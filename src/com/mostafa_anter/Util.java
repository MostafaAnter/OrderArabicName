package com.mostafa_anter;

/**
 * Created by mostafa on 19/06/16.
 */
public class Util {
    /**
     *
     * @param name
     * @return object of Name that contain correct order
     */
    public static Name createNameObject(String name){
        switch (name.charAt(0)){
            case 'ا':
                return new Name(name, ArabicAlphabeticalLetters.ا);
            case 'ب':
                return new Name(name, ArabicAlphabeticalLetters.ب);
            case 'ت':
                return new Name(name, ArabicAlphabeticalLetters.ت);
            case 'ث':
                return new Name(name, ArabicAlphabeticalLetters.ث);
            case 'ج':
                return new Name(name, ArabicAlphabeticalLetters.ج);
            case 'ح':
                return new Name(name, ArabicAlphabeticalLetters.ح);
            case 'خ':
                return new Name(name, ArabicAlphabeticalLetters.خ);
            case 'د':
                return new Name(name, ArabicAlphabeticalLetters.د);
            case 'ذ':
                return new Name(name, ArabicAlphabeticalLetters.ذ);
            case 'ر':
                return new Name(name, ArabicAlphabeticalLetters.ر);
            case 'ز':
                return new Name(name, ArabicAlphabeticalLetters.ز);
            case 'س':
                return new Name(name, ArabicAlphabeticalLetters.س);
            case 'ش':
                return new Name(name, ArabicAlphabeticalLetters.ش);
            case 'ص':
                return new Name(name, ArabicAlphabeticalLetters.ص);
            case 'ض':
                return new Name(name, ArabicAlphabeticalLetters.ض);
            case 'ط':
                return new Name(name, ArabicAlphabeticalLetters.ط);
            case 'ظ':
                return new Name(name, ArabicAlphabeticalLetters.ظ);
            case 'ع':
                return new Name(name, ArabicAlphabeticalLetters.ع);
            case 'غ':
                return new Name(name, ArabicAlphabeticalLetters.غ);
            case 'ف':
                return new Name(name, ArabicAlphabeticalLetters.ف);
            case 'ق':
                return new Name(name, ArabicAlphabeticalLetters.ق);
            case 'ك':
                return new Name(name, ArabicAlphabeticalLetters.ك);
            case 'ل':
                return new Name(name, ArabicAlphabeticalLetters.ل);
            case 'م':
                return new Name(name, ArabicAlphabeticalLetters.م);
            case 'ن':
                return new Name(name, ArabicAlphabeticalLetters.ن);
            case 'ه':
                return new Name(name, ArabicAlphabeticalLetters.ه);
            case 'و':
                return new Name(name, ArabicAlphabeticalLetters.و);
            case 'ى':
                return new Name(name, ArabicAlphabeticalLetters.ي);
            case 'ء':
                return new Name(name, ArabicAlphabeticalLetters.ء);

        }

        return null;


    }
}
