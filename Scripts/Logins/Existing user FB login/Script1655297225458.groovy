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

WebUI.delay(40)

KeywordLogger log = new KeywordLogger()

WebUI.comment('Capture the username from side menu on taping hamburger icon')

username = Mobile.verifyElementExist(findTestObject('Hamburger menu'), 30, FailureHandling.OPTIONAL)

if (username == true) {
    WebUI.comment('Tap on Hamburger menu')

    Mobile.tap(findTestObject('Hamburger menu'), 30)

    WebUI.delay(10)

    Mobile.scrollToText('Log Out')

    WebUI.comment('Tap on Logout button')

    Mobile.tap(findTestObject('Log Out'), 10)

    WebUI.delay(10)
}

WebUI.delay(10)

WebUI.comment('Tap on "Sign in with Facebook" button')

Mobile.tap(findTestObject('Login/Login with facebook tab'), 120)

WebUI.delay(3)

WebUI.comment('User tap on Corporate user button.')

Mobile.tap(findTestObject('Login/corporate user button'), 10)

WebUI.delay(3)

//email = Mobile.verifyElementExist('Object Repository/Login/android.widget.EditText', 0, FailureHandling.STOP_ON_FAILURE)
if (Mobile.verifyElementExist(findTestObject('Login/username(facebook)'), 30, FailureHandling.OPTIONAL) == true) {
    WebUI.comment('Enter Facebook credentials with which already registered on wellness corner')

    Mobile.setText(findTestObject('Login/username(facebook)'), GlobalVariable.fbuserid, 10)

    WebUI.delay(2)

    WebUI.comment('Enter the Facebook password')

    Mobile.setText(findTestObject('Login/Password(facebook)'), GlobalVariable.fbpassword, 10)

    WebUI.delay(3)

    WebUI.comment('Tap on Login button.')

    Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - Log In'), 30)

    WebUI.delay(5)

    WebUI.comment('Tap on the "Continue as <username>" button on the confirmation page')

    Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - Continue'), 20 //    Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - OK'), 10)
        )
} else {
    WebUI.delay(5)

    WebUI.comment('Tap on continue button.')

    Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - Continue'), 30)
}

if (Mobile.verifyElementExist(findTestObject('Registration/Calendar OK'), 30, FailureHandling.OPTIONAL) == true) {
    WebUI.delay(5)

    Mobile.tap(findTestObject('Login/android.widget.Button - OK'), 30)

    not_run: assert false : 'Test case failed- User not logged in.'
} else {
    WebUI.delay(5)

    if (Mobile.verifyElementExist(findTestObject('Registration/Tap on Date Of Birth'), 30, FailureHandling.OPTIONAL) == 
    true) {
        WebUI.comment('User select gender.(Male/Female)')

        Mobile.tap(findTestObject('Registration/Gender'), 10)

        WebUI.comment('User tap on date of birth Field.')

        Mobile.tap(findTestObject('Registration/Tap on Date Of Birth'), 10)

        WebUI.comment('Tap on "OK" button on calendar.')

        Mobile.tap(findTestObject('Registration/Calendar OK'), 10)

        WebUI.delay(3)

        WebUI.comment('Tap on "Register" button.')

        Mobile.tap(findTestObject('Registration/Continue'), 10)

        WebUI.delay(3)

        WebUI.comment('Tap on "I don\'t have a Referral Code".')

        Mobile.tap(findTestObject('Registration/I Dont Have a Referral Code link'), 10)

        WebUI.delay(3)

        WebUI.comment('Tap on "I agree. Take me ahead!" button.')

        Mobile.tap(findTestObject('Registration/User Consent button'), 10)

        WebUI.comment('Tap on Mobile no. field')

        Mobile.setText(findTestObject('Registration/Enter mobile number'), '8952954319', 0)

        WebUI.comment('Tap on continue button after filling Mobile number.')

        Mobile.tap(findTestObject('Registration/Continue on Mobile number'), 10)

        WebUI.comment('Tap on "SKIP" button on OTP screen.')

        Mobile.tap(findTestObject('Registration/SKIP on Verify OTP'), 10)

        WebUI.delay(10)

        WebUI.comment('Tap on Hamburger menu')

        Mobile.tap(findTestObject('Hamburger menu'), 10)

        WebUI.comment('Get email adress text from sidemenu.')

        def useremail = Mobile.getText(findTestObject('Registration/Email address sidemenu'), 10)

        if (GlobalVariable.fbuserid == useremail) {
            log.logInfo('email address matched successfully')

            log.logInfo('Expected result=' + GlobalVariable.fbuserid)

            log.logInfo('Actual result=' + useremail)
        }
        
        Mobile.scrollToText('Log Out')

        WebUI.delay(3)

        WebUI.comment('Tap on Logout button.')

        Mobile.tap(findTestObject('Log Out'), 10)

        WebUI.delay(10)

        Mobile.closeApplication()
    } else {
        WebUI.delay(10)

        WebUI.comment('Tap on Hamburger menu.')

        Mobile.tap(findTestObject('Hamburger menu'), 10)

        def useremail = Mobile.getText(findTestObject('Registration/Email address sidemenu'), 10)

        if (GlobalVariable.fbuserid == useremail) {
            log.logInfo('email address matched successfully')

            log.logInfo('Expected result=' + GlobalVariable.fbuserid)

            log.logInfo('Actual result=' + useremail)

            Mobile.scrollToText('Log Out')

            WebUI.delay(3)

            WebUI.comment('Tap on logout button.')

            Mobile.tap(findTestObject('Log Out'), 10)

            WebUI.delay(10)

            Mobile.closeApplication()
        } else {
            log.logInfo('email address is not matched')

            log.logInfo('Expected result=' + useremail)

            log.logInfo('Actual result=' + GlobalVariable.fbuserid)

            Mobile.scrollToText('Log Out')

            WebUI.delay(3)

            WebUI.comment('Tap on Logout button')

            Mobile.tap(findTestObject('Log Out'), 10)

            WebUI.delay(10)

            Mobile.closeApplication()

            assert false : 'email address is not matched'
        }
    }
}

