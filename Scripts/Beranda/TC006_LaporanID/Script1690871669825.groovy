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

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.click(findTestObject('Object Repository/Beranda/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/img_YOUTUBE_button-image'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Beranda/Page_Kementerian Keuangan Republik Indonesia/img_Profil_brand'), 
    0)

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.click(findTestObject('Object Repository/Beranda/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/img_YOUTUBE_button-image_1'))

WebUI.verifyElementPresent(findTestObject('Beranda/Page_Home Page - Whistleblowing System/Page_Home Page - Whistleblowing System/img'), 
    0)

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.click(findTestObject('Object Repository/Beranda/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/img_YOUTUBE_button-image_1_2'))

WebUI.switchToWindowTitle('Kalkulator Kurs')

WebUI.verifyElementPresent(findTestObject('Object Repository/Beranda/Page_Kalkulator Kurs/img_Peta Situs_onetidHeadbnnr0'), 
    0)

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.click(findTestObject('Object Repository/Beranda/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/a_YOUTUBE_btn btn-primary btn-sm square-button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Beranda/Page_LAPOR - Layanan Aspirasi dan Pengaduan_5c85b6/img_Toggle navigation_img-responsive hidden_ebcc28'), 
    0)

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.click(findTestObject('Object Repository/Beranda/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/a_YOUTUBE_btn btn-primary btn-sm square-button_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Beranda/Page_SAPA DJPPR/img'), 0)

WebUI.closeBrowser()

