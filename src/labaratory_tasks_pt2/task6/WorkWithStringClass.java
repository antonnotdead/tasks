package labaratory_tasks_pt2.task6;

public class WorkWithStringClass {
    public static void printLastChar (String str){
        System.out.println("Last character: "+str.charAt(str.length()-1));
    }
    public static void checkForEnd(String str){
        if (str.endsWith("!!!")){
            System.out.println("Yes!");
        }else {
            System.out.println("No!");
        }
    }

    public static void checkForStart(String str){
        if (str.startsWith("I like")){
            System.out.println("Yes!");
        }else {
            System.out.println("No!");
        }
    }
    public static void checkForContains(String str){
        String requiredString = "Java";
        if (str.contains(requiredString)){
            System.out.print("Yes!");
            int i = 0;
            while (!str.startsWith(requiredString, i)){
                i++;
            }
            System.out.println(" At index: " + i);
        }else {
            System.out.println("No!");
        }

    }
    public static String replaceAtoO(String str){
        String str_new = str.replaceAll("a", "o");
        return str_new;
    }
    public static String replaceAllToUpper(String str){
        String str_new = str.toUpperCase();
        return str_new;
    }
    public static String deleteJavaSubstring(String str){
        String[] parts = str.split("Java");
        String new_str = "";
        for (int i = 0; i < parts.length; i++) {
            if (parts[i] != "Java"){
                new_str += parts[i];
            }
        }
        return new_str;
    }
    public static void main(String[] args){
        String sentence = "I like Java!!!";
        printLastChar(sentence);
        checkForEnd(sentence);
        checkForStart(sentence);
        checkForContains(sentence);
        System.out.println(replaceAtoO(sentence));
        System.out.println(replaceAllToUpper(sentence));
        System.out.println(deleteJavaSubstring(sentence));
    }
}
