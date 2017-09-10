package guru.springframework;

import org.springframework.stereotype.Component;

@Component
public interface InitInterface {
	public void beforeInit();
    public void afterInit();
	
	
	
}
