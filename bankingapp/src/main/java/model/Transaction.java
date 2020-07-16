package model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
public class Transaction {

    private Integer id;
    private String senderAccountId;
    private String receiverAccountId;
    private BigDecimal amount;
    private String currency;
    private Instant transactionDate;
}
