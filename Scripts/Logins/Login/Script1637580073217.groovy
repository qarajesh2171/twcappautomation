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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

Mobile.startApplication('C:\\Users\\rajeshs1\\Downloads\\TWC_V77(5.8)_2021-11-22_16-21_IST-release.apk', false)

WebUI.delay(40)

KeywordLogger log = new KeywordLogger()

Mobile.tap(findTestObject('Enter email tab'), 10)

def email = 'rajesh.sharma1@truworth.com'

Mobile.setText(findTestObject('Enter your email'), email, 10)

Mobile.tap(findTestObject('Continue'), 10)

Mobile.setText(findTestObject('Enter password'), 'test@123', 10)

Mobile.tap(findTestObject('Continue button'), 10)

WebUI.delay(5)

Mobile.tap(findTestObject('Hamburger menu'), 10)

def actualemail = Mobile.getText(findTestObject('Registration/Email address sidemenu'), 10)

if (email == actualemail) {
    log.logInfo('email matched')
	log.logInfo(actualemail)
	log.logInfo(email)
	
} 
    Mobile.scrollToText('Log Out')

    Mobile.tap(findTestObject('null'), 10)

    WebUI.delay(10)

    Mobile.closeApplication()

