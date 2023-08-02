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

WebUI.click(findTestObject('Object Repository/Informasi/CardPublication/a_Informasi'))

WebUI.click(findTestObject('Object Repository/Informasi/CardPublication/button_Galeri'))

WebUI.click(findTestObject('Object Repository/Informasi/CardPublication/a_Publikasi'))

WebUI.click(findTestObject('Object Repository/Informasi/CardPublication/div_Publikasi Ketiga'))

WebUI.verifyElementPresent(findTestObject('Informasi/CardPublication/strong_I. Tantangan global, Hibah Internasi_acc3bf'), 
    0)

WebUI.click(findTestObject('Object Repository/Informasi/CardPublication/a_Kembali'))

WebUI.click(findTestObject('Object Repository/Informasi/CardPublication/a_2'))

WebUI.click(findTestObject('Object Repository/Informasi/CardPublication/div_Publikasi Pertama'))

WebUI.verifyElementPresent(findTestObject('Informasi/CardPublication/p_Pemerintah Indonesia telah secara aktif'), 
    0)

WebUI.click(findTestObject('Object Repository/Informasi/CardPublication/a_Kembali'))

