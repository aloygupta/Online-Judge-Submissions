package misc;

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
}
