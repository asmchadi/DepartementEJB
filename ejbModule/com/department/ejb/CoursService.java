package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.Cours;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class CoursService extends Service<Cours> {
	
    /**
     * Default constructor. 
     */
    public CoursService() {
    	super(Cours.class);
    }

}
