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

WebUI.click(findTestObject('Object Repository/Berita/CardBerita/a_Berita'))

WebUI.click(findTestObject('Object Repository/Berita/CardBerita/div_Berita 15Jakarta - 13 Juli 2023JAKARTA,_8eb56d'))

WebUI.verifyElementPresent(findTestObject('Berita/CardBerita/h1_Berita 15'), 0)

WebUI.click(findTestObject('Berita/CardBerita/a_Kembali (1)'))

WebUI.click(findTestObject('Object Repository/Berita/CardBerita/a_2'))

WebUI.click(findTestObject('Object Repository/Berita/CardBerita/h5_Berita 3'))

WebUI.click(findTestObject('Berita/CardBerita/a_Kembali (1)'))

WebUI.verifyElementPresent(findTestObject('Berita/CardBerita/div_BERITA'), 0)

