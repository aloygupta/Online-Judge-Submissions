import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

//https://www.hackerrank.com/challenges/coin-change
//https://www.youtube.com/watch?v=_fgjrs570YE	



public class CoinChange {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int moneytoMake,differentCoinType;
		String[] arr;
		arr=br.readLine().split(" ");
		moneytoMake=Integer.parseInt(arr[0]);
		differentCoinType=Integer.parseInt(arr[1]);
		
		int[] coins=new int[differentCoinType];
		
		arr=br.readLine().split(" ");
		for(int i=0;i<differentCoinType;i++){
			coins[i]=Integer.parseInt(arr[i]);
		}
		
		Arrays.sort(coins);
		
		int maxCoin=coins[differentCoinType-1];
		
		long[][] table=new long[maxCoin+1][moneytoMake+1];
		
		for(int i=1;i<=differentCoinType;i++){
			int coin=coins[i-1];
			for(int j=0;j<=moneytoMake;j++){
				
				if(i==1){
					if((j%coin)==0)
						table[coin][j]=1;
					else
						table[coin][j]=0;
				}
				else if(coin>j){
					table[coin][j]=table[coins[i-2]][j];
				}
				else{
					table[coin][j]=table[coins[i-2]][j]+table[coin][j-coin];
				}
			}
		}
		
		
		//display(table,maxCoin,moneytoMake);
		System.out.println(table[maxCoin][moneytoMake]);
		
	}

	static void display(int[][] arr,int a,int b){
		
		System.out.print(" ");
		for(int i=0;i<=b;i++){
			System.out.print("\t"+i);
		}
		System.out.println();
		for(int i=0;i<=a;i++){
			System.out.print(i+"\t");
			for(int j=0;j<=b;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
