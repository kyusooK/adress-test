package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.SocialServiceApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SocialServiceApplication.class })
public class CucumberSpingConfiguration {}
