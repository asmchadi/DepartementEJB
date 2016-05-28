package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.PvValidators;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class PvValidatorsService extends Service<PvValidators> {
	
    /**
     * Default constructor. 
     */
    public PvValidatorsService() {
    	super(PvValidators.class);
    }

}
