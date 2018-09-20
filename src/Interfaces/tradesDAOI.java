package Interfaces;


import Models.trades;

import Models.TradeOffers;


import java.util.List;

public interface tradesDAOI {
    public List<trades> tradeList();

    public List<TradeOffers> tradeofferList();




}
