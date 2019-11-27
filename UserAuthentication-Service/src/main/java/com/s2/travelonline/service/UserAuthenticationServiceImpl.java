package com.s2.travelonline.service;

import org.springframework.stereotype.Service;

import com.s2.travelonline.exception.UserAlreadyExistsException;
import com.s2.travelonline.exception.UserNotFoundException;
import com.s2.travelonline.model.User;

/*
* Service classes are used here to implement additional business logic/validation 
* This class has to be annotated with @Service annotation.
* @Service - It is a specialization of the component annotation. It doesn't currently 
* provide any additional behavior over the @Component annotation, but it's a good idea 
* to use @Service over @Component in service-layer classes because it specifies intent 
* better. Additionally, tool support and additional behavior might rely on it in the 
* future.
* */

@Service
public class UserAuthenticationServiceImpl implements UserAuthenticationService {

	/*
	 * Autowiring should be implemented for the UserAuthenticationRepository.
	 * (Use Constructor-based autowiring) Please note that we should not create
	 * any object using the new keyword.
	 */
	/*@Autowired
	private UserAutheticationRepository userAutheticationRepository;*/

	/*
	 * This method should be used to validate a user using userId and password.
	 * Call the corresponding method of Respository interface.
	 * 
	 */
	@Override
	public User findByUserIdAndPassword(String userId, String password) throws UserNotFoundException {
		System.out.println(userId+"\t"+ password+" after the vcall Check the details"); 
		User user = new User();
		user.setFirstName("Karthick");
		user.setLastName("Raj");
		user.setUserId("Karthick");
		user.setUserPassword("1234");
		user.setUserRole("USER");
		//User currentUser = this.userAutheticationRepository.findByUserIdAndUserPassword(userId, password);
		//System.out.println(userId+"\t"+ password+" after the vcall Check the details"+currentUser.getFirstName()); 
		if (user != null) {
			return user;
		} else {
			throw new UserNotFoundException("User is not found");
		}
	}

	/*
	 * This method should be used to save a new user.Call the corresponding
	 * method of Respository interface.
	 */

	@Override
	public boolean saveUser(User user) throws UserAlreadyExistsException {
		/*User returnObject = (User) this.userAutheticationRepository.save(user);
		if (returnObject != null) {
			return true;
		} else {
			throw new UserAlreadyExistsException("User was already found");
		}*/
		
		return true;
	}
}
