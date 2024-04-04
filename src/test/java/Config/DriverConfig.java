package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverConfig {
   public static WebDriver driver=new ChromeDriver();
   public void ImpWait(int ImpliciteTime)
   {
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(ImpliciteTime));
   }
   public void LaunchBrowser(String URL){
      driver.navigate().to(URL);
      //ImpWait(5000);
   }

}
