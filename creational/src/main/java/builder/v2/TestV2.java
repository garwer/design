package builder.v2;

public class TestV2 {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder().buildCpu("i9").buildGraphics("2080显卡").buildHardDisk("1T硬盘").buildMainBoard("败家国度主板").buildPower("32G内存").buildSolidStateDisk("固态硬盘").build();
        System.out.println(computer.toString());

        StringBuffer sb = new StringBuffer();
        sb.append(7).append("3");
    }
}
