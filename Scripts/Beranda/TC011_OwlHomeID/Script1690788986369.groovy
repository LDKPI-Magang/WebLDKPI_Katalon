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

WebUI.click(findTestObject('Object Repository/OwlHome/ID/button_Direktorat Jenderal Perbendaharaan_owl-prev'))

WebUI.click(findTestObject('Object Repository/OwlHome/ID/i_Direktorat Jenderal Perbendaharaan_fa fa-_0ff10a'))

WebUI.switchToWindowTitle('React App')

WebUI.verifyElementPresent(findTestObject('Object Repository/OwlHome/ID/span_Direktorat Jenderal Pajak'), 0)

WebUI.switchToWindowTitle('React App')

WebUI.verifyElementPresent(findTestObject('Object Repository/OwlHome/ID/div_Direktorat Jenderal Anggaran'), 0)

WebUI.switchToWindowTitle('React App')

WebUI.verifyElementPresent(findTestObject('Object Repository/OwlHome/ID/div_Inspektorat Jenderal'), 0)

