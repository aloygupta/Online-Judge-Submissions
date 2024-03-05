import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HR2 {

	// Java Datatypes
	public static void main(String[] args)throws Exception {
		
		int n;
		long num=0;
		String x;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		
		while(n>0){
			x=br.readLine();
			try{
				num=Long.parseLong(x);
				System.out.println(num+" can be fitted in:");
				if(num>=Byte.MIN_VALUE && num<=Byte.MAX_VALUE)
					System.out.println("* byte");
				if(num>=Short.MIN_VALUE && num<=Short.MAX_VALUE)
					System.out.println("* short");
				if(num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE)
					System.out.println("* int");
				if(num>=Long.MIN_VALUE && num<=Long.MAX_VALUE)
					System.out.println("* long");
			}
			catch(Exception e){
				System.out.println(x+" can't be fitted anywhere.");
				
			}
						
			n--;
		}

	}

}
