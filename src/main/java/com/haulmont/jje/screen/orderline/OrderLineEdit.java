package com.haulmont.jje.screen.orderline;

import io.jmix.ui.screen.*;
import com.haulmont.jje.entity.OrderLine;


/**
 *
 * @author vasilev
 * 
 */
@UiController("jje_OrderLine.edit")
@UiDescriptor("order-line-edit.xml")
@EditedEntityContainer("orderLineDc")
public class OrderLineEdit extends StandardEditor<OrderLine> {
}