package pagebean;

public class Page {
    private String name;
    private int number;

    public Page(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {

        return name + " " + number;
    }
}
