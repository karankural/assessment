package com.axelerantPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContacForm extends Base{
	
	public static void main(String[] ar) throws InterruptedException {
		new ContacForm();
		driver.get("http://automationpractice.com/index.php");
		Base.login("karan123@mailinator.com", "qwe123");
		driver.findElement(By.xpath("//div[@id='contact-link']/a")).click();
		scrollBy(600);
		WebElement selectDropdown = driver.findElement(By.id("id_contact"));
		Select se = new Select(selectDropdown);
		se.selectByVisibleText("Customer service");
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Testing prospective");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit']/button")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
