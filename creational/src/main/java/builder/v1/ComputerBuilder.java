package builder.v1;

public abstract class ComputerBuilder {
    public abstract void buildCpu(String cpu);
    public abstract void buildMainBoard(String mainBoard);
    public abstract void buildGraphics(String graphics);
    public abstract void buildMemory(String memory);
    public abstract void buildHardDisk(String hardDisk);
    public abstract void buildSolidStateDisk(String solidStateDisk);
    public abstract void buildPower(String power);
    public abstract Computer createComputer();
}
