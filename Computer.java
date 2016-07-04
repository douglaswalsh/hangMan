import java.util.Random;
import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class Computer {
	String computerWord;
	ArrayList<Character> compGuessList = new ArrayList<Character>();
	ArrayList<Character> compAnswer = new ArrayList<Character>();
	int correctGuesses = 0;
	int incorrectGuesses = 0;
	Scanner userGuess = new Scanner(System.in);

	HashMap <Integer, String> dictionary = new HashMap <Integer, String>();

	void createDictionary(){
	dictionary.put(1,"gladiator");
	dictionary.put(2,"elephant");
	dictionary.put(3,"crocodile");
	dictionary.put(4,"balloon");
	dictionary.put(5,"history");
	dictionary.put(6,"jellyfish");
	dictionary.put(7,"bear");
	dictionary.put(8,"potatoes");
	dictionary.put(9,"giraffe");
	dictionary.put(10,"mannequin");	
	}

	//System.out.println(dictionary);

	void computerSetWord() {
		Random rn = new Random();
		int randomNum = rn.nextInt((10) + 1);

		if (randomNum > 0) {
		computerWord = dictionary.get(randomNum);
		System.out.println("the computer has chosen a word");
		//System.out.println(computerWord);
		for (char c : computerWord.toCharArray()) {
			compGuessList.add(c);
			}
		} else {
				System.out.println("The computer is still thinking of a word");
		}	
	}
		
			//System.out.println(compGuessList);
	

	void computerSetAnswer() {
		int i = 0;
		for (i = 0; i < computerWord.length();i++) {
			compAnswer.add('-');
			}
		
		System.out.println(compAnswer);

	}

	void compMakeGuess() {
		while (compAnswer.contains('-')) {
			System.out.println("please guess a letter");
			char guessChar = userGuess.next().charAt(0);


		int letterPos = compGuessList.indexOf(guessChar);

			if (compGuessList.contains(guessChar)) {
			compGuessList.set(letterPos, '-');
			compAnswer.set(letterPos, guessChar);
			System.out.println(compAnswer);
			correctGuesses++;
				if (correctGuesses == 1) {
					System.out.println("you have made " + correctGuesses + " correct guess");
				} else {
					System.out.println("you have made " + correctGuesses + " correct guesses");
				}
		} 	else if (incorrectGuesses > 6) {
			System.out.println("the word was " + computerWord);
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

	void compEndGame() {
		if (!(compAnswer.contains('-'))) {
			System.out.println("well done you win!");
			System.out.println("The word is " + computerWord);
		} 
		
	}



}