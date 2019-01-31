package builder.v1;

/**
 * 产品
 * 创建一台电脑
 */
public class Computer {
    private String cpu;
    /**
     * 主板
     */
    private String mainBoard;
    /**
     * 显卡
     */
    private String graphics;

    /**
     * 内存
     */
    private String memory;

    /**
     * 硬盘
     */
    private String hardDisk;

    /**
     * 固态硬盘
     */

    private String solidStateDisk;
    /**
     * 电源
     */
    private String power;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getSolidStateDisk() {
        return solidStateDisk;
    }

    public void setSolidStateDisk(String solidStateDisk) {
        this.solidStateDisk = solidStateDisk;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", graphics='" + graphics + '\'' +
                ", memory='" + memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", solidStateDisk='" + solidStateDisk + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
