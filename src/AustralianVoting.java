import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class AustralianVoting {
	
	// https://uva.onlinejudge.org/external/101/10142.pdf
	
	int[] voteReceivedByCandidate;
	int noOfVoters=0;
	int N;
	String[] names;
	ArrayList<ArrayList<Integer>> listofBallots;
	boolean winnersFound=false;
	int minVote;
	ArrayList<Integer> minVoteCandidates;

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		AustralianVoting main=new AustralianVoting();
		main.read();

	}
	
	private void read()throws Exception {
		
		//Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
		//int T=sc.nextInt();
		int T=Integer.parseInt(br.readLine());
		
		while(T>0){
			
			winnersFound=false;
			N=Integer.parseInt(br.readLine());
			
			names=new String[N+1];
		
			for(int i=1;i<=N;i++){
				names[i]=br.readLine();
			}
			
			voteReceivedByCandidate=new int[N+1];
						
			listofBallots=new ArrayList<ArrayList<Integer>>();
			String[] input;
			while((input=br.readLine()!==null){
				ArrayList<Integer> ballot=new ArrayList<Integer>();
				for(int i=1;i<=N;i++){
					
					ballot.add(Integer);
				}
				++noOfVoters;
				listofBallots.add(ballot);
			}
			
			determineWinners();
			
		
			
			System.out.println();
			T--;
		
		}
		

	}
	
	private void determineWinners(){
		
		while(winnersFound==false){
			countVotes();
			for(int i=1;i<=N;i++){
				int votesReceived=voteReceivedByCandidate[i];
				int totalVotes=noOfVoters;
				
				if(votesReceived>=((int)(totalVotes/2) +1)){
					System.out.println(names[i]);
					winnersFound=true;
				}
								
			}
			
			if(winnersFound==false){
				// eliminate candidates having minVote
			
				for(Integer candidate:minVoteCandidates){
					
					for(int i=1;i<=noOfVoters;i++){
						listofBallots.get(i-1).remove(candidate);
					}
				}
					
			}
		}
		
		
	}
	
	private void countVotes(){
		
		minVote=Integer.MAX_VALUE;
		minVoteCandidates=new ArrayList<Integer>();
		
		for(int i=1;i<=noOfVoters;i++){
			int candidate=listofBallots.get(i-1).get(0);
			
			// increase vote receive count for that candidate
			++voteReceivedByCandidate[candidate];
			
			if(voteReceivedByCandidate[candidate]<=minVote){
				minVote=voteReceivedByCandidate[candidate];
				minVoteCandidates.add(candidate);
			}
		}
	
	}

}
