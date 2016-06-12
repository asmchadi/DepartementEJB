package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.Pv;
import com.department.entities.PvDefault;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class PvDefaultService extends Service<PvDefault> {
	
    /**
     * Default constructor. 
     */
    public PvDefaultService() {
    	super(PvDefault.class);
    }

}
