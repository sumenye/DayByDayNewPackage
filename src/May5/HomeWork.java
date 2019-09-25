package May5;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HomeWork {

	public static void main(String[] args) {
		List<String> lineLst = getTextFileAsList("AkbarsList");
		System.out.println(lineLst);
	}
	
	
	
	
	
	//-----------------------------------------------------------------
	public static List<String> getTextFileAsList(String filePath) {

		List<String> allLines = null;
		try {
			allLines = Files.readAllLines(Paths.get(filePath));
		} catch (Exception e) {
			System.out.println("Wrong file path probably");
		}
		return allLines;

	}

}
