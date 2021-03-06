/*package com.s2.travelonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.s2.travelonline.model.User;



* This class is implementing the JpaRepository interface for User.
* Annotate this class with @Repository annotation
* 
@Repository
public interface UserAutheticationRepository extends JpaRepository<User, String> {




	* Apart from the standard CRUD methods already available in JPA Repository, based
	* on our requirements, we might need to create few query methods for getting 
	* specific data from the database. 
	* 
	
	
	* This method will validate a user from database by username and password. 
    
    //@Query(value="SELECT U from User U",nativeQuery=false)
    @Query(value="SELECT U from User U where U.userId=:userId AND U.userPassword=:userPassword")
    User findByUserIdAndUserPassword(@Param("userId") String userId,@Param("userPassword") String userPassword);
}
*/