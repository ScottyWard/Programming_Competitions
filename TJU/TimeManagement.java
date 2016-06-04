import java.util.Scanner;

// Problem set: 3154
public class TimeManagement {

    static class Jobs{
    	int jobTime;
    	int endTime;
    	
        public Jobs(int jT, int eT){
            this.jobTime = jT;
            this.endTime = eT;
        }
        
    }

    private static void sort(Jobs[] j){
        Jobs smallest;
        for (int i = 0; i < j.length; i++){
        	smallest = j[i];
        	int smallestIndex = i;
            for (int k = i; k < j.length; k++){
                if (smallest.endTime > j[k].endTime){
                    smallest = j[k];
                    smallestIndex = k;
                }
            }
            Jobs temp = j[i];
            j[i] = smallest;
            j[smallestIndex] = temp;
        }
    }

    private static int compare (Jobs[] j){
        int smallestGap = Integer.MAX_VALUE;
        int totalTime = 0;
        for (int i = 0; i < j.length; i++){
        	if (totalTime > j[i].endTime){
        	    return -1;
        	} else {
        	    totalTime = totalTime + j[i].jobTime;
        	    int sg = j[i].endTime - totalTime;
        	    if (sg < 0) return -1;
        	    else if (sg < smallestGap){
        	        smallestGap = sg;
        	    }
        	}
        }
        if (smallestGap == Integer.MAX_VALUE) smallestGap = -1;
        return smallestGap;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfJobs = input.nextInt();
        Jobs[] jobs = new Jobs[numberOfJobs];
        
        for (int i = 0; i < numberOfJobs; i++){
            int jTime = input.nextInt();
            int eTime = input.nextInt();
            jobs[i] = new Jobs(jTime, eTime);
        }
        sort(jobs);
        System.out.println(compare(jobs));
        
    }

}
