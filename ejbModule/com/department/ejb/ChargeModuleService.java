package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.ChargeModule;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class ChargeModuleService extends Service<ChargeModule> {
	
    /**
     * Default constructor. 
     */
    public ChargeModuleService() {
    	super(ChargeModule.class);
    }

}
