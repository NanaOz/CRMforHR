package com.company.repository;

import com.company.entity.CandidateTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateTagRepository extends JpaRepository<CandidateTag, Long> {
}
