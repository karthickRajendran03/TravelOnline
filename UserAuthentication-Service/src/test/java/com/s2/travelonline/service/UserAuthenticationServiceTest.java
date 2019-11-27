/*package com.s2.travelonline.service;

import java.util.Date;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.s2.travelonline.exception.UserAlreadyExistsException;
import com.s2.travelonline.exception.UserNotFoundException;
import com.s2.travelonline.model.User;
import com.s2.travelonline.repository.UserAutheticationRepository;
import com.s2.travelonline.service.UserAuthenticationServiceImpl;

public class UserAuthenticationServiceTest {

    @Mock
    private UserAutheticationRepository autheticationRepository;

    private User user;
    @InjectMocks
    private UserAuthenticationServiceImpl authenticationService;

    Optional<User> optional;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        user = new User();
        user.setUserId("Jhon123");
        user.setFirstName("Jhon123");
        user.setLastName("Smith");
        user.setUserRole("Admin");
        user.setUserPassword("123456");
        user.setUserAddedDate(new Date());
        optional = Optional.of(user);
    }

    @Test
    public void testSaveUserSuccess() throws UserAlreadyExistsException {

        Mockito.when(autheticationRepository.save(user)).thenReturn(user);
        boolean flag = authenticationService.saveUser(user);
        Assert.assertEquals("Cannot Register User", true, flag);

    }


    @Test(expected = UserAlreadyExistsException.class)
    public void testSaveUserFailure() throws UserAlreadyExistsException {

        Mockito.when(autheticationRepository.findById("Jhon123")).thenReturn(optional);
        Mockito.when(autheticationRepository.save(user)).thenReturn(user);
        boolean flag = authenticationService.saveUser(user);
        Assert.assertEquals("Cannot Register User", true, flag);

    }

    @Test
    public void testFindByUserIdAndPassword() throws UserNotFoundException {
        Mockito.when(autheticationRepository.findByUserIdAndUserPassword("Jhon123", "123456")).thenReturn(user);
        User fetchedUser = authenticationService.findByUserIdAndPassword("Jhon123", "123456");
        System.out.println(fetchedUser.getUserId());
        Assert.assertEquals("Jhon123", fetchedUser.getUserId());
    }
}
*/