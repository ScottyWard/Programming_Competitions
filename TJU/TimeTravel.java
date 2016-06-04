import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

// Problem Set: 3715
public class TimeTravel {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberOfQueries = scan.nextInt();
        Stack<Integer> cows = new Stack<Integer>();
        ArrayList<String> queries = new ArrayList<String>();
        scan.nextLine();
        
        for (int i = 0; i < numberOfQueries; i++){
        	String nextLine = scan.nextLine();
        	String[] nline = nextLine.split("\\s+");
            //temp = cows;

        	if (nline[0].equals("a")){
        	    cows.add(Integer.parseInt(nline[1]));
        	    System.out.println(cows.peek());
        	} else if (nline[0].equals("s")){
        		try {
        			cows.pop();
        			System.out.println(cows.peek());
        		} catch (EmptyStackException e) {
        		    System.out.println("-1");
        		}
        	} else if (nline[0].equals("t")){
        	    int q = Integer.parseInt(nline[1]);
        	    cows.clear();
        	    if (q-2 >= 0){
        	        String temp = queries.get(q-2);
            	    String[] tempArr = temp.split("\\s+");
            	    for (int j = 0; j < tempArr.length; j++){
        	            cows.add(Integer.parseInt(tempArr[j]));
        	        }
        	    }
        	    if (cows.size() >= 1){
        	        System.out.println(cows.peek());
        	    } else {
        	        System.out.println("-1");
        	    }
        	}
        	
            String tempString = "-1";
            if (cows.size() >= 1){
                tempString = cows.elementAt(0).toString();
            }
            for (int d = 1; d < cows.size(); d++){
                tempString = tempString + " " + cows.elementAt(d);
            }
            queries.add(tempString);

        }
       
    }

}
