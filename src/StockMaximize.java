import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StockMaximize {
	

	public static void main(String[] args) throws Exception, IOException {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		while(T>0){
			int N=sc.nextInt();
			
			//String[] arr=br.readLine().split(" ");
			long[] in=new long[N];
			
			for(int i=0;i<N;i++){
				in[i]=sc.nextLong();				
			}
			
			
			long totalProfit=0;
			
					
			long currentMax=Long.MIN_VALUE;
			
			for(int i=N-1;i>=0;i--){
				
				if(in[i]>currentMax){
					currentMax=in[i];
				}
			
			totalProfit+=currentMax-in[i];
			}
			
			System.out.println(totalProfit);
			
			T--;
		}
	}
}
