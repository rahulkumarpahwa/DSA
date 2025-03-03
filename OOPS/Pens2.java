package OOPs;
// Getters and Setters.

class PenProp {
    private String color;
    private int tip;

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }

    int getTip() {
        return this.tip;

    }

    String getColor() {
        return this.color;
    }
}

public class Pens2 {
    public static void main(String[] args) {
        PenProp p1 = new PenProp();
        p1.setTip(23);
        p1.setColor("Grey");
        System.out.println(p1.getTip());
        System.out.println(p1.getColor());
    }
}
