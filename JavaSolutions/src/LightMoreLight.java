import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LightMoreLight {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			long n=Long.parseLong(br.readLine());
			
			if(n==0)
				break;
			
			long limit=(long) Math.sqrt((double)n);
			
			/*boolean switchON=false;
			for(long i=1;i<=limit;i++){
				
				if(n%i==0){
					switchON=!switchON;
				}
			}
			
			switchON=!switchON;*/
			//System.out.println(switchON?"yes":"no");
			
			
		
			
			if((limit*limit)==n){
				System.out.println("yes");
				
			}
			else
				System.out.println("no");
		}
	}

}
