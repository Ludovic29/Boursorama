package pom;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HomePage extends BaseClass {

    private static final ExcelManager excel = new ExcelManager();
    private static String elementTranslate;
    private static String message;
    private static String link;
    private static String bug_statut;
    private static String element_size="0";
    private static String element1_size;
    private static String element2_size;
    private static int cpt = 0;


    //----------------------------- header page locators ----------------------------------------

    @FindBy(id = "login-member")
    private static WebElement espace_membre;

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/form/div[2]/p/a")
    private static WebElement devenez_membre;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div/div/div[2]/a")
    private static WebElement inscription_free;

    @FindBy(xpath = "/html/body/main/div/div/div/div/div[2]/a/span")
    private static WebElement fiche_incription;

    @FindBy(xpath = "/html/body/main/div/div/div/div[1]/div/form/div[1]/div[19]/button/span")
    private static WebElement je_m_inscris_gratuitement;




  //---------------------post impossible  OF BUG 1232------------------------------------------------

  @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/span")
  private static WebElement espace_membre2;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/ol/li[3]/ol/li[1]/button/span")
    private static WebElement devenez_membre2;

    ///etape de connexion avec SIDO1 et Mathematiques29*
    @FindBy(xpath = "/html/body/div[6]/div/div[2]/form/div[1]/div/div[1]/div/input")
    private static  WebElement nom_utilisateur;

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/form/div[1]/div/div[2]/div/div/input")
    private static WebElement mot_de_passe;

    ///etape de connexion avec SIDO1 et Mathematique29*

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/form/div[2]/div/button")
    private static WebElement button_connexion;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/ol/li[3]/div/div/div[2]/div/ul/li[1]/a")
    private static WebElement fiche_membre;

    ///Etape pour ecrire un post
    @FindBy(xpath = " /html/body/main/div/div/div[4]/div[1]/div[4]/form/div[1]/textarea")
    private static WebElement champs_ecriture_du_post;

    ///Etape pour ecrire un post

    @FindBy(xpath = "/html/body/div[12]/div/footer/button[1]/span")
    private static WebElement cookie_passed;

    @FindBy(xpath = "/html/body/main/div/div/div[4]/div[1]/div[4]/form/div[3]/button")
    private static WebElement click_to_post;


  //--------------------------bug 1233-----------------------------------------------------

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/span")
    private static WebElement page_acceuil;

    @FindBy(xpath = " /html/body/div[5]/div[3]/div[2]/ol/li[3]/ol/li[1]/button/span")
    private static WebElement cliquer_sur_espace_Membre;

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/form/div[1]/div/div[1]/div/input ")
    private static WebElement nom_utilisateur1;

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/form/div[1]/div/div[2]/div/div/input")
    private static WebElement mot_de_passe2;

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/form/div[2]/div/button/span")
    private static WebElement connexion;

    @FindBy(xpath = "/html/body/div[5]/div[3]/nav/ul/li[1]/a")
    private static WebElement cliquer_sur_actu_eco;

    @FindBy(xpath = " /html/body/main/div/div[1]/div[3]/div[4]/div/div[4]/div/a/div/div[2]/div/h3")
    private static WebElement cliquer_sur_actualite;

    @FindBy(xpath = "/html/body/main/div/div/div[1]/div[1]/div[2]/div[8]/div[4]/div/div[2]/form/div[2]/textarea")
    private static WebElement ecrire_un_commenataire;

    @FindBy(xpath = " /html/body/main/div/div/div[1]/div[1]/div[2]/div[8]/div[4]/div/div[2]/form/div[3]/div/button/span")
    private static WebElement cliquer_sur_poster;

    //------------------------------bug 1233-----------------------------------------------------------------

      public static void page_acceuil_click(){
          page_acceuil.click();
    }

    public static void cliquer_espace_membree_click(){
          cliquer_sur_espace_Membre.click();
    }

    public static void nom_utilisateur_click (){

          nom_utilisateur1.sendKeys("SIDO1");

    }

    public static void mot_de_passe2_click() {
          mot_de_passe2.sendKeys("Mathematiques29*");

    }
    public static void connection_click(){
          connexion.click();
    }
    public static void cliquer_sur_actu_economie() {
        cliquer_sur_actu_eco.click();
    }

    public static void actualite_click() {
        cliquer_sur_actualite.click();
    }

    public static void ecrire_un_commenatire_click() {
        ecrire_un_commenataire.sendKeys("bonjour le monde");

    }
        public static void poster_click () {
            cliquer_sur_poster.click();
        }

    @FindBy(id = "didomi-popup")
    private static WebElement  popup;

    @FindBy(xpath = "//*[@id=\"didomi-popup\"]/div/div/div/span")
    private static WebElement pass_cookie;

    public static void handle_cookie(){
        if (popup.isDisplayed()) pass_cookie.click();
    }


 //////////////////bug 1232//////////////////////////////////////////////////////////////////////////////

 public static void  esp_membre2_click() {
     espace_membre2.click();
 }
       public static void  dev_membre2_click() {
        devenez_membre2.click();
    }

    public static void utilisateur_click(){
     nom_utilisateur.sendKeys( "SIDO1");

    }

    public static void mot_de_passe_click(){
     mot_de_passe.sendKeys("Mathematiques29*");
    }
    public static void buton_connexion_click(){
     button_connexion.click();
    }
      public static void fic_membre_click(){
     fiche_membre.click();

      }


    public static void champs_pour_poster_click(){
     champs_ecriture_du_post.sendKeys("bonjour le monde");
    }

    public static void passe_cookie_click(){
     cookie_passed.click();
    }

    public static void cliquer_pour_poster_click() {

     click_to_post.click();
    }
     /////////////////////1232///////////////////////////////////////////////////////
    public static void esp_membre_click(){
        espace_membre.click();



    }
public static void dev_membre_click () {

        devenez_membre.click();
}
public static void inscrip_click () throws InterruptedException {

        inscription_free.click();
        scroll(2000);
        Thread.sleep(1500);
        message = je_m_inscris_gratuitement.isEnabled()+"";
}

public static void verified_inactive_bouton (){


    try {

        String Bug = "1513";

        System.out.println("\nbouton actif  "+ message);

        if (message.equals("true")) {

            System.out.println("\n bouton non grisé : "
                    + "\n\n\tBug Non Corrigé  !!!");
            bug_statut = "KO";
            excel.excelWriting(Bug,bug_statut, getDate(), getTime());

        } else {

            System.out.println("\n bouton grisé : "
                    + "\n\n\tBug Corrigé !!!");
            bug_statut = "OK";
            excel.excelWriting(Bug,bug_statut, getDate(), getTime());
        }

    } catch(Exception e) {

        System.out.println(" No more for this ");

    }

    Assert.assertEquals(bug_statut,"OK");



}








    //--------------------------------------- methods ----------------------------------
/*

    public static void checkErrorpage(WebElement linked) throws InterruptedException {

        scroll((linked.getLocation().getY()-20));
        Thread.sleep(1500);
        link = linked.getAttribute("href");
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // establish and open connection with URL
        try {
            HttpURLConnection c = (HttpURLConnection) new URL(link).openConnection();
            // set the HEAD request with setRequestMethod
            c.setRequestMethod("HEAD");
            // connection started and get response code
            c.connect();

            int r = c.getResponseCode();

            String answ = r + "";

            if (answ.startsWith("4")) {
                message = "FAIL";
            } else {
                message = "PASS";
            }

        } catch (Exception e){

            message = "FAIL";
            System.out.println("url inaccessible");

    }
        try{
            driver.navigate().to(link);
            Thread.sleep(3000);
            element_size = driver.findElement(By.xpath("/html/body")).getText();
            Thread.sleep(3000);
        }catch (Exception e){

            System.out.println("No for this");

        }


    }

    public static void getLinkParcours() throws InterruptedException {
        element1_size = driver.getCurrentUrl();
        navigateLink(footerdmrse);
        navigateLink(footerhubrecrut);
        element2_size = driver.getCurrentUrl();
        Thread.sleep(2000);
    }

    public static void getLinkParcours2() throws InterruptedException {
        element1_size = "(720, 390)";
        navigateLink(footer2plansite);
        navigateLink(cand_conseils_epl);
        navigateLink(cons_perso_svr_pl);
        navigateLink(deb_care_svr_pl);
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        element2_size = driver.findElement(By.xpath("/html/body/div[1]/div/section/section/section/section")).getSize().toString();
        Thread.sleep(2000);
        scroll(500);
    }

    public static WebElement getFooterfondmanpow(){

        return footerfondmanpow;
    }

    public static WebElement getDetailCDD(){

        return detailcdd_cdi;
    }

    public static void getLinkParcours4() throws InterruptedException {

        navigateLink(footer2plansite);
        navigateLink(cand_alternance);
        navigateLink(cons_offre);
        Thread.sleep(1500);
        link = driver.getCurrentUrl();
        Thread.sleep(1500);

    }

    public static void getLinkParcours5() throws InterruptedException {

        navigateLink(footerintavantage);
        navigateLink(infopratq);
        navigateLink(polempl);
        navigateLink(myrenum);
        Thread.sleep(1500);
        myrenum_email.sendKeys("bonaldisimo@yahoo.com");
        myrenum_pwd.sendKeys("Mathematiques29*");
        myrenum_submit.click();
        Thread.sleep(2500);
        message = myrenum_content.getText();

    }

    public static void getLinkParcours6() throws InterruptedException {
        driver.get("https://www.manpower.fr/candidats/trouver-un-emploi/quel-contrat-pour-vous/cdi-cdd");
    }


    public static void verifyMoreCDDContent(){

        try {

            String Bug = "801";

            System.out.println("\nurl de page "+link
                    + "\naccess au contenu de la page : "+message
                    + "\ncontenu de la page : "+element_size);

            if ((link.contains("https"))&&(message.equals("PASS"))&&(!element_size.contains("ERROR"))) {

                System.out.println("\n Probleme de securite et d'affichage de la page resolu : "
                        + "\n\n\tBug Corrigé !!!");
                bug_statut = "OK";
                excel.excelWriting(Bug,bug_statut, getDate(), getTime());

            } else {

                System.out.println("\n Probleme de securite et d'affichage de la page non-resolu : "
                        + "\n\n\tBug Non Corrigé !!!");
                bug_statut = "KO";
                excel.excelWriting(Bug,bug_statut, getDate(), getTime());
            }

        } catch(Exception e) {

            System.out.println(" No more for this ");

        }

        Assert.assertEquals(bug_statut,"OK");

    }

    public static void goToChantierBTP() throws InterruptedException{

        driver.get("https://www.manpower.fr/candidats/votre-metier/metiers-du-btp");
        navigateLink(chantierbtp);
        Thread.sleep(1500);
        message = chantiercontent.getText();

    }

    public static void verifyMyRenumLoginContent(){

        try {

            String Bug = "734";

            System.out.println("\nmessage d'en-tete : "+message);

            if (!message.contains("Accès refusé")){

                System.out.println("\n L'element souhaité s'affiche : "
                        + "\n\n\tBug Corrigé !!!");
                bug_statut = "OK";
                excel.excelWriting(Bug,bug_statut, getDate(), getTime());

            } else {

                System.out.println("\n L'element souhaité ne s'affiche pas : "
                        + "\n\n\tBug Non Corrigé !!!");
                bug_statut = "KO";
                excel.excelWriting(Bug,bug_statut, getDate(), getTime());
            }

        } catch(Exception e) {

            System.out.println(" No more for this ");

        }

        Assert.assertEquals(bug_statut,"OK");

    }

    public static void verifyChantierBTPContent(){

        try {

            String Bug = "767";

            System.out.println("\nmessage d'en-tete : "+message);

            if (!message.contains("Accès refusé")){

                System.out.println("\n L'element souhaité s'affiche : "
                        + "\n\n\tBug Corrigé !!!");
                bug_statut = "OK";
                excel.excelWriting(Bug,bug_statut, getDate(), getTime());

            } else {

                System.out.println("\n L'element souhaité ne s'affiche pas : "
                        + "\n\n\tBug Non Corrigé !!!");
                bug_statut = "KO";
                excel.excelWriting(Bug,bug_statut, getDate(), getTime());
            }

        } catch(Exception e) {

            System.out.println(" No more for this ");

        }

        Assert.assertEquals(bug_statut,"OK");

    }

    public static void verifyAlternanceFilter(){

        try {

            String Bug = "757";

            System.out.println("\nurl de page "+link);

            if (!link.equals("https://www.manpower.fr/offre-emploi")){

                System.out.println("\n L'element renvoit vers un contenu specifique : "
                        + "\n\n\tBug Corrigé !!!");
                bug_statut = "OK";
                excel.excelWriting(Bug,bug_statut, getDate(), getTime());

            } else {

                System.out.println("\n L'element renvoit vers un contenu general  : "
                        + "\n\n\tBug Non Corrigé !!!");
                bug_statut = "KO";
                excel.excelWriting(Bug,bug_statut, getDate(), getTime());
            }

        } catch(Exception e) {

            System.out.println(" No more for this ");

        }

        Assert.assertEquals(bug_statut,"OK");


    }

    public static void verifyPageSecurityAccess(){

        try {

            String Bug = "740";

            System.out.println("\nurl de page "+link
                    + "\naccess au contenu de la page : "+message);

            if ((link.contains("https"))&&(message.equals("PASS"))) {

                System.out.println("\n Probleme de securite et d'affichage de la page resolu : "
                        + "\n\n\tBug Corrigé !!!");
                bug_statut = "OK";
                excel.excelWriting(Bug,bug_statut, getDate(), getTime());

            } else {

                System.out.println("\n Probleme de securite et d'affichage de la page non-resolu : "
                        + "\n\n\tBug Non Corrigé !!!");
                bug_statut = "KO";
                excel.excelWriting(Bug,bug_statut, getDate(), getTime());
            }

        } catch(Exception e) {

            System.out.println(" No more for this ");

        }

        Assert.assertEquals(bug_statut,"OK");


    }

    public static void verifyEmptyContent(){

        try {

            String Bug = "763";

            System.out.println("\ntaille de l'élément par défaut : "+element1_size
                    + "\ntaille de l'élément actuel : "+element2_size);

            if (!element1_size.equals(element2_size)) {

                System.out.println("\n Il y'a eu ajout de contenus : "
                        + "\n\n\tBug Corrigé !!!");
                bug_statut = "OK";
                excel.excelWriting(Bug,bug_statut, getDate(), getTime());

            } else {

                System.out.println("\n Aucun ajout de contenus : "
                        + "\n\n\tBug Non Corrigé !!!");
                bug_statut = "KO";
                excel.excelWriting(Bug,bug_statut, getDate(), getTime());
            }

        } catch(Exception e) {

            System.out.println(" No more for this ");

        }

        Assert.assertEquals(bug_statut,"OK");

    }

    public static void verifySameLink(){

        try {

            String Bug = "743";

            System.out.println("\nlien de depart : "+element1_size
                    + "\nlien d'arrivee : "+element2_size);

            if (!element1_size.equals(element2_size)) {

                System.out.println("\n les liens sont différents : "
                        + "\n\n\tBug Corrigé !!!");
                bug_statut = "OK";
                excel.excelWriting(Bug,bug_statut, getDate(), getTime());

            } else {

                System.out.println("\n les liens sont identiques : "
                        + "\n\n\tBug Non Corrigé !!!");
                bug_statut = "KO";
                excel.excelWriting(Bug,bug_statut, getDate(), getTime());
            }

        } catch(Exception e) {

            System.out.println(" No more for this ");

        }

        Assert.assertEquals(bug_statut,"OK");
*/

    }




// https://www.manpower.fr/offre-emploi
