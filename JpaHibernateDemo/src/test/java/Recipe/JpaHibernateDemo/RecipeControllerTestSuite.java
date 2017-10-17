package Recipe.JpaHibernateDemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import Recipe.JpaHibernateDemo.BootStrapClass.FirstBootStrapClass;
import Recipe.JpaHibernateDemo.Controller.RecipeController;
import Recipe.JpaHibernateDemo.Entities.Recipe;
import Recipe.JpaHibernateDemo.Service.RecipeService;
@RunWith(SpringRunner.class)
@SpringBootTest
//@Sql("data.sql")
public class RecipeControllerTestSuite {// This Junit test case will validate if the Controller is returning the String "RecipeList".
	@Mock
	private RecipeService recpie_service;
	@Autowired
	private RecipeController recipeController;
	@Mock
	private Model model;
	List<Recipe> recipe_list;
	
	
	@Before
	public void setUp() throws Exception{
		MockitoAnnotations.initMocks(this);// Registering all the objects as mocks which are annotated with @Mock
		recipeController = new RecipeController(recpie_service);// Initializing
		recipe_list = new ArrayList<Recipe>(); 
	}
	
	@Test
	public void getRecipeList() throws Exception{
		
		
	when(recpie_service.findAll()).thenReturn(this.recipe_list);// Substituting findALL return with this.recipe_list. We can do that when the object is registered as a Mock.
	assertEquals(recipeController.getRecipeList(model),"RecipeList");// Verifying if the string returned by the controller is the same as the one returned by our mock
	verify(recpie_service,times(1)).findAll();//Verifying if the method is executed only one time
	verify(model,times(1)).addAttribute(eq("Recipes"),anyList());//Verifying if the method is executed only one time
	}


}
