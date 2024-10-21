package com.cyb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cyb.entities.Contact;
import com.cyb.entities.Employee;

public interface ContactRepository extends JpaRepository<Contact, Integer>{
	
}
