package ca.rasul;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import ca.rasul.services.LoizInject;
import ca.rasul.services.LoizInjectInterface;


public class LoizInjectGuiceModule extends AbstractModule {


	@Override
	protected void configure() {
		// TODO Auto-generated method stub
	}
	

	@Provides
    public LoizInjectInterface getLoizInject(){
        return new LoizInject("NomExemple");
    }


}