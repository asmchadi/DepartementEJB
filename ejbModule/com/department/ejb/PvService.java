package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.Pv;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class PvService extends Service<Pv> {
	
    /**
     * Default constructor. 
     */
    public PvService() {
    	super(Pv.class);
    }

}
