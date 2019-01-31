package clone;

public class Appearance {
    private String eyss;
    private String ears;


    public String getEyss() {
        return eyss;
    }

    public void setEyss(String eyss) {
        this.eyss = eyss;
    }

    public String getEars() {
        return ears;
    }

    public void setEars(String ears) {
        this.ears = ears;
    }

    @Override
    public String toString() {
        return "Appearance{" +
                "eyss='" + eyss + '\'' +
                ", ears='" + ears + '\'' +
                '}';
    }
}
