package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.AnneeUniversitaire;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class AnneeService extends Service<AnneeUniversitaire> {
	
    /**
     * Default constructor. 
     */
    public AnneeService() {
    	super(AnneeUniversitaire.class);
    }

}
