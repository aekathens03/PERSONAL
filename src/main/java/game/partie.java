package game;

import bot.Bot;

public class partie {
    public static void main(String[] args){
        System.out.println("------------BIENVENUE SUR DICE-FORGE------------\n");
        Bot Kyriakos = new Bot();
        Bot Sabri = new Bot();
        new Tours(Kyriakos, Sabri).partie();


    }
}
