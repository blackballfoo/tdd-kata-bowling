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
        int frameIndex = 0;
       for(int frame=0; frame<10; frame++) {
           if(isStrike(frameIndex)){
                score += 10 + rolls.get(frameIndex+1) + rolls.get(frameIndex+2);
               frameIndex++ ;
           }else if(isSpare(frameIndex, frameIndex+1)){
                score += 10 + rolls.get(frameIndex+2);
               frameIndex += 2;
           }else{
               score += rolls.get(frameIndex) + rolls.get(frameIndex+1);
               frameIndex += 2;
           }
       }
        return score;
    }

    private boolean isStrike(int index){
        return rolls.get(index)==10;
    }

    private boolean isSpare(int index1, int index2){
        return (rolls.get(index2) + rolls.get(index2))==10;
    }
}
