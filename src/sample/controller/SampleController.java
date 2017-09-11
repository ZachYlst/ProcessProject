package sample.controller;

import java.util.Scanner;
import sample.model.PlayDohCircle;
import sample.model.PlayDohSquare;

public class SampleController
{
	public SampleController()
	{
		
	}
	
	public void start()
	{
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(10);
		
		PlayDohSquare mySquare = new PlaydohSquare(5);
		
		System.out.println("This is a sample project to show the Github and");
		System.out.println("Eclipse process so I develop muscle memory");
		
		testScanner();
	}

private void testScanner()
	{
		Scanner firstScanner; //Declares a Scanner object 
		firstScanner = new Scanner(System.in);  //Instantiates a Scanner object
		System.out.println("Please type your favorite food");
		String answer = firstScanner.nextLine();
		System.out.println("Oh, you like to eat " + answer);
	}
}	
