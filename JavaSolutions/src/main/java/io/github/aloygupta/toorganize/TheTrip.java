import java.util.Scanner;

public class TheTrip {
	
	// https://uva.onlinejudge.org/external/101/10137.pdf

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		while(true){
		
			int N=sc.nextInt();
			if(N==0)
				break;
			
			
			double[] expenses=new double[N];
			double avg=0.0D;
			double total=0.0D;
			
			for(int i=0;i<N;i++){
				expenses[i]=sc.nextDouble();
				total+=expenses[i];
			}
			avg=((double)total)/N;
			avg=roundToTwo(avg);
			
			double posD=0.0D;
			double negD=0.0D;
			
			for(int i=0;i<N;i++){
				
				if(expenses[i]>avg){
					posD+=(expenses[i]-avg);
				}
				else{
					negD+=(avg-expenses[i]);
				}
			}
			double result=(negD<posD)?negD:posD;
			System.out.printf("$%.2f\n", result);
			
		}
				


	}
	
	private static double roundToTwo(double n){
		return Math.round(n*100)/100.00D;
	}

}
