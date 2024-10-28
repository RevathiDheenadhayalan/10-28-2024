package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.main.Arguments;

public class Browser {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		// Typecasting - converts lower interface to higher interface

		JavascriptExecutor jk = (JavascriptExecutor) driver; // Typecasting done here

		WebElement username = driver.findElement(By.id("email"));

		jk.executeScript("arguments[0].setAttribute('value','revadheena2011@gmail')", username);

		WebElement password = driver.findElement(By.id("pass"));

		jk.executeScript("arguments[0].setAttribute('value','123456')", password);

		WebElement login = driver.findElement(By.name("login"));

		jk.executeScript("arguments[0].click()", login);

	}
}
