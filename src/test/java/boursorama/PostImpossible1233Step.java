package boursorama;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Description;
import org.testng.Assert;
import pom.HomePage;

public class PostImpossible1233Step {
    @Given("User in on homepage")
    @Description("verification")
    public void user_in_on_homepage() throws InterruptedException {
        HomePage.gotohomepage();
        HomePage.handle_cookie();
    }
    @When("User click on espace_membre")
    public void user_click_on_espace_membre() {
        HomePage.esp_membre_click();
    }
    @When("^the user connects to his account with his ([^\"]*) and ([^\"]*)$")
    public void the_user_connects_to_his_account_with_his_login_and_password(String login , String password) throws InterruptedException {
        HomePage.setLogin(login);
        HomePage.setPassword(password);
        HomePage.login();
        HomePage.close_modal();
    }
    @When("the user click on news and eco and select a news")
    public void the_user_click_on_news_and_eco_and_select_a_news() throws InterruptedException {
        HomePage.cliquer_sur_actu_economie();
        Thread.sleep(2000);
        HomePage.actualite_click();
    }

    @Then("^the user tries to ([^\"]*) on the news$")
    public void the_user_tries_to_comment_on_the_news(String comment) {
        String before_comment = HomePage.get_Result_comment();
        HomePage.setComment(comment);
        HomePage.poster_click();
        String after_comment = HomePage.get_Result_comment();
        Assert.assertEquals(before_comment, after_comment);
    }
}



//    @Given("User is on website on rubrique **Actu et Eco****")
//    public void user_is_on_website_on_rubrique_actu_et_eco() throws InterruptedException {
//        HomePage.gotohomepage();
//        HomePage.page_acceuil_click();
////        HomePage.cliquer_espace_membree_click();
////        HomePage.nom_utilisateur_click();
////        HomePage.mot_de_passe2_click();
////        HomePage.connection_click();
//   }
//
//    @When("User click on **Poster**")
//    public void user_click_on_poster() {
////        HomePage.cliquer_sur_actu_economie();
////        HomePage.actualite_click();
////        HomePage.ecrire_un_commenatire_click();
//
//
//    }
//
//    @Then("user be able to post a news")
//    public void user_be_able_to_post_a_news() {
//
////        HomePage.poster_click();
//
//    }
//}


