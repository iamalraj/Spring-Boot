package com.example.demo.dao;

import java.util.List;
import java.util.UUID;

import com.example.demo.model.Person;

public interface PersonDao {

	int insertPerson(UUID id, Person person);// insert person with given ID
	
	//no ID given. ID randomly generated
	default int insertPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);//insert person with generated ID
	}
	
	List<Person> selectAllPeople();
}
