import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HR3 {

	// Java Loops
	public static void main(String[] args)throws Exception {
		
		long t,a,b,n,p,sum;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		t=Long.parseLong(br.readLine());
		
		while(t>0){
			String[] arr=(br.readLine()).split(" ");
			a=Long.parseLong(arr[0]);
			b=Long.parseLong(arr[1]);
			n=Long.parseLong(arr[2]);
			
			sum=a;
			p=b;
			sum+=p;
			System.out.print(sum+" ");
			for(long i=1;i<n;i++){
				p*=2;
				sum+=p;
				System.out.print(sum+" ");
			}
			System.out.println();
			
			t--;
		}

	}

}
