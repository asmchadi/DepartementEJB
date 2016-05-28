package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.DemandeAttestation;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class DemandeAttestationService extends Service<DemandeAttestation> {
	
    /**
     * Default constructor. 
     */
    public DemandeAttestationService() {
    	super(DemandeAttestation.class);
    }

}
