package com.joao.studycase.ordersservice.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrdersCommandController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<OrderResponse> createOrder(@RequestBody(required = true) OrderRequest request) {
        OrderResponse response = new OrderResponse();
        BeanUtils.copyProperties(request, response);

        return Collections.singletonList(response);
    }
}
