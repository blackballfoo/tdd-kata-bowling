import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BowlingGameTest {

    @Test
    public void testZeroScoringGame(){
        Game g = new Game();
        g.roll(0);
        assertThat(g.score(), is(0));
    }
}
