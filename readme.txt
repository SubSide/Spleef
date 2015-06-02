This is an example of what can be made with the GameFramework.
I kind of discontinued the project, so the area is fixed at the coordinates 10,10 and 20,20

It does show you how to set it up, you can just copy the 3 Framework classes which are:
- GameSpleef
- RunningGameSpleef
- SpleefPlayer

And just rename then to what you want.


GameSpleef is where you set some global settings, it can also be used to get all the running games.
RunningGameSpleef is an instance of a game running, it has its own tick events and everything.
SpleefPlayer is the player. You can give it your own variables like money, xp, whatever.

Just look at https://github.com/SubSide/GameFramework for all the functions my framework has to offer ;)