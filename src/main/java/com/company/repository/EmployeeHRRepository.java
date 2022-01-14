package com.company.repository;

import com.company.utils.EmployeeHR;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeHRRepository extends JpaRepository<EmployeeHR, Long> {
//    List<EmployeeHR> findByName(String name);
}
