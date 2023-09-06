package org.example.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\arab-soft\\IdeaProjects\\GraduationProject\\src\\main\\resources\\Features",
        glue = "org.example.StepDef",
        tags = "@Smoke" ,
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"
        }
)

public class Runner extends AbstractTestNGCucumberTests {
}
