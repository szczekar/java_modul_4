package pl.modulczwarty_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PoliczZnakiMain {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\szczekar\\Desktop\\file.txt");
		PoliczZnaki licz = new PoliczZnaki(file);
		licz.CountDiffSigns();

	}

}
