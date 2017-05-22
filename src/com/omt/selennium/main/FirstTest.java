package com.omt.selennium.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/home/omt/omt/tools/WebDriver_Selenium/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/home/omt/omt/tools/WebDriver_Selenium/chromedriver");

		new Thread() {
			@Override
			public void run() {
				try {
					openWindow1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();

		new Thread() {
			@Override
			public void run() {
				try {
					openWindow2();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();
	}

	public static void openWindow1() throws InterruptedException {
		// WebDriver wd = new FirefoxDriver();
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.com");
		System.out.println("Opened Google");

		WebElement we = wd.findElement(By.id("lst-ib"));
		we.sendKeys("omtlab.com");

		we.sendKeys(Keys.RETURN);

		System.out.println("Current URL :" + wd.getCurrentUrl());

		Thread.sleep(5000);
		wd.quit();
	}

	public static void openWindow2() throws InterruptedException {
		// WebDriver wd = new FirefoxDriver();
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.com");
		System.out.println("Opened Google");

		WebElement we = wd.findElement(By.id("lst-ib"));
		we.sendKeys("Dhiral Pandya");

		we.sendKeys(Keys.RETURN);

		System.out.println("Current URL :" + wd.getCurrentUrl());

		Thread.sleep(5000);
		wd.quit();
	}

}
