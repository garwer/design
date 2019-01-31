package builder.v1;

/**
 * Derector角色
 * 调用具体建造者来创建复杂对象各个部分，指导者不涉及具体产品信息，只负责保证对象各部分完整创建 或者按某种顺序创建
 * 遇到多个构造器参数时要考虑用构建器
 */
public class Creator {
    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer makeComputer(String cpu,
                                 String mainBoard,
                                 String graphics,
                                 String memory,
                                 String hardDisk,
                                 String solidStateDisk,
                                 String power
                             ) {
        this.computerBuilder.buildCpu(cpu);
        this.computerBuilder.buildMainBoard(mainBoard);
        this.computerBuilder.buildGraphics(graphics);
        this.computerBuilder.buildMemory(memory);
        this.computerBuilder.buildHardDisk(hardDisk);
        this.computerBuilder.buildSolidStateDisk(solidStateDisk);
        this.computerBuilder.buildPower(power);
        return this.computerBuilder.createComputer();
    }
}
