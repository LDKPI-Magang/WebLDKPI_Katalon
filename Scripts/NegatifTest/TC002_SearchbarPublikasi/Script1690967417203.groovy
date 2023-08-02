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

WebUI.click(findTestObject('Object Repository/NegatifTest/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/a_Informasi'))

WebUI.click(findTestObject('Object Repository/NegatifTest/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/button_Galeri'))

WebUI.click(findTestObject('Object Repository/NegatifTest/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/a_Publikasi'))

WebUI.setText(findTestObject('Object Repository/NegatifTest/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/input_Publikasi_form-control search-bar'), 
    'keempat')

WebUI.click(findTestObject('Object Repository/NegatifTest/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/button_Publikasi_btn btn-outline-secondary _d80d0b'))

WebUI.verifyElementNotPresent(findTestObject('NegatifTest/Page_Lembaga Dana Kerjas Sama Pembangunan I_724398/Page_Lembaga Dana Kerjas Sama Pembangunan Internasional/div_Publikasi KetigaI'), 
    0)

