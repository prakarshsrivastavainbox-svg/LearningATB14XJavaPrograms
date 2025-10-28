package ex_18_AcessModifier.Police;

public class Cop {
    public int gun;
    private String icard;
    public Cop(int bullet)
    {
        this.gun = bullet;
    }
    public void shoot()
    {
        System.out.println("Can i shoot, Yes you can");
    }
    void thisdefault()
    {
        System.out.println("This is Default Class");
    }
}

