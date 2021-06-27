package tr.gov.tcmb.ornkprj.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import tr.gov.tcmb.ornkprj.config.RootScannerConfig;

@RunWith(value = SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = RootScannerConfig.class)
@ActiveProfiles("default")
public abstract class AbstractTestSuite {
  //
}
