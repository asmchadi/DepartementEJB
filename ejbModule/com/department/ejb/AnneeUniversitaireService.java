package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.AnneeUniversitaire;
import com.department.utils.Service;

@Stateless
public class AnneeUniversitaireService extends Service<AnneeUniversitaire> {

	public AnneeUniversitaireService() {
		super(AnneeUniversitaire.class);
	}

}
