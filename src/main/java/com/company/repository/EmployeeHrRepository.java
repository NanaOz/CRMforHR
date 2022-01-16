package com.company.repository;

import com.company.entity.EmployeeHR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeHrRepository extends JpaRepository<EmployeeHR, Long> {
}
