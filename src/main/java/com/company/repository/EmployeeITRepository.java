package com.company.repository;

import com.company.utils.EmployeeIT;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeITRepository extends JpaRepository<EmployeeIT, Long> {
//    List<EmployeeIT> findByName(String name);
}
