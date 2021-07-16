package boursorama;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.HomePage;

public class Impossibletocommentonanews1232Step {
    @Given("user is on website on rubrique **Ma fiche  de membre***")
    public void user_is_on_website_on_rubrique_ma_fiche_de_membre() {

        HomePage.esp_membre2_click();
        HomePage.dev_membre2_click();
        HomePage.utilisateur_click();
        HomePage.mot_de_passe_click();
    }
    @When("user click on **poster**")
    public void user_click_on_poster() {
        HomePage.buton_connexion_click();
        HomePage.fic_membre_click();
        HomePage.champs_pour_poster_click();
        HomePage.passe_cookie_click();
    }
//    @Then("user be able to post a news")
//    public void user_be_able_to_post_a_news() {
//        HomePage.cliquer_pour_poster_click();
//    }

}
