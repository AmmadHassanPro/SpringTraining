package Recipe.JpaHibernateDemo.Repository;

import org.springframework.data.repository.CrudRepository;

import Recipe.JpaHibernateDemo.Entities.Category;

public interface CategoryRepository extends CrudRepository<Category,Long>{

}
