// 10-6-12 Gold Miner Problem set ID 3906
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class GoldMiner {
	
    static class Gold {
        int x;
        int time;
        double weight;
        double slope;
        
        public Gold(int xcord, int t, double s, double w) {
            x = xcord;
            time = t;
            weight = w;
            slope = s;
        }
    }

    public static void sortSlope(ArrayList<Gold> list){

        ArrayList<Gold> sorted = new ArrayList<Gold>();
        int j = 0;
        while (list.size() > 0){
            int max = 0;
            for (int i = 0; i < list.size(); i++){
                if (list.get(i).slope >= list.get(max).slope){
                    max = i;
                }
            }
            sorted.add(j, new Gold (list.get(max).x, list.get(max).time, list.get(max).slope, list.get(max).weight));
            list.remove(max);
            j++;
        }
        list = sorted;
    }
    
    public static void combineSlopes(ArrayList<Gold> list, int totalTime){
        
        
    }

    public static int highestValue(ArrayList<Gold> list){
        
        return 0;
    }

    public ArrayList<Gold> mergeSort(ArrayList<Gold> list){
        ArrayList<Gold> slope = new ArrayList<Gold>();
        ArrayList<Gold> weight = new ArrayList<Gold>();
        ArrayList<Gold> sortedList = null;

        System.out.println("MERGE SORTING...");
        if(list.size() > 1){
            for(int i = 0; i<(list.size()/2); i++){
                slope.add(list.get(i));
            }
            for(int j = list.size()/2; j<list.size(); j++){
                weight.add(list.get(j));
            }
            mergeSort(slope);
            mergeSort(weight);
        }
        sortedList = merge(slope, weight);


        return sortedList;
    }

    public ArrayList<Gold> merge(ArrayList<Gold> slope, ArrayList<Gold> weight){
        ArrayList<Gold> newList = new ArrayList<Gold>();

        int i = 0;
        int j = 0;

        while(i<slope.size() && j<weight.size()){
            if(slope.get(i) <= weight.get(j)){
                newList.add(slope.get(i));
                i++;
            }
            else{
                newList.add(weight.get(j));
                j++;
            }
        }
        if(i==slope.size()){
            for(int k = j; k<weight.size(); k++){
                newList.add(weight.get(k));
            }
        }
        else{
            for(int l = i; l<slope.size(); l++){
                newList.add(slope.get(l));
            }
        }
//      while(i<first.size()){
//          for(int i : first){
//              
//          }
//          newList.add()
//      }
//      while(j<second.size()){
//          
//      }

        return newList;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList<Gold> al = new ArrayList();
    
    
        int caseNumber = 1;
    
	    while (input.hasNext()){
	        int testCases = input.nextInt();
	        int totalTime = input.nextInt();
	        
	        int tc = 0;
	        // Adds testcase values to Gold class if time < Total time
	        while(tc < testCases){
	            int x = input.nextInt();
	            int y = input.nextInt();
	            int time = input.nextInt();
	            int value = input.nextInt();
	            double weight = ((double)value)/time;
	            double slope = ((double)y)/x;
	            System.out.printf ("x: %d y: %d time: %d value:%d slope: %f weight: %f%n", x, y, time, value, slope, weight);
	            if (time < totalTime) al.add(new Gold(x, time, slope, weight));
	            tc++;
	        }

	        System.out.println("Testcases: " + testCases);
            sortSlope(al);
            System.out.println("sorted");
            //mergeSort(al);

            int val = 0;//highestValue(al, totalTime);
            System.out.printf("Case %d: %d%n", caseNumber, val);
            
            
        }
    
    }

}
