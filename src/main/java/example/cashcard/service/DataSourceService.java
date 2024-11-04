package example.cashcard.service;

import example.cashcard.domain.CashCard;
import example.cashcard.domain.Transaction;

import java.util.Random;

public class DataSourceService {
    private final Random random = new Random();

    public Transaction getData() {
        CashCard cashCard = new CashCard(
                random.nextLong(),
                "John Doe",
                100.0
        );
        return new Transaction(random.nextLong(), cashCard);
    }
}
