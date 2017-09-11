package sample.controller;

import java.util.Scanner;

public class SampleController
{
	public void start()
	{
		System.out.println("This is a sample project to show the Github and");
		System.out.println("Eclipse process so I develop muscle memory");
		
		testScanner();
	}

private void testScanner()
	{
		Scanner firstScanner; //Declares a Scanner object 
		firstScanner = new Scanner(System.in);  //Instanciates a Scanner object
		System.out.println("Please type your favorite food");
		String answer = firstScanner.nextLine();
		System.out.println("Oh, you like to eat " + answer);
	}
}	
