import java.util.Scanner;
import java.util.*;
import java.io.Console;


public class gameHelper {

	String targetWord;
	//Scanner userInput = new Scanner(System.in);
	Scanner userGuess = new Scanner(System.in);
	ArrayList<Character> guessList = new ArrayList<Character>();
	ArrayList<Character> answer = new ArrayList<Character>();
	int correctGuesses = 0;
	int incorrectGuesses = 0;

	
	void setTargetWord() {
		Console cnsl = null;
		cnsl = System.console();
		targetWord = new String(cnsl.readPassword("please enter the word to guess: "));
		for (char c : targetWord.toCharArray()) {
			guessList.add(c);
		}
	}

	void setAnswer() {
		int i = 0;
		for (i = 0; i < targetWord.length();i++) {
			answer.add('-');
		}
		System.out.println(answer);

	}

	void makeGuess() {
		while (answer.contains('-')) {
			System.out.println("please guess a letter");
			char guessChar = userGuess.next().charAt(0);


		int letterPos = guessList.indexOf(guessChar);

			if (guessList.contains(guessChar)) {
			guessList.set(letterPos, '-');
			answer.set(letterPos, guessChar);
			System.out.println(answer);
			correctGuesses++;
				if (correctGuesses == 1) {
					System.out.println("you have made " + correctGuesses + " correct guess");
				} else {
					System.out.println("you have made " + correctGuesses + " correct guesses");
				}
		} 	else if (incorrectGuesses > 6) {
			System.out.println("you lose bye!");
			break;			
		}
		else {
			System.out.println("incorrect guess again");
			incorrectGuesses++;
				if (incorrectGuesses == 1) {
					System.out.println("you have made " + incorrectGuesses + " incorrect guess");
				} else {
					System.out.println("you have made " + incorrectGuesses + " incorrect guesses");
				}
			
		}	
	}

	}

	void endGame() {
		if (!(answer.contains('-'))) {
			System.out.println("well done you win asshole");
			System.out.println("The word is " + targetWord);
		} 
		
	}

}