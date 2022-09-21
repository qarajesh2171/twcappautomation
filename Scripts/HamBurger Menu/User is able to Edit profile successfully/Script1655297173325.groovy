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

WebUI.comment('capture username from side menu.')

def username = Mobile.getText(findTestObject('Object Repository/Edit profile/android.widget.TextView - Rajesh QC'), 30)

log.logInfo(username)

WebUI.comment('Tap on Edit Profile from side menu')

Mobile.tap(findTestObject('Object Repository/Edit profile/android.widget.TextView - EDIT PROFILE'), 30)

WebUI.delay(5)

String candidateChars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

StringBuilder fname = new StringBuilder()

Random random = new Random()

for (int i = 0; i < 6; i++) {
    fname.append(candidateChars.charAt(random.nextInt(candidateChars.length())))
}

WebUI.comment('Edit the first name of user')

//def fname = 'Rajesh'
Mobile.setText(findTestObject('Object Repository/Edit profile/android.widget.EditText - Rajesh'), fname.toString(), 30)

WebUI.delay(3)

String candidateChars1 = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

StringBuilder lname = new StringBuilder()

Random random1 = new Random()

for (int i = 0; i < 6; i++) {
    lname.append(candidateChars1.charAt(random1.nextInt(candidateChars1.length())))
}

WebUI.comment('Edit the last name of user.')

//def lname = 'QC'
Mobile.setText(findTestObject('Object Repository/Edit profile/android.widget.EditText - QC'), lname.toString(), 30)

WebUI.delay(3)

WebUI.comment('Tap on Edit DOB')

Mobile.tap(findTestObject('Edit profile/DOB tab'), 30)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Edit profile/android.view.View - 4'), 30)

WebUI.comment('Tap on Ok button on calendar.')

Mobile.tap(findTestObject('Object Repository/Edit profile/android.widget.Button - OK'), 30)

WebUI.comment('tap on Bio field to edit Bio.')

Mobile.setText(findTestObject('Edit profile/android.widget.EditText - live user (1)'), 'Testing text for automation testing', 
    30, FailureHandling.OPTIONAL)

WebUI.delay(8)

WebUI.comment('Tap on save button on Edit screen.')

Mobile.tap(findTestObject('Edit profile/save button'), 30)

WebUI.delay(15)

WebUI.comment('Tap on Hamburger menu icon.')

Mobile.tap(findTestObject('Hamburger menu'), 30)

WebUI.delay(10)

WebUI.comment('Capture the text i.e. full name of user from side menu')

def Eusername = Mobile.getText(findTestObject('Edit profile/android.widget.TextView - MUZTUM ORYDUU'), 30)

not_run: def Eusername1 = Mobile.getText(findTestObject('Registration/Email address sidemenu'), 30)

log.logInfo(Eusername)

def username1 = (fname.toString() + ' ') + lname.toString()

if (Eusername == username1) {
    log.logInfo('User details are edited.')

    log.logInfo(Eusername)

    log.logInfo(username1)
} else {
    log.logInfo('User details are not edited.')

    log.logInfo(Eusername)

    log.logInfo(username1)

    not_run: assert false : 'Test case fail due to edit profile is not working.'
}

WebUI.delay(10)

Mobile.closeApplication()

