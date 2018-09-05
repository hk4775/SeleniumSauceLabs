package com.aa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import sun.font.CoreMetrics;
import sun.security.krb5.internal.crypto.Des;

import java.net.MalformedURLException;
import java.net.URL;

public class Browser {

    //System.setProperty()
    //DesiredCapabilities caps = DesiredCapabilities.chrome();
    public static WebDriver driver;
    static
    {
        System.setProperty("webdriver.chrome.driver", "C:/Dev/tools/chromedriver.exe");
        System.out.println(System.getProperty("webdriver.chrome.driver"));


//         String USERNAME = "hk4775";
//         String SauceLabsURL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
//        DesiredCapabilities caps = DesiredCapabilities.firefox();
//        caps.setCapability("platform", "Windows XP");
//        caps.setCapability("version", "52.0");
//        caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//        caps.setCapability("acceptSslCerts",true);
//        System.out.println("SauceLabsURL: " +SauceLabsURL);
//        try {
//            driver = new RemoteWebDriver(new URL(SauceLabsURL), caps);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
        driver = new ChromeDriver();


    }

    public static void goTo(String url) {
        driver.get(url);
    }

    public static String title() {
        System.out.println(driver.getTitle());
        return driver.getTitle();
    }

    public static void close() {
        driver.close();
    }
}
