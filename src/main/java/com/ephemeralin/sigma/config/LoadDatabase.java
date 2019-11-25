package com.ephemeralin.sigma.config;

import com.ephemeralin.sigma.domain.Issue;
import com.ephemeralin.sigma.repository.IssueRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(IssueRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Issue("fix a bug", "bug!")));
            log.info("Preloading " + repository.save(new Issue("add a feature", "feature!")));
        };
    }

}
