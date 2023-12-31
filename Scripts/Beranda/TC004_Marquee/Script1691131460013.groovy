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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.waitForElementVisible(findTestObject('Beranda/Marquee/a_LDKPI Meraih Opini Wajar Tanpa Pengecualian'), 
    0)

WebUI.click(findTestObject('Object Repository/Beranda/Marquee/a_LDKPI Meraih Opini Wajar Tanpa Pengecualian'))

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.waitForElementVisible(findTestObject('Beranda/Marquee/a_LDKPI Menentang Keras Segala Bentuk Pembe_279bcb'), 
    0)

WebUI.click(findTestObject('Object Repository/Beranda/Marquee/a_LDKPI Menentang Keras Segala Bentuk Pembe_279bcb'))

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.waitForElementVisible(findTestObject('Beranda/Marquee/a_YOUTUBE'), 
    0)

WebUI.click(findTestObject('Object Repository/Beranda/Marquee/a_YOUTUBE'))

