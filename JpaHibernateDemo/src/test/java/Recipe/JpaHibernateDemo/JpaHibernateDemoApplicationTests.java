package Recipe.JpaHibernateDemo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;

import Recipe.JpaHibernateDemo.Controller.RecipeController;
import Recipe.JpaHibernateDemo.Service.RecipeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaHibernateDemoApplicationTests {
	
	private RecipeService recpie_service;
	
	private RecipeController recipeController;
	private Model model;
	
	
	@Before
	public void setUp() throws Exception{
		MockitoAnnotations.initMocks(recpie_service);
		MockitoAnnotations.initMocks(model);
		recpie_service = new RecipeService();
		
	}
	
	@Test
	public void getRecipeList() throws Exception{
		
		
	}

}
