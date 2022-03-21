package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement resultTextElement;

    @FindBy(id = "sp-cc-accept")
    public WebElement cookiesBtn;

    @FindBy(xpath = " (//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-3'])[1]")
    public WebElement firstResultLink;

    @FindBy(xpath = "(//span[@aria-hidden=\"true\"])[4]")
    public WebElement  priceText;

     @FindBy(id = "inline-twister-expanded-dimension-text-size_name")
    public WebElement sizeText;

    @FindBy(id = "inline-twister-expanded-dimension-text-color_name")
    public WebElement colorText;

    @FindBy(id = "availability")
    public WebElement stockText;

    @FindBy(xpath = "//h1[@id='title']")
    public WebElement selectedProduct;

}
