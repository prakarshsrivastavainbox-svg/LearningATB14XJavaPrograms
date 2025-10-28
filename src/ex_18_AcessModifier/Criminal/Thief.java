package ex_18_AcessModifier.Criminal;

import ex_18_AcessModifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c=new Cop(100); // Since the class is public hence it can be used here
        c.shoot();
    }
}
