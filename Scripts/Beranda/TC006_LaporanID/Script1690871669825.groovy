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

WebUI.switchToWindowTitle('React App')

WebUI.click(findTestObject('Object Repository/Beranda/Laporan/Page_React App/img_YOUTUBE_button-image'))

WebUI.verifyElementPresent(findTestObject('Beranda/Laporan/Page_Kementerian Keuangan Republik Indonesia/h3_Berita Terbaru'), 0)

WebUI.switchToWindowTitle('React App')

WebUI.click(findTestObject('Object Repository/Beranda/Laporan/Page_React App/img_YOUTUBE_button-image_1'))

WebUI.verifyElementPresent(findTestObject('Beranda/Laporan/Page_Home Page - Whistleblowing System/h1_Selamat datang di Whistleblowing System'), 
    0)

WebUI.switchToWindowTitle('React App')

WebUI.click(findTestObject('Object Repository/Beranda/Laporan/Page_React App/img_YOUTUBE_button-image_1_2'))

WebUI.verifyElementPresent(findTestObject('Beranda/Laporan/Page_Kalkulator Kurs/h2_Kalkulator Kurs'), 0)

WebUI.switchToWindowTitle('React App')

WebUI.click(findTestObject('Object Repository/Beranda/Laporan/Page_React App/img_YOUTUBE_button-image_1_2_3'))

WebUI.switchToWindowTitle('React App')

WebUI.click(findTestObject('Object Repository/Beranda/Laporan/Page_React App/img_YOUTUBE_button-image_1_2_3_4'))

WebUI.verifyElementPresent(findTestObject('Beranda/Laporan/Page_SAPA DJPPR/p_Kami Hadir Untuk Menyapa'), 0)

