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

WebUI.click(findTestObject('Object Repository/Beranda/ButtonHome/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/img_YOUTUBE_button-image'))

WebUI.switchToWindowTitle('Kementerian Keuangan Republik Indonesia')

WebUI.verifyElementPresent(findTestObject('Object Repository/Beranda/ButtonHome/Page_Kementerian Keuangan Republik Indonesia/p_Informasi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Beranda/ButtonHome/Page_Kementerian Keuangan Republik Indonesia/p_Informasi'), 
    0)

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.click(findTestObject('Object Repository/Beranda/ButtonHome/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/img_YOUTUBE_button-image_1'))

WebUI.switchToWindowTitle('Home Page - Whistleblowing System')

WebUI.verifyElementPresent(findTestObject('Object Repository/Beranda/ButtonHome/Page_Home Page - Whistleblowing System/h1_Selamat datang di Whistleblowing System'), 
    0)

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.click(findTestObject('Object Repository/Beranda/ButtonHome/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/img_YOUTUBE_button-image_1_2'))

WebUI.switchToWindowTitle('Kalkulator Kurs')

WebUI.verifyElementPresent(findTestObject('Object Repository/Beranda/ButtonHome/Page_Kalkulator Kurs/div_Home                                   _11912c'), 
    0)

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.click(findTestObject('Object Repository/Beranda/ButtonHome/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/img_YOUTUBE_button-image_1_2_3'))

WebUI.switchToWindowTitle('LAPOR! - Layanan Aspirasi dan Pengaduan Online Rakyat')

WebUI.verifyElementPresent(findTestObject('Object Repository/Beranda/ButtonHome/Page_LAPOR - Layanan Aspirasi dan Pengaduan_5c85b6/div_Layanan Aspirasi dan Pengaduan Online Rakyat'), 
    0)

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.click(findTestObject('Object Repository/Beranda/ButtonHome/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/img_YOUTUBE_button-image_1_2_3_4'))

WebUI.switchToWindowTitle('SAPA DJPPR')

WebUI.verifyElementPresent(findTestObject('Object Repository/Beranda/ButtonHome/Page_SAPA DJPPR/div_Kami Hadir Untuk Menyapa               _e4db6b'), 
    0)

WebUI.closeBrowser()

