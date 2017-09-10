package guru.springframework;

import org.springframework.stereotype.Component;

@Component
public class CustomBean implements InitInterface {

public String name;
public String age;

@Override
public void beforeInit(){
    System.out.println("(CustomBean) ## - Before Init - Called by Bean Post Processor");
}
@Override
public void afterInit(){
    System.out.println("(CustomBean) ## - After init called by Bean Post Processor");
}
	
	

}
