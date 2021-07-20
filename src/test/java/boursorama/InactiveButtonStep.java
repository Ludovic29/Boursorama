package boursorama;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import pom.HomePage;

public class InactiveButtonStep {
    @Given("user is on page **je m'inscris**")
    public void user_is_on_page_je_m_inscris() throws InterruptedException {
        HomePage.gotohomepage();
        HomePage.handle_cookie();
    }
    @When("the user is on the page I subscribe")
    public void the_user_is_on_the_page_i_subscribe() {
        HomePage.esp_membre_click();
        HomePage.dev_membre_click();
    }
    @Then("check if the button I subscribe is grayed out")
    public void check_if_the_button_i_subscribe_is_grayed_out() throws InterruptedException {
        HomePage.inscrip_click();
        HomePage.verified_inactive_bouton();

    }
}

