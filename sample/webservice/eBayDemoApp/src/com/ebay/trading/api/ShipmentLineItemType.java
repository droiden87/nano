// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 *          This type provides information about one or more order line items in a Global Shipping Program package.
 * 
 */
public class ShipmentLineItemType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "LineItem")
	@Order(value=0)
	public List<LineItemType> lineItem;	
	
	@AnyElement
	@Order(value=1)
	public List<Object> any;	
	
    
}