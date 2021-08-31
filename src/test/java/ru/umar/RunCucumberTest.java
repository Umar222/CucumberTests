package ru.umar;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:src/test/resources/features"},
        plugin = {"pretty", "html:target/cucumber"},
        snippets = CAMELCASE,
//        publish = true,
        //UNDERSCORE
        dryRun = false,
        tags = ("@smoke, @positive, @negative, @simple and not @fail")
//        name = "^@smoke|@positive...*"
)

public class RunCucumberTest {

}


