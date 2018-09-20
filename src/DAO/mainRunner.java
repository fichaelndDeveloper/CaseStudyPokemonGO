package DAO;

import Interfaces.*;

import java.util.ArrayList;
import java.util.List;

import DAO.*;
import Models.*;

public class mainRunner {
    public static void main(String[] args) {

        User user1 = new User();
        user1.setFriendCOde(43244233);
        user1.setLocation("flushing");
        user1.setTeam("valor");
        user1.setTrainerLVL(40);
        user1.setUser_Name("visRock");

        UserDAO userDAO = new UserDAO();
        //userDAO.insertNewUser(user1);
        userDAO.getUsers();

        LocationDAO locationDAO=new LocationDAO();

        locationDAO.locationList();

        
        TradeOffersDAO tester=new TradeOffersDAO();
        
        
        List<TradeOffers> tradelist = new ArrayList<>();
        tradelist=tester.tradeOfferByID(28);
        
        System.out.println(tradelist);
        
        
        
        
        
    }

}

