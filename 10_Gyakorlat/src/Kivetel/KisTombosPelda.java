package Kivetel;
import java.util.*;
public class KisTombosPelda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			int meret = 5;
			int egeszTomg [] = new int [meret];
			
			Scanner sc = new Scanner(System.in);
			
			
			for (int i =0; i< egeszTomg.length; i++){
				boolean rosszaAdat = true;
				
				do {
					System.out.println("Kérem az "+(i+1)+".számot ");
					try {
						String s1 = sc.nextLine();
						egeszTomg [i] = Integer.parseInt(s1);
					rosszaAdat = false;
					} catch (InputMismatchException e) {
						// TODO: handle exception
						System.out.println("Elkaptuka kivételt");
						
					} catch (NumberFormatException e) {
						// TODO: handle exception
						System.out.println("Elkaptuka kivételt");
						
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Elkaptuka kivételt");
						
					
					
				}
				
				} while (rosszaAdat);
				System.out.println("A megadott számok:");
				for(int i1 : egeszTomg){
					System.out.println(i1);
				}
			}
		
	}

}
