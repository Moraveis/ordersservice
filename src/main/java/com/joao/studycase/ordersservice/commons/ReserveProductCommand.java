package com.joao.studycase.ordersservice.commons;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class ReserveProductCommand {

    /**
     * TODO: move this package to a share project
     */

    @TargetAggregateIdentifier
    private String productId;
    private String orderId;
    private String userId;
    private Integer quantity;

}
