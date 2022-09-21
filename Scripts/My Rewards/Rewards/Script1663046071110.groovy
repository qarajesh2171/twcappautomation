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

username = Mobile.verifyElementExist(findTestObject('Hamburger menu'), 45, FailureHandling.OPTIONAL)

if (username == false) {
    WebUI.callTestCase(findTestCase('TestModules/call dashboard screen'), [:], FailureHandling.STOP_ON_FAILURE)
}

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Tap on rewards icon')

Mobile.tap(findTestObject('Object Repository/My Rewards/android.view.ViewGroup'), 45)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Verify the Screen heading text : My Rewards')

Mobile.verifyElementText(findTestObject('Object Repository/My Rewards/android.widget.TextView - My Rewards'), 'My Rewards')

WebUI.comment('Capture the Availablr peps')

peps1 = Mobile.getText(findTestObject('Object Repository/My Rewards/android.widget.TextView - 3739'), 45)

Mobile.scrollToText('Refer Friends & Family')

Mobile.scrollToText('My Rewards')

WebUI.comment('Tap on PEPs History option')

Mobile.tap(findTestObject('Object Repository/My Rewards/android.widget.TextView - PEPs History'), 45)

WebUI.comment('Capture the Current PEPs ')

peps2 = Mobile.getText(findTestObject('Object Repository/My Rewards/android.widget.TextView - 3739 (1)'), 45)

WebUI.comment('Verify the Screen heading Text : PEPs History')

Mobile.verifyElementText(findTestObject('Object Repository/My Rewards/android.widget.TextView - PEPs History (1)'), 'PEPs History')

WebUI.comment('Tap on back button from PEPs History  screen')

Mobile.pressBack()

WebUI.comment('Tap on "GET Coupons & Discounts" option')

Mobile.tap(findTestObject('Object Repository/My Rewards/android.widget.TextView - Get Coupons  Discounts'), 45)

WebUI.comment('Verify the Text "Redeem Your PEPs"')

Mobile.verifyElementText(findTestObject('Object Repository/My Rewards/android.widget.TextView - Redeem Your PEPs'), 'Redeem Your PEPs')

WebUI.comment('Tap on Back button fron Redeem Your PEPs screen')

Mobile.pressBack()

WebUI.comment('Tap on My Coupons option')

Mobile.tap(findTestObject('Object Repository/My Rewards/android.widget.TextView - My Coupons'), 45)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Verify the creen heading text : MY Coupons')

Mobile.verifyElementText(findTestObject('Object Repository/My Rewards/android.widget.TextView - My Coupons (1)'), 'My Coupons')

WebUI.comment('Tap on Back button')

Mobile.pressBack()

if (peps1 == peps2) {
    Mobile.comment('PEPs are showing correct on both screens.')
} else {
    Mobile.comment('PEPs are showing correct on both screens.')

    assert false : 'PEPs are not matched.'

    Mobile.closeApplication()
}

Mobile.closeApplication()

