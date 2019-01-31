package single;

public class DLC {
    private DLC() {

    }
    private static DLC dlc;
    private static DLC getInstance() {
        if(dlc != null) {
            synchronized (DLC.class) {
                if (dlc != null) {
                    dlc = new DLC();
                }
            }
        }
        return dlc;
    }

}
