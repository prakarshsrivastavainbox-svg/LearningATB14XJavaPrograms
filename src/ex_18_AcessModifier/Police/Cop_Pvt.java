package ex_18_AcessModifier.Police;

public class Cop_Pvt {
    public int gun;
    private String icard;
    public Cop_Pvt(int bullet)
    {
        this.gun = bullet;
    }
    public void shoot()
    {
        System.out.println("Can i shoot, Yes you can");
    }
}
