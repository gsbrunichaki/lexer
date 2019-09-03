package br.com.lexer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
	
	public static void main(String args[]) {
		try {
		      FileReader txtFile = new FileReader(args[0]);
		      BufferedReader readFile = new BufferedReader(txtFile);
		      String line = readFile.readLine();
		      
		      while(line != null) {
		    	  char[] charArray = line.toCharArray();
		    	  String result = "";
		    	  
		    	  for(int i = 0; i < charArray.length; i++) {
		    		  if(Character.isLetter(charArray[i])) {
		    			  result += charArray[i];
		    		  } else if(Character.isDigit(charArray[i])
		    		  && result.length() > 0) {
		    			  result += charArray[i];
		    		  }
		    	  }
		    	  
		    	  System.out.println(result);
		    	  line = readFile.readLine();
		      }
		      
		      txtFile.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
	}

}
