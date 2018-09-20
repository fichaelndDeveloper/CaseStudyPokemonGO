package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Interfaces.TradeOffersDAOI;
import Models.TradeOffers;

public class TradeOffersDAO implements TradeOffersDAOI {

	@Override
	public List<TradeOffers> tradeOfferByID(int ID) {
		// TODO Auto-generated method stub

		List<TradeOffers> tradelist = new ArrayList<>();

		String sql = "Select * from tradeOffers Where UserID=?";
		try {
			OracleConnection con = new OracleConnection();
			Connection connected = con.getConnection();

			PreparedStatement ps = connected.prepareStatement(sql);

			ps.setInt(1, ID);
			
			//System.out.println(ps.toString());
			
			ResultSet rs = ps.executeQuery();

			
			while (rs.next()) {

				TradeOffers temp = new TradeOffers();
				// temp.setUser_Name(rs.getString("user_name"));

				temp.setAgreed(rs.getString("agreed"));
				temp.setPokemon(rs.getString("PokemonTraded"));
				temp.setPokemonOffered(rs.getString("pokemonOffered"));
				temp.setUserID(rs.getInt("UserID"));
				temp.setUserIDOffered(rs.getInt("TradeOFFERID"));
				
				tradelist.add(temp);

			}

			System.out.println(tradelist.size());
			System.out.println("successful get all tradesOffers");

		} catch (Exception e) {
			System.out.println(e.toString());

		}

		return tradelist;

	}

}
