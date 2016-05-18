import java.util.HashMap;
import java.util.Scanner;


public class Election {
// problem set 1322

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int numParties = in.nextInt();
        in.nextLine();
        final HashMap<String, String> party = new HashMap<String, String>();
        final HashMap<String, Integer > votes = new HashMap<String, Integer>();
        
        for (int i=0; i<numParties; i++){
            final String canidate = in.nextLine();
            final String partyAff = in.nextLine();
            
            party.put(canidate, partyAff);
        }
        
        final int numVotes = in.nextInt();
        in.nextLine();
        
        for (int i=0; i<numVotes; i++){
            String vote = in.nextLine();
            if(votes.containsKey(vote)){
                int voteCount=votes.remove(vote);
                votes.put(vote, voteCount+1);
            }else{
                votes.put(vote, 1);
            }
        }
        // Need to sort the map based on keys
        String maxName="";
        int maxVal=Integer.MIN_VALUE;
        boolean tie=false;
        for(String name:votes.keySet()){
            int currVal=votes.get(name);
            if(currVal>maxVal){
                maxVal=currVal;
                maxName=name;
                tie=false;
            }else if(currVal==maxVal){
                tie=true;
            }
        }
        if(tie){
            System.out.println("tie");
        }else{
            System.out.println(party.get(maxName));
        } 
    }
}
