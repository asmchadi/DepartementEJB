package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.BonusParticipant;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class BonusParticipantService extends Service<BonusParticipant> {
	
    /**
     * Default constructor. 
     */
    public BonusParticipantService() {
    	super(BonusParticipant.class);
    }

}
