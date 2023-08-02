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

WebUI.click(findTestObject('Object Repository/Profil/ListAnggota/a_Profil'))

WebUI.click(findTestObject('Object Repository/Profil/ListAnggota/a_Struktur Manajemen'))

WebUI.verifyElementPresent(findTestObject('Profil/Manajemen/h2_KOMITE PENGARAH'), 0)

WebUI.click(findTestObject('Object Repository/Profil/ListAnggota/svg'))

WebUI.verifyElementPresent(findTestObject('Profil/ListAnggota/div_Ketua Merangkap Anggota'), 
    0)

WebUI.click(findTestObject('Object Repository/Profil/ListAnggota/svg_1'))

WebUI.verifyElementPresent(findTestObject('Profil/ListAnggota/div_Direktur UtamaTormarbulang Lumbantobing'), 
    0)

WebUI.click(findTestObject('Object Repository/Profil/ListAnggota/svg_1_2'))

WebUI.verifyElementPresent(findTestObject('Profil/ListAnggota/div_Kepala Satuan Pemeriksa InternAris Widodo (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Profil/ListAnggota/svg_1_2_3'))

WebUI.verifyElementPresent(findTestObject('Profil/ListAnggota/div_Kepala Divisi KeuanganLeni Andrayani (1)'), 
    0)

