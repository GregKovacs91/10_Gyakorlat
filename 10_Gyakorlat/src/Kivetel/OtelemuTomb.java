package Kivetel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OtelemuTomb {

	public static void main(String[] args ) {
		
		int meret = 5;
		int egeszTomg [] = new int [meret];
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int i =0; i< egeszTomg.length; i++){
			boolean rosszaAdat = true;
			
			do {
				System.out.println("Kérem az "+(i+1)+".számot ");
				try {
					egeszTomg [i] = sc.nextInt();
				rosszaAdat = false;
				} catch (InputMismatchException e) {
					// TODO: handle exception
					System.out.println("Elkaptuka kivételt");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Elkaptuka kivételt");
					
				}finally {
					sc.nextLine();
				
			}
			
			} while (rosszaAdat);
				
			
		
		System.out.println("A megadott számok:");
		for(int i1 : egeszTomg){
			System.out.println(i1);
		}
		System.out.println("Kérek egy másik táblázatot, adja meg a mennyiségét");
		
		String s1 = sc.nextLine();
			int db= Integer.parseInt(s1);
			int kisTomb [] = new int [db];
		
			for(int j=0; i<5; i++){
			System.out.println("Kérem a(z)"+(j+1)+" számot: ");
			String s2 = sc.nextLine();
			kisTomb[j] = Integer.parseInt(s2);
			}
		System.out.println("A kis tomb számai");
			for(int j=0; i<db;i++){
				System.out.println(kisTomb[j]);
			}
		
	
		}
	}
	
		
	
	
	



}
