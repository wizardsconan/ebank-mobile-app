package app.msb.ebank.mobile;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.Predicate;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.WebDriverFacade;

public class MobilePageObject extends PageObject {

	protected MobilePageObject() {
		super();
	}

	protected MobilePageObject(final WebDriver driver, Predicate<? super PageObject> callback) {
		super(driver, callback);
	}

	public MobilePageObject(final WebDriver driver, final int ajaxTimeout) {

		super(driver, ajaxTimeout);
	}

/*	public MobilePageObject(final WebDriver driver) {
		super(driver);
	}
*/
	public MobilePageObject(final WebDriver driver, final EnvironmentVariables environmentVariables) {
		super(driver, environmentVariables);
	}

	public void highlightElement(WebElementFacade webElement) {
		for (int i = 0; i < 10; i++) {
			evaluateJavascript("arguments[0].setAttribute('stype',arguments[1]);", webElement,
					"color:red;border:2px solid red;");
			evaluateJavascript("arguments[0].setAttribute('stype',arguments[1]);", webElement, "");
		}
	}

	public void cutTextFrom(WebElementFacade webElement, String value) {
		withAction().moveToElement(webElement).click().keyDown(webElement, Keys.SHIFT).sendKeys(webElement, value)
				.keyUp(webElement, Keys.SHIFT).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
				.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
		waitABit(3000);
	}

	public void pasteTextInto(WebElementFacade webElement) {
		withAction().moveToElement(webElement).click()
				// .keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
				.contextClick().build().perform();

	}

	public static void setClipboardData(String pathFile) {

		// StringSelection is a class that can be used for copy and paste operations
		StringSelection stringSelectio = new StringSelection(pathFile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectio, null);
	}
	
	/*AndroidDriver<AndroidElement> androidDriver() {
	    return (AndroidDriver<AndroidElement>);
	            ((WebDriverFacade) getDriver()).getProxiedDriver();

	}*/

	

	public void openContentMenu(WebElementFacade webElement, String value) {
		withAction().moveToElement(webElement).click().sendKeys(webElement, value).keyDown(Keys.CONTROL).sendKeys("a")
				.keyUp(Keys.CONTROL).contextClick().build().perform();
		waitABit(3000);
	}

	public void pressItemOnContentMenu(WebElementFacade webElement, int indexItem) {
		Robot robot;
		{
			try {
				robot = new Robot();
				robot.setAutoDelay(500);
				for (int i = 1; i <= indexItem; i++) {
					robot.keyPress(KeyEvent.VK_DOWN);
				}
				robot.keyPress(KeyEvent.VK_ENTER);

			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void selectElementToPaste(WebElementFacade webElement) {
		withAction().moveToElement(webElement).click().contextClick().build().perform();

	}

	public void JsClickOn(WebElementFacade webElement) {
		evaluateJavascript("arguments[0].click()", webElement);
	}

	public void ScrollTo(WebElementFacade webElement) {
		evaluateJavascript("arguments[0].scrollIntoView(true);", webElement);
	}

	public void Remember(String key) {
		Serenity.setSessionVariable(key);
	}

	public void moveMouse(WebElementFacade webElement) {
		withAction().moveToElement(webElement)
				// .click()
				.build().perform();
	}

	public void ScrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

	}
	public void clickAction(WebElementFacade webElement) {
		withAction().moveToElement(webElement)
				.click()
				.build().perform();
	}
    public MobilePageObject(final WebDriver driver) {
        super(driver, new Predicate<PageObject>() {
            @Override
            public boolean apply(PageObject page) {

                PageFactory
                        .initElements(new AppiumFieldDecorator(((WebDriverFacade) page.getDriver()).getProxiedDriver(),
                                page.getImplicitWaitTimeout()), page);
                return true;
            }

        });

    }
	



}
