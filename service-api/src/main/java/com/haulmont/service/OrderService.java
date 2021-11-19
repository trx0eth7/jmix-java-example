package com.haulmont.service;

import com.haulmont.model.OrderDto;

import java.util.UUID;

/**
 * @author vasilev
 */
public interface OrderService {
    String NAME = "jje_OrderService";

    OrderDto findOrderById(UUID id);
}
