package com.joao.studycase.ordersservice.controllers;

import com.joao.studycase.ordersservice.commands.CreatedOrderCommand;
import com.joao.studycase.ordersservice.domain.OrderStatus;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value = "/orders")
public class OrdersCommandController {

    private final CommandGateway commandGateway;

    public OrdersCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createOrder(@RequestBody OrderRequest request) {
        CreatedOrderCommand createdOrderCommand = CreatedOrderCommand.builder()
                .userId("27b95829-4f3f-4ddf-8983-151ba010e35b")
                .productId(request.getProductId())
                .addressId(request.getAddressId())
                .quantity(request.getQuantity())
                .orderId(UUID.randomUUID().toString())
                .orderStatus(OrderStatus.CREATED)
                .build();

        return commandGateway.sendAndWait(createdOrderCommand);
    }
}
