package service;

import model.Transaction;

import java.math.BigDecimal;

public class TransactionService {

    public void sendMoney(Transaction transaction){
        if (!validateSenderBalance(transaction)){
            return;
        }
        if (!validateReceiverAccountNumber(transaction)){
            return;
        }
        if (!validateCurrency(transaction)){
            return;
        }
        // Send money
    }

    private boolean validateSenderBalance(Transaction transaction){
        return true;
    }

    private boolean validateReceiverAccountNumber(Transaction transaction){
        return true;
    }

    private boolean validateCurrency(Transaction transaction){
        return true;
    }
}
