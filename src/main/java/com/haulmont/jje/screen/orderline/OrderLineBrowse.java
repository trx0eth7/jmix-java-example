package com.haulmont.jje.screen.orderline;

import io.jmix.ui.screen.*;
import com.haulmont.jje.entity.OrderLine;


/**
 *
 * @author vasilev
 * 
 */
@UiController("jje_OrderLine.browse")
@UiDescriptor("order-line-browse.xml")
@LookupComponent("orderLinesTable")
public class OrderLineBrowse extends StandardLookup<OrderLine> {
}