WebUI.openBrowser('')

WebUI.navigateToUrl('http://the-internet.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Heroku App/Page_The Internet/Page_The Internet/a_JavaScript Alerts'))

WebUI.click(findTestObject('Object Repository/Heroku App/Page_The Internet/Page_The Internet/button_Click for JS Confirm'))

'Get text alert on the alert when it\'s shown'
alertText = WebUI.getAlertText()

'Verify text alert is correct or not'
WebUI.verifyMatch(alertText, 'I am a JS Confirm', false)

WebUI.acceptAlert()

WebUI.verifyElementText(findTestObject('Heroku App/Page_The Internet/p_You clicked Cancel'), 'You clicked: Ok')

//WebUI.closeBrowser()