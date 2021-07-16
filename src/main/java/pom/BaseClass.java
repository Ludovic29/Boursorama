package pom;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.concurrent.TimeUnit;


public class BaseClass {

    public static WebDriver driver;
    private static ChromeOptions options;
    private static LocalDate date;
    private static LocalTime tps;
    private static String value_tps;
    private static String value_date;
    private static final String os = System.getProperty("os.name");
    private static String path;
//    private static By


    public static void setDriver(){
        System.out.println(os);
        if (os.startsWith("W")){
            path = (System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
        } else {
            path = (System.getProperty("user.dir")+"/src/main/resources/chromedriver");
        }

        System.setProperty("webdriver.chrome.driver", path);
        options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--disable-blink-features=AutomationControlled");
        //----------- Add BypassCaptcha Extension -----------------------------
        options.addExtensions(new File("src/main/resources/CaptchaBypass.crx"));
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

     public static void gotohomepage () throws InterruptedException {
        driver.get("https://www.boursorama.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
     }


    public static String getDate(){
        date = LocalDate.now();
        value_date = date.toString();
        return value_date;
    }

    public static String getTime(){
        tps = LocalTime.now();
        value_tps = tps.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return value_tps;
    }

    public static void scroll(int height) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+height+")", "");
        Thread.sleep(1500);
    }


}
