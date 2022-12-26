public class Journal {
    private String brand;
    private String RAM;
    private String HDD;
    private String opersys;
    private String colour;

    public Journal(String brand, String RAM, String HDD, String opersys, String colour) {
        this.brand = brand;
        this.RAM = RAM;
        this.HDD = HDD;
        this.opersys = opersys;
        this.colour = colour;
    }

    public String FunctionName() {
        return brand;
    }

    public String FunctionRAM() {
        return RAM;
    }

    public String FunctionHDD() {
        return HDD;
    }


    public String FunctionOperationSystem() {
        return opersys;
    }


    public String FunctionColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Notebook [brand=" + brand + ", RAM=" + RAM + ", HDD=" + HDD + ", opersys="
                + opersys + ", colour=" + colour + "]";
    }
}
