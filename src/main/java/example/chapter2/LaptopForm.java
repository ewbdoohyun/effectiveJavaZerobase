package example.chapter2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LaptopForm {
    private String modelName;
    private String company;

    public LaptopForm(){

    }

    public LaptopForm(String modelName, String company){
        this.modelName = modelName;
        this.company = company;
    }

    public static LaptopForm ofModelNameAndCompany(String modelName, String company){
        LaptopForm laptop = new LaptopForm();
        laptop.company = company;
        laptop.modelName = modelName;
        return laptop;
    }
}
