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
// WebDriver driver=new ChromeDriver(); 
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
driver.manage().window().maximize(); 
driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click(); 
Set<String> windowIDs-driver.getWindowHandles(); 
for (String winid:windowIDs) 
{ 
String title=driver.switchTo().window(winid).getTitle(); 
System.out.println(title); 
if(title.equals("Human Resources Management Software | OrangeHRM")) 
{ 
driver.close(); 
break; 
}
}
  driver.manage().window().maximize(); 
//1) select specific checkbox 
//driver.findElement(By.xpath("//input[@id='sunday']")).click(); 
//2) select all the checkboxes 
List<WebElement> checkboxes=driver.findElements (By.xpath("//input[@class='form-check-inp 
/*for(int i=0;i<checkboxes.size();i++) 
{ 
checkboxes.get(i).click(); 
7-34 
} 
*/
7-2:5 
2 
/*for(WebElement checkbox:checkboxes) 
3 
{ 
checkbox.click(); 
0 
} 
//3) select last 3 checkboxes
  //3) select last 3 checkboxes 
//total no of checkboxes-how many checkboxes want to select startig index 
//7-3-4 (stating index) 
/*for(int i=4;i<checkboxes.size();i++) 
{ 
checkboxes.get(i).click(); 
} 
*/
//4)) select first 3 checkboxes 
/*for(int i=0;i<3;i++) 
{ 
} 
*/
//5) unselect checkboxes if they are selected 
for(int i=0;i<3;i++) 
{ 
I 
checkboxes.get(i).click(); 
checkboxes.get(i).click(); 
}
  Thread.sleep(5000); 
for(int i=0;i<checkboxes.size();i++) 
{ 
if(checkboxes.get(i).isSelected()) 
{ 
checkboxes.get(i).click(); 
}
  
}
  
}
}
