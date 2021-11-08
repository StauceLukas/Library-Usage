package com.libraryUsage.Lib;

import com.libraryUsage.Lib.model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    void PersonTest() {
        Person p = new Person(1,"Vardas", "Pavarde", "+370123456", "email@gmail.com", "Vilnius", "Pass1234");
        assertEquals(1, p.getId());
        assertEquals("Vardas", p.getName());
        assertEquals("Pavarde", p.getSurname());
        assertEquals("+370123456", p.getNumber());
        assertEquals("email@gmail.com", p.getEmail());
        assertEquals("Vilnius", p.getAddress());
        assertEquals("Pass1234", p.getPassword());
    }
}
