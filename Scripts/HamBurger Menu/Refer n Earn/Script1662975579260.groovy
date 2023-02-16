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

Mobile.startApplication(GlobalVariable.diawi_path, false)

WebUI.delay(40)

KeywordLogger log = new KeywordLogger()

WebUI.delay(3)

WebUI.comment('Verify that Hamburger menu is present and Capture the username from side menu on taping hamburger icon')

username = Mobile.verifyElementExist(findTestObject('Hamburger menu'), 30, FailureHandling.OPTIONAL)

if (username == false) {
    WebUI.callTestCase(findTestCase('TestModules/call dashboard screen'), [:], FailureHandling.STOP_ON_FAILURE)

    not_run: WebUI.comment('Tap on Hamburger menu.')

    not_run: Mobile.tap(findTestObject('Hamburger menu'), 30)

    not_run: WebUI.delay(10)

    not_run: Mobile.scrollToText('Log Out')

    not_run: WebUI.comment('Tap on Logout button.')

    not_run: Mobile.tap(findTestObject('null'), 10)

    not_run: WebUI.delay(20)
}

WebUI.comment('Tap on Hamburger menu')

Mobile.tap(findTestObject('Hamburger menu'), 30)

WebUI.delay(10)

WebUI.comment('Tap on Refer & Earn from side menu')

Mobile.tap(findTestObject('Object Repository/Refer n Earn/android.widget.TextView - Refer  Earn'), 30)

WebUI.comment('After Taping on Refer & Earn Verify the text on next screen : Invite Your Friends')

Mobile.verifyElementText(findTestObject('Object Repository/Refer n Earn/android.widget.TextView - Invite Your Friends'), 
    'Invite Your Friends')

WebUI.comment('Tap on "SHARE REFERRAL CODE"')

Mobile.tap(findTestObject('Object Repository/Refer n Earn/android.widget.TextView - SHARE REFERRAL CODE'), 30)

WebUI.comment('Tap on Back button')

Mobile.pressBack()

WebUI.comment('Tap on "TRACK MY REFERRALS"')

Mobile.tap(findTestObject('Object Repository/Refer n Earn/android.widget.TextView - TRACK MY REFERRALS'), 30)

WebUI.comment('Verify the Text of Heading : Refer & Earn')

Mobile.verifyElementText(findTestObject('Object Repository/Refer n Earn/android.widget.TextView - Refer  Earn (1)'), 'Refer & Earn')

screen1 = Mobile.getText(findTestObject('Object Repository/Refer n Earn/android.widget.TextView - Refer  Earn (1)'), 30)

WebUI.comment('Tap on Back Button')

Mobile.pressBack()

WebUI.comment('Tap on Back button to redirect on Home Screen')

Mobile.pressBack()

if (screen1 == 'Refer & Earn') {
    WebUI.comment('Test case Passed')
} else {
    WebUI.comment('Test case Failed')

    Mobile.closeApplication()

    assert false : 'Test case failed- User not at Refer n Earn screen'
}

Mobile.closeApplication()

