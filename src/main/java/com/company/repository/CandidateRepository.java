package com.company.repository;

import com.company.utils.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
//    List<Candidate> findByName(String name);
}
