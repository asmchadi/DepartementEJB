package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.Module;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class ModuleService extends Service<Module> {
	
    /**
     * Default constructor. 
     */
    public ModuleService() {
    	super(Module.class);
    }

}
