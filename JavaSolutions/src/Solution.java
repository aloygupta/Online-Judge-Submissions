//https://www.hackerrank.com/challenges/candies
import misc.MaxOddBinaryNum;

import java.io.*;
import java.util.*;

public class Solution {

    private String in;
    public static void main(String[] args) throws IOException{
        Solution solution = new Solution();
        solution.readInput();
        MaxOddBinaryNum maxOddBinaryNum = new MaxOddBinaryNum();

        String out = maxOddBinaryNum.maximumOddBinaryNumber(solution.in);

        solution.displayOutput(out);
    }

    private void readInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        in = br.readLine();
        br.close();
    }

    private void displayOutput(String out){
        System.out.println(out);
    }

}