package hej;

import java.util.Scanner;

public class michell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
		
		String str1 = input.nextLine();
		
		System.out.println("Hur gammal ‰r du?");
		
		String str2 = input.nextLine();

		System.out.println("Vad ‰r din adress?");
		
		String str3 = input.nextLine();

		System.out.println("Vad ‰r ditt postnummer?");
		
		String str4 = input.nextLine();
		
     System.out.println("Vilken stad bor du i?");
		
		String str5 = input.nextLine();

		System.out.println("Vad ‰r ditt telefonnummer?");
		
		String str6 = input.nextLine();
		
		System.out.println("\nInformation:");
		
		System.out.println("\nNamn:\t\t" + str1 + "\n≈lder:\t\t" + str2 + "\nAdress:\t\t" + str3 + "\n\t\t" + str4 + "\t" + str5 + "\nTelefon:\t"+ str6);

	
	}

}
