package practical_tasks_pt2.task14;

import java.util.Scanner;

public class ArrayString {
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
            for(int j = 0; j < stringsclone[i].length(); j++){
                if (stringsclone[i].charAt(j) == ' '){
                    words++;
                }
            }
            worldarray[i] = words;
        }
        //sorting
        for(int i = 1; i < stringsclone.length; i++) {
            for (int j = 0; j < stringsclone.length - 1; j++) {
                int flagword;
                String flagstring;
                if (worldarray[j] < worldarray[j - 1]) {
                    flagstring = stringsclone[j - 1];
                    stringsclone[j - 1] = stringsclone[j];
                    stringsclone[j] = flagstring;

                    flagword = worldarray[j - 1];
                    worldarray[j - 1] = worldarray[j];
                    worldarray[j] = flagword;
                }
            }
        }
    }
}
