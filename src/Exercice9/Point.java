package Exercice9;

public class Point {
    private int x;
    private int y;
    public Point(){}
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distance(){
        return Math.pow((Math.pow(x, 2)+Math.pow(y,2)), 0.5);
    }
    public double distance( Point p){
        return Math.pow((Math.pow(x-p.getX(), 2)+Math.pow(y-p.getY(),2)), 0.5);
    }
    public double distance(int x, int y){
        return Math.pow((Math.pow(this.x-x, 2)+Math.pow(this.y-y,2)), 0.5);
    }
    public static void main(String[] args) {
        Point p1 =new Point(2, 3);
        System.out.println("x = " + p1.getX());
        System.out.println("y = " + p1.getY());
        System.out.println("Distance to origin: " + p1.distance());
        Point p2 = new Point(5, 7);
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
        System.out.println("Distance to (5,7): " + p1.distance(5, 7));
    }
}

