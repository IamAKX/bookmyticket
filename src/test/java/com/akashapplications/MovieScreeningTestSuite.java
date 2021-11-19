package com.akashapplications;

import com.akashapplications.business.service.ScreeningServiceIntegrationTest;
import com.akashapplications.data.repository.ScreeningRepositoryIntegrationTest;
import com.akashapplications.web.application.ScreeningControllerIntegrationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ScreeningServiceIntegrationTest.class, ScreeningControllerIntegrationTest.class,
        ScreeningRepositoryIntegrationTest.class})
public class MovieScreeningTestSuite {
}
