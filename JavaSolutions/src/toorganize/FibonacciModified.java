import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//https://www.hackerrank.com/challenges/fibonacci-modified
public class FibonacciModified {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		BigInteger A,B,term=null;
		int i,N;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//t=Long.parseLong(br.readLine());
		
			String[] arr=(br.readLine()).split(" ");
			A=new BigInteger(arr[0]);
			B=new BigInteger(arr[1]);
			N=Integer.parseInt(arr[2]);
			
			for(i=3;i<=N;i++){
			
				term=(B.multiply(B)).add(A);
				A=B;
				B=term;
			}
			
			System.out.println(term);
	}

}
