package Recipe.JpaHibernateDemo.Repository;

import org.springframework.data.repository.CrudRepository;

import Recipe.JpaHibernateDemo.Entities.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long>{

}
