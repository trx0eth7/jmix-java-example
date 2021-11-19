package com.haulmont.jje.screen.order;

import io.jmix.ui.screen.*;
import com.haulmont.jje.entity.Order;


/**
 *
 * @author vasilev
 * 
 */
@UiController("jje_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
public class OrderEdit extends StandardEditor<Order> {
}