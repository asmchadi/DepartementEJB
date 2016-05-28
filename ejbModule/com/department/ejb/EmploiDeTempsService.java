package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.EmploiDeTemps;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class EmploiDeTempsService extends Service<EmploiDeTemps> {
	
    /**
     * Default constructor. 
     */
    public EmploiDeTempsService() {
    	super(EmploiDeTemps.class);
    }

}
