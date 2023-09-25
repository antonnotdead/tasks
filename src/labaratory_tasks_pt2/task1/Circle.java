package labaratory_tasks_pt2.task1;

public class Circle {
    private double radius;
    private int x_coordinate;
    private int y_coordinate;

    public Circle(){
        this.radius = 1;
        this.x_coordinate = 0;
        this.y_coordinate = 0;
    }
    public Circle(double radius){
        this.radius = radius;
        this.x_coordinate = 0;
        this.y_coordinate = 0;
    }
    public Circle(int x_coordinate, int y_coordinate){
        this.radius = 1;
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }
    public Circle(double radius, int x_coordinate, int y_coordinate){
        this.radius = radius;
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x_coordinate=" + x_coordinate +
                ", y_coordinate=" + y_coordinate +
                '}';
    }
    public void showInfo(){
        System.out.println(this);
    }
    public void setCoordinates(int x_coordinate, int y_coordinate){
        this.x_coordinate += x_coordinate;
        this.y_coordinate += y_coordinate;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void getSquare(){
        System.out.println(3.14*this.radius*this.radius);
    }
    public void getCircleLength(){
        System.out.println(2*3.14*this.radius);
    }

    public static void main(String[] args){
        Circle circle = new Circle(10.23, 5, 6);
        circle.showInfo();
        circle.setCoordinates(123, 22);
        circle.showInfo();
        circle.setRadius(34.54);
        circle.getCircleLength();
        circle.getSquare();
    }
}
