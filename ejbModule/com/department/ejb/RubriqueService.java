package com.department.ejb;

import java.util.List;

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


	@SuppressWarnings("unchecked")
	public List<String> cd_findOneColumn(String query) {
		return em.createQuery(query).getResultList();
	}
	public Object cd_findByIntitule(String intitule){
		return em.createQuery("from Rubrique where intitule = '"+intitule+"'");
		
	}
	
}
