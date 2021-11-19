package com.haulmont.jje.screen.order;

import com.haulmont.jje.entity.Order;
import com.haulmont.service.OrderService;
import io.jmix.ui.screen.CloseAction;
import io.jmix.ui.screen.LookupComponent;
import io.jmix.ui.screen.Screen;
import io.jmix.ui.screen.StandardLookup;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import io.jmix.ui.util.OperationResult;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import io.jmix.ui.screen.Screen.InitEvent;

import java.util.UUID;


/**
 * @author vasilev
 */
@UiController("jje_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
public class OrderBrowse extends StandardLookup<Order> {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(OrderBrowse.class);

    @Autowired
    @Qualifier("jje_OrderService")
    protected OrderService orderService;

    @Override
    public OperationResult close(CloseAction action) {
        var noopOrder = orderService.findOrderById(UUID.randomUUID());
        log.info("Order: " + noopOrder);
        return super.close(action);
    }

    @Subscribe
    protected void onInit(InitEvent event) {

    }

}