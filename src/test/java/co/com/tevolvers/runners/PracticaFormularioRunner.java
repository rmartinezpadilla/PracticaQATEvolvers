package co.com.tevolvers.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/practica_formulario.feature",
        glue = {"co.com.tevolvers.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"}
)
public class PracticaFormularioRunner {
}
