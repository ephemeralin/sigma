package com.ephemeralin.sigma.repository;

import com.ephemeralin.sigma.domain.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {

}
