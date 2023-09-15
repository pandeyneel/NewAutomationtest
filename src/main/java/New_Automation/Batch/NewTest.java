package New_Automation.Batch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import propertyutility.Baselibrary;

public class NewTest extends Baselibrary
{
	public NewTest()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "sfds")
	private WebElement  nielsh;

}
