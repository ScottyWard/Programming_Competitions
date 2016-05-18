import java.util.Scanner;


public class NoWin {
	
	public static int cardVal(Character c){
		int val = 0;
	    if (Character.isDigit(c)){
	        val = Integer.parseInt(c.toString());
	    } else if (c == 'K'||c == 'Q'||c == 'J'||c == 'T'){
	        val = 10;
	    }
	    return val;
	}

    public static void main(String[] args) {

        String cards;
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
            cards = input.nextLine();
            
            if (cards.equalsIgnoreCase("JOKER")){
                break;
            } else {
                int userTotal = cardVal(cards.charAt(0)) + cardVal(cards.charAt(1));
                int dealerTotal = cardVal(cards.charAt(2)) + cardVal(cards.charAt(3));
                
                for (int i = 4; i < cards.length(); i++){
                    int card = cardVal(cards.charAt(i));
                    
                }
            }
        }
    }

}
