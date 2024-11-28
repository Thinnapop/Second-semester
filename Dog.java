public class Dog {
    private String color;
    private double weight;

    public Dog(){

    }
    public Dog(String color,double weight){
        this.color = color;
        this.weight = weight;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void displayDog(){
        System.out.println("The color of my dog is " +color);
        System.out.println("The weight of my dog is " +weight);
    }
}
