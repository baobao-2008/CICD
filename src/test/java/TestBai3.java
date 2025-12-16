import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBai3 {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testTimKiem() throws InterruptedException{
        driver.get("https://vitimex.com.vn/");
        Thread.sleep(3000);
        driver.findElement(By.className("h-search")).click();
        driver.findElement(By.id("inputSearchAuto")).sendKeys("Áo");
        driver.findElement(By.id("search-header-btn")).click();
        Thread.sleep(3000);
    }

    @Test
    public void testThemSanPhamVaoGioHang() throws InterruptedException{
        driver.get("https://vitimex.com.vn/products/akn2031");
        Thread.sleep(3000);
        driver.findElement(By.className("aspect-ratio")).sendKeys("50");
        driver.findElement(By.id("btn-addtocart")).click();
        Thread.sleep(3000);
    }
}
