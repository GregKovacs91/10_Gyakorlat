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
				System.out.println("K�rem az "+(i+1)+".sz�mot ");
				try {
					egeszTomg [i] = sc.nextInt();
				rosszaAdat = false;
				} catch (InputMismatchException e) {
					// TODO: handle exception
					System.out.println("Elkaptuka kiv�telt");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Elkaptuka kiv�telt");
					
				}finally {
					sc.nextLine();
				
			}
			
			} while (rosszaAdat);
				
			
		
		System.out.println("A megadott sz�mok:");
		for(int i1 : egeszTomg){
			System.out.println(i1);
		}
		System.out.println("K�rek egy m�sik t�bl�zatot, adja meg a mennyis�g�t");
		
		String s1 = sc.nextLine();
			int db= Integer.parseInt(s1);
			int kisTomb [] = new int [db];
		
			for(int j=0; i<5; i++){
			System.out.println("K�rem a(z)"+(j+1)+" sz�mot: ");
			String s2 = sc.nextLine();
			kisTomb[j] = Integer.parseInt(s2);
			}
		System.out.println("A kis tomb sz�mai");
			for(int j=0; i<db;i++){
				System.out.println(kisTomb[j]);
			}
		
	
		}
	}
	
		
	
	
	



}
