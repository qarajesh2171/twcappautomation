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

Mobile.startApplication(GlobalVariable.diawi_path, false)

WebUI.delay(20)

KeywordLogger log = new KeywordLogger()

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

if (Mobile.verifyElementExist(findTestObject('Food tracker/My zone tab 5'), 30, FailureHandling.OPTIONAL) == true) {
    Mobile.tap(findTestObject('Food tracker/My zone tab 5'), 20)
}

WebUI.comment('Tap on my zone tab on home screen')

WebUI.delay(15)

WebUI.comment('Tap on Water tracker in my zone section')

Mobile.tap(findTestObject('hc/water tracker 01'), 30, FailureHandling.OPTIONAL)

WebUI.delay(5)

verifyscreen = Mobile.verifyElementText(findTestObject('MJ/android.widget.TextView - Water Tracker'), 'Water Tracker', FailureHandling.OPTIONAL)

if (verifyscreen == true) {
    WebUI.comment('Verified')
} else {
    Mobile.pressBack()

    WebUI.delay(3)

    Mobile.tap(findTestObject('hc/water tracker01'), 30, FailureHandling.OPTIONAL)

    WebUI.delay(5)
}

WebUI.comment('capture the heading of the screen: "Water Tracker"')

def watertracker = Mobile.getText(findTestObject('Object Repository/Water tracker/android.widget.TextView - Water Tracker'), 
    30)

log.logInfo(watertracker)

if (watertracker == 'Water Tracker') {
    log.logInfo('User is at Water Tracker')
} else {
    log.logInfo('Test case failed- User is at Another Tracker')

    assert false : 'Test-case failed'
}

WebUI.delay(10)

WebUI.comment('Tap on "+" icon to add no. of glass of water from 0 to 1')

Mobile.tap(findTestObject('Water tracker/add number of glassess water tracker'), 30)

WebUI.delay(15)

WebUI.comment('Capture the text "1 glass" after adding glass of water from Quick Add for Today section')

def waterglasses1 = Mobile.getText(findTestObject('Water tracker/Capture -1 glass after adding glass'), 30)

log.logInfo(waterglasses1)

WebUI.comment('Tap on back button to redirect on my zone screen')

Mobile.pressBack()

WebUI.delay(5)

WebUI.comment('Tap on Water Tracker from my zone screen')

Mobile.tap(findTestObject('hc/water tracker 01'), 30, FailureHandling.OPTIONAL)

WebUI.delay(5)

verifyscreen = Mobile.verifyElementText(findTestObject('MJ/android.widget.TextView - Water Tracker'), 'Water Tracker', FailureHandling.OPTIONAL)

if (verifyscreen == true) {
    WebUI.comment('Verified')
} else {
    Mobile.pressBack()

    WebUI.delay(3)

    Mobile.tap(findTestObject('hc/water tracker01'), 30, FailureHandling.OPTIONAL)

    WebUI.delay(5)
}

not_run: WebUI.comment('Verified')

not_run: Mobile.pressBack()

not_run: WebUI.delay(3)

not_run: Mobile.tap(findTestObject('hc/water tracker 01'), 30, FailureHandling.OPTIONAL)

not_run: WebUI.delay(5)

WebUI.comment('Capure the number of glass of water from logs.')

def waterglasses2 = Mobile.getText(findTestObject('Water tracker/Captre 1 glass in logs'), 30)

log.logInfo(waterglasses2)

if (waterglasses1 == waterglasses2) {
    log.logInfo('Logged glasses are same')
} else {
    log.logInfo('Logged glasses are not same')

    log.logInfo(waterglasses1)

    log.logInfo(waterglasses2)

    assert false : 'Test-case failed'
}

WebUI.comment('Tap on Delete icon showing infront of water log for today')

Mobile.tap(findTestObject('Water tracker/Delete icon'), 30)

WebUI.delay(5)

WebUI.comment('Tap on the "DELETE" button on the pop-up')

Mobile.tap(findTestObject('Water tracker/DELETE button on ppup'), 30)

WebUI.delay(5)

WebUI.comment('Tap on back button from water tracker screen')

Mobile.pressBack()

WebUI.delay(5)

Mobile.closeApplication()

