package com.mostafa_anter;

/**
 * Created by mostafa on 19/06/16.
 */
public class Name implements Comparable<Name>{
    private String name;
    private ArabicAlphabeticalLetters orderLetter;

    public Name(String name, ArabicAlphabeticalLetters orderLetter) {
        this.name = name;
        this.orderLetter = orderLetter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArabicAlphabeticalLetters getOrderLetter() {
        return orderLetter;
    }

    public void setOrderLetter(ArabicAlphabeticalLetters orderLetter) {
        this.orderLetter = orderLetter;
    }

    @Override
    public int compareTo(Name o) {
        String order1 = this.orderLetter.toString();
        String order2 = o.orderLetter.toString();

        return order1.compareTo(order2);
    }
}
