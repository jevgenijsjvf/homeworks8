package HW4;

import java.util.Objects;

public class CreditCard {
    private String cardNumber;
    private String pinCode;
    private double debetBalance;
    private double creditLimite;
    private double spendCredit;

    public CreditCard(String cardNumber, String pinCode, double debetBalance, double creditLimite, double spendCredit) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.debetBalance = debetBalance;
        this.creditLimite = creditLimite;
        this.spendCredit = spendCredit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getDebetBalance() {
        return debetBalance;
    }

    public void setDebetBalance(double debetBalance) {
        this.debetBalance = debetBalance;
    }

    public double getCreditLimite() {
        return creditLimite;
    }

    public void setCreditLimite(double creditLimite) {
        this.creditLimite = creditLimite;
    }

    public double getSpendCredit() {
        return spendCredit;
    }

    public void setSpendCredit(double spendCredit) {
        this.spendCredit = spendCredit;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return Double.compare(that.debetBalance, debetBalance) == 0 &&
                Double.compare(that.creditLimite, creditLimite) == 0 &&
                Double.compare(that.spendCredit, spendCredit) == 0 &&
                Objects.equals(cardNumber, that.cardNumber) &&
                Objects.equals(pinCode, that.pinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, pinCode, debetBalance, creditLimite, spendCredit);
    }

    public boolean topup(double amount, String pinCode) {
        if (this.pinCode.equals(pinCode)) {
            if (spendCredit > 0) {
                amount = amount - spendCredit;
                System.out.println("Есть использованый остаток по кредиту, сначало погашаем его.");
                if (amount > 0) {
                    debetBalance = debetBalance + amount;
                    spendCredit=0;
                    System.out.println("Остатком от взноса увеличи дебетовый баланс.");
                    return true;
                } else {
                    spendCredit=-amount;
                    System.out.println("Остатком от взноса увеличи дебетовый баланс.");
                    }
            } else {
                debetBalance = debetBalance + amount;
                System.out.println("Сразу увеличи дебетовый баланс сумой.");
                return true;
            }
            return true;
        } else {
            System.out.println("Pin code wrong.");
            return false;
        }

    }

    public boolean withdraw(double amount, String pinCode) {
        double availableAmount = debetBalance + (creditLimite - spendCredit);
        boolean isEnoughMoney = availableAmount - amount > 0.001;
        if (this.pinCode.equals(pinCode)) {
            System.out.print("Pin code correct. / ");
            if (isEnoughMoney) {
                System.out.print("Money enough. / ");
                if (debetBalance >= amount) {
                    System.out.println("Money withdraw from debet balance.");
                    debetBalance = debetBalance - amount;
                    return true;
                } else {
                    amount = amount - debetBalance;
                    debetBalance = 0;
                    System.out.print("Debet balance is 0. " + amount + " need to take from credit balance. / ");
                    if (creditLimite > amount) {
                        spendCredit = spendCredit + amount;
                        System.out.println("Money issued.");
                        return true;
                    } else {
                        System.out.println("Credit limit no enough");
                        return false;
                    }
                }
            } else {
                System.out.println("Money not enough.");
                return false;
            }
        } else {
            System.out.println("Pin code wrong.");
            return false;
        }
    }

    public void printInfo() {
        System.out.println();
        System.out.println("Дебетовый баланс = " + debetBalance);
        System.out.println("Кредитный лимит = " + creditLimite);
        System.out.println("Выбрано по кредиту = " + spendCredit);
        System.out.println();
    }

}
