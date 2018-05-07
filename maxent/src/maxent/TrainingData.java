package maxent;

import java.io.*;
import java.util.*;

/*
 * Section to read in training data from given files.
 */

public class TrainingData {
	public static List<String> trainNeg() {
		String NeginFileName = "/home/jptomanibarra/Downloads/negative-words.txt";
//		String PosinFileName = "/home/jptomanibarra/Downloads/positive-words.txt";
		
		String negline = null;
//		String posline = null;
		List<String> tokens = null;
		
		try {

			
			File NeginFile = new File(NeginFileName);
			
			Scanner NegfileScanner = new Scanner(NeginFile);
			
			while(NegfileScanner.hasNextLine()) {
				negline = NegfileScanner.nextLine();
				System.out.println(negline);
				tokens = Arrays.asList(negline.split("\\s"));
//				String s1 = tokens.get(0);


			}
			
			NegfileScanner.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("Error reading file '" + NeginFileName + "'");
		}
		
//		try {
//			File PosinFile = new File(PosinFileName);
//			
//			Scanner PosfileScanner = new Scanner(PosinFile);
//			
//			while(PosfileScanner.hasNextLine()) {
//				posline = PosfileScanner.nextLine();
//				System.out.println(posline);
//				List<String> tokens = Arrays.asList(posline.split("\\s"));
////				String s2 = tokens.get(0);
//
//
//			}
//			PosfileScanner.close();
//		}
//		catch(FileNotFoundException ex){
//			System.out.println("Error reading file '" + PosinFileName + "'");
//		}
	return tokens;

	}
	public static List<String> trainPos() {
//		String NeginFileName = "/home/jptomanibarra/Downloads/negative-words.txt";
		String PosinFileName = "/home/jptomanibarra/Downloads/positive-words.txt";
		
//		String negline = null;
		String posline = null;
		List<String> tokens = null;
		
//		try {
//
//			
//			File NeginFile = new File(NeginFileName);
//			
//			Scanner NegfileScanner = new Scanner(NeginFile);
//			
//			while(NegfileScanner.hasNextLine()) {
//				negline = NegfileScanner.nextLine();
//				System.out.println(negline);
//				List<String> tokens = Arrays.asList(negline.split("\\s"));
////				String s1 = tokens.get(0);
//
//
//			}
//			
//			NegfileScanner.close();
//		}
//		catch(FileNotFoundException ex) {
//			System.out.println("Error reading file '" + NeginFileName + "'");
//		}
		
		try {
			File PosinFile = new File(PosinFileName);
			
			Scanner PosfileScanner = new Scanner(PosinFile);
			
//			List<String> tokens = null;
			
			while(PosfileScanner.hasNextLine()) {
				posline = PosfileScanner.nextLine();
				System.out.println(posline);
//				List<String> tokens = Arrays.asList(posline.split("\\s"));
//				String s2 = tokens.get(0);
				tokens = Arrays.asList(posline.split("\\s"));

			}
			PosfileScanner.close();
//			return tokens;
		}
		catch(FileNotFoundException ex){
			System.out.println("Error reading file '" + PosinFileName + "'");
		}
		return tokens;
	}
}