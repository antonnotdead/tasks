package practical_tasks_pt2.task15;

public enum Color {
    RED(0), ORANGE(1), YELLOW(2), GREEN(3), BLUE(4), INDIGO(5), VIOLET(6);
    private int num;
    private Color (int num){
        this.num = num;

    }
    public static void printAllColors(){
        Color[] AllColors = Color.values();
        for (Color c: AllColors){
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void printColor(int index){
        Color[] AllColors = Color.values();
        System.out.println(AllColors[index]);
    }
}
