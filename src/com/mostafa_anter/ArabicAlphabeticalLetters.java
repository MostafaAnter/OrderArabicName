package com.mostafa_anter;

/**
 * Created by mostafa on 19/06/16.
 */
public enum  ArabicAlphabeticalLetters {
    ا(0), ب(1), ت(2), ث(3), ج(3), ح(4), خ(5), د(6), ذ(7), ر(8), ز(9), س(10), ش(11),
    ص(12), ض(13), ط(14), ظ(15), ع(16), غ(17), ف(18), ق(19), ك(20), ل(21), م(22), ن(23), ه(24), و(25), ي(26), ء(27);


    private int order;
    private ArabicAlphabeticalLetters(int order){
        this.order = order;
    }


    @Override
    public String toString() {
        return String.valueOf(order);
    }
}






