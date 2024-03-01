package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://leetcode.com/problems/maximum-odd-binary-number/description/?envType=daily-question&envId=2024-03-01
// 2864. Maximum Odd Binary Number
public class MaxOddBinaryNum {

    public String maximumOddBinaryNumber(String s) {

        int countOne = 0;
        for (int index = 0; index< s.length();  index++){
            if(s.charAt(index) == '1'){
                ++countOne;
            }
        }

        String output = "";
        for (int index = 0; index< s.length();  index++){
            if(countOne >1){
                output += "1";
                --countOne;
            }
            else{
                output += "0";
            }
        }


        if(countOne == 1)
           output = output.substring(0, output.length()-1) + "1";


        return output;
    }

    private String in;
    private String out;
    public static void main(String[] args) throws IOException {
        MaxOddBinaryNum solution = new MaxOddBinaryNum();
        solution.readInput();

        solution.out  = solution.maximumOddBinaryNumber(solution.in);

        solution.displayOutput();
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
