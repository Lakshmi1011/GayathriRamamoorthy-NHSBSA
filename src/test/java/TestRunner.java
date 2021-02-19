import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




    @CucumberOptions(
            features = "Feature/EligibilityChecker.feature",


            plugin = {"pretty:target/test.html"}

    )


    @RunWith(Cucumber.class)
    public class TestRunner
    {

    }


