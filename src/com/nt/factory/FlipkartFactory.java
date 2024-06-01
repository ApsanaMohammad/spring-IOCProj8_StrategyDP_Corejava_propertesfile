package com.nt.factory;

import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.BlueDart;
import com.nt.comp.FlipKart;

public class FlipkartFactory {

	 public static FlipKart getInstance(String ctype) {
	        
		 Courier courier = null;
	        if (ctype.equalsIgnoreCase("dtdc"))
	            courier = new DTDC();
	        else if (ctype.equalsIgnoreCase("bDart"))
	            courier = new BlueDart();
	        else
	            throw new IllegalArgumentException("Invalid person type");
	        FlipKart f=new FlipKart();
	        f.setCouier(courier);
	        return f;
	        
	    }
}
