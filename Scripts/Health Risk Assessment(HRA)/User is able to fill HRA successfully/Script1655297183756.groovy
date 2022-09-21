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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.startApplication(GlobalVariable.build_path, false)

KeywordLogger log = new KeywordLogger()

WebUI.delay(60)

if (Mobile.verifyElementExist(findTestObject('App update/android.widget.Button - CANCEL'), 30, FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('App update/android.widget.Button - CANCEL'), 30)
}

WebUI.comment('Capture the username from side menu on taping hamburger icon')

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

not_run: WebUI.scrollToElement(findTestObject('HRA2/View More text'), 15)

Mobile.scrollToText('Fitness', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.comment('Tap on "View more" from \'My Links" on Home screen')

Mobile.tap(findTestObject('HRA2/View More text'), 30)

WebUI.delay(8)

not_run: WebUI.click(findTestObject('HRA2/hra text tap sidemenu'))

not_run: WebUI.delay(8)

WebUI.comment('Tap on HRA card in My Links')

Mobile.tap(findTestObject('HRA2/HRA card on my links'), 15)

WebUI.delay(15)

Mobile.swipe(200, 600, 200, 100)

WebUI.delay(3)

WebUI.comment('Tap on \'RETAKE HRA"')

Mobile.tap(findTestObject('HRA2/android.widget.TextView - RETAKE HRA text'), 15)

WebUI.delay(3)

WebUI.comment('From goal sreen select "Get fit and active" goal')

not_run: Mobile.tap(findTestObject('HRA2/Get fit and active on goal'), 15)

Mobile.tap(findTestObject('HRA2/Get Fit Active HRA'), 15)

WebUI.delay(6)

WebUI.comment('Tap on BEGIN ASSESSMENT button')

not_run: Mobile.tap(findTestObject('HRA2/Begin assessment button'), 15)

Mobile.tap(findTestObject('HRA3/BEGIN ASSESSMENT HRA'), 15)

WebUI.delay(6)

WebUI.comment('Tap on NEXT button on height screen')

not_run: Mobile.tap(findTestObject('HRA2/Next on select height and weight'), 15)

Mobile.tap(findTestObject('HRA3/NEXT cal bmi HRA'), 15)

WebUI.delay(3)

WebUI.comment('Tap on NEXT button on Weight screen')

not_run: Mobile.tap(findTestObject('HRA2/Next on select height and weight'), 15)

Mobile.tap(findTestObject('HRA3/NEXT cal bmi HRA'), 15)

WebUI.delay(15)

WebUI.comment('Tap on NEXT button fron Your BMI screen')

not_run: Mobile.tap(findTestObject('HRA2/Next on BMI'), 45)

Mobile.tap(findTestObject('HRA3/NEXT cal bmi HRA'), 45)

WebUI.delay(20)

WebUI.comment('User giving answer for the 1st question')

not_run: Mobile.tap(findTestObject('HRA2/Sleep disorder on Q1'), 15)

Mobile.tap(findTestObject('HRA3/Sleep Disorders HRA'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the first question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 2nd question')

not_run: Mobile.tap(findTestObject('HRA2/Q2-16-17-25'), 15)

Mobile.tap(findTestObject('HRA3/YES q2 HRA'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the second question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 3rd question')

Mobile.tap(findTestObject('HRA3/Moderate q3'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the third question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 4th question')

Mobile.tap(findTestObject('HRA3/Yes q4'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the fourth question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 5th question')

Mobile.tap(findTestObject('HRA3/None of These q5'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the fifth question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 6th question')

Mobile.tap(findTestObject('HRA3/Yes q6'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the sixtgh question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 7th question')

Mobile.tap(findTestObject('HRA3/After Intensive Workout for 30 minutes q7'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the seventh question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 8th question')

Mobile.tap(findTestObject('HRA3/Rarely q8'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the eighth question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 9th question')

Mobile.tap(findTestObject('HRA3/No q9'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the ninth question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 10th question')

Mobile.tap(findTestObject('HRA3/Rarely q10'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the tenth question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 11th question')

Mobile.tap(findTestObject('HRA3/Once a Week q11'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the eleventh question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 12th question')

Mobile.tap(findTestObject('HRA3/Yes q12'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the twelth question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 13th question')

Mobile.tap(findTestObject('HRA3/7 to 9 Hours q13'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 13th question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 14th question')

Mobile.tap(findTestObject('HRA3/Yes q6'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 14th question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 15th question')

Mobile.tap(findTestObject('HRA3/Rarely Occasionally q15'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 15th question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 16th question')

Mobile.tap(findTestObject('HRA3/2 to 4 Per Day q16'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 16th question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 17th question')

Mobile.tap(findTestObject('HRA3/2 to 3 Per Day q17'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 17th question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 18th question')

Mobile.tap(findTestObject('HRA3/Less than 6 portions q18'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 18th question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 19th question')

Mobile.tap(findTestObject('HRA3/2 to 3 Portions q19'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 19th question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 20th question')

Mobile.tap(findTestObject('HRA3/Never Rarely q20'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 20th question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 21st question')

Mobile.tap(findTestObject('HRA3/Only in The Evenings q21'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 21st question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 22nd question')

Mobile.tap(findTestObject('HRA3/Rarely  Occasionally q22'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 22nd question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 23rd question')

Mobile.tap(findTestObject('HRA3/Once in 15 Days q23'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 23rd question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 24th question')

Mobile.tap(findTestObject('HRA3/Rarely  Occasionally q22'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 24th question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 25th question')

Mobile.tap(findTestObject('HRA3/Rarely  Occasionally q25'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 25th question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 26th question')

Mobile.tap(findTestObject('HRA3/Rarely  Occasionally q26'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 26th question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 27th question')

Mobile.tap(findTestObject('HRA3/5 to 10 Glasses q27'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 27th question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 28th question')

Mobile.tap(findTestObject('HRA3/Everyday q28'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 28th question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(3)

WebUI.comment('User giving answer for the 29th question')

Mobile.tap(findTestObject('HRA3/30 to 60 Minutes q29'), 15)

WebUI.comment('Tap on NEXT button after giving answer for the 29th question')

Mobile.tap(findTestObject('HRA2/Next on Questions'), 15)

WebUI.delay(20)

WebUI.comment('Tap on View full Report button to see HRA report')

Mobile.tap(findTestObject('HRA3/HOME HRA report'), 45)

