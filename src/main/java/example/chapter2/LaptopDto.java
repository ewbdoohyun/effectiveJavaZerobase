package example.chapter2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LaptopDto {
    private String modelName;
    private String company;

    public LaptopDto(){

    }

    public LaptopDto(String modelName, String company){
        this.modelName = modelName;
        this.company = company;
    }

    public static LaptopDto from(Laptop laptop){
        LaptopDto laptopDto = new LaptopDto();
        laptopDto.company = laptop.getCompany();
        laptopDto.modelName = laptop.getModelName();
        return laptopDto;
    }
}
