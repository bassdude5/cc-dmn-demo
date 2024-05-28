package com.dmn.example.model;

import java.util.List;
import java.util.Objects;

public class CreditTransaction {

    private String accountNumber;
    private Double amount;
    private List<HistoricTransaction> history;

    public CreditTransaction() {
    }

    public CreditTransaction(String accountNumber, Double amount, List<HistoricTransaction> history) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.history = history;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<HistoricTransaction> getHistory() {
        return this.history;
    }

    public void setHistory(List<HistoricTransaction> history) {
        this.history = history;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CreditTransaction)) {
            return false;
        }
        CreditTransaction creditTransaction = (CreditTransaction) o;
        return Objects.equals(accountNumber, creditTransaction.accountNumber) && Objects.equals(amount, creditTransaction.amount) && Objects.equals(history, creditTransaction.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, amount, history);
    }

    @Override
    public String toString() {
        return "{" +
            " accountNumber='" + getAccountNumber() + "'" +
            ", amount='" + getAmount() + "'" +
            ", history='" + getHistory() + "'" +
            "}";
    }    
}
