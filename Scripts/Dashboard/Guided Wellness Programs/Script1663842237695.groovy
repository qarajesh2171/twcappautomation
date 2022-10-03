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
    WebUI.callTestCase(findTestCase('TestModules/call dashboard screen 2'), [:], FailureHandling.STOP_ON_FAILURE)
}

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/GWP/android.widget.TextView - Guided Wellness Programs'), 30)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/GWP/android.widget.TextView - Diabetes Management'), 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/GWP/android.widget.TextView - Diabetes Management (1)'), 30)

Mobile.getText(findTestObject('Object Repository/GWP/android.widget.TextView - How does it work'), 30)

Mobile.tap(findTestObject('Object Repository/GWP/android.widget.TextView - JOIN NOW'), 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('GWP/android.widget.TextView - Diabetes Management (1)'), 30)

Mobile.getText(findTestObject('Object Repository/GWP/android.widget.TextView - In Progress'), 30)

Mobile.tap(findTestObject('Object Repository/GWP/android.widget.TextView - VIEW TASKS'), 30)

Mobile.getText(findTestObject('Object Repository/GWP/android.widget.TextView - Todays Tasks'), 30)

Mobile.getText(findTestObject('Object Repository/GWP/android.widget.TextView - Yesterdays Tasks'), 30)

Mobile.tap(findTestObject('Object Repository/GWP/android.view.ViewGroup'), 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/GWP/android.widget.TextView - Leave Program'), 30)

Mobile.getText(findTestObject('Object Repository/GWP/android.widget.TextView - Are you sure'), 30)

Mobile.tap(findTestObject('Object Repository/GWP/android.widget.Button - YES, LEAVE PROGRAM'), 30)

Mobile.pressBack()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

text1 = Mobile.getText(findTestObject('Object Repository/GWP/android.widget.TextView - Guided Wellness Programs (1)'), 30)

if (text1 == 'Guided Wellness Programs') {
    Mobile.comment('Test Case Passed')

    Mobile.pressBack()

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.getText(findTestObject('Object Repository/GWP/android.widget.TextView - Select an option to explore The Wellness Corner'), 
        30)

    Mobile.closeApplication()
} else {
    Mobile.comment('Test Case Failed')

    Mobile.closeApplication()

    assert false : 'Test Case Failed'
}

