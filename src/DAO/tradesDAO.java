package DAO;

import Interfaces.tradesDAOI;


import Models.trades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Models.TradeOffers;

import java.util.List;

public class tradesDAO implements tradesDAOI {

	 


	
    @Override

    public List<trades> tradeList() {
    	
    	
    	List<trades> tradelist=new ArrayList<>();
    	
    	String sql = "Select * from trades";
        try {
            OracleConnection con = new OracleConnection();
            Connection connected = con.getConnection();

            PreparedStatement ps = connected.prepareStatement(sql);


            ResultSet rs = ps.executeQuery();


            while (rs.next()) {
//            	private int tradeid;
//                private int friendone;
//                private int friendtwo;
//                private String pokemonone;
//                private String pokemontwo;
//                private int stardust;
                trades temp = new trades();
                //temp.setUser_Name(rs.getString("user_name"));
              temp.setFriendone(rs.getInt("friendone"));
              temp.setFriendtwo(rs.getInt("friendtwo"));
              temp.setStardust(rs.getInt("stardustcost"));
              temp.setPokemonone(rs.getString("pokemonone"));
              temp.setPokemontwo(rs.getString("pokemontwo"));
              temp.setTradeid(rs.getInt("tradeid"));
            
              System.out.println(rs.getInt("stardustcost"));
                tradelist.add(temp);


            }

            System.out.println(tradelist.size());
            System.out.println("successful get all trades");


        } catch (Exception e) {
            System.out.println(e.toString());

        }


    	
    	
    	
    	
        return tradelist;
    }
    public List<TradeOffers> tradeofferList() {
        return null;

    }
}
