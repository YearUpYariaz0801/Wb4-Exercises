package com.pluralsight;

import java.util.ArrayList;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name){
        this.name = name;
        this.hand = new Hand();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
    @Override
    public String toString(){
        return this.name + "'s Hand:\n" + this.getHand().toString();
    }
}
