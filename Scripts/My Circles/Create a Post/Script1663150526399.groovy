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

Mobile.tap(findTestObject('Object Repository/Share Post/android.view.ViewGroup'), 30)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(566, 1513, 709, 963)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Share Post/android.view.ViewGroup (2)'), 30)

Mobile.tap(findTestObject('Object Repository/Share Post/android.widget.TextView - Wellness Corner'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Share Post/android.widget.TextView - Create a Post'), 30)

screen1 = Mobile.getText(findTestObject('Object Repository/Share Post/android.widget.TextView - Create a Post'), 30)

if(screen1 == 'Create a Post') {
	Mobile.comment("Test case passed- User navigates to the Create a Post screen")
}else {
	Mobile.comment("Test case passed- User doesn't navigates to the Create a Post screen")
	Mobile.closeApplication()
	
	assert false : 'Test case passed- User does not navigates to the Create a Post screen'
}

Mobile.tap(findTestObject('Object Repository/Share Post/android.widget.TextView - Select circle'), 30)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Share Post/select circle tick'), 30)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/Share Post/android.widget.TextView - SAVE'), 30)

Mobile.tap(findTestObject('Share Post/android.widget.TextView - SAVE'), 30)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/Share Post/android.widget.TextView - My Circles'), 30)

Mobile.getText(findTestObject('Object Repository/Share Post/android.widget.TextView - a few seconds ago'), 30, FailureHandling.OPTIONAL)

Mobile.closeApplication()

