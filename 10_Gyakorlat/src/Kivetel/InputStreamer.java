package Kivetel;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStreamer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int meret = 5;
		
		try {
			int egeszTomg [] = Integer.valueOf(beolvasas.readLine());
			InputStreamReader bementOlvaso = new InputStreamReader(System.in);
			BufferedReader beolvasas = new BufferedReader(bementOlvaso);
			
			BufferedReader beolvasas2 = new BufferedReader(new InputStreamReader(System.in));
			
			boolean rosszaAdat = true;
			
			do {
				System.out.println("K�rem az "+(i+1)+".sz�mot ");
				try {
					String s1 = sc.nextLine();
					egeszTomg [i] = Integer.parseInt(s1);
				rosszaAdat = false;
				} catch (InputMismatchException e) {
					// TODO: handle exception
					System.out.println("Elkaptuka kiv�telt");
					
				} catch (NumberFormatException e) {
					// TODO: handle exception
					System.out.println("Elkaptuka kiv�telt");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Elkaptuka kiv�telt");
					
				
				
			}
			
			} while (rosszaAdat);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		@SuppressWarnings("resource")
		
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int i =0; i< egeszTomg.length; i++){
		
			System.out.println("A megadott sz�mok:");
			for(int i1 : egeszTomg){
				System.out.println(i1);
			}
		}
	
	}

}
