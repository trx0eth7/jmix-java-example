package com.haulmont.jje.service;

import com.haulmont.jje.entity.Order;
import com.haulmont.model.OrderDto;
import com.haulmont.service.OrderService;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import org.slf4j.Logger;
import org.springframework.context.annotation.Primary;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author vasilev
 */
@SuppressWarnings("FieldMayBeFinal")
@Primary
@Service(OrderService.NAME)
public class OrderServiceBean implements OrderService {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(OrderServiceBean.class);

    private DataManager dataManager;

    public OrderServiceBean(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Nullable
    @Override
    public OrderDto findOrderById(UUID id) {
        log.info("Calling order service bean...");

        var order = dataManager.load(Order.class)
                .id(id)
                .fetchPlan(FetchPlan.LOCAL)
                .optional().orElse(null);

        if (order == null) {
            return null;
        }

        return new OrderDto(order.getId());
    }
}
