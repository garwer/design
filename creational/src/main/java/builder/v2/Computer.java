package builder.v2;

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


    public Computer(ComputerBuilder computerBuilder) {
        this.cpu = computerBuilder.cpu;
        this.mainBoard = computerBuilder.mainBoard;
        this.graphics = computerBuilder.graphics;
        this.memory = computerBuilder.memory;
        this.hardDisk = computerBuilder.hardDisk;
        this.solidStateDisk = computerBuilder.solidStateDisk;
        this.power = computerBuilder.power;
    }

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



    public static class ComputerBuilder {
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

        public ComputerBuilder buildCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder buildMainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public ComputerBuilder buildGraphics(String graphics) {
            this.graphics = graphics;
            return this;
        }

        public ComputerBuilder buildMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public ComputerBuilder buildHardDisk(String hardDisk) {
            this.hardDisk = hardDisk;
            return this;
        }

        public ComputerBuilder buildSolidStateDisk(String solidStateDisk) {
            this.solidStateDisk = solidStateDisk;
            return this;
        }

        public ComputerBuilder buildPower(String power) {
            this.power = power;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }


}
