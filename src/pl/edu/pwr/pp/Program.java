package pl.edu.pwr.pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Program {
	
	public static void main(String[] args) {
		
		Horoskop h = new Horoskop();
		
		try (BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in))) {
			
			System.out.println("Podaj imie i nazwisko:");
			String name = bufferRead.readLine();
			
			System.out.println("Zdrowie :\t" + Przepowiednie.ZDROWIE[h.healthIndex(name)]);
			System.out.println("Miłość  :\t" + Przepowiednie.MILOSC[h.loveIndex()]);
			System.out.println("Praca   :\t" + Przepowiednie.PRACA[h.workIndex()]);
			} catch(IOException ex) {
			 System.out.println("error ;(");

			}
	}
}
