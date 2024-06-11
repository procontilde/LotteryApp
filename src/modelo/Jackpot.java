package modelo;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Jackpot {

	public static void main(String[] args) {
		
        	String uniqueNumber = generateUniqueFiveDigitNumber();
		String b = generateJackpotSuns();
		
		System.out.println("Números: " + uniqueNumber + " Soles: " + b);

	}
    
    public static String generateUniqueFiveDigitNumber() {
    	
        Set<Integer> selectedDigits = new HashSet<>();
        
        while (selectedDigits.size() < 5) {
        	
            int num = ThreadLocalRandom.current().nextInt(1, 51); 
            selectedDigits.add(num);
            
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int digit : selectedDigits) {
        	
            sb.append(digit).append(", "); 
            
        }
        
        sb.setLength(sb.length() - 2);
        
        return sb.toString();
        
    }
	
	public static String generateJackpotSuns() {
		
		StringBuilder s = new StringBuilder();
		
		for(int i = 0; i < 2; i++) {
			
			int num = ThreadLocalRandom.current().nextInt(0, 13);
			s.append(num).append(", ");
			
		}
		
		s.setLength(s.length() - 2);
		
		return s.toString();	
	
	}
	
	public String fullBet() {
		
		
		return "Números: " + generateUniqueFiveDigitNumber() + ", Soles: " + generateJackpotSuns();
		
	}

}
