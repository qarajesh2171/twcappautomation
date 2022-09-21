import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

System.setProperty('webdriver.chrome.driver', 'D:\\Katalon builds\\Katalon_Studio_Windows_64-8.3.5\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe')

ChromeOptions option = new ChromeOptions()

option.setBinary('C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe')

/*DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(ChromeOptions.CAPABILITY, option);
ChromeDriver driver = new ChromeDriver(capabilities);
DriverFactory.changeWebDriver(driver)
*/
HashMap<String, Object> chromePrefs = new HashMap<String, Object>()

chromePrefs.put('download.default_directory', 'C:\\Users\\rajeshs1\\Downloads')

chromePrefs.put('download.prompt_for_download', false)

RunConfiguration.setWebDriverPreferencesProperty('prefs', chromePrefs)

//driver = new ChromeDriver(option)	
//driver.get(GlobalVariable.diawi_link)
WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.outlook_path)

WebUI.setText(findTestObject('Object Repository/Outlook/Page_Outlook/input_Show password_username'), GlobalVariable.user_email)

WebUI.setText(findTestObject('Object Repository/Outlook/Page_Outlook/input_Show password_password'), GlobalVariable.password_email)

WebUI.click(findTestObject('Object Repository/Outlook/Page_Outlook/span_sign in'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Outlook/Page_Mail - rajesh.sharma1truworth.com/button_Mail_O365_MainLink_Settings'))

WebUI.click(findTestObject('Object Repository/Outlook/Page_Mail - rajesh.sharma1truworth.com/button_Refresh'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Outlook/Page_Mail - rajesh.sharma1truworth.com/div_Draft     Rajesh Sharma1 Pushpendra Sin_371dd2'))

WebUI.click(findTestObject('Object Repository/Outlook/Page_Mail - rajesh.sharma1truworth.com/div_Pushpendra Singh  Doctor Consultation d_f7f441'))

link = WebUI.getText(findTestObject('Object Repository/Outlook/Page_Mail - rajesh.sharma1truworth.com/a_httpsi.diawi.comZvkaM6'))

WebUI.comment(link)

WebUI.delay(10)

WebUI.closeBrowser()

