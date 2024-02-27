package jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
public interface productsRepo extends JpaRepository<Products,Integer>{

}
