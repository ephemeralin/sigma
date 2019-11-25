package com.ephemeralin.sigma.rest;

import com.ephemeralin.sigma.domain.Issue;
import com.ephemeralin.sigma.service.IssueService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class IssueController {

    private final IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    @RequestMapping(path = "/getById", method = GET)
    public Issue getById(@RequestParam (value = "id") long id) {
        return issueService.getById(id);
    }
}
