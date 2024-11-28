

public class RectangleClass {
    public static void main(String[] args) {
        RectangleMain rec = new RectangleMain(5.0,5.0);
        rec.calculate();
        rec.displayRec(); 
        
        System.out.println("");

        RectangleMain rec2 = new RectangleMain(8.0,5.0);
        rec2.calculate();
        rec2.displayRec();
    }
}
