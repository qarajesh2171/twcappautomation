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
import org.eclipse.core.runtime.Assert as Assert
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

if (Mobile.verifyElementExist(findTestObject('Food tracker/My zone tab 5'), 60, FailureHandling.OPTIONAL) == true) {
    WebUI.comment('User tap on "My Zone" tab')

    Mobile.tap(findTestObject('Food tracker/My zone tab 5'), 60)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
}

WebUI.comment('User tap on setting iconI on my zone screen')

Mobile.tap(findTestObject('Object Repository/Update Targets/android.view.ViewGroup'), 30)

WebUI.comment('Verify the text : Update targets')

Mobile.verifyElementText(findTestObject('Object Repository/Update Targets/android.widget.TextView - Update Targets'), 'Update Targets')

WebUI.comment('Tap on Update target option')

Mobile.tap(findTestObject('Update Targets/android.widget.TextView - Update Targets'), 30)

WebUI.comment('Verify the Text : Desired Weight')

Mobile.verifyElementText(findTestObject('Object Repository/Update Targets/android.widget.TextView - DESIRED WEIGHT'), 'DESIRED WEIGHT')

WebUI.comment('Edit the Weight to 51')

splitted1 = Mobile.getText(findTestObject('Update Targets/android.widget.EditText - 51'), 30)

text1 = Mobile.getText(findTestObject('Object Repository/Update Targets/android.widget.TextView -  51 Kgs'), 30)

String splitted2 = text1.trim().split(' ')[0]

Mobile.comment(splitted2)

Mobile.comment(splitted1)

if (splitted1 == splitted2) {
    Mobile.comment('Weight is matched with scale')
} else {
    Mobile.comment('Weight is not matched with scale')

    Mobile.closeApplication()

    assert false : 'Test case failed.'
}

WebUI.comment('User tap on Continue Button')

Mobile.tap(findTestObject('Object Repository/Update Targets/android.widget.TextView - CONTINUE'), 30)

WebUI.comment('Verify the text "EXERCISE IN A WEEK"')

Mobile.verifyElementText(findTestObject('Object Repository/Update Targets/android.widget.TextView - EXERCISE IN A WEEK'), 
    'EXERCISE IN A WEEK?')

WebUI.comment('User tap on CONTINUE button')

Mobile.tap(findTestObject('Object Repository/Update Targets/android.widget.TextView - CONTINUE (1)'), 30)

WebUI.comment('Verify the text : CALORIES & MACRONUTRIENTS')

Mobile.verifyElementText(findTestObject('Object Repository/Update Targets/android.widget.TextView - CALORIE  MACRONUTRIENT'), 
    'CALORIE & MACRONUTRIENT')

WebUI.comment('Tap on Continue button')

Mobile.tap(findTestObject('Object Repository/Update Targets/android.widget.TextView - CONTINUE (2)'), 30)

WebUI.comment('Verify the text " GLASSES OF WATER"')

Mobile.verifyElementText(findTestObject('Object Repository/Update Targets/android.widget.TextView - GLASSES OF WATER'), 
    'GLASSES OF WATER')

WebUI.comment('User tap on Continue button')

Mobile.tap(findTestObject('Object Repository/Update Targets/android.widget.TextView - CONTINUE (3)'), 30)

WebUI.comment('Verify the text "STEPS"')

Mobile.verifyElementText(findTestObject('Object Repository/Update Targets/android.widget.TextView - STEPS'), 'STEPS')

WebUI.comment('User tap on CONTINUE button')

Mobile.tap(findTestObject('Update Targets/android.widget.TextView - CONTINUE'), 30)

WebUI.comment('Verify the text : HOURS OF SLEEP')

Mobile.verifyElementText(findTestObject('Object Repository/Update Targets/android.widget.TextView - HOURS OF SLEEP'), 'HOURS OF SLEEP')

WebUI.comment('User tap on CONTINUE button')

Mobile.tap(findTestObject('Update Targets/android.widget.TextView - CONTINUE'), 30)

WebUI.comment('Verify the text : MEDITATION MINUTES')

Mobile.verifyElementText(findTestObject('Object Repository/Update Targets/android.widget.TextView - MEDITATION MINUTES'), 
    'MEDITATION MINUTES')

WebUI.comment('User tap on CONTINUE button')

Mobile.tap(findTestObject('Object Repository/Update Targets/android.widget.TextView - CONTINUE (3)'), 30)

WebUI.comment('Verify the text : Would you like to set reminders for any of the below habits?')

Mobile.verifyElementText(findTestObject('Object Repository/Update Targets/android.widget.TextView - Would you like to set reminders for any of the below habits'), 
    'Would you like to set reminders for any of the below habits?')

WebUI.comment('User tap on CONTINUE button')

Mobile.tap(findTestObject('Update Targets/android.widget.TextView - CONTINUE'), 30)

WebUI.comment('Verify the text : My Zone')

Mobile.verifyElementText(findTestObject('Object Repository/Update Targets/android.widget.TextView - My Zone'), 'My Zone')

Mobile.closeApplication()

