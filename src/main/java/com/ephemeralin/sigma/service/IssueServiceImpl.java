package com.ephemeralin.sigma.service;

import com.ephemeralin.sigma.domain.Issue;
import com.ephemeralin.sigma.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * The Issue service.
 */
@Repository("issueService")
@Transactional
public class IssueServiceImpl implements IssueService {

    private final IssueRepository repository;

    @PersistenceContext
    private EntityManager em;

    public IssueServiceImpl(IssueRepository repository) {
        this.repository = repository;
    }

    @Override
    public Long create(Issue issue) {
        return this.repository.save(issue).getId();
    }

    @Override
    public Issue getById(Long id) {
        return this.repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

}
