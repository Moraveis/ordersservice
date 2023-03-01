package com.joao.studycase.ordersservice.handlers;

import com.joao.studycase.ordersservice.domain.entities.OrderEntity;
import com.joao.studycase.ordersservice.events.OrderCreatedEvent;
import com.joao.studycase.ordersservice.repository.OrderRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OrderEventHandler {

    private final OrderRepository orderRepository;

    public OrderEventHandler(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @EventHandler
    public void on(OrderCreatedEvent orderCreatedEvent) {
        OrderEntity orderEntity = new OrderEntity();
        BeanUtils.copyProperties(orderCreatedEvent, orderEntity);

        orderRepository.save(orderEntity);
    }
}
