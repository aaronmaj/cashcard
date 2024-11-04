package example.cashcard.domain;

public record CashCard(
        Long id,
        String owner,
        Double amountRequestedForAuthorization
) {
}
