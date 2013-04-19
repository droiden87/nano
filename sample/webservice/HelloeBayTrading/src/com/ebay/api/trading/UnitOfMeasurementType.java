// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Provides a mapping between suggested unit of measure strings and
 * other, less popular strings.
 * 
 */
public class UnitOfMeasurementType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AlternateText")
	@Order(value=0)
	public List<String> alternateText;	
	
	@Element(name = "SuggestedText")
	@Order(value=1)
	public String suggestedText;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}