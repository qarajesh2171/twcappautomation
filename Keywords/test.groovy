import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.FluentWait
//import org.openqa.selenium.support.ui
import com.google.common.base.Function

import internal.GlobalVariable


public class test {
protected WebDriver driver
@Keyword
public void waitForElementvisible(TestObject to, String PropertyValue){
//get the locator value by find it from the testobject
String locator = to.findPropertyValue(PropertyValue)
System.out.println("check" + locator)
driver = DriverFactory.getWebDriver()

	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(60, TimeUnit.SECONDS)
			.pollingEvery(5, TimeUnit.SECONDS)
			.ignoring(WebElementNotFoundException.class)
	WebElement element = wait.until(new Function<WebDriver, WebElement>() {

				public WebElement apply(WebDriver driver) {
					WebElement element
											//check if the locator value is css or xpath
					if (PropertyValue.equals("css")){
						element = driver.findElement(By.cssSelector(locator))
					}
					else if (PropertyValue.equals("xpath")){
						element = driver.findElement(By.xpath(locator))
					}

					return element
				}
			})
}
}