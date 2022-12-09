package loginAccountFile;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginAccount {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement signInButton=driver.findElement(By.xpath("//a[@class=\"gb_7 gb_8 gb_de gb_dd\"]"));
        signInButton.click();

        WebElement epostaClick = driver.findElement(By.cssSelector("input#identifierId"));
        epostaClick.click();
        epostaClick.sendKeys("yasintest45@gmail.com");

        WebElement laterButton=driver.findElement(By.xpath("(//span[@class=\"VfPpkd-vQzf8d\"])[2]"));
        laterButton.click();


    }
}
