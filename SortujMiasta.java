package pl.modulczwarty_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SortujMiasta {

	public static void main(String[] args) {
		try {
			ArrayList<Miasto> listaMiast = new ArrayList<Miasto>();

			int licznik = 0;
			Miasto aktualneMiasto = null;
			File file = new File("C:\\Users\\Karolek\\Desktop\\miasta.txt");
			Scanner reader = new Scanner(file);

			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				String kodPocztowy = "";
				String nazwaMiasta = "";
				licznik++;

				for (int i = 0; i < line.length(); i++) {

					if (Character.isDigit(line.charAt(i))) {
						kodPocztowy += line.charAt(i);
					} else if (Character.isLetter(line.charAt(i))) {
						nazwaMiasta += line.charAt(i);
					}
				}

				int nowyKodPocztowy = Integer.parseInt(kodPocztowy);
				aktualneMiasto = new Miasto(nowyKodPocztowy, nazwaMiasta);
				listaMiast.add(aktualneMiasto);
			}

			// sortowanie (wedlug comparable)

			Collections.sort(listaMiast);
			System.out.println("Znaleziono " + licznik + " miast:");

			for (Miasto miasto : listaMiast) {
				System.out.println(miasto);
			}
				
			reader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Nie ma takiego pliku !");
		}
		catch (NumberFormatException e) {
			System.out.println("Nieprawidlowa konwersja liczb." + e.getMessage());
		}
		catch (NoSuchElementException e) {
			System.out.println("Nieprawidlowa zawartosc pliku !");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
