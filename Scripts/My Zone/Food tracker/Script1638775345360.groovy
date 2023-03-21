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

if (Mobile.verifyElementExist(findTestObject('Food tracker/My zone tab 5'), 60, FailureHandling.OPTIONAL) == true) {
    WebUI.comment('Tap on My zone tab fron home screen')

    Mobile.tap(findTestObject('Food tracker/My zone tab 5'), 60)
}

WebUI.delay(15)

not_run: if (Mobile.verifyElementExist(findTestObject('Food tracker/android.view.ViewGroup22'), 40, FailureHandling.OPTIONAL) == 
true) {
    not_run: WebUI.comment('Tap on Meal tracker in my zone section')

    not_run: Mobile.tap(findTestObject('Food tracker/android.view.ViewGroup22'), 20, FailureHandling.OPTIONAL)
}

//Mobile.tap(findTestObject('Food tracker/Food tracker tab1'), 30)
not_run: WebUI.delay(10)

not_run: Mobile.tap(findTestObject('trackers/food tracker'), 20, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('trackerss/foodtracer1'), 30)

WebUI.delay(10)

if (Mobile.verifyElementExist(findTestObject('Food tracker/BREAKFAST TAB (1)'), 60, FailureHandling.OPTIONAL) == true) {
    WebUI.comment('Tap on "Add Breakfast".')

    Mobile.tap(findTestObject('Food tracker/BREAKFAST TAB (1)'), 60)

    WebUI.delay(5)
}

if (Mobile.verifyElementExist(findTestObject('Food tracker/android.widget.TextView - ADD MORE FOOD'), 60, FailureHandling.OPTIONAL) == 
true) {
    WebUI.delay(5)

    WebUI.comment('Tap on the food from the list which are showing in Recent.')

    Mobile.tap(findTestObject('Food tracker/android.widget.TextView - ADD MORE FOOD'), 30)

    WebUI.delay(5)

    WebUI.comment('Tap on the search food field to search the food')

    Mobile.tap(findTestObject('Food tracker/android.widget.TextView - Search Food1'), 30)
} else {
    WebUI.delay(5)

    WebUI.comment('Tap on "Search Food" field to search the food')

    Mobile.tap(findTestObject('Food tracker/android.widget.TextView - Search Food1'), 30)
}

WebUI.delay(5)

WebUI.comment('Search "Gulab Jamun" in the search food field')

Mobile.setText(findTestObject('Object Repository/Food tracker/android.widget.EditText - Search Food'), 'gulab jamun', 30)

WebUI.comment('User tap on the first food which is showing after searching gulab jamun in the search field')

Mobile.tap(findTestObject('Food tracker/search food 1st element'), 30)

WebUI.comment('User fill 10 numbers in the no. of gulab jamun eaten')

Mobile.setText(findTestObject('Object Repository/Food tracker/android.widget.EditText - 1'), '10', 30)

not_run: Mobile.tap(findTestObject('Object Repository/Food tracker/android.view.ViewGroup (4)'), 30)

not_run: Mobile.tap(findTestObject('Object Repository/Food tracker/android.view.ViewGroup (5)'), 30)

WebUI.delay(5)

WebUI.comment('Tap on "TRACK FOOD" button to add gulab jamun in breakfast')

Mobile.tap(findTestObject('Food tracker/Track food button'), 30)

WebUI.delay(5)

//Mobile.tap(findTestObject('Object Repository/Food tracker/android.view.View (1)'), 30)
WebUI.comment('Tap on "ADD MORE FOOD" on Breakfast screen')

Mobile.tap(findTestObject('Object Repository/Food tracker/android.widget.TextView - ADD MORE FOOD'), 30)

WebUI.delay(5)

WebUI.comment('Tap on Search Food field to search the food')

Mobile.tap(findTestObject('Food tracker/android.widget.TextView - Search Food1'), 30)

WebUI.comment('Search "Roti" in the search field')

Mobile.setText(findTestObject('Food tracker/android.widget.EditText - Search Food'), 'roti', 30)

WebUI.delay(5)

WebUI.comment('Tap on the first food showing in the list after searching Roti in search box')

Mobile.tap(findTestObject('Food tracker/search food 1st element'), 30)

WebUI.comment('Set 10 no. of roti in numbers')

WebUI.delay(5)

Mobile.setText(findTestObject('Object Repository/Food tracker/android.widget.EditText - 1 (1)'), '10', 30)

WebUI.delay(5)

WebUI.comment('Tap on "TRACK FOOD" button to add Roti in breakfast')

Mobile.tap(findTestObject('Food tracker/Track food button'), 30)

not_run: Mobile.tap(findTestObject('Object Repository/Food tracker/android.view.ViewGroup (6)'), 30)

not_run: Mobile.tap(findTestObject('Object Repository/Food tracker/android.widget.Button - YES'), 30)

WebUI.delay(5)

WebUI.comment('Tap on "ADD MORE FOOD" button to addd more food in breakfast')

Mobile.tap(findTestObject('Object Repository/Food tracker/android.widget.TextView - ADD MORE FOOD'), 30)

WebUI.delay(5)

WebUI.comment('Tap on serach food field to search food')

Mobile.tap(findTestObject('Food tracker/android.widget.TextView - Search Food1'), 30)

WebUI.comment('Search Roti in the search box')

Mobile.setText(findTestObject('Food tracker/EditText - Search Food'), 'roti', 30)

WebUI.comment('Tap on the first food showing after searching Roti in the search box')

Mobile.tap(findTestObject('Food tracker/search food 1st element'), 30)

WebUI.delay(8)

WebUI.comment('Set 50 in the number of roti.')

Mobile.setText(findTestObject('Object Repository/Food tracker/android.widget.EditText - 1 (1)'), '50', 30)

WebUI.delay(5)

not_run: Mobile.tap(findTestObject('Object Repository/Food tracker/android.view.View (2)'), 30)

not_run: Mobile.tap(findTestObject('Object Repository/Food tracker/android.view.ViewGroup (6)'), 30)

WebUI.comment('Tap on Track food button after entering number of roti')

Mobile.tap(findTestObject('Food tracker/Track food button'), 30)

WebUI.delay(5)

WebUI.comment('Tap on Three dot icon on the top right side of the Breakfast screen')

Mobile.tap(findTestObject('Object Repository/Food tracker/android.view.ViewGroup (7)'), 30)

WebUI.delay(5)

WebUI.comment('Tap on Create Meal ')

Mobile.tap(findTestObject('Object Repository/Food tracker/android.widget.TextView - Create Meal'), 30)

WebUI.delay(5)

WebUI.comment('Give the meal name-"testmeal1"')

Mobile.setText(findTestObject('Object Repository/Food tracker/android.widget.EditText'), 'testmeal1', 30)

WebUI.delay(5)

WebUI.comment('Tap on "SAVE MEAL" button on the Create meal screen')

Mobile.tap(findTestObject('Edit profile/Submit button'), 30)

WebUI.delay(5)

WebUI.comment('Tap on the back button from meal screen')

Mobile.pressBack()

Mobile.closeApplication()

