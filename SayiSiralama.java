package Giris;

import java.util.Scanner;

public class SayiSiralama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int s1, s2, s3;

		System.out.println("Birinci sayiyi giriniz: ");
		s1 = input.nextInt();
		System.out.println("İkinci sayiyi giriniz: ");
		s2 = input.nextInt();
		System.out.println("Ücüncü sayiyi giriniz: ");
		s3 = input.nextInt();

		if (s1 < s2 && s1 < s3) {

			if (s2 < s3) {System.out.println(s1 + "<" + s2 + "<" + s3);}
			else  {System.out.println(s1 + "<" + s3 + "<" + s2);}
				}
		
		if (s2 < s1 && s2 < s3) {

			if (s1 < s3) {System.out.println(s2 + "<" + s1 + "<" + s3);}
			else  {System.out.println(s1 + "<" + s3 + "<" + s2);}
				}
		
		if (s3 < s2 && s3 < s1) {

			if (s1 < s2) {System.out.println(s3 + "<" + s1 + "<" + s2);}
			else  {System.out.println(s3 + "<" + s2 + "<" + s1);}
				}
		
		
		

		} 
				

			}
		

	

