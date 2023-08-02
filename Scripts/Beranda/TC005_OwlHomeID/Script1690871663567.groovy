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

WebUI.waitForElementVisible(findTestObject('Beranda/OwlCarousel/div_Sekretariat Jenderal'), 
    0)

WebUI.click(findTestObject('Object Repository/Beranda/OwlCarousel/div_Sekretariat Jenderal'))

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.waitForElementVisible(findTestObject('Beranda/OwlCarousel/div_Inspektorat Jenderal'), 
    0)

WebUI.click(findTestObject('Object Repository/Beranda/OwlCarousel/div_Inspektorat Jenderal'))

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.waitForElementVisible(findTestObject('Beranda/OwlCarousel/div_Direktorat Jenderal Anggaran'), 
    0)

WebUI.click(findTestObject('Object Repository/Beranda/OwlCarousel/div_Direktorat Jenderal Anggaran'))

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.waitForElementVisible(findTestObject('Beranda/OwlCarousel/div_Direktorat Jenderal Pajak'), 
    0)

WebUI.click(findTestObject('Object Repository/Beranda/OwlCarousel/div_Direktorat Jenderal Pajak'))

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.waitForElementVisible(findTestObject('Beranda/OwlCarousel/div_Direktorat Jenderal Bea dan Cukai'), 
    0)

WebUI.click(findTestObject('Object Repository/Beranda/OwlCarousel/div_Direktorat Jenderal Bea dan Cukai'))

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.waitForElementVisible(findTestObject('Beranda/OwlCarousel/div_Direktorat Jenderal Kekayaan Negara'), 
    0)

WebUI.click(findTestObject('Object Repository/Beranda/OwlCarousel/div_Direktorat Jenderal Kekayaan Negara'))

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.waitForElementVisible(findTestObject('Beranda/OwlCarousel/div_Direktorat Jenderal Perbendaharaan'), 
    0)

WebUI.click(findTestObject('Object Repository/Beranda/OwlCarousel/div_Direktorat Jenderal Perbendaharaan'))

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.waitForElementVisible(findTestObject('Beranda/OwlCarousel/div_Direktorat Jenderal Perimbangan Keuangan'), 
    0)

WebUI.click(findTestObject('Object Repository/Beranda/OwlCarousel/div_Direktorat Jenderal Perimbangan Keuangan'))

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.waitForElementVisible(findTestObject('Beranda/OwlCarousel/div_Direktorat Jenderal Pengelolaan Pembiay_489c58'), 
    0)

WebUI.click(findTestObject('Object Repository/Beranda/OwlCarousel/div_Direktorat Jenderal Pengelolaan Pembiay_489c58'))

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.waitForElementVisible(findTestObject('Beranda/OwlCarousel/div_Badan Kebijakan Fiskal'), 
    0)

WebUI.click(findTestObject('Object Repository/Beranda/OwlCarousel/div_Badan Kebijakan Fiskal'))

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

WebUI.waitForElementVisible(findTestObject('Beranda/OwlCarousel/div_Badan Pendidikan dan Pelatihan Keuanganl'), 
    0)

WebUI.click(findTestObject('Object Repository/Beranda/OwlCarousel/div_Badan Pendidikan dan Pelatihan Keuanganl'))

WebUI.switchToWindowTitle('Lembaga Dana Kerjas Sama Pembangunan Internasional')

