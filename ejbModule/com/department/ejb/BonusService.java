package com.department.ejb;

import java.util.List;

import javax.ejb.Stateless;

import com.department.entities.Bonus;
import com.department.entities.Cours;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class BonusService extends Service<Bonus> {
	
    /**
     * Default constructor. 
     */
    public BonusService() {
    	super(Bonus.class);
    }
    
    public Long getPFEBonusId() {

		List<Bonus> lst = findByWhere("intitule like '%PFE%'", "id");
		if (lst.size() > 0) {
			return lst.get(0).getId();
		}
		return new Long(1);
	}

	public Bonus getPFEBonus() {

		List<Bonus> lst = findByWhere("intitule like '%PFE%'", "id");
		if (lst.size() > 0) {
			return lst.get(0);
		}
		return null;
	}

}
