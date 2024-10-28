package org.sample;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		List<WebElement> linkCount = driver.findElements(By.tagName("a"));

		// To get number of links present

		int size = linkCount.size();

		System.out.println(size);

		int Count = 0;

		for (WebElement e : linkCount) {

			String linkName = e.getAttribute("href");

			// Convert String into Url == Java.net Package

			URL url = new URL(linkName);

			// Open each url using method called openconnection

			URLConnection openConnection = url.openConnection();

			// By using responsecode == we find links are active or broken
			// To get responsecode == we need to convert URL connection to HTTPurl
			// connection
			// conversion means typecasting - Lower interface to Higher interface

			HttpURLConnection hc = (HttpURLConnection) openConnection;

			int responseCode = hc.getResponseCode();

			if (responseCode != 200) {

				Count++;
				System.out.println("Total broken link name :" + linkName);

			}

		}
		
		System.out.println("Total broken link count :" + Count);

	}

}
