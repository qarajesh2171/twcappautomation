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

Mobile.scrollToText('Gyms & Fitness Centers', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/Fitternity/android.widget.TextView - Gyms  Fitness Centers'), 30)

Mobile.tap(findTestObject('Fitternity/android.widget.TextView - Gyms  Fitness Centers'), 30)

WebUI.delay(5)

Mobile.getText(findTestObject('Object Repository/Fitternity/android.widget.TextView - Choose an activity'), 30, FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Fitternity/android.widget.TextView - Book a Workout'), 30)

Mobile.tap(findTestObject('Fitternity/android.widget.TextView - Explore all'), 30)

WebUI.delay(3)

Mobile.tapAtPosition(562, 772)

WebUI.delay(3)

Mobile.getText(findTestObject('Object Repository/Fitternity/android.widget.TextView - Facilities'), 30)

Mobile.tap(findTestObject('Object Repository/Fitternity/android.widget.TextView - BOOK A SESSION'), 30)

WebUI.delay(3)

Mobile.tapAtPosition(303, 1551)

not_run: Mobile.getText(findTestObject('Object Repository/Fitternity/android.widget.TextView - 30700 pm - 30800 pm'), 30)

Mobile.tap(findTestObject('Object Repository/Fitternity/android.view.ViewGroup'), 30)

WebUI.delay(3)

Mobile.getText(findTestObject('Object Repository/Fitternity/android.widget.TextView - Booking For'), 30)

Mobile.getText(findTestObject('Object Repository/Fitternity/android.widget.TextView - Im booking for myself'), 30)

Mobile.tap(findTestObject('Object Repository/Fitternity/android.widget.TextView - BOOK SESSION'), 30)

WebUI.delay(3)

Mobile.getText(findTestObject('Object Repository/Fitternity/android.widget.TextView - Checkout'), 30)

Mobile.tap(findTestObject('Object Repository/Fitternity/android.widget.TextView - CHECKOUT (1)'), 30)

WebUI.delay(10)

Mobile.closeApplication()

