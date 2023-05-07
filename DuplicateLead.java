package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ChromeDriver driver=new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps");
				
			driver.findElement(By.id("username")).sendKeys("demoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.id("button")).click();
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pushpa");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Madhu");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pushpa");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Want to nominate for a selenium course");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pushpamadhu123@gmail.com");
			
			WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			
			Select s1=new Select(state);
			
			s1.selectByVisibleText("New York");
			
			driver.findElement(By.name("submitButton")).click();
			
			String title=driver.getTitle();
			
			System.out.println(title);
			
			driver.findElement(By.linkText("Duplicate Lead")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
			
            String title1=driver.getTitle();
			
			System.out.println(title1);

	}

}
