package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.Formation;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class FormationService extends Service<Formation> {
	
    /**
     * Default constructor. 
     */
    public FormationService() {
    	super(Formation.class);
    }

}
