import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;


public class DijkstraWithPath {
	public static void main(String[] args){
		Scanner in=new Scanner(new BufferedInputStream(System.in));
		int size=in.nextInt();
		int [][] capacities=new int[size][size];
		int [][] paths=new int[size][size];
		for(int a=0;a<size;a++){
			for(int b=0;b<size;b++){
				capacities[a][b]=in.nextInt();
				paths[a][b]=Integer.MAX_VALUE;
			}
		}
		setUp(capacities);
		dijkstraWithPath(capacities,paths,0,1);
		for(int a=0;a<paths.length;a++){
			for(int b=0;b<paths.length;b++){
				if(paths[a][b]==Integer.MAX_VALUE){
				break;
				}
				System.out.print(paths[a][b]+" ");
			}
		System.out.println();
		}

	}
	
	public static void setUp(int[][] matrix){
		int len=matrix.length;
		for(int a=0;a<len;a++){
			for(int b=0;b<=a;b++){
				int temp=matrix[len-1-a][len-1-b];
				if(temp==0){
					temp=Integer.MAX_VALUE;
				}
				if(len-1-a==len-1-b){
					temp=0;
				}
				matrix[len-1-a][len-1-b]=temp;
				matrix[len-1-b][len-1-a]=temp;
			}
		}
	}
	
	public static void addPath(int[][] paths,int prev,int next){
		int n=0;
		while(paths[prev][n]!=Integer.MAX_VALUE){
			paths[next][n]=paths[prev][n++];
		}
		paths[next][n++]=next;
		while(n<paths.length){
			paths[next][n++]=Integer.MAX_VALUE;
		}
	}

	//int[][] matrix must have infinity for all spots where a link is missing and 0 for indices [a][a]
	public static void dijkstraWithPath(int[][] matrix,int[][] paths,int source,int end){
		TreeMap<Integer,Integer> toBeVisited = new TreeMap<Integer,Integer>();
		ArrayList<Integer> visited=new ArrayList<Integer>();
		toBeVisited.put(source,0);
		paths[0][0]=0;
		while(!toBeVisited.isEmpty()){
			int current=toBeVisited.firstEntry().getKey();
			toBeVisited.remove(current);
			visited.add(current);
			if(visited.contains(end)){
				return;
			}
			for(int a=0;a<matrix[current].length;a++){
				if(matrix[current][a]!=Integer.MAX_VALUE&&!visited.contains(a)){
					int updatedLength=Math.min(matrix[source][a], matrix[source][current]+matrix[current][a]);
					if(updatedLength!=matrix[source][a]||current==source){
						addPath(paths,current,a);
					}
					matrix[source][a]=updatedLength;
					matrix[a][source]=updatedLength;
					if(toBeVisited.containsKey(a)){
						toBeVisited.remove(a);
						toBeVisited.put(a, updatedLength);
					}else{
						toBeVisited.put(a, updatedLength);
					}
				}
			}
		
		}
	}

	//int[][] matrix must have infinity for all spots where a link is missing and 0 for indices [a][a]
	public static void dijkstraWithPath(int[][] matrix,int[][] paths,int source){
		TreeMap<Integer,Integer> toBeVisited = new TreeMap<Integer,Integer>();
		ArrayList<Integer> visited=new ArrayList<Integer>();
		toBeVisited.put(source,0);
		paths[0][0]=0;
		while(!toBeVisited.isEmpty()){
			int current=toBeVisited.firstEntry().getKey();
			toBeVisited.remove(current);
			visited.add(current);
			for(int a=0;a<matrix[current].length;a++){
				if(matrix[current][a]!=Integer.MAX_VALUE&&!visited.contains(a)){
					int updatedLength=Math.min(matrix[source][a], matrix[source][current]+matrix[current][a]);
					if(updatedLength!=matrix[source][a]||current==source){
						addPath(paths,current,a);
					}
					matrix[source][a]=updatedLength;
					matrix[a][source]=updatedLength;
					if(toBeVisited.containsKey(a)){
						toBeVisited.remove(a);
						toBeVisited.put(a, updatedLength);
					}else{
						toBeVisited.put(a, updatedLength);
					}
				}
			}
		}
	}
}