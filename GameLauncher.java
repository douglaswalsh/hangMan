public class GameLauncher {
	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new Player();
		gameHelper h = new gameHelper();

		p1.setName();
		p1.sayWelcome();

		p2.setName();
		p2.sayWelcome();

		h.setTargetWord();
		h.setAnswer();
		h.makeGuess();
		h.endGame();
		
	}
}