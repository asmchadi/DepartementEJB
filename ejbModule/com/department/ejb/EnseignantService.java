package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.Enseignant;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class EnseignantService extends Service<Enseignant> {
	
    /**
     * Default constructor. 
     */
    public EnseignantService() {
    	super(Enseignant.class);
    }

}
