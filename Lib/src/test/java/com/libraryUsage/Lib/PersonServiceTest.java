package com.libraryUsage.Lib;

import com.libraryUsage.Lib.model.Person;
import com.libraryUsage.Lib.repository.PersonRepository;
import com.libraryUsage.Lib.service.PersonService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    PersonRepository repo;

    @InjectMocks
    PersonService service;

    @DisplayName("Test Find All")
    @Test
    void testFindAll() {
        Person p = new Person(1,"Vardas", "Pavarde", "+370123456", "email@gmail.com", "Vilnius", "Pass1234");
        List<Person> people = new ArrayList<>();
        people.add(p);

        when(repo.findAll()).thenReturn(people);

        List<Person> found = service.findAll();

        verify(repo).findAll(); // called 1 time

        assertEquals(1, found.size());
    }


    @Test
    void testFindById() {
        Person p = new Person(1,"Vardas", "Pavarde", "+370123456", "email@gmail.com", "Vilnius", "Pass1234");
        when(repo.findById(Mockito.anyInt())).thenReturn(Optional.of(p));

        Person found = service.findById(1);
        verify(repo.findById(Mockito.anyInt()));
        assertNotNull(found);
    }



    @Test
    void testAdd() {

        Person p = new Person(1,"Vardas", "Pavarde", "+370123456", "email@gmail.com", "Vilnius", "Pass1234");
        when(repo.save(Mockito.any(Person.class))).thenReturn(p);

        Person added = service.add(p);
        verify(repo).save(Mockito.any(Person.class));
        assertNotNull(added);
    }


    @Test
    void testDeleteById() {
        service.deleteById(1);
        verify(repo).deleteById(Mockito.anyInt()); // verify that mock method was called one time

    }

    @Test
    void testDelete() {
        Person p = new Person(1,"Vardas", "Pavarde", "+370123456", "email@gmail.com", "Vilnius", "Pass1234");
        service.delete(p);
        verify(repo).delete(Mockito.any(Person.class));
    }


}
