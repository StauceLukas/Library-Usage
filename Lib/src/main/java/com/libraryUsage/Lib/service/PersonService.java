package com.libraryUsage.Lib.service;

import com.libraryUsage.Lib.model.Person;
import com.libraryUsage.Lib.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;

    public List<Person> findAll() {
        return (List<Person>)repository.findAll();
    }

    public Person findById(int customerId) {
        return repository.findById(customerId).get();
    }

    public void update (Person p) {
        //repository.update(zm);
        repository.save(p);
    }

    public Person add(Person p) {
        return repository.save(p);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public void delete(Person p) {
        repository.delete(p);
    }

}
