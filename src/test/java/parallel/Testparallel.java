package parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

public class Testparallel {

  private WebDriver driver;

  @Before
  public void init() throws MalformedURLException {
//    ChromeOptions chromeOptions = new ChromeOptions();
//    chromeOptions.setCapability("browserName", "chrome");
//    chromeOptions.setCapability("se:name", "My simple test");
//
//    chromeOptions.setCapability("se:sampleMetadata", "Sample metadata value");
//
//    driver = new RemoteWebDriver(new URL("http://10.10.57.94:4444/wd/hub"), chromeOptions);

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("browserName", "chrome");
    capabilities.setCapability("browserVersion", "101.0");
    capabilities.setCapability("enableVNC", true);
    driver = new RemoteWebDriver(
        URI.create("http://127.0.0.1/wd/hub").toURL(),
        capabilities
    );
  }

  @After
  public void tearDown() {
    if(driver != null) {
      driver.close();
      driver.quit();
    }
  }

  @Test
  public void test1() throws InterruptedException {
    driver.get("https://ya.ru");

    Thread.sleep(10000);
  }

  @Test
  public void test2() throws InterruptedException {
    driver.get("https://ya.ru");

    Thread.sleep(10000);
  }

  @Test
  public void test3() throws InterruptedException {
    driver.get("https://ya.ru");

    Thread.sleep(10000);
  }

  @Test
  public void test4() throws InterruptedException {
    driver.get("https://ya.ru");

    Thread.sleep(10000);
  }

  @Test
  public void test5() throws InterruptedException {
    driver.get("https://ya.ru");

    Thread.sleep(10000);
  }

  @Test
  public void test6() throws InterruptedException {
    driver.get("https://ya.ru");
    Thread.sleep(10000);
  }

  @Test
  public void test7() throws InterruptedException {
    driver.get("https://ya.ru");

    Thread.sleep(10000);
  }

  @Test
  public void test8() throws InterruptedException {
    driver.get("https://ya.ru");

    Thread.sleep(10000);
  }

  @Test
  public void test9() throws InterruptedException {
    driver.get("https://ya.ru");

    Thread.sleep(10000);
  }

}
