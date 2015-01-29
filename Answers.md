# Hailey Kester CSCI 121 1/29/15
## Debugger Lab

**Question 1:** Why is cutoff not a parameter to the method playTurn in the PigGame class?

Cutoff is not a parameter to the method playTurn in the pigGame class because cutoff is used to tell you which value to stop playing the game at.  If the cutoff was a parameter, then you would be giving yourself a set value as to when you stop playing the game and you can't do that because we don't know how many turns it will take to finish the game.

**Question 2:** What would the following code print? 
```
ScoreSheet s = new ScoreSheet(); System.out.println(s.getTurnAverage( ));
```

The following code would create a new score sheet and it would print out the average number of turns it take to finish the game on the new score sheet. 

**Question 3"** In the `PigGame` class, `numBusts` is incremented in the `playGame` method. Describe how this statement could be moved to another method in the class without affecting the results.

The statement `numBusts` could be moved to the method `playTurn` class after `rolledOne = true;` because we need to know if we rolled a one in order to know if we busted, this way if `rolledOne = true` then we know we rolled a one and we also know that we busted.  We can then see the number of turns we rolled a one. 

**Question 4:** Based on your current understanding of the code, where do you think the problem(s) might be located? Are there portions of the code where you are fairly certain the problem(s) could not possibly be?

Based on my current understanding of the code, I think that the problem is that we are giving a cutoff value of 18, but we have nothing in the code that is tracking the number of turns that we have taken.  Therefore, the code is going to continue to run infinitely because it doesn't know when it gets to the cutoff value of 18 so it is going to continue playing the game.  I think the print functions and the `new PigGame` functions are not where the problem(s) are.

**Question 5:** Describe the problem(s) with the program and the way(s) you made the program execute correctly.

The problem was in the `Die.java`, where the upValue line  where the `upValue = Math.random`, the `(int)` was missed placed and was giving us just a value between 0 and 1.  After figuring out this problem, I moved the `(int)` to be outside of the Math.random part in order for the function to compute an integer, so the new line came out to be `upValue = (int)(Math.random() * 6 ) + 1;` and then the program stopped looping infinitely. 

**Question 6:** Using the correct program, what are the average number of turns for cutoff values 10, 15, 20, and 25?

The average number of turns for the cutoff value of 10 came out to be `9.090909090909092`.
The average number of turns for the cutoff value of 15 came out to be `7.285714285714286`.
The average number of turns for the cutoff value of 20 came out to be `10.2`.
The average number of turns for the cutoff value of 25 came out to be `17.0`. 

