package com.sosa.constants;

public class RomanNumbers {
    private  String _romanNumber;
    private  int _standardNumber;

    public RomanNumbers(String romanNumber, int standardNumber) {
        this._romanNumber = romanNumber;
        this._standardNumber = standardNumber;
    }

    public String getRomanNumber() {
        return _romanNumber;
    }

    public void setRomanNumber(String romanNumber) {
        this._romanNumber = romanNumber;
    }

    public int getStandardNumber() {
        return _standardNumber;
    }

    public void setStandardNumber(int standardNumber) {
        this._standardNumber = standardNumber;
    }
}
