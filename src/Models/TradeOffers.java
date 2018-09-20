package Models;

public class TradeOffers {

    public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getUserIDOffered() {
		return userIDOffered;
	}
	public void setUserIDOffered(int userIDOffered) {
		this.userIDOffered = userIDOffered;
	}
	public String getPokemon() {
		return pokemon;
	}
	public void setPokemon(String pokemon) {
		this.pokemon = pokemon;
	}
	public String getPokemonOffered() {
		return pokemonOffered;
	}
	public void setPokemonOffered(String pokemonOffered) {
		this.pokemonOffered = pokemonOffered;
	}
	public String getAgreed() {
		return agreed;
	}
	public void setAgreed(String agreed) {
		this.agreed = agreed;
	}
	private int userID;
    private int userIDOffered;
    private String pokemon;
    private String pokemonOffered;
    private String agreed;
    
    


}
