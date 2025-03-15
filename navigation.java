package day28; 
import java.time.Duration; 
public class HandleBrowserWindows { 
public static void main(String[] args) { 
WebDriver driver=new ChromeDriver(); 
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
driver.manage().window().maximize(); 
driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click(); I 
Set<String> windowIDs=driver.getWindowHandles(); 
//Appoach1 
/*List<String> windowList=new ArrayList(windowIDs); 
String parentID=windowList.get(0);
WebDriver driver=new ChromeDriver(); 
driver.get("https://testautomationpractice.blogspot.com/"); 
driver.manage().window().maximize(); 
//1) select specific checkbox 
//driver.findElement(By.xpath("//input[@id='sunday']")).click(); 
//2) select all the checkboxes 
List<Webelement> checkboxes=driver.findElements (By.xpath("//input[@class='form-check-inp']")); 
