package Recipe.JpaHibernateDemo.Entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Ingredient {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long id;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public BigDecimal getAmount() {
	return amount;
}
public void setAmount(BigDecimal amount) {
	this.amount = amount;
}
public Recipe getRecipes() {
	return recipes;
}
public void setRecipes(Recipe recipes) {
	this.recipes = recipes;
}
private String description;
private BigDecimal amount;
@ManyToOne
private Recipe recipes;
}
