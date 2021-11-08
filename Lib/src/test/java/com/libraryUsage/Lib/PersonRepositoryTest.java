package com.libraryUsage.Lib;

import com.libraryUsage.Lib.model.Person;
import com.libraryUsage.Lib.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@DataJpaTest
public class PersonRepositoryTest {
    @Autowired
    private PersonRepository repo;


    @Test
    public void testFindAll() {
        Person p = new Person(1,"Vardas", "Pavarde", "+370123456", "email@gmail.com", "Vilnius", "Pass1234");
        repo.save(p);

        Iterable<Person> people = repo.findAll();

        assertNotNull(people);

        List<Person> result = new ArrayList<Person>();
        people.forEach(result::add);
        assertEquals(1, result.size());
    }




}
