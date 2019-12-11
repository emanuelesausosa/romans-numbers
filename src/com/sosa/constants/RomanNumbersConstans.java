package com.sosa.constants;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RomanNumbersConstans {

    private  List<RomanNumbers> romanNumbers = new ArrayList<RomanNumbers>();

    public RomanNumbersConstans() {
        if (this.romanNumbers.size() < 1)
            setAllNumbers();
    }

    private void setAllNumbers(){
        romanNumbers.add(new RomanNumbers("M", 1000));
        romanNumbers.add(new RomanNumbers("D", 500));
        romanNumbers.add(new RomanNumbers("C", 100));
        romanNumbers.add(new RomanNumbers("L", 50));
        romanNumbers.add(new RomanNumbers("X", 10));
        romanNumbers.add(new RomanNumbers("V", 5));
        romanNumbers.add(new RomanNumbers("I", 1));





    }

    public List<RomanNumbers> getAllNumbersPairs(){
        return romanNumbers;
    }
}
