package tests.telecommunications.positive;

import static constants.Constant.CURRENCY.CURRENCY_UAH;
import static constants.Constant.MobileReplenishmentTestData.*;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

public class MobilePhoneReplenishmentPositiveTest extends BaseTest {

    @Test
    public void checkIsRedirectToAuth(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.clickButtonWallet();
        basePage.isAuthWidgetPresent();

}

    @Test
    public void checkMinimumReplenishmentAmount(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("1")
                .enterCardFrom(MOBILE_PAYMENT_PHONE_CARD_FROM)
                .enterCardExpDate(MOBILE_PAYMENT_PHONE_CARD_EXP_DATE)
                .enterCardCvv(MOBILE_PAYMENT_PHONE_CARD_CVV)
                .clickButtonSubmitToCard()
                .checkPaymentAmountAndCommission("1", "1")
                .checkPaymentCurrency(CURRENCY_UAH, CURRENCY_UAH)
                .checkPaymentCardAndRecipient(TEST_CARD_1_THE_LAST_FOUR_DIGITS, "Kyivstar Ukraine");

    }


}
