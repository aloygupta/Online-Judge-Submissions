import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaximumSubarray {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Long test=Long.parseLong(br.readLine());
		Long N,maxSum,sum,max;
				while(test>0){
			N=Long.parseLong(br.readLine());
			String[] arr=(br.readLine()).split(" ");
			Long maxNonContagiousSum=0L;
			boolean positivePresent=false;

			sum=Long.parseLong(arr[0]);
			maxSum=sum;
			max=sum;
			if(sum>=0){
				maxNonContagiousSum+=sum;
				positivePresent=true;
			}
			
			for(int i=1;i<N;i++){
				Long num=Long.parseLong(arr[i]);
				sum=Math.max(sum+num, num);
				
				if(num>=0){
					maxNonContagiousSum+=num;
					positivePresent=true;
				}
				
				if(num>max)
					max=num;
				
				if(maxSum<sum)
					maxSum=sum;
			}
			System.out.print(maxSum+" ");
			if(positivePresent){
				System.out.println(maxNonContagiousSum);
			}
			else
				System.out.println(max);
		}
			
		

	}

}
