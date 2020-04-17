package uk.co.barclays.pages;

import org.openqa.selenium.By;
import uk.co.barclays.utility.Utility;

public class HomePage extends Utility {
By bankMenuItem = By.linkText("Bank");
By switchingBankAccountToBarclays = By.linkText("Switching bank account to Barclays");
By newToUsButton = By.xpath("//a[@class='btn btn-secondary']");
By branchFinderButton = By.xpath("//a[contains(text(),'Branch finder')]");
By locationTextField = By.xpath("//input[@id='location']");
By searchButton = By.xpath("//input[@class='btn btn-primary']");

public void mouseHoverOnBank(){ mouseHoverToElement(bankMenuItem);}
public void mouseHoverAndClickOnSwitchingBankAccountToBarclays(){mouseHoverToElementAndClick(switchingBankAccountToBarclays);}
public void clickOnNewToUsButton(){ clickOnElement(newToUsButton);}
public void clickOnBranchFinderButton(){clickOnElement(branchFinderButton);}
public void enterLocation(){sendTextToElement(locationTextField,"Hatfield");}
public void clickOnSearchButton(){clickOnElement(searchButton);}

}
