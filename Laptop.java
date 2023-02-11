package homework6;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Laptop {
    private String model;
    private int ram;
    private String processor;
    private String color;
    private String operatingSystem;
    private int hardDrive;
    private double diagonal;

    public Laptop(String model, int ram, String processor, String color, String operatingSystem, int hardDrive, double diagonal) {
        this.model = model;
        this.ram = ram;
        this.processor = processor;
        this.color = color;
        this.operatingSystem = operatingSystem;
        this.hardDrive = hardDrive;
        this.diagonal = diagonal;
    }
    public void getAllLaptops() {
        System.out.println(model);
    }
}
