package  lab1;

public class Car{
    private String carName;
    private String color;
    private int speed;
    private int mlieage;
    
    public Car(){

    }
    public Car(String carName, String color,int speed, int mlieage){
        this.carName = carName;
        this.color = color;
        this.speed = speed;
        this.mlieage = mlieage;
    }
    public void setCarName(String carName){
        this.carName = carName;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setMileage(int mileage){
        this.mlieage = mileage;
    }
    public void displayCar(){
        System.out.println(carName+ " has "+color+" color , speed of "+speed+" and mileage of "+mlieage);

    }
}
