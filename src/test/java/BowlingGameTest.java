import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BowlingGameTest {

    @Test
    public void testZeroScoringGame(){
        Game g = new Game();
        for(int i=0; i<20; i++){
            g.roll(0);
        }
        assertThat(g.score(), is(0));
    }

    @Test
    public void whenOnePinIsKnockedDownForTwentyRollsScoreShouldBeTwenty(){
        Game g = new Game();
        for(int i=0; i<20; i++){
            g.roll(1);
        }
        assertThat(g.score(), is(20));
    }
}
