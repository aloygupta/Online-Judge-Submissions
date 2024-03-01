import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    // Skeleton Main class
    private String in;
    private String out;
    public static void main(String[] args) throws IOException{
        Solution solution = new Solution();
        solution.readInput();


        // solution.out = solution.func(solution.in);

        //solution.displayOutput();
    }

    private void readInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        in = br.readLine();
        br.close();
    }

    private void displayOutput(){
        System.out.println(out);
    }

}