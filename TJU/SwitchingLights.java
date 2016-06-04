import java.util.Scanner;

// Problem set 3140
public class SwitchingLights {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int numLights = scan.nextInt();
        int commands = scan.nextInt();
        scan.nextLine();
        
        int[] lights = new int[numLights];
        for (int i = 0; i <numLights; i++){
            lights[i] = -1;
        }
        
        for (int i = 0; i < commands; i++){
            int operation = scan.nextInt();
            int low = scan.nextInt() - 1;
            int high = scan.nextInt() - 1;
            
            if (operation == 1){
            	int count = 0;
                for (int l = low; l <= high; l++){
                    if (lights[l] == 1){
                        count++;
                    }
                }
                System.out.println(count);
            } else {
            	for (int l = low; l <= high; l++){
                    lights[l] = lights[l] * -1;
                }
            }
        }
    }

}
