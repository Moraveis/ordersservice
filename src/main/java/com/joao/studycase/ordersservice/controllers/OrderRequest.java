package com.joao.studycase.ordersservice.controllers;

import lombok.Data;

@Data
public class OrderRequest {

    private String productId;
    private Integer quantity;
    private String addressId;
}
