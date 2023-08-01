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

WebUI.click(findTestObject('Object Repository/Laporan/Page_React App/img_YOUTUBE_button-image'))

WebUI.switchToWindowTitle('Kementerian Keuangan Republik Indonesia')

WebUI.click(findTestObject('Object Repository/Laporan/Page_Kementerian Keuangan Republik Indonesia/h1_ORI023'))

WebUI.switchToWindowTitle('React App')

WebUI.click(findTestObject('Object Repository/Laporan/Page_React App/img_YOUTUBE_button-image_1'))

WebUI.switchToWindowTitle('Home Page - Whistleblowing System')

WebUI.verifyElementPresent(findTestObject('Object Repository/Laporan/Page_Home Page - Whistleblowing System/h1_Selamat datang di Whistleblowing System'), 
    0)

WebUI.switchToWindowTitle('React App')

WebUI.click(findTestObject('Object Repository/Laporan/Page_React App/img_YOUTUBE_button-image_1_2'))

WebUI.switchToWindowTitle('Kalkulator Kurs')

WebUI.verifyElementPresent(findTestObject('Object Repository/Laporan/Page_Kalkulator Kurs/img_Peta Situs_onetidHeadbnnr0'), 
    0)

WebUI.switchToWindowTitle('React App')

WebUI.click(findTestObject('Object Repository/Laporan/Page_React App/img_YOUTUBE_button-image_1_2_3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Laporan/Page_LAPOR - Layanan Aspirasi dan Pengaduan_5c85b6/div_Layanan Aspirasi dan Pengaduan Online Rakyat'), 
    0)

WebUI.switchToWindowTitle('React App')

WebUI.click(findTestObject('Object Repository/Laporan/Page_React App/img_YOUTUBE_button-image_1_2_3_4'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Laporan/Page_SAPA DJPPR/img_Masuk_sapa'), 0)

