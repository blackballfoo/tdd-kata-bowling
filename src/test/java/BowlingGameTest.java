import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BowlingGameTest {

    Game g;

    @Before
    public void setup(){
        g = new Game();
    }

    @Test
    public void testZeroScoringGame(){
        rollGame(0, 20);
        assertThat(g.score(), is(0));
    }

    @Test
    public void whenOnePinIsKnockedDownForTwentyRollsScoreShouldBeTwenty(){
        rollGame(1, 20);
        assertThat(g.score(), is(20));
    }

    private void rollGame(int pinsPerTurn, int numberOfTurns){
        for(int i=0; i<numberOfTurns; i++){
            g.roll(pinsPerTurn);
        }
    }
}
