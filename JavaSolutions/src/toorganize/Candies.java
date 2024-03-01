import java.util.Scanner;

public class Candies {

	//https://www.hackerrank.com/challenges/candies
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
	
			int N=sc.nextInt();
			
			int[] rating=new int[N];
			
			for(int i=0;i<N;i++){
				rating[i]=sc.nextInt();				
			}
			
			int[] candy=new int[N];
			
		
			for(int i=0;i<N;i++){
				candy[i]=1;
			}
			
			for(int i=1;i<N;i++){
				
				if(rating[i]>rating[i-1]){
					candy[i]=candy[i-1]+1;
				}
				else{
					for(int j=i;(j>0 && rating[j]<rating[j-1] && (candy[j]==candy[j-1]));j--){
						candy[j-1]+=1;
					}
				}
			}
			
			//System.out.println();
			int totalCandies=0;
			for(int i=0;i<(N);i++){
				//System.out.print(candy[i]+" ");
				totalCandies+=candy[i];
			}
			//System.out.println();
			//System.out.println();
			System.out.println(totalCandies);

	}

}
