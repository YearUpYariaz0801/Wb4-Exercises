package com.pluralsight;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws Exception {

        Deck deck = new Deck();
        deck.shuffle();



        System.out.println("Welcome to BlackJack!");
        String player1Name = Console.PromptForString("Player 1 Enter Your Name: ");
        System.out.println("Dealing cards... 2 cards to each player!");

        Hand dealerHand = new Hand();
        Card dealerCard1 = deck.deal();
        Card dealerCard2 = deck.deal();

        dealerHand.Deal(dealerCard1);
        dealerHand.Deal(dealerCard2);
        dealerHand.DisplayHand();

        Hand player1Hand = new Hand();
        Card player1Card1 = deck.deal();
        Card player1Card2 = deck.deal();
        player1Hand.Deal(player1Card1);
        player1Hand.Deal(player1Card2);
        player1Hand.DisplayHand();


        if(dealerHand.getValue() == player1Hand.getValue()){
            System.out.println("It's a TIE!");
        }
        else if(dealerHand.getValue() > player1Hand.getValue()){
            System.out.println("Dealer wins!");
        }
        else{
            System.out.println(player1Name + "wins!");
        }


    }
}