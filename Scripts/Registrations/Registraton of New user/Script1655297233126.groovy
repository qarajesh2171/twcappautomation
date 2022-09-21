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
import groovy.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

Mobile.startApplication(GlobalVariable.build_path, false)

if (Mobile.verifyElementExist(findTestObject('Exercise tracker/LATER button on launch'), 15, FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('Exercise tracker/LATER button on launch'), 30)
}

WebUI.delay(45)

KeywordLogger log = new KeywordLogger()

WebUI.comment('Find Hamburger menu and Capture the username from side menu on taping hamburger icon')

username = Mobile.verifyElementExist(findTestObject('Hamburger menu'), 30, FailureHandling.OPTIONAL)

if (username == true) {
    WebUI.comment('Tap on Hamburger Menu.')

    Mobile.tap(findTestObject('Hamburger menu'), 30)

    WebUI.delay(10)

    Mobile.scrollToText('Log Out')

    WebUI.comment('Tap on Logout button')

    Mobile.tap(findTestObject('Login/Log Out 1'), 10)

    WebUI.delay(10)
}

WebUI.comment('Tap on Enter email tab.')

Mobile.tap(findTestObject('Login/android.widget.TextView - Enter your Email'), 120)

int randomemail = (((Math.random() * ((10000 - 100) + 1)) + 100) as int)

WebUI.delay(3)

WebUI.comment('Enter the Email for registration')

Mobile.setText(findTestObject('Enter your email'), ('rrrajesh' + randomemail) + '@truworth.com', 10)

WebUI.comment('Tap on Continue button after filling email address.')

Mobile.tap(findTestObject('Continue'), 10)

String fname = 'Rrrajesh'

WebUI.delay(2)

WebUI.comment('Tap on Enter First Name field.')

Mobile.setText(findTestObject('Registration/Enter First Name'), fname, 10)

log.logInfo(fname)

//String lname = RandomStringUtils.randomAlphanumeric(5).toUpperCase();
String candidateChars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

StringBuilder lname = new StringBuilder()

Random random = new Random()

for (int i = 0; i < 6; i++) {
    lname.append(candidateChars.charAt(random.nextInt(candidateChars.length())))
}

println(lname)

WebUI.delay(2)

WebUI.comment('Tap on Enter Last Name field')

Mobile.setText(findTestObject('Registration/Enter Last Name'), lname.toString(), 10)

WebUI.delay(3)

WebUI.comment('Tap on Gender Field to select the gender')

Mobile.tap(findTestObject('Registration/android.widget.TextView - MALE'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Registration/MALE'), 10, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.comment('Tap on Date Of Birth field')

Mobile.tap(findTestObject('Registration/Tap on Date Of Birth'), 10)

WebUI.comment('Tap on OK on calender.')

Mobile.tap(findTestObject('Registration/Calendar OK'), 10)

WebUI.delay(5)

WebUI.comment('Tap on Register button.')

Mobile.tap(findTestObject('Registration/Continue'), 10)

WebUI.delay(3)

verifyscreen = Mobile.verifyElementNotVisible(findTestObject('Login/Create your password text'), 20, FailureHandling.OPTIONAL)

if (verifyscreen == true) {
    WebUI.comment('Choose the gender')

    Mobile.tap(findTestObject('Registration/Gender'), 10)

    WebUI.delay(5)

    WebUI.comment('Tap on Continue button after choosing Gender')

    Mobile.tap(findTestObject('Registration/Continue'), 10)
}

WebUI.delay(5)

WebUI.comment('Create a password for user')

Mobile.setText(findTestObject('Registration/Enter password'), 'test@123', 10)

WebUI.delay(3)

WebUI.comment('Tap on continue after entering password')

Mobile.tap(findTestObject('Registration/android.widget.TextView - Continue 1'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Registration/Continue on password'), 10, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.comment('Re-enter the password to confirm')

Mobile.setText(findTestObject('Registration/Confirm password'), 'test@123', 10)

WebUI.delay(3)

WebUI.comment('Tap on continue after password confirmation')

Mobile.tap(findTestObject('Registration/android.widget.TextView - Continue 1'), 10)

WebUI.comment('Tap on the link- " I don\'t have the refferal code\'')

Mobile.tap(findTestObject('Registration/I Dont Have a Referral Code link'), 10)

WebUI.delay(3)

WebUI.comment('Tap on confirmation button.')

Mobile.tap(findTestObject('Registration/User Consent button'), 10)

WebUI.delay(3)

WebUI.comment('Enter the mobile no. for registration')

Mobile.setText(findTestObject('Registration/Enter mobile number'), '8888888888', 10)

WebUI.delay(3)

WebUI.comment('Tap on continue button after filling mobile number')

Mobile.tap(findTestObject('Registration/Continue on Mobile number'), 10)

WebUI.delay(8)

WebUI.comment('Tap on SKIP on OTP screen.')

Mobile.tap(findTestObject('Registration/SKIP Register'), 30, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Login/Skip2'), 30, FailureHandling.OPTIONAL)

WebUI.delay(3)

if (Mobile.verifyElementNotVisible(findTestObject('Registration/Welcome text'), 30, FailureHandling.OPTIONAL) == true) {
    WebUI.delay(3)

    WebUI.comment('Tap on SKIP on OTP screen')

    Mobile.tap(findTestObject('Registration/SKIP Register'), 30, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('Login/Skip2'), 30, FailureHandling.OPTIONAL)
}

WebUI.delay(15)

log.logInfo('Hi')

WebUI.delay(15)

WebUI.comment('Get the Welcome text from home screen')

def welcometext = Mobile.getText(findTestObject('Registration/Welcome text'), 20)

if (welcometext == (('Hi' + fname) + '!')) {
    log.logInfo('User registered successfully' + 'User matched')

    log.logInfo((('Expected result=' + 'Hi') + fname) + 'i')

    log.logInfo('Expected result=' + welcometext)
}

WebUI.comment('Tap on Hamburger menu')

Mobile.tap(findTestObject('Hamburger menu'), 30)

WebUI.comment('Get email address from side menu')

def email = Mobile.getText(findTestObject('Registration/Email address sidemenu'), 20)

if (email == (('rrrajesh' + randomemail) + '@truworth.com')) {
    log.logInfo('email address matched successfully')

    log.logInfo((('Actual result=' + 'rrrajesh') + randomemail) + '@truworth.com')

    log.logInfo('Expected result=' + email)
}

WebUI.comment('Capture the side menu text i.e. username')

def username = Mobile.getText(findTestObject('Registration/Sidemenu text'), 10)

log.logInfo(username)

if (((fname + ' ') + lname) == username) {
    log.logInfo('Username matched successfully')

    log.logInfo((('Expected result=' + fname) + ' ') + lname)

    log.logInfo('Expected result=' + username)
} else {
    log.logInfo(('Expected result=' + fname) + lname)

    Mobile.scrollToText('Log Out')

    WebUI.comment('Tap on logout button')

    Mobile.tap(findTestObject('Login/Log Out 1'), 10)

    WebUI.delay(10)

    log.logInfo('email not matched')

    not_run: assert false : 'email not matched'

    Mobile.closeApplication()
}

Mobile.scrollToText('Log Out')

WebUI.comment('Tap on Logout button.')

Mobile.tap(findTestObject('Login/Log Out 1'), 10)

WebUI.delay(10)

Mobile.closeApplication()

