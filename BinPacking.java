import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Problem set 2404
public class BinPacking {


    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int items = scan.nextInt();
		int maxBinWeight = scan.nextInt();
		int[][] bins = new int[items][2];
		int[] inputItems = new int[items];
		
		for (int i=0; i<items; i++){
			inputItems[i] = scan.nextInt();
		    bins[i][0]=0;
		    bins[i][1]=0;
		}

		mergeSort(inputItems, 0, inputItems.length-1);
		
		for (int i = 0; i < inputItems.length; i++){
		    int itemWeight = inputItems[i];
		    boolean notAdded = true;
		    int index = 0;
		    
		    while(notAdded && index < items){
		        if (bins[index][0] + itemWeight <= maxBinWeight && bins[index][1] < 2){
		            bins[index][0] =+ itemWeight;
		            bins[index][1]++;
		            notAdded = false;
		        }
		        index++;
		    }
		}
		int count = 0;
		for (int x = 0; x < bins.length; x++){
		    if (bins[x][1] > 0) count++;
		}
		System.out.println(count);

	}
    
    
    private static void mergeSort (int[] list, int first, int last){
        if (first >= last) return;
        
        int middle = (first+last)/2;
        
        mergeSort(list, first, middle);
        mergeSort(list, middle+1, last);
        
        merge(list, first, middle, last);
    }

    private static void merge(int[] list, int first, int middle, int last){
        int i, j;
        int[] holder = new int[list.length];
        // Puts the list into a holder list, right hand half is in reverse order
        for (i = middle+1; i > first; i--){
            holder[i-1] = list[i-1];
        }
        for (j = middle; j < last; j++){
            holder[last+middle-j] = list[j+1];
        }
        // merges the 2 lists in order
        for (int k = first; k <= last; k++){
            if (holder[j] < holder[i]) list[k] = holder[j--];
            else list[k] = holder[i++];
        }
    }

}
