package ex_18_AcessModifier.Police;

public class Default_Cop {
    public static void main(String[] args) {
        Cop jd = new Cop();
        jd.thisdefault(); // This is also working with the package, working like protected one
    }
}
