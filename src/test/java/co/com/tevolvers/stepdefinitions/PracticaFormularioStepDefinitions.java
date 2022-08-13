package co.com.tevolvers.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class PracticaFormularioStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("tevolvers");

    }

    @Given("I enter the page toolsqa")
    public void iEnterThePageToolsqa() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/automation-practice-form"));

    }
    @When("complete the fields firstname:(.*) lastName:(.*) email:(.*) gender:(.*) mobile:(.*) Date of Birth:(.*) subjects:(.*) Hobbies:(.*) picture:(.*) Current Address:(.*) State:(.*) City:(.*)")
    public void completeTheFieldsFirstnamePedroManuelLastNamePicapiedraEmailPicapiedraTestComGenderMaleMobileDateOfBirthDecSubjectsMathsHobbiesSportsPictureTextoPendientCurrentAddressCllMedellinStateHaryanaCityKarnal(
            String firstName, String lastname, String email, String gender, String mobile, String dateofbirth, String subjects, String hobbies, String picture, String currentaddress, String state, String city
    ) {

    }
    @Then("View the entered information")
    public void viewTheEnteredInformation() {

    }

}
