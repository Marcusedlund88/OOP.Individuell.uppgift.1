package OOP.uppgift1;

public class Car{

    protected String licenseNumber;
    protected String brand;
    protected String model;
    CarOwner carOwner;

    public Car(String licenseNumber, String brand, String model){
        this.licenseNumber = licenseNumber;
        this.brand = brand;
        this. model = model;
    }
public CarOwner getCarOwner(){
        return  carOwner;
}
    public void ownerOfCar(CarOwner carOwner){

        this.carOwner = carOwner;
    }
    public CarOwner newOwner(CarOwner carOwner){
        CarOwner newOwner = carOwner;
        return newOwner;
    }

    public void hasOwner(){
        carOwner = null;
    }

    public String getLicenseNumber(){
        return licenseNumber;
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }

}
