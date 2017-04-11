# TTD Bowling Kata 


Details from PPT:-

## Scoring

Example Score:
![alt text](https://github.com/blackballfoo/tdd-kata-bowling/blob/master/src/main/resources/readme-images/bowling-score.png  "Bowling Score")


The game consists of 10 frames as shown above.  In each frame the player has
two opportunities to knock down 10 pins.  The score for the frame is the total
number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two tries.  The bonus for
that frame is the number of pins knocked down by the next roll.  So in frame 3
above, the score is 10 (the total number knocked down) plus a bonus of 5 (the
number of pins knocked down on the next roll.)

A strike is when the player knocks down all 10 pins on his first try.  The bonus
for that frame is the value of the next two balls rolled.

In the tenth frame a player who rolls a spare or strike is allowed to roll the extra
balls to complete the frame.  However no more than three balls can be rolled in
tenth frame.

## The Requirements 

Write a class named “Game” that has two methods roll(pins : int) is called each time the player rolls a ball.  The argument is the number of pins knocked down.
   score() : int is called only at the very end of the game.  It returns the total score for that game.

# Quick Design Session

We will need a "Game" Class and from the scoring we can see that we will need to model another class 
"Frame". 

* A Game has 10 Frames
* A Frame has 1 or 2 rolls
* The Tenth Frame has 2 or 3 rolls and differs from the other Frames
* The Score function needs to iterate through all the frames and calculate all their scores
* The Score for a Strike or a Spare depends on the Frames Successor

## Clues

Start with the simplest test which is a gutter ball zero score game. Then work on another simple test to test when only 1 pin is hit on each roll.

Next we can look at when you get a Spare and the scoring and then when you get a strike.

## Links 
http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata
http://butunclebob.com/files/downloads/Bowling%20Game%20Kata.ppt