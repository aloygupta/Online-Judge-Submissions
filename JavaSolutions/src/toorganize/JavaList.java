import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JavaList {
	
	//https://www.hackerrank.com/contests/codewhiz-java-march-2016/challenges/java-list

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		String[]arr=br.readLine().split("\\s+");
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		int len=arr.length;
		for(int i=0;i<len;i++){
			list.add(Integer.parseInt(arr[i]));
		}
		
		int Q=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=Q;i++){
			
			String cmd=br.readLine();
			
			switch(cmd){
			
			case "Insert":
				arr=br.readLine().split(" ");
				int index=Integer.parseInt(arr[0]);
				int value=Integer.parseInt(arr[1]);
				
				list.add(index, value);
				
				break;
				
			case "Delete":
				
				int index1=Integer.parseInt(br.readLine());
				
				
				list.remove(index1);
				break;
		
			}
			
		}
		
		
		for(Integer n:list){
			System.out.print(n+" ");
		}
	}

}
