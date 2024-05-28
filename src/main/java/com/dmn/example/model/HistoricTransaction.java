package com.dmn.example.model;
import java.util.Objects;

public class HistoricTransaction {
    
    private String accountNumber;
    private String mcc;
    private int amount;

    public HistoricTransaction() {
    }

    public HistoricTransaction(String accountNumber, String mcc, int amount) {
        this.accountNumber = accountNumber;
        this.mcc = mcc;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMcc() {
        return this.mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof HistoricTransaction)) {
            return false;
        }
        HistoricTransaction historicTransaction = (HistoricTransaction) o;
        return Objects.equals(accountNumber, historicTransaction.accountNumber) && Objects.equals(mcc, historicTransaction.mcc) && Objects.equals(amount, historicTransaction.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, mcc, amount);
    }

    @Override
    public String toString() {
        return "{" +
            " accountNumber='" + getAccountNumber() + "'" +
            ", mcc='" + getMcc() + "'" +
            ", amount='" + getAmount() + "'" +
            "}";
    }    
}
