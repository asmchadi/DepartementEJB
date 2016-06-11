package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.ChargeHoraire;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class ChargeHoraireService extends Service<ChargeHoraire> {
	
    /**
     * Default constructor. 
     */
    public ChargeHoraireService() {
    	super(ChargeHoraire.class);
    }
    
    public ChargeHoraire getCurrentChargeHoraire(){
    	return this.findById(new Long(1));
    }
    
   

    
}
