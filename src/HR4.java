import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HR4 {

	// Java End-of-file
	public static void main(String[] args)throws Exception {
		long num=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x=br.readLine();
		while(!x.isEmpty() && !x.equals(null)){
			System.out.println(++num+" "+x);
			x=br.readLine();
		}
	}

}
