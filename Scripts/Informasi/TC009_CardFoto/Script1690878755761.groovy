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

WebUI.click(findTestObject('Informasi/CardFoto/a_Informasi'))

WebUI.click(findTestObject('Informasi/CardFoto/button_Galeri'))

WebUI.click(findTestObject('Informasi/CardFoto/a_Foto'))

WebUI.verifyElementPresent(findTestObject('Informasi/CardFoto/h2_Galeri Foto (1)'), 0)

WebUI.click(findTestObject('Object Repository/Informasi/CardFoto/div_25 Juni 2023Jonski HomskiIndonesia dike_6859db'))

WebUI.verifyElementPresent(findTestObject('Informasi/CardFoto/p_Jonski Homski (1)'), 0)

WebUI.click(findTestObject('Object Repository/Informasi/CardFoto/svg_Indonesia dikenal sebagai salah satu ne_17a59c'))

WebUI.navigateToUrl('http://localhost:3000/informasi/foto/jonski-homski')

WebUI.click(findTestObject('Object Repository/Informasi/CardFoto/svg_Indonesia dikenal sebagai salah satu ne_0a374c'))

WebUI.navigateToUrl('http://localhost:3000/informasi/foto/jonski-homski')

WebUI.click(findTestObject('Object Repository/Informasi/CardFoto/svg_Indonesia dikenal sebagai salah satu ne_e8e97d'))

WebUI.navigateToUrl('http://localhost:3000/informasi/foto/jonski-homski')

WebUI.click(findTestObject('Informasi/CardFoto/svg'))

WebUI.verifyElementPresent(findTestObject('Informasi/CardFoto/h2_Galeri Foto (1)'), 0)

