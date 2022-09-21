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

Mobile.startApplication('C:\\Users\\rajeshs1\\Downloads\\TWC_V77(5.8)_2021-11-22_16-21_IST-release.apk', false)

WebUI.delay(40)

/*String welcometext = WebUI.getText(findTestObject('Registration/Welcome text'))

if (welcometext == (('Hi' + 'Rrajesh') + '!')) {
    println('User registered successfully' + 'User matched')
} else {*/
Mobile.tap(findTestObject('Hamburger menu'), 0)

WebUI.delay(4)

def email = Mobile.getText(findTestObject('Registration/Email address sidemenu'), 10)
println(email)

def username = Mobile.getText(findTestObject('Registration/Sidemenu text'), 10)
println(username)

