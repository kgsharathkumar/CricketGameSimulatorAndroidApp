# CricketGameSimulatorAndroidApp
CricketGameSimulatorApp

# 2nd Innings:
It is always exciting to see the second innings of the Cricket match and that is what we are
going to simulate. Please look at all the rules carefully. It’s not that hard ;)
This is how our team will look:
1. A random number from 30 to 90 is to be generated at the beginning of the
game which will be the target score.
2. We will have 5 players in each team. Chasing side will have 5 batsmen (P1,
P2, P3, P4, P5) and defending side will have five bowlers (B1, B2, B3, B4,
B5)
3. Each Bowler has a difficulty level associated with it. For Eg: B1 has a
difficulty level of 1, B2 has a difficulty level of 2, and so on. *5 is the highest
difficulty level
# -----------Rulesof the game------------
1. Batting team wins, if they achieve the target within 5 overs.
2. Bowling team wins, if all the 5 batsmen get out within 5 overs.
3. The result of a single ball is picked randomly from the following set:

   • {“0”, “1”, “2”, “3“, “4”, “6”, “W”, “NB”}
    • 0, 1, 2, 3, 4, 6 are runs
    • W stands for Wicket
    • NB stands for No Ball
4. Batting order will be in sequence - {P1, P2, P3, P4, P5}
5. Bowling order will depend on the runs scored in the previous over.
    • 1st Bowler will be picked randomly from {B1, B2, B3, B4, B5}
• If any bowler concedes 10 runs or more in an over, the next bowler
should be of higher difficulty level.
• If any bowler concedes less than 10 runs, the next bowler is again
chosen randomly excluding the current one.
• A bowler cannot bowl more than an over.
6. If the result of a ball is 1 run or 3 runs, the batsmen should change their positions
7. After every over(6 balls), the batsmen should change their positions.

# -----------User Interface------------
1. The UI should be simple with a cricket pitch drawn in the middle.
2. The top part of pitch should display the first batsman’s name, for eg: P1
3. The bottom part of pitch should display the 2nd batsman’s name, for eg:
P2
4. Below the pitch, place a button for bowler, on click of which a random
result will be generated (check Rule No. 3).
5. At the bottom of the screen, there should be an info view displaying the
following:
• Runs and Wickets
• Current bowl result
• Overs
• Target/To win runs
