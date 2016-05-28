package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.Cycle;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class CycleService extends Service<Cycle> {
	
    /**
     * Default constructor. 
     */
    public CycleService() {
    	super(Cycle.class);
    }

}
