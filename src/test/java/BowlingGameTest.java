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
    public void testOneScoringGame(){
        rollGame(1, 20);
        assertThat(g.score(), is(20));
    }

    @Test
    public void testSpareThenThreeRollScore(){
        g.roll(5);
        g.roll(5);
        g.roll(3);
        rollGame(0,17);
        assertThat(g.score(), is(16));
    }

    private void rollGame(int pinsPerTurn, int numberOfTurns){
        for(int i=0; i<numberOfTurns; i++){
            g.roll(pinsPerTurn);
        }
    }
}
