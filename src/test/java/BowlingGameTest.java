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
        rollSpare();
        g.roll(3);
        rollGame(0,17);
        assertThat(g.score(), is(16));
    }

    @Test
    public void testStrikeThenRollThreeThenRollFourScore(){
        g.roll(10);
        g.roll(3);
        g.roll(4);
        rollGame(0,17);
        assertThat(g.score(), is(24));
    }

    private void rollGame(int pinsPerTurn, int numberOfTurns){
        for(int i=0; i<numberOfTurns; i++){
            g.roll(pinsPerTurn);
        }
    }

    private void rollSpare(){
        g.roll(5);
        g.roll(5);
    }
}
