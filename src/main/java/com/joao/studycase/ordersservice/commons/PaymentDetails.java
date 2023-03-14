package com.joao.studycase.ordersservice.commons;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentDetails {

    private final String name;
    private final String cardNumber;
    private final Integer validUntilMonth;
    private final Integer YearMonth;
    private final String cvv;
}
