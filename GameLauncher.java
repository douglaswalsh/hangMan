public class GameLauncher {
	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new Player();
		Computer c = new Computer();
		gameHelper h = new gameHelper();
		

		h.oneOrTwoPlayers();

		if (h.onePlayer == false) {
		p1.setName();
		p1.sayWelcome();

		p2.setName();
		p2.sayWelcome();

		h.setTargetWord();
		h.setAnswer();
		h.makeGuess();
		h.endGame();			
		} else {
			c.createDictionary();
			c.computerSetWord();
			h.setTargetWord();
			System.out.println(h.targetWord2);
			System.out.println(h.guessList);
			System.out.println(h.answer);
			//System.out.println(c.computerWord);
			//h.makeGuess();
			//h.endGame();
		}


		
	}
}