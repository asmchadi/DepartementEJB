package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.TypeAttestation;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class TypeAttestationService extends Service<TypeAttestation> {
	
    /**
     * Default constructor. 
     */
    public TypeAttestationService() {
    	super(TypeAttestation.class);
    }

}
