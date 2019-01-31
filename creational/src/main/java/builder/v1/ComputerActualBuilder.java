package builder.v1;



public class ComputerActualBuilder extends ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void buildCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void buildMainBoard(String mainBoard) {
        computer.setMainBoard(mainBoard);
    }

    @Override
    public void buildGraphics(String graphics) {
        computer.setGraphics(graphics);
    }

    @Override
    public void buildMemory(String memory) {
        computer.setMemory(memory);
    }

    @Override
    public void buildHardDisk(String hardDisk) {
        computer.setHardDisk(hardDisk);
    }

    @Override
    public void buildSolidStateDisk(String solidStateDisk) {
        computer.setSolidStateDisk(solidStateDisk);
    }

    @Override
    public void buildPower(String power) {
        computer.setPower(power);
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
