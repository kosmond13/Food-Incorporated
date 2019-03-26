package com.excella.foodinc.repository;

import com.excella.foodinc.domains.Food;
import java.util.List;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<Food, Long> {

    @Query("SELECT id, name, calories, fat, protein, carbs FROM food where upper(name) like '%' || upper(:name) || '%' ")
    List<Food> findByName(@Param("name") String name);

}