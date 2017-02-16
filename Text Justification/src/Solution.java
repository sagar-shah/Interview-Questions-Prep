import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"What","must","be","shall","be."};
		int l = 12;
		List<String> result = fullJustify(words,l);
		System.out.println(result);
	}
	public static List<String> fullJustify(String[] words, int maxWidth) {
        
		List<String> result = new ArrayList<String>();

        int currentLineWidth = 0;
        int fromIndex = 0;
        int tillIndex = 0;
        int noOfWordsInCurrentLine = 0;
        int noOfCharactersInCurrentLine = 0;
        for(int i = 0 ; i < words.length ; i++){
        	int wordLength = words[i].length();
        	
        	wordLength++;
        	currentLineWidth += wordLength;
        	
        	if(currentLineWidth <= maxWidth + 1){
        		tillIndex = i;
        		noOfCharactersInCurrentLine += words[i].length();
        		noOfWordsInCurrentLine++;
        		if(tillIndex == words.length - 1 ){
        			noLastLineFormatting(words,maxWidth,fromIndex,tillIndex,noOfWordsInCurrentLine,noOfCharactersInCurrentLine,result);
            	}
        		continue;
        	} 
        	else{
        		createJustifiedLine(words,maxWidth,fromIndex,tillIndex,noOfWordsInCurrentLine,noOfCharactersInCurrentLine,result);
        		currentLineWidth = 0; 
        		fromIndex = tillIndex + 1 ;
        		tillIndex++;
        		noOfWordsInCurrentLine = 0;
        		noOfCharactersInCurrentLine = 0;
        		i = tillIndex - 1;
        	}
        	

        }



        return result;
    }
    private static void noLastLineFormatting(String[] words, int maxWidth, int fromIndex, int tillIndex,
			int noOfWordsInCurrentLine, int noOfCharactersInCurrentLine, List<String> result) {
    	
    	StringBuilder sb = new StringBuilder();
    	int spacesLeft = maxWidth - noOfCharactersInCurrentLine;
    	
    	while(fromIndex <= tillIndex){
    		sb.append(words[fromIndex]);
    		sb.append(' ');
    		spacesLeft--;
    		fromIndex++;
    	}
    	spacesLeft++;
    	String t = sb.toString().trim();
    	sb = new StringBuilder(t);
    	
    	
    	
//    	System.out.println(maxWidth);
//    	System.out.println(spacesLeft);
//    	System.out.println(fromIndex);
//    	System.out.println(tillIndex);
//    	System.out.println(noOfWordsInCurrentLine);
//    	System.out.println(noOfCharactersInCurrentLine);
//    	System.out.println(); 
    	
    	while(spacesLeft > 0){
			sb.append(' ');
			spacesLeft--;
		}
    	
    	result.add(sb.toString());
	}
	public static void createJustifiedLine(String[] words,int maxWidth,int fromIndex,int tillIndex,int noOfWordsInCurrentLine,int noOfCharactersInCurrentLine, List<String> result){
    	StringBuilder sb = new StringBuilder();
    	
    	int spacesLeft = maxWidth - noOfCharactersInCurrentLine;
    	
//    	System.out.println(maxWidth);
//    	System.out.println(spacesLeft);
//    	System.out.println(fromIndex);
//    	System.out.println(tillIndex);
//    	System.out.println(noOfWordsInCurrentLine);
//    	System.out.println(noOfCharactersInCurrentLine);
//    	System.out.println(); 
    	
    	if(noOfWordsInCurrentLine == 1){
    		sb.append(words[fromIndex]);
    		while(spacesLeft > 0){
    			sb.append(' ');
    			spacesLeft--;
    		}
    		result.add(sb.toString());
    		return;
    	}
    	
    	int minSpacePerWord = spacesLeft / (noOfWordsInCurrentLine - 1) ;
    	int extraSpaces = spacesLeft % (noOfWordsInCurrentLine - 1) ;

    	while(fromIndex <= tillIndex){
    		sb.append(words[fromIndex]);
    		int count = minSpacePerWord;
    		while(count>0){
    			sb.append(' ');
    			count--;
    		}
    		if(extraSpaces > 0 ){
    			sb.append(' ');
    			extraSpaces--;
    		}
    		fromIndex++;
    	}
    	result.add(sb.toString().trim());
    }

}
