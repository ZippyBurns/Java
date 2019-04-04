import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
//● Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. 
	//Also have the function return an array that only includes numbers that are greater than 10
	//(e.g. when you pass the array above, it should return an array with the values of 13,25,32)
public class PuzzleJava {
	public void arrayPuzzle() {
		int[] arr = {3,5,1,2,7,9,8,13,25,32};
		int sum = 0;
		ArrayList<Integer> finalArr = new ArrayList<Integer>();
		for (int x = 0; x < arr.length; x++) {
			sum = sum + arr[x];
			
			if (arr[x] > 9) {
			finalArr.add(arr[x]);
			}
		}
		System.out.println(sum);
		System.out.println(finalArr);
	}
	//Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
	//Shuffle the array and print the name of each person. 
	//Have the method also return an array with names that are longer than 5 characters.
	public void array2() {
		ArrayList<String> arr = new ArrayList<String>();   
		arr.add("Nancy");
		arr.add("Jinichi");
		arr.add("Fujibayashi");
		arr.add("Momo");
		arr.add("ishikawa");
		
		Collections.shuffle(arr, new Random());
		System.out.println(arr);
		
		ArrayList<String> arr5 = new ArrayList<String>();
		for (int x = 0; x < arr.size(); x++) {
			if ((arr.get(x).length()) >= 5) {
				arr5.add(arr.get(x));
			}
		}
		System.out.println(arr5);	
	}
	
//	Create an array that contains all 26 letters of the alphabet (this array must have 26 values).
//	Shuffle the array and, after shuffling, display the last letter from the array. 
//	Have it also display the first letter of the array. If the first letter in the array is a vowel,
	//have it display a message.


	
	public void alphabet() {
		ArrayList<String> alpha = new ArrayList<String>();
		alpha.add("a");
		alpha.add("b");
		alpha.add("c");
		alpha.add("d");
		alpha.add("e");
		alpha.add("f");
		alpha.add("g");
		alpha.add("h");
		alpha.add("i");
		alpha.add("j");
		alpha.add("k");
		alpha.add("l");
		alpha.add("m");
		alpha.add("n");
		alpha.add("o");
		alpha.add("p");
		alpha.add("q");
		alpha.add("r");
		alpha.add("s");
		alpha.add("t");
		alpha.add("u");
		alpha.add("v");
		alpha.add("w");
		alpha.add("x");
		alpha.add("y");
		alpha.add("z");
		Collections.shuffle(alpha, new Random());
		System.out.println(alpha.get(0));
		System.out.println(alpha.get(25));
		
		
		if (alpha.get(0).equals("a")){
			System.out.println("You got a VOWEL!");
		}
		else if (alpha.get(0).equals("e")){
			System.out.println("You got a VOWEL!");
		}
		else if (alpha.get(0).equals("i")){
			System.out.println("You got a VOWEL!");
		}
		else if (alpha.get(0).equals("o")){
			System.out.println("You got a VOWEL!");
		}
		else if (alpha.get(0).equals("u")){
			System.out.println("You got a VOWEL!");
		}
	}
//	 Generate and return an array with 10 random numbers between 55-100.
//
//			 To get a random integer, you can use the nextInt method of the Random class.
//			 Random Class documentation
//	
	public void random(){
		Random ran = new Random();
		ArrayList<Integer> rando = new ArrayList<Integer>();
//		int randomnumber = ran.nextInt(100 - 55) + 55;
//		rando.add(randomnumber);
		rando.add(ran.nextInt(100 - 55) + 55);
		rando.add(ran.nextInt(100 - 55) + 55);
		rando.add(ran.nextInt(100 - 55) + 55);
		rando.add(ran.nextInt(100 - 55) + 55);
		rando.add(ran.nextInt(100 - 55) + 55);
		rando.add(ran.nextInt(100 - 55) + 55);
		rando.add(ran.nextInt(100 - 55) + 55);
		rando.add(ran.nextInt(100 - 55) + 55);
		rando.add(ran.nextInt(100 - 55) + 55);
		rando.add(ran.nextInt(100 - 55) + 55);
		System.out.println(rando);
		}
	
	
	//Generate 5 random numbers in a string
	public void randomString() {
		String CHAR_LIST = 
		        "aABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	    StringBuffer randStr = new StringBuffer();
	    Random ran = new Random();
	    int random = 5;
	    
	    for(int i=0; i < random ; i++){
	        int number = (ran.nextInt(25 - 0) + 25);
	        char ch = CHAR_LIST.charAt(number);
	        randStr.append(ch);
	        }
	    
	    System.out.println(randStr.toString());
		}
	
	
//	 Generate an array with 10 random strings that are each 5 characters long.
	
	
	public void randomArray() {
		ArrayList<String> ranarr = new ArrayList<String>();
		String CHAR_LIST2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	    StringBuffer Str = new StringBuffer();
	    Random rand = new Random();
	    
	   for (int q = 0; q < 10; q++){
	    	for(int i=0; i < 5 ; i++){
	    		int number = (rand.nextInt(26 - 0) + 26);
	    		char ch = CHAR_LIST2.charAt(number);
	    		Str.append(ch);
	        }
	    	ranarr.add(Str.toString());
	   }
	   System.out.println(ranarr);
		}
		
	}
	
	



