package com.joao.studycase.ordersservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrdersController {

    @GetMapping
    public List<String> getAllOrders() {
        return Arrays.asList("order1", "order2");
    }
}
