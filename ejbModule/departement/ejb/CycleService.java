package departement.ejb;

import javax.ejb.Stateless;
import departement.*;
import departement.util.Service;

@Stateless
public class CycleService extends Service<Cycle> {
	
	public CycleService(){
		super(Cycle.class);
	}

}
