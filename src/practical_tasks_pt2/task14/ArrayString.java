package practical_tasks_pt2.task14;

import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args){
        ArrayString slova = new ArrayString(5);
//        slova.sort();
        slova.showlenght();
    }
    private String[] strings;
    public ArrayString(int N){
        strings = new String[N];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings: ");
        for (int i = 0; i < N; i++){
            strings[i] = sc.nextLine();
        }
    }
    public void sort(){
        String[] stringsclone = strings.clone(); //creating new array that copied original one
        int[] worldarray = new int[stringsclone.length]; //this array uses to store the number of words in each string
        int words;
        for (int i = 0; i < stringsclone.length; i++){
            stringsclone[i] = stringsclone[i].trim(); //removing whitespace`s from both sides
            words = 0;
            for(int j = 0; j < stringsclone[i].length()-1; j++){
                if (stringsclone[i].charAt(j) == ' ' && stringsclone[i].charAt(j+1) != ' '){
                    words++;
                }
            }
            worldarray[i] = words;
        }
        //sorting
        for(int i = 0; i < stringsclone.length; i++) {
            for (int j = 0; j < stringsclone.length - 1; j++) {
                int flagword;
                String flagstring;
                if (worldarray[j] > worldarray[j + 1]) {
                    flagstring = stringsclone[j + 1];
                    stringsclone[j + 1] = stringsclone[j];
                    stringsclone[j] = flagstring;

                    flagword = worldarray[j + 1];
                    worldarray[j + 1] = worldarray[j];
                    worldarray[j] = flagword;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i = 0; i < stringsclone.length; i++){
            System.out.println(stringsclone[i]);
        }
    }

    public void showlenght(){
        for (int i = 0; i < strings.length; i++) {
            System.out.println(i+1 + ". " + strings[i].length());
        }
    }
    public void outputFromTo(int f, int l){
        for (int i = f; i < l; i++){
            System.out.println(strings[i]);
        }
    }

    public void maxNumber(){
        int[] maxIntValues = new int[strings.length];
        for (int i = 0; i < strings.length; i++){
            StringBuilder digits = new StringBuilder();
            for (int j = 0; j < strings[i].length(); j++){
                char chrs = strings[i].charAt(j);
                if (Character.isDigit(chrs))
                    digits.append(chrs);
            }
            char maxStringValue = '0';
            for (int k = 0; k < digits.length(); k++){
                if (digits.charAt(k) > maxStringValue){
                    maxStringValue = digits.charAt(k);
                }
            }
            maxIntValues[i] = maxStringValue - '0';
        }
        int maxNumber = maxIntValues[0];
        int maxIndex = 0;
        for (int i = 1; i < maxIntValues.length; i++){
            if (maxNumber < maxIntValues[i])
                maxIndex = i;
        }
        System.out.println(strings[maxIndex]);
    }
    public void deleteUpper(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of string: ");
        int index = sc.nextInt();
        strings[index] = strings[index].replaceAll("[A-Z]", "");
        System.out.println("Changed line: " + strings[index]);
    }
}
