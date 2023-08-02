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

WebUI.click(findTestObject('Object Repository/Informasi/CarouselFoto/a_Informasi'))

WebUI.click(findTestObject('Object Repository/Informasi/CarouselFoto/button_Galeri'))

WebUI.click(findTestObject('Object Repository/Informasi/CarouselFoto/a_Foto'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Informasi/CarouselFoto/h2_Galeri Foto (1)'), 0)

WebUI.click(findTestObject('Object Repository/Informasi/CarouselFoto/span_Previous_carousel-control-next-icon'))

WebUI.click(findTestObject('Object Repository/Informasi/CarouselFoto/span_Indonesia dikenal sebagai salah satu n_6ea12e'))

WebUI.click(findTestObject('Object Repository/Informasi/CarouselFoto/div_Mabar anjay- 19 Juli 2023Indonesia dike_96a059'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Informasi/CarouselFoto/p_Anjay mabar'), 0)

WebUI.click(findTestObject('Object Repository/Informasi/CarouselFoto/svg'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Informasi/CarouselFoto/h2_Galeri Foto (1)'), 0)

