package springwork.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import DAO.TradeOffersDAO;
import DAO.UserDAO;
import DAO.tradesDAO;
import Interfaces.UserDAOI;
import Interfaces.tradesDAOI;
import Models.TradeOffers;
import Models.User;
import Models.trades;

//import springwork.model.*;


@Controller 
@RequestMapping("/")
@SessionAttributes("userkey")
//@RequestMapping(value="/userInfo",method=RequestMethod.POST)


public class HomeController {

	
	@ModelAttribute("userkey")
	public User setUpUserForm() {
		return new User();
	}
	
	
	@RequestMapping("/")
	public ModelAndView Welcome() {
		
		ModelAndView mav=new ModelAndView("Welcome");
		return mav;
	}
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public ModelAndView WelcomePage() {
		
		ModelAndView mav=new ModelAndView("Welcome");
		return mav;
	}
	
	@RequestMapping(value="/UseTradeOffers",method=RequestMethod.GET)
	public ModelAndView useTradeOffers() {
		
		ModelAndView mav=new ModelAndView("UseTradeOffers");
		
		TradeOffersDAO mytradeDAO=new TradeOffersDAO();
		
		List<TradeOffers> mytrades=mytradeDAO.tradeOfferByID(28);
		
		mav.addObject("mytrades",mytrades);
		
		return mav;
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView Register() {
		
		
		
		ModelAndView mav=new ModelAndView("Register");
		return mav;
	}
	
	@RequestMapping(value="/SignedUP",method=RequestMethod.POST)
	public ModelAndView SignedUp(@RequestParam("trainerName")String trainer,@RequestParam("trainerLVL")int trainerLVL
			,@RequestParam("team")String team,@RequestParam("location")String location
			,@RequestParam("friendCode")int friendCode,@RequestParam("password")String password) {
		
		User u=new User();
		UserDAOI test=new UserDAO();
		u.setUser_Name(trainer);
		u.setLocation(location);
		u.setTeam(team);
		u.setTrainerLVL(trainerLVL);
		u.setFriendCOde(friendCode);
		u.setPassword(password);
		System.out.println(trainer);
		System.out.println(trainerLVL);
		System.out.println(team);
		System.out.println(location);
		System.out.println(friendCode);
		
		ModelAndView mav;
		
	
		if(test.insertNewUser(u)) {
		mav=new ModelAndView("UserPage");
		
		
		}
		else {
			mav=new ModelAndView("Register");
		}
		return mav;
	}
	
	
	@RequestMapping(value="/userInfo",method=RequestMethod.GET)
	public ModelAndView user_info(@RequestParam("username")String username,@RequestParam("password")String password) {
			User u=new User();
			UserDAO test=new UserDAO();
			u.setUser_Name(username);
			if(test.userExist(u)) {
		
				
			System.out.println(true);
			
		ModelAndView mav=new ModelAndView("UserPage");
		
		u=test.getUser(username);

		
		mav.addObject("username",u.getUser_Name());
		mav.addObject("friendcode",u.getFriendCOde());
		mav.addObject("team",u.getTeam());
		mav.addObject("password",u.getPassword());
		mav.addObject("location",u.getLocation());

		
		
		return mav;
		}
			else {
				ModelAndView mav=new ModelAndView("Welcome");
				System.out.println(false);
				return mav;
			}
		
	}
	
	
	
	@RequestMapping(value="/userInfo_confirm",method=RequestMethod.POST)
	public ModelAndView user_info_confirm(@RequestAttribute("userkey")User player) {
	
		ModelAndView mav=new ModelAndView("UserAccountPage");
		
		return mav;
	}
	
	@RequestMapping(value="/UpdateInfo",method=RequestMethod.POST)
	public ModelAndView user_info_confirm(@RequestParam("friendcode")int friendcode,@RequestParam("password")String password
			,@RequestParam("location")String location,@RequestParam("user_name")String user_name) {
	
		User u=new User();
		u.setFriendCOde(friendcode);
		u.setLocation(location);
		u.setPassword(password);
		u.setUser_Name(user_name);
		ModelAndView mav;
		UserDAO test=new UserDAO();
		if(test.updateUser(u))
		mav=new ModelAndView("UpdatedInfo");
		else
			mav=new ModelAndView("Error");
		
		
		return mav;
	}
	
	
	
	@RequestMapping(value="/pokemontradesoffers",method=RequestMethod.GET)
	public ModelAndView pokemonTradesOffers() {
	
		ModelAndView mav=new ModelAndView("PokemonTrades");
		tradesDAOI tradeDAO=new tradesDAO();
		
		List<trades> listtrade=tradeDAO.tradeList();
		System.out.println(listtrade.size());
		mav.addObject("listofPokemon",listtrade);
		
		return mav;
	}
	
	
	
}
	
	
//	
//	@RequestMapping(value="/userInfo",method=RequestMethod.POST)
//	public ModelAndView user_info(@ModelAttribute("userkey")@Valid User u,BindingResult errors) {
//		
//		
//		
//		if(errors.hasErrors()) {
//			ModelAndView mav=new ModelAndView("Index");
//			
//		}
//		
//		ModelAndView mav=new ModelAndView("UserPage");
//		
//		return mav;
//	}
//
//	
//	
//	@RequestMapping(value="/userInfo_confirm",method=RequestMethod.POST)
//	public ModelAndView user_info_confirm(@ModelAttribute("userkey") User u) {
//			ModelAndView mav=new ModelAndView("UserAccountPage");
//		
//			//User k=new User();
//		return mav;
//	
//	}
//	
//
//	
//	@ModelAttribute("userkey")
//	public User setUpUserForm() {
//		
//		
//		return new User();
//		
//	}
//	
//	@RequestMapping(value="/modify",method=RequestMethod.GET)
//	public ModelAndView user_info_modify() {
//		
//		ModelAndView mav=new ModelAndView("UserAccountModify");
//		
//		return mav;
//	}
//	
//	
//	
//	@RequestMapping(value="/submit_changes",method = RequestMethod.POST)
//	public String user_info_changes(@ModelAttribute User u,@SessionAttribute("userkey")User ukey) {
//		
//		if(u.getPassword().equals(ukey.getPassword())){
//		return "redirect:modify";
//	}
//	ukey.setPassword(u.getPassword());
//	return "UserAccountPage";
//	}


