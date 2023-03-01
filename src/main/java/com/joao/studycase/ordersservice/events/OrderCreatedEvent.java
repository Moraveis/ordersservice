package com.joao.studycase.ordersservice.events;

import com.joao.studycase.ordersservice.domain.OrderStatus;
import lombok.Builder;
import lombok.Data;

@Data
public class OrderCreatedEvent {

    private String orderId;
    private String userId;
    private String productId;
    private Integer quantity;
    private String addressId;
    private OrderStatus orderStatus;
}
