package com.department.ejb;

import javax.ejb.Stateless;

import com.department.entities.Document;
import com.department.utils.Service;

/**
 * Session Bean implementation class KidService
 */

@Stateless 
public class DocumentService extends Service<Document> {
	
    /**
     * Default constructor. 
     */
    public DocumentService() {
    	super(Document.class);
    }

}
