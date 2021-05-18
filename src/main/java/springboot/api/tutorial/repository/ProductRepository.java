package springboot.api.tutorial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springboot.api.tutorial.model.Product;

@Repository
public interface ProductRepository extends CrudRepository <Product, Long> {
 
}