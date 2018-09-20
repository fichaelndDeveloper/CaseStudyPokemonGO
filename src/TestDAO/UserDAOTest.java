package TestDAO;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;


import DAO.UserDAO;
import Models.User;
import junit.framework.Assert;

public class UserDAOTest {
	
	UserDAO userDAO;
//	@BeforeClass
	public void setUp() {
		userDAO=new UserDAO();
	}

	@Test
	public void testGetUser() {
		User excepted=new User();
		
		excepted.setFriendCOde(43244233);
        excepted.setLocation("flushing");
        excepted.setTeam("valor");
        excepted.setTrainerLVL(40);
        excepted.setUser_Name("visRock");
        
        
        User actual=userDAO.getUser("visRock");
        
        Assert.assertEquals(excepted.getFriendCOde(),actual.getFriendCOde());
		
	}
	
	
	
	
}
