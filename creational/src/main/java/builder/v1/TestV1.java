package builder.v1;

public class TestV1 {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerActualBuilder();
        Creator creator = new Creator();
        creator.setComputerBuilder(computerBuilder);
        Computer computer = creator.makeComputer("i9","败家国度主板","GTX2080","32g","1T硬盘","512g固态","红星1000W");
        System.out.println(computer.toString());
    }
}
