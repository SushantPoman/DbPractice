package com.cyb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyb.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
