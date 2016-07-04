import java.util.Random;
import java.util.HashMap;

public class computer {
	String computerWord;
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
	//System.out.println(randomNum);

		computerWord = dictionary.get(randomNum);
		System.out.println(computerWord);
	}



}