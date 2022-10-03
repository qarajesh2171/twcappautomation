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

Mobile.tap(findTestObject('Object Repository/Wellness Plans/android.widget.TextView - Wellness Plans'), 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(538, 988)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/Wellness Plans/android.widget.TextView - Plan Details'), 30)

Mobile.tap(findTestObject('Object Repository/Wellness Plans/android.widget.TextView - BOOK NOW'), 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/Wellness Plans/android.widget.TextView - Select Coach'), 30)

Mobile.tap(findTestObject('Object Repository/Wellness Plans/android.widget.TextView - BOOK APPOINTMENT'), 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/Wellness Plans/android.widget.TextView - Book a Session'), 30)

Mobile.tap(findTestObject('Wellness Plans/android.widget.TextView - 0500 PM'), 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/Wellness Plans/android.widget.TextView - Checkout'), 30)

Mobile.getText(findTestObject('Object Repository/Wellness Plans/android.widget.TextView - Shuvashish Mukherjee'), 30)

Mobile.getText(findTestObject('Object Repository/Wellness Plans/android.widget.TextView - Amount Payable'), 30)

Mobile.tap(findTestObject('Object Repository/Wellness Plans/android.widget.TextView - PROCEED TO PAYMENT'), 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

