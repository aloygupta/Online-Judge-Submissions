import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

public class JavaBitSet {
	
	//https://www.hackerrank.com/contests/codewhiz-java-march-2016/challenges/java-bitset

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int N,M;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] arr=null;
		try {
			arr = br.readLine().split(" ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		N=Integer.parseInt(arr[0]);
		M=Integer.parseInt(arr[1]);
		
		BitSet b1=new BitSet(N);
		BitSet b2=new BitSet(N);
		
		for(int i=1;i<=M;i++){
			
			String[] line=br.readLine().split(" ");
			
			String cmd=line[0];
			String val1=line[1];
			String val2=line[2];
			
			switch(cmd){
			
			case "AND":
				if(val1.equals("1"))
					b1.and(b2);
				else
					b2.and(b1);
				
				break;
				
			case "OR":
				if(val1.equals("1"))
					b1.or(b2);
				else
					b2.or(b1);
				
				break;

			case "XOR":
				if(val1.equals("1"))
					b1.xor(b2);
				else
					b2.xor(b1);
				
				break;
				
			case "FLIP":
				if(val1.equals("1"))
					b1.flip(Integer.parseInt(val2));
				else
					b2.flip(Integer.parseInt(val2));
				
				break;

			case "SET":
				if(val1.equals("1"))
					b1.set(Integer.parseInt(val2));
				else
					b2.set(Integer.parseInt(val2));
				
				break;


					
			}
			
			System.out.println(b1.cardinality()+" "+b2.cardinality());		
		}
		

	}

}
