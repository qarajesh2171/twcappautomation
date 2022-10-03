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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

Mobile.startApplication(GlobalVariable.build_path, false)

WebUI.delay(40)

KeywordLogger log = new KeywordLogger()

WebUI.delay(3)

WebUI.comment('Verify that Hamburger menu is present and Capture the username from side menu on taping hamburger icon')

username = Mobile.verifyElementExist(findTestObject('Hamburger menu'), 30, FailureHandling.OPTIONAL)

if (username == false) {
    WebUI.callTestCase(findTestCase('TestModules/call dashboard screen'), [:], FailureHandling.STOP_ON_FAILURE)
}

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Tap on Hamburger menu.')

Mobile.tap(findTestObject('Hamburger menu'), 30)

WebUI.delay(10)

WebUI.comment('Get email address text.')

def actualemail = Mobile.getText(findTestObject('Registration/Email address sidemenu'), 30)

WebUI.delay(5)

Mobile.pressBack()

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/Wallet/android.view.ViewGroup'), 30)

Mobile.getText(findTestObject('Object Repository/Wallet/android.widget.TextView - My Wallet'), 30)

Mobile.getText(findTestObject('Object Repository/Wallet/android.widget.TextView - Where to spend'), 30)

Mobile.getText(findTestObject('Object Repository/Wallet/android.widget.TextView - available in your wallet'), 30)

WebUI.callTestCase(findTestCase('TestModules/New Test Case (2)'), [:], FailureHandling.STOP_ON_FAILURE)

