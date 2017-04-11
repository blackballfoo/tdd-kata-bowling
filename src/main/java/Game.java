import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Game {

    private List<Integer> rolls = new LinkedList<Integer>();

    public void roll(int pins) {
        rolls.add(pins);
    }

    public int score() {
        int score = 0;
        int i = 0;
       for(int frame=0; frame<10; frame++){
           int frameScore = rolls.get(i) + rolls.get(i+1);
           if(frameScore==10){
                frameScore += rolls.get(i+2);
           }
           score += frameScore;
           i += 2;
       }
        return score;
    }
}
