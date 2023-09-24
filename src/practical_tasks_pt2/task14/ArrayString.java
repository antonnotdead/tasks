package practical_tasks_pt2.task14;

import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args){
        ArrayString slova = new ArrayString(5);
//        slova.sort();
//        slova.showlenght();
        slova.delNotLetterNotNum();
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

    public void delNotLetterNotNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of string: ");
        int index = sc.nextInt();
        strings[index] = strings[index].replaceAll("\\W", "");
        strings[index] = strings[index].replaceAll("_", "");
        System.out.println("Changed line: " + strings[index]);
    }
    public void printwordswithNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of string: ");
        int index = sc.nextInt();
        String[] word = strings[index].split(" ");
        for (String processedword : word) {
            for (int j = 0; j < processedword.length(); j++) {
                if (Character.isDigit(processedword.charAt(j))) {
                    System.out.print(processedword + " ");
                    break;
                }
            }
        }
    }
    public void getsumOfNum() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of string: ");
        int index = sc.nextInt();
        String str = strings[index];
        for (int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum += Integer.valueOf(str.charAt(i));
            }
        }
        System.out.println(sum);
    }
    //переделать слишком долго может выполняться
    public void printLowerCaseWords(){
        for (int i = 0; i < strings.length; i++){
            String words[] = strings[i].split(" ");
            for(int j= 0; j < words.length; j++){
                String word = words[j];
                for (int k = 0; k < word.length(); k ++){
                    if (Character.isUpperCase(word.charAt(k))){
                        j++;
                    }
                }
                System.out.println(word);
            }
        }
    }
    public void getNums() {
        for (int index = 0; index < strings.length; index++) {
            String str = strings[index];
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    System.out.print(str.charAt(i) + "\t");
                }
            }
            System.out.println();
        }

    }
    public void sameWords() {
        int amountOfArrayWords = 0;
        for (int i = 0; i < strings.length; i++) {
            String[] wordsInCurrentString = strings[i].split("[ .,]");
            for (int j = 0; j < wordsInCurrentString.length; j++) {
                amountOfArrayWords++;
            }
        }
        String[] allWords = new String[amountOfArrayWords];
        int wordscounter = 0;
        for (int i = 0; i < strings.length; i++) {
            String[] wordsInCurrentString = strings[i].split("[ .,]");
            for (int j = 0; j < wordsInCurrentString.length; j++){
                allWords[wordscounter] = wordsInCurrentString[j];
                wordscounter++;
            }
        }
        for (int i = 0; i < allWords.length - 1; i++) {
            for (int j = i + 1; j < allWords.length; j++) {
                if (allWords[i].compareTo(allWords[j]) > 0){
                    String flagWord = allWords[i];
                    allWords[i] = allWords[j];
                    allWords[j] = flagWord;
                }
            }
        }
        System.out.println('\n');
        for (int i = 0; i < allWords.length; i++)
            System.out.print(allWords[i] + " ");
        System.out.println("List of the same words: ");
        int numberOfSameWords = 1;
        for (int i = 0; i < allWords.length; i++){
            if ((i != allWords.length - 1) && (allWords[i].equals(allWords[i + 1]))) {
                numberOfSameWords++;
            } else if ((i == allWords.length - 1) && (allWords[i].equals(allWords[i - 1]))){
                if (numberOfSameWords > 1)
                    System.out.println(allWords[i] + ": " + numberOfSameWords);
            } else if (numberOfSameWords > 1){
                System.out.println(allWords[i] + ": " + numberOfSameWords);
                numberOfSameWords = 1;
            }
        }
    }
    public void substrings(){
        Scanner cs = new Scanner(System.in);
        String new_string = "";
        System.out.println("Enter the first element's index of the string: ");
        int i = cs.nextInt();
        System.out.println("Enter the last element's index of the string: ");
        int j = cs.nextInt();
        for (int k = 0; k < strings.length; k++){
            if (j > strings[k].length() || i > strings[k].length()){
                System.out.println("Wrong input! String shorter than the number of index.");
            }else {
                new_string += strings[k].substring(i, j+1);
            }
        }
        System.out.println("United string:" + new_string);
    }
    public void Change1stCharacterToUpperCase(){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        String[] words = strings[i].split("[ .,]");
        for (int u = 0; u < words.length; u++) {
            String current_word = words[u];
            String first_char = String.valueOf(current_word.charAt(0));
            words[u] = current_word.replaceFirst(first_char, first_char.toUpperCase());
        }
        String replacement = "";
        for (int j = 0; j < words.length; j++) {
            replacement =replacement + words[j] + " ";
        }
        strings[i] = replacement;
        System.out.println("Changed array: ");
        for (int l = 0; l < strings.length; l++) {
            System.out.println(strings[l]);
        }
    }
    public void updateStr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of string: ");
        int index = sc.nextInt();
        System.out.println("Enter updated string:");
        strings[index] = sc.nextLine();
        System.out.println("Changes applied");
    }
}