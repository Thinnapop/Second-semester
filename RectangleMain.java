public class RectangleMain {
    private double width;
    private double height;
    private double area;
    private double perimeter;

    public RectangleMain(){

    }
    public RectangleMain(double width,double height){
        this.width = width;
        this.height = height;
    }
    public void width(double width){
        this.width = width;
    }
    public void height(double height){
        this.height = height;
    }

    public void area(double area){
        this.area = area;
    }
    public void perimeter(double perimeter){
        this.perimeter = perimeter;
    }
    
    public void calculate(){
        this.area = width * height;
        this.perimeter = 2 * (width + height);
    }
    
    public void displayRec(){
        if (width == height) {
            System.out.println("square "+width+" x" +height);
        }
        else {
        System.out.println("non_square "+width+" x" +height);
    }
    System.out.println("Area: "+area);
    System.out.println("Perimeter: "+perimeter);
    }
}
