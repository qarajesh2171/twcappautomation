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
    WebUI.comment('User tap on "My zone" tab from home screen')

    Mobile.tap(findTestObject('Food tracker/My zone tab 5'), 15)
}

WebUI.delay(15)

WebUI.comment('User scroll to "8 hours sleep"')

Mobile.scrollToText('8 hours slept', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Object Repository/My habits/android.widget.TextView - No Habits Found'), 30)

WebUI.comment('User tap on Habit tracker from the My zone screen.')

Mobile.tap(findTestObject('habits/tap on habit tracker tab'), 30, FailureHandling.OPTIONAL)

WebUI.delay(5)

Mobile.tap(findTestObject('trackers/habit tracker'), 30, FailureHandling.OPTIONAL)

if (Mobile.verifyElementExist(findTestObject('My habits/continue when no habits'), 15, FailureHandling.OPTIONAL) == true) {
    WebUI.comment('User tap on "Continue" button when no habit is saved.')

    Mobile.tap(findTestObject('My habits/continue when no habits'), 30)

    WebUI.delay(3)

    WebUI.comment('Tap on "Drink water" habit ')

    Mobile.tap(findTestObject('My habits/drink water'), 30)

    WebUI.delay(3)

    Mobile.verifyElementText(findTestObject('habits/Drink water text'), 'Drink water')

    WebUI.comment('User tap on "Repeat" From Drink water habit screen toset the weak days for the habit.')

    Mobile.tap(findTestObject('habits/Repeat- drink water'), 30)

    WebUI.delay(3)

    WebUI.comment('User tap on "Sunday" fto remove this day for the water tracker habit.')

    Mobile.tap(findTestObject('habits/sunday0'), 30)

    WebUI.delay(3)

    WebUI.comment('User tap on "Wednesday" to remove this day for the water tracker habit.')

    Mobile.tap(findTestObject('habits/wednesday0'), 30)

    WebUI.delay(3)

    WebUI.comment('Tap on back button from Repeat screen from where user select weak days.')

    Mobile.pressBack()

    WebUI.delay(3)

    WebUI.comment('Tap on Goal from Drink water screen')

    Mobile.tap(findTestObject('habits/Goal- drink water'), 30)

    WebUI.delay(3)

    WebUI.comment('Tap back button from Goal screen from where user select number of glass of water.')

    Mobile.pressBack()

    WebUI.delay(3)

    WebUI.comment('Tap on "Reminders" on Drink water Habit screen.')

    Mobile.tap(findTestObject('habits/Reminder- drik water'), 30)

    WebUI.delay(3)

    WebUI.comment('Scroll to the text "ADD REMINDER"')

    Mobile.scrollToText('ADD REMINDER', FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(3)

    not_run: Mobile.getText(findTestObject('Object Repository/My habits/android.widget.TextView - ADD REMINDER'), 30)

    WebUI.comment('Tap on "ADD REMINDERS" button from Reminders screen.')

    Mobile.tap(findTestObject('habits/add reminder button'), 30)

    WebUI.delay(3)

    WebUI.comment('Tap on back button from reminders screen')

    Mobile.pressBack()

    not_run: WebUI.delay(3)

    not_run: Mobile.tap(findTestObject('Object Repository/My habits/android.view.ViewGroup (11)'), 30)

    not_run: WebUI.delay(3)

    not_run: Mobile.scrollToText('ADD REMINDER', FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.comment('Tap on "Add Habit" icon to add new habit')

    Mobile.tap(findTestObject('My habits/add habits'), 30)

    WebUI.delay(3)

    WebUI.comment('Tap on first habit showing from all habits')

    Mobile.tap(findTestObject('habits/1st habit'), 30)

    WebUI.delay(3)

    WebUI.comment('User tap on "Repeat" From Drink water habit screen toset the weak days for the habit.')

    Mobile.tap(findTestObject('habits/Repeat- drink water'), 30)

    WebUI.delay(3)

    WebUI.comment('User tap on "Sunday" fto remove this day for the water tracker habit.')

    Mobile.tap(findTestObject('habits/sunday0'), 30)

    WebUI.delay(3)

    WebUI.comment('User tap on "Wednesday" to remove this day for the water tracker habit.')

    Mobile.tap(findTestObject('habits/wednesday0'), 30)

    WebUI.delay(3)

    Mobile.pressBack()

    WebUI.delay(3)

    WebUI.comment('Tap on Goal from Drink water screen')

    Mobile.tap(findTestObject('habits/Goal- drink water'), 30)

    WebUI.delay(3)

    Mobile.pressBack()

    WebUI.delay(3)

    WebUI.comment('Tap on "Reminders" on Drink water Habit screen.')

    Mobile.tap(findTestObject('habits/Reminder- drik water'), 30)

    WebUI.delay(3)

    WebUI.comment('Scroll to the text "ADD REMINDER"')

    Mobile.scrollToText('ADD REMINDER', FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(3)

    not_run: Mobile.getText(findTestObject('Object Repository/My habits/android.widget.TextView - ADD REMINDER'), 30)

    WebUI.comment('Tap on "ADD REMINDERS" button from Reminders screen.')

    Mobile.tap(findTestObject('habits/add reminder button'), 30)

    WebUI.delay(3)

    WebUI.comment('Tap on back button from Repeat screen from where user select weak days.')

    Mobile.pressBack()

    not_run: WebUI.delay(3)

    not_run: Mobile.tap(findTestObject('Object Repository/My habits/android.view.ViewGroup (11)'), 30)

    not_run: WebUI.delay(3)

    not_run: Mobile.scrollToText('ADD REMINDER', FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(15)

    Mobile.closeApplication()
}

WebUI.delay(5)

