package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.Rubrique;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class RubriqueService extends Service<Rubrique> {
	
    /**
     * Default constructor. 
     */
    public RubriqueService() {
    	super(Rubrique.class);
    }

}
