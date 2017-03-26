package pl.modulczwarty_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PoliczZnaki {
	private int bigLetters;
	private int smallLetters;
	private int spaces;
	private int rest_signs;
	private File file;
	private Scanner fileScan;

	public PoliczZnaki(File file) {
		super();
		this.file = file;
	}

	public void CountDiffSigns() {
		int bigLetters = 0;
		int smallLetters = 0;
		int spaces = 0;
		int rest_signs = 0;
		int allLetters = 0;

		try {
			fileScan = new Scanner(file);

			while (fileScan.hasNextLine()) {

				String line = fileScan.nextLine();

				for (int i = 0; i < line.length(); i++) {

					if (Character.isWhitespace(line.charAt(i)) == true) {
						spaces++;

					} else if (Character.isUpperCase(line.charAt(i)) == true) {
						bigLetters++;

					} else if (Character.isLowerCase(line.charAt(i)) == true) {

						smallLetters++;

					} else {

						rest_signs++;
					}
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			System.out.println("Big letters:" + bigLetters);
			System.out.println("Small letters:" + smallLetters);
			System.out.println("Spaces:" + spaces);
			System.out.println("Rest signs:" + rest_signs);
			fileScan.close();
		}
	}

}
