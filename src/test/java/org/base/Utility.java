package org.base;	


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.io.File;
	import java.io.IOException;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Utility {

		public static WebDriver driver;
		
		public void getDriver() {
			System.setProperty("webdriver.chrome.driver", "D:\\Tamizhbharathi\\My_Workspace\\Libraries\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			//return driver;
		}
		public void loadUrl(String url) {
			driver.get(url);
		}
		
		public String title() {
			String titleName = driver.getTitle();
			System.out.println(titleName);
			return titleName;
		}	
		public void alertAccept() {
			Alert alertRef = driver.switchTo().alert();
			alertRef.accept();
			
		}
		public void alertDismiss() {
			Alert alertRef = driver.switchTo().alert();
			alertRef.dismiss();

		}
		
		public void alertSendKeys(String str) {
			Alert alertRef = driver.switchTo().alert();
			alertRef.sendKeys(str);
			
		}
		public String getWindowUrl() {
			String url = driver.getWindowHandle();
			return url;
		}
		public Set<String> getWindowUrls() {
			Set<String> ulrs = driver.getWindowHandles();
			return ulrs;
		}
		public void takeScreenshot(String str2) throws Throwable {
			TakesScreenshot tk = (TakesScreenshot)driver;
			File s = tk.getScreenshotAs(OutputType.FILE);
			File d = new File("D:\\\\Tamizhbharathi\\\\ProjectScreenShots"+"\\\\"+str2);
			FileUtils.copyFile(s, d);
		}
		public void maximize() {
			driver.manage().window().maximize();
		}
		public void dragAndDrop(WebElement source , WebElement target) {
			Actions actionRef = new Actions(driver);
			actionRef.dragAndDrop(source, target).perform();
		}
		public void moveToElement(WebElement element) {
			Actions actionRef = new Actions(driver);
			actionRef.moveToElement(element).perform();
		}
		public void rightClick() {
			Actions actionRef = new Actions(driver);
			actionRef.contextClick();
		}
		public void keyPress(int keycode) throws AWTException {
			Robot robotRef = new Robot();
			robotRef.keyPress(keycode);
		}
		public void keyRelease(int keycode) throws Throwable {
			Robot robotRef = new Robot();
			robotRef.keyRelease(keycode);
		}
		public void keyUp(WebElement target, CharSequence key ) {
			Actions actionRef = new Actions(driver);
			actionRef.keyDown(target, key);
		}
		public void keyDown(WebElement target , CharSequence key) {
			Actions actionRef = new Actions(driver);
			actionRef.keyUp(target, key);
		}
		public void findElementById(String locator) {
			driver.findElement(By.id(locator));	
		}
		public void findElementByName(String locator) {
			driver.findElement(By.name(locator));
		}
		public void findElementByXpath(String locator) {
			driver.findElement(By.xpath(locator));
		}
		public void type(WebElement element , String text) {
			element.sendKeys(text);
		}
		public void btnClick(WebElement element) {
			element.click();
		}
		public void selectValue(WebElement element, String str) {
			Select selectRef = new Select(element);
			selectRef.selectByValue(str);
		}
		public void selectVisibleText(WebElement element, String str) {
			Select selectRef = new Select(element);
			selectRef.selectByVisibleText(str);
			
		}
		
		public String retrieveText(WebElement element) {
			String str = element.getText();
			return str;	

		}
		public String getAttribute(WebElement element) {
			String str = element.getAttribute("value");
			return str;
			
		}
		
	}

