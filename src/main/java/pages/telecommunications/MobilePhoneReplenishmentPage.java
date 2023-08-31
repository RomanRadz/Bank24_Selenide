package pages.telecommunications;

import org.junit.jupiter.api.Assertions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$x;
import java.util.Objects;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {


    private final SelenideElement buttonWallet = $x("//div[contains(text(),'My wallet')]");
    private final SelenideElement inputPhoneNumber = $x("//input[@data-qa-node='phone-number']");
    private final SelenideElement inputAmount = $x("//input[@data-qa-node='amount']");
    private final SelenideElement buttonSubmitToCard = $x("//button[@data-qa-node='submit']");
    private final SelenideElement inputCardFrom = $x("//input[@data-qa-node='numberdebitSource']");
    private final SelenideElement inputCardExpDate = $x("//input[@data-qa-node='expiredebitSource']");
    private final SelenideElement inputCardCvv = $x("//input[@data-qa-node='cvvdebitSource']");
    private final SelenideElement cardNumberInTheCart = $x("//td[@data-qa-node='card']");
    private final SelenideElement recipientNameInTheCart = $x("//span[@data-qa-node='nameB']");
    private final SelenideElement amountInTheCart = $x("//span[@data-qa-node='amount']");
    private final SelenideElement commissionInTheCart = $x("//span[@data-qa-node='commission']");
    private final SelenideElement amountCurrencyInTheCart = $x("//small[@data-qa-node='currency']");
    private final SelenideElement commissionCurrencyInTheCart = $x("//small[@data-qa-node='commission-currency']");
    private final SelenideElement paymentDetails = $x("//div[@data-qa-node='details']");

    /**
     * Click on button 'My wallet'
     * @return MobilePhoneReplenishmentPage
     * */
    public MobilePhoneReplenishmentPage clickButtonWallet(){
        buttonWallet.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Enter phone number
     * @param phoneNumber
     * */
    public MobilePhoneReplenishmentPage enterPhoneNumber(String phoneNumber){
        clearAndType(inputPhoneNumber, phoneNumber);
        return this;
    }

    /**
     * Enter amount
     * @param amount
     * */
    public MobilePhoneReplenishmentPage enterAmount(String amount){
        clearAndType(inputAmount, amount);
        return this;
    }

    /**
     * Enter card from
     * @param card
     * */
    public MobilePhoneReplenishmentPage enterCardFrom(String card){
        clearAndType(inputCardFrom, card);
        return this;
    }

    /**
     * Enter card exp date
     * @param expDate
     * */
    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate){
        clearAndType(inputCardExpDate, expDate);
        return this;
    }

    /**
     * Enter card cvv
     * @param cvv
     * */
    public MobilePhoneReplenishmentPage enterCardCvv(String cvv){
        clearAndType(inputCardCvv, cvv);
        return this;
    }

    /**
     * Click on button 'Submit to card'
     * @return MobilePhoneReplenishmentPage
     * */
    public MobilePhoneReplenishmentPage clickButtonSubmitToCard(){
        buttonSubmitToCard.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Check the card number with which the payment and the recipient are made
     * @param cardFrom
     * @param recipient
     * */
    public MobilePhoneReplenishmentPage checkPaymentCardAndRecipient(String cardFrom, String recipient){
        checkMessage(cardFrom);
        checkMessage(recipient);
        return this;
    }

    /**
     * Check payment amount and commission amount
     * @param commission
     * @param amount
     * */
    public MobilePhoneReplenishmentPage checkPaymentAmountAndCommission(String amount, String commission){
        checkMessage(amount);
        checkMessage(commission);
        return this;
    }

    /**
     * Check payment currency of the payment amount and currency of fee
     * @param currencyAmount
     * @param commissionAmount
     * */
    public MobilePhoneReplenishmentPage checkPaymentCurrency(String currencyAmount, String commissionAmount){
        checkMessage(currencyAmount);
        checkMessage(commissionAmount);
        return this;
    }
}
