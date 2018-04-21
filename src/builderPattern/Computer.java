package builderPattern;

/**
 * Created by Harshraj on 06-04-2018.
 */
public class Computer {

    //required parameters
    public String ram;
    public String hdd;

    //optional parameters
    public String graphicsCard;

    private Computer(ComputerBuilder builder){
        this.ram = builder.ram;
        this.hdd = builder.hdd;
    }

    public static class ComputerBuilder{

        //required parameters
        public String ram;
        public String hdd;

        //optional parameters
        public String graphicsCard;

        public ComputerBuilder(String ram,String hdd){
            this.ram = ram;
            this.hdd = hdd;
        }

        public void setGraphicsCard(String graphicsCard){
            this.graphicsCard = graphicsCard;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
