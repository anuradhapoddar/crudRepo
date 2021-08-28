package com.example.demo;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
	
	@Query("DELETE FROM Ability a WHERE a.id = :id")
	void deleteById(@Param("id") Integer id);

	
}  