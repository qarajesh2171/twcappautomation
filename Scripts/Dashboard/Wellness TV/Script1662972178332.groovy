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

WebUI.comment('Tap on Wellness Tv icon')

Mobile.tap(findTestObject('Object Repository/Wellness TV/android.widget.TextView - Wellness TV'), 30)

WebUI.comment('Tap on recently uploaded First Video')

Mobile.tap(findTestObject('Object Repository/Wellness TV/android.widget.ImageView'), 30)

WebUI.comment('Tap on Watch now button')

Mobile.tap(findTestObject('Object Repository/Wellness TV/android.widget.TextView - WATCH NOW'), 30)

WebUI.comment('Verify the Text "Wellness Corner" on the Header')

Mobile.verifyElementText(findTestObject('Object Repository/Wellness TV/android.widget.TextView - Wellness Corner'), 'Wellness Corner')

videoplayertext = Mobile.getText(findTestObject('Object Repository/Wellness TV/android.widget.TextView - Wellness Corner'), 
    30)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Tap on Back icon')

Mobile.pressBack()

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Object Repository/Wellness TV/android.widget.TextView - ADD TO LOG'), 30, 
    FailureHandling.OPTIONAL) == true) {
    WebUI.comment('Tap on "ADD TO LOG"')

    Mobile.tap(findTestObject('Object Repository/Wellness TV/android.widget.TextView - ADD TO LOG'), 30)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    WebUI.comment('Tap on Dismiss button to remove the Workout logged successfully popup')

    Mobile.tap(findTestObject('Object Repository/Wellness TV/android.widget.TextView - DISMISS'), 30)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
}

WebUI.comment('Verify the text on header : Video Details')

Mobile.verifyElementText(findTestObject('Object Repository/Wellness TV/android.widget.TextView - Video Details'), 'Video Details', 
    FailureHandling.OPTIONAL)

WebUI.comment('Tap on Back button')

Mobile.pressBack()

WebUI.comment('Verify the text on the screen header : Wellness TV')

Mobile.verifyElementText(findTestObject('Object Repository/Wellness TV/android.widget.TextView - Wellness TV (1)'), 'Wellness TV')

WebUI.comment('Tap on Back button to redirect on Home Screen')

Mobile.pressBack()

WebUI.comment('Verify the text : Select an option to explore The Wellness Corner')

Mobile.verifyElementText(findTestObject('Object Repository/Wellness TV/android.widget.TextView - Select an option to explore The Wellness Corner'), 
    'Select an option to explore The Wellness Corner')

if (videoplayertext == 'Wellness Corner') {
    WebUI.comment('Test case Passed')
} else {
    WebUI.comment('Test Case failed due to user not navigates to the video player screen')

    Mobile.closeApplication()

    assert false : 'Test Case failed due to user not navigates to the video player screen'
}

Mobile.closeApplication()

