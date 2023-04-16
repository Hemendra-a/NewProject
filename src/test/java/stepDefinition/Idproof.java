package stepDefinition;

import pageObjects.IdproofObject;
import utils.Testcontextsetup;

public class Idproof {
	
	Testcontextsetup Testcontextsetup;
	IdproofObject IdproofObject ;
	public Idproof(Testcontextsetup Testcontextsetup) {
		this.Testcontextsetup=Testcontextsetup;
		this.IdproofObject=Testcontextsetup.PageObjectManager.GetIdproofObject();
		
	}
}
