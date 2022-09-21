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

Mobile.startApplication(GlobalVariable.build_path, false)

KeywordLogger log = new KeywordLogger()

WebUI.delay(30)

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

WebUI.comment('Tap on "Health Checks" fromhome screen')

Mobile.tap(findTestObject('Object Repository/health check/android.widget.TextView - Health Checks'), 120)

WebUI.delay(10)

WebUI.comment('Tap on first card of Health Checks @Diagnostic Centers or Hospitals : "Comprehensive ull Body Checkup with Vitamin D & B12"')

Mobile.tap(findTestObject('hc/BUY1'), 30, FailureHandling.OPTIONAL)

WebUI.delay(8)

not_run: Mobile.tap(findTestObject('hc/buy button0'), 30, FailureHandling.OPTIONAL)

not_run: WebUI.delay(8)

def packagename1 = Mobile.getText(findTestObject('health check/android.widget.TextView - Comprehensive Full Body Checkup with Vitamin D  B12 (2)'), 
    30)

not_run: Mobile.getText(findTestObject('Object Repository/health check/android.widget.TextView - Comprehensive Full Body Checkup with Vitamin D  B12'), 
    30)

not_run: Mobile.getText(findTestObject('Object Repository/health check/android.widget.TextView - MRP55001499'), 30)

WebUI.comment('Tap on "SELECT PACKAGE" button on package detail screen')

Mobile.tap(findTestObject('hc-hc/SELECT PACKAGE in package details'), 30, FailureHandling.OPTIONAL)

WebUI.delay(10)

not_run: Mobile.tap(findTestObject('hc/SELECT PACKAGE text button'), 30, FailureHandling.OPTIONAL)

not_run: WebUI.delay(3)

if (Mobile.verifyElementExist(findTestObject('Object Repository/health check/android.widget.TextView -  ADD NEW'), 30, FailureHandling.OPTIONAL) == 
true) {
    WebUI.comment('Tap on "ADD NEW" icon to add new address')

    Mobile.tap(findTestObject('Object Repository/health check/android.widget.TextView -  ADD NEW'), 30)
} else {
    WebUI.comment('tap on "ADD ADDRESS" button to add new address')

    Mobile.tap(findTestObject('health check/android.widget.TextView - ADD ADDRESS'), 30)
}

WebUI.comment('Set the pin code in "Pincode" field')

Mobile.setText(findTestObject('Object Repository/health check/android.widget.EditText - Pincode'), '110032', 30)

WebUI.comment('Tap on Address field to add address')

Mobile.setText(findTestObject('Object Repository/health check/android.widget.EditText - Address'), '52, vaishali nagar', 
    30)

WebUI.comment('Set the name in the Name field of the Add Address screen')

Mobile.setText(findTestObject('Object Repository/health check/android.widget.EditText - Name'), 'Rajeshqc', 30)

WebUI.comment('Set the phone number in the phone field of the add adress screen')

Mobile.setText(findTestObject('Object Repository/health check/android.widget.EditText - Phone'), '8952954319', 30)

Mobile.setText(findTestObject('Object Repository/health check/android.widget.EditText - 8952954319'), '8888888888', 30)

WebUI.comment('User tap on "HOME" button on the add address screen')

Mobile.tap(findTestObject('Object Repository/health check/android.widget.TextView - HOME'), 30)

WebUI.comment('Tap on "SAVE" button to Add address on the Add Address screen')

Mobile.tap(findTestObject('Object Repository/health check/android.widget.TextView - SAVE'), 30)

WebUI.delay(4)

Mobile.scrollToText('Rajeshqc', FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Tap on New address added with name " Rajeshqc"')

Mobile.tap(findTestObject('Object Repository/health check/android.widget.TextView - Rajeshqc'), 30)

WebUI.comment('tap on "CONTINUE" button on select address screen after selecting the addresss')

Mobile.tap(findTestObject('Object Repository/health check/android.widget.TextView - CONTINUE'), 30)

WebUI.comment('Tap on "+ADD NEW PATIENT" button on Select Patient screen to add new patient.')

Mobile.tap(findTestObject('Object Repository/health check/android.widget.TextView -  ADD NEW PATIENT'), 30)

WebUI.comment('tap on "Spouse" for the relation of the patient on add New Patient screen')

WebUI.delay(5)

Mobile.tap(findTestObject('hc-hc/Spouse in add new patient'), 30)

WebUI.comment('Set the Name of the patient in Name field on Add New Patient screen')

Mobile.setText(findTestObject('Object Repository/health check/android.widget.EditText - Name (1)'), 'rajeshqc', 30)

WebUI.comment('Tap on Male on Add New Patient screen')

Mobile.tap(findTestObject('hc-hc/MALE in add new patient'), 30, FailureHandling.OPTIONAL)

WebUI.comment('set the age "26" in the age field on AddNew Patient screen')

Mobile.setText(findTestObject('Object Repository/health check/android.widget.EditText - Age'), '26', 30)

WebUI.comment('set the Email Address "rajeshqc@mailinator.com" in the email address field')

Mobile.setText(findTestObject('Object Repository/health check/android.widget.EditText - Email Address'), 'rajeshqc@mailinator.com', 
    30)

WebUI.comment('Set the Phone number in the phone field on Add new Patient screen')

Mobile.setText(findTestObject('Object Repository/health check/android.widget.EditText - Phone Number'), '8952954319', 30)

Mobile.setText(findTestObject('Object Repository/health check/android.widget.EditText - 8952954319'), '8888888888', 30)

WebUI.comment('tap on "ADD PATIENT" button on Add new patient screen')

Mobile.tap(findTestObject('hc-hc/ADD PATIENT in add new patient'), 30)

WebUI.delay(3)

not_run: Mobile.getText(findTestObject('Object Repository/health check/android.widget.TextView - 1499.00'), 30)

WebUI.comment('tap on the pickup button of the newly added patient')

Mobile.tap(findTestObject('hc-hc/PROCEED in select patient'), 30)

WebUI.delay(3)

WebUI.comment('Tap on the pickup button of Before 10 AM on select time screen')

Mobile.tap(findTestObject('Object Repository/health check/android.widget.TextView - Before 10 AM'), 30)

WebUI.comment('User tap on "PROCEED" button on select Time screen')

Mobile.tap(findTestObject('hc/android.widget.TextView - PROCEED'), 30)

WebUI.delay(10)

def packagename2 = Mobile.getText(findTestObject('hc/android.widget.TextView - Complete Care Premium Health Check Package'), 
    30)

log.logInfo(packagename1)

log.logInfo(packagename2)

if (packagename1 == packagename2) {
    log.logInfo(('Testcase passed' + ' ') + packagename1)
} else {
    log.logInfo(('Testcase failed' + ' ') + packagename2)

    assert false : 'Package name is not matched'
}

not_run: Mobile.getText(findTestObject('Object Repository/health check/android.widget.TextView - Comprehensive Full Body Checkup with Vitamin D  B12 (1)'), 
    30)

not_run: Mobile.getText(findTestObject('Object Repository/health check/android.widget.TextView - 1499.00 (1)'), 30)

WebUI.comment('Tap on "BOOK nOw" button on confirm order screen')

Mobile.tap(findTestObject('Object Repository/health check/android.widget.TextView - BOOK NOW'), 30)

WebUI.delay(20)

WebUI.comment('User tap on "Wallet-PhonePe" on payment screen')

Mobile.tap(findTestObject('Object Repository/health check/android.view.View - 260e3cf3_rzp.preferred_0_0_wallet_false Wallet - PhonePe'), 
    30)

not_run: Mobile.tap(findTestObject('Object Repository/health check/android.view.View'), 30)

Mobile.closeApplication()

