package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 6/5/17.
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

    	 //  ((LifeCycleDemoBean) bean).beforeInit();
    //	InitInterface obj = (LifeCycleDemoBean) bean;
    	
    //	obj.beforeInit();
   // ((InitInterface) bean).beforeInit();
    	 
    	 
    	
   	
        if(bean instanceof InitInterface){
            ((InitInterface) bean).beforeInit();
        }

    	
    	
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        
    //	((InitInterface) bean).afterInit();
    	
  	
    	if(bean instanceof InitInterface){
            ((InitInterface) bean).afterInit();
        }

    	
    	  
        return bean;
    }
}
