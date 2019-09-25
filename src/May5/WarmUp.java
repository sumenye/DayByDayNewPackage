package May5;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WarmUp {

	public static void main(String[] args) {

		List<String> lineLst = getTextFileAsList("AkbarsList");
		System.out.println(lineLst);
		String fullpath="/Users/sumeyyecetintas/eclipse-workspace/DayByDayNewPackage/hero";
		List<String> lineLst2 = getTextFileAsList(fullpath);
		System.out.println(lineLst2);
		String fullpath2="/Users/sumeyyecetintas/eclipse-workspace/DayByDayNewPackage/AkbarsList";
		List<String> lineLst3 = getTextFileAsList(fullpath2);
		System.out.println(lineLst3);
		
		 System.out.println(  lineLst.size()  );
		    
		    // xls  doc  ppt  pdf
		    String s = "erat_quisque_erat.xls" ; 
		    // how do we just get file extention 
		    String fileExtention = s.substring( s.indexOf(".")+1  ); 
		    System.out.println( fileExtention   );
		    
		    int count =0;
		    for (String each : lineLst) {
		    	if(each.endsWith(".xls")) {
		    	count++;}
		      //System.out.println(each);
		    }
		    System.out.println("excel file count is: "+ count);
		//TO FIND THE LONGEST ITEM
		    String longest = lineLst.get(0);
		    for(String each : lineLst) {
		    	if(each.length()>longest.length()) {
		    		longest=each;
		    	}
		    }
		    System.out.println("Longest file name is: "+longest);
		    
		    //TASK3 FIND OUT LONGEST EXCEL FILE
		    String longestEXCL = lineLst.get(0);
		    for(String each : lineLst) {
		    	if(each.endsWith(".xls")) {
		    	if(each.length()>longestEXCL.length()) {
		    		longestEXCL=each;}
		    	}
		    }
		    System.out.println("Longest EXCEL file name is: "+longestEXCL);
	
	}
	/*
	 * DO NOT MODIFY AND JUST USE IT
	 * Method name : getTextFileAsList
	 * @parameter  location of text file as String
	 * 	if your file is at root path (right under project folder)
	 *  you may directly path your filename.txt
	 *  if not pass /your/own/folder/name/filename.txt as String to method
	 * 
	 * @return List of String that contain each line as per element

	 */
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
