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

Mobile.startApplication(GlobalVariable.diawi_path, false)

WebUI.delay(20)

not_run: if (Mobile.verifyElementExist(findTestObject('App update/android.widget.Button - CANCEL'), 40, FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('App update/android.widget.Button - CANCEL'), 30)
}

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

if (Mobile.verifyElementExist(findTestObject('Food tracker/My zone tab 5'), 35, FailureHandling.OPTIONAL) == true) {
    Mobile.tap(findTestObject('Food tracker/My zone tab 5'), 30)
}

WebUI.delay(30)

if (Mobile.verifyElementExist(findTestObject('Mood tracker/android.widget.TextView - No Mood Tracked Today'), 10, FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('Mood tracker/android.widget.TextView - No Mood Tracked Today'), 30)

    WebUI.delay(5)

    Mobile.tap(findTestObject('Mood tracker/android.widget.TextView - TRACK MOOD'), 30)
} else {
    WebUI.comment('Tap on add another mood on my zone screen')

    Mobile.tap(findTestObject('Mood tracker/android.widget.TextView - Add AnotherMood (1)'), 30)
}

WebUI.delay(3)

WebUI.comment('Tap on feerful for the Questio: How are you feeling right now?')

Mobile.tap(findTestObject('Mood tracker/android.widget.TextView - Fearful'), 30)

WebUI.delay(3)

WebUI.comment('Tap on "Dosgusted" card for the Questio: How are you feeling right now?')

Mobile.tap(findTestObject('Mood tracker/android.widget.TextView - Disgusted'), 30)

WebUI.delay(3)

WebUI.comment('Tap on "Sad" card for the Questio: How are you feeling right now')

Mobile.tap(findTestObject('Mood tracker/android.widget.TextView - Sad'), 30)

WebUI.delay(3)

WebUI.comment('User tap on "Next" button after giving answer for the firstquestion')

Mobile.tap(findTestObject('Mood tracker/Next button'), 30)

not_run: Mobile.tap(findTestObject('Object Repository/Mood tracker/android.view.ViewGroup (5)'), 30)

not_run: WebUI.delay(3)

not_run: Mobile.tap(findTestObject('Object Repository/Mood tracker/android.view.ViewGroup (6)'), 30)

WebUI.delay(3)

WebUI.comment('tap on Next button for the How strongly are you experiencing these feelings?')

Mobile.tap(findTestObject('Mood tracker/Next button'), 30)

WebUI.comment('tap on "Threatened" for Do you also feel...')

Mobile.tap(findTestObject('Mood tracker/android.widget.TextView - Threatened1'), 30)

WebUI.delay(3)

WebUI.comment('tap on "Rejected" for Do you also feel...')

Mobile.tap(findTestObject('Mood tracker/android.widget.TextView - Rejected1'), 30)

WebUI.delay(3)

not_run: Mobile.setText(findTestObject('Object Repository/Mood tracker/android.widget.EditText - or describe your feelings'), 
    'test feel', 30)

WebUI.comment('Tap on Next button after filling answersfor: Do you also feel...')

Mobile.tap(findTestObject('Mood tracker/Next button'), 30)

WebUI.delay(3)

WebUI.comment('User select "Nervous" card for the question : Do you also feel...')

Mobile.tap(findTestObject('Mood tracker/android.widget.TextView - Nervous2'), 30)

not_run: Mobile.scrollToText('Home')

WebUI.comment('User select "Exposed" card for the question: Do you also feel...')

Mobile.tap(findTestObject('Mood tracker/android.widget.TextView - Exposed2'), 30)

WebUI.delay(3)

WebUI.comment('User tap on Next button after giving answers for the "Do you also feel"')

Mobile.tap(findTestObject('Mood tracker/Next button'), 30)

WebUI.delay(5)

WebUI.comment('Tap on "Myself" card for the question : What areas of your life are making you feel this way?')

Mobile.tap(findTestObject('Mood tracker/android.widget.TextView - Myself3'), 30)

not_run: Mobile.getText(findTestObject('Object Repository/Mood tracker/android.widget.TextView - Happy'), 30)

WebUI.comment('Tap on Next button after giving answer for the question : What areas of your life are making you feel this way?')

Mobile.tap(findTestObject('Mood tracker/Next button'), 30)

WebUI.delay(3)

WebUI.comment('User tap on "COMPLETE CHECK IN" button ')

Mobile.tap(findTestObject('Mood tracker/android.widget.TextView - COMPLETE CHECK-IN'), 30)

WebUI.delay(3)

WebUI.comment('User tap on back button from Recommended for you screen')

Mobile.pressBack()

WebUI.delay(3)

WebUI.comment('capure the text " Add Another Mood" on my zone screen')

Mobile.getText(findTestObject('Mood tracker/android.widget.TextView - Add AnotherMood (1)'), 30)

WebUI.comment('Tap on Add Another Mood on My zone screen')

Mobile.tap(findTestObject('Mood tracker/android.widget.TextView - Add AnotherMood (1)'), 30)

WebUI.delay(10)

Mobile.closeApplication()

