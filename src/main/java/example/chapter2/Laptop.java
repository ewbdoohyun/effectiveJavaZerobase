package example.chapter2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Laptop {
    private String modelName;
    private String company;

    public Laptop(){

    }

    public Laptop(String modelName,String company){
        this.modelName = modelName;
        this.company = company;
    }

    public static Laptop ofModelNameAndCompany(String modelName,String company){
        Laptop laptop = new Laptop();
        laptop.company = company;
        laptop.modelName = modelName;
        return laptop;
    }

    public static Laptop from(LaptopForm laptopForm){
        Laptop laptop = new Laptop();
        laptop.modelName = laptopForm.getModelName();
        laptop.company = laptopForm.getCompany();
        return laptop;
    }
}
