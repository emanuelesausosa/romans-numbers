package com.sosa;

import com.sosa.constants.RomanNumbers;
import com.sosa.constants.RomanNumbersConstans;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<RomanNumbers> romanNumbers = new ArrayList<>() {
    };
    public static void main(String[] args) {


        RomanNumbersConstans constansNumbers = new RomanNumbersConstans();
        romanNumbers = constansNumbers.getAllNumbersPairs();

        // System.out.println(romanNumbers);

        String romanNumberResult = GetNumbersToRomans(16);
        System.out.println(romanNumberResult);
    }

    public static String GetNumbersToRomans(int number)
    {
        String result = "";

        if (number <= 0)
            return  "";

        for (var n:
             romanNumbers) {

            if (number >= n.getStandardNumber())
            {
                result = result.concat(n.getRomanNumber());
                var subNumber = number - n.getStandardNumber();
                if(subNumber <= 0)
                    break;
                result = result.concat(GetNumbersToRomans(subNumber));
                break;

            }else
            {
                continue;
            }
        }
        return result;
    }
}
