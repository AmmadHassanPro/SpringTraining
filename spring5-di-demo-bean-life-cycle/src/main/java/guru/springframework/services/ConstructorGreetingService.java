package guru.springframework.services;

import org.springframework.stereotype.Service;

import guru.springframework.InitInterface;

/**
 * Created by jt on 5/24/17.
 */
@Service
public class ConstructorGreetingService implements GreetingService,InitInterface {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor!!!";
    }
    
    @Override
    public void beforeInit(){
        System.out.println("(ConstructorGreetingService) ## - Before Init - Called by Bean Post Processor");
    }
    @Override
    public void afterInit(){
        System.out.println("(ConstructorGreetingService) ## - After init called by Bean Post Processor");
    }
    	
    
}
