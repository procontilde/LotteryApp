package modelo;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery {

    public static void main(String[] args) {
    	
        String lotteryNumber = generateLotteryNumber();
        System.out.println("Lottery number: " + lotteryNumber);
        
    }

    public static String generateLotteryNumber() {
    	
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 5; i++) {
        	
            int digit = ThreadLocalRandom.current().nextInt(0, 10);
            sb.append(digit);
            
        }
        
        return sb.toString();
        
    }
    
}

	 
