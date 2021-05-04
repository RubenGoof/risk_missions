package generation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Distributor {

    private List<Card> cards;
    private List<Card> distribution;


    public Distributor(){
        cards =  new LinkedList<>();
        cards.addAll(Arrays.asList(Card.values()));
        distribution = new LinkedList<>();
    }


    public void generate(int amount){
        distribution = new LinkedList<>();
        Random r = new Random();
        for(int i = 0; i < amount; i++){
            int randomNumber = r.ints(1, 0, cards.size()).findFirst().getAsInt();
            System.out.println(randomNumber);
            distribution.add(cards.get(randomNumber));
            cards.remove(randomNumber);
        }

    }

    public Card getCard(int player){
        if(distribution.size() < 1) return null;

        return distribution.get(player - 1);
    }
}


