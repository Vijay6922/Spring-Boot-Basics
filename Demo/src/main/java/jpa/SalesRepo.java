package jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
public interface SalesRepo extends JpaRepository<Sales1,Integer>{

	@Query("from sale where qty between :minqty and :maxqty")
	List<Sales1> getSales1(@Param("minqty") int minqty,@Param("maxqty") int maxqty);
	
}
