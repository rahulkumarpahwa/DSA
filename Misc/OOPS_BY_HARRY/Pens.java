package Misc.OOPS_BY_HARRY;

class PensProp {
    String Color;
    int tip;

    void SetColor(String Color) {
        this.Color = Color;

    }

    void SetTip(int tip) {
        this.tip = tip;
    }
}

public class Pens {
public static void main(String[] args) {
    PensProp p1 = new PensProp();
    p1.Color = "Blue";
    p1.tip = 23;

    System.out.println(p1.tip);
    System.out.println(p1.Color);

    p1.SetColor("Green");
    p1.SetTip(4);
    System.out.println(p1.tip);
    System.out.println(p1.Color);
}
}
