package com.ephemeralin.sigma.service;

import com.ephemeralin.sigma.domain.Issue;

/**
 * The interface Issue service.
 */
public interface IssueService {

    Long create(Issue issue);
    Issue getById(Long id);
}
