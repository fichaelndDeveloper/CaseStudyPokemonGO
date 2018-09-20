package Interfaces;

import Models.User;

import java.util.List;

public interface UserDAOI {

    public List<User> getUsers();

    public List<User> getUsersBylocation(String loc);


    public boolean userExist(User u);

    public User getUser(String name);
    
    public boolean updateUser(User u);

    public boolean insertNewUser(User user) ;
    
}
