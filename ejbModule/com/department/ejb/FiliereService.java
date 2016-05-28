package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.Filiere;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class FiliereService extends Service<Filiere> {
	
    /**
     * Default constructor. 
     */
    public FiliereService() {
    	super(Filiere.class);
    }

}
