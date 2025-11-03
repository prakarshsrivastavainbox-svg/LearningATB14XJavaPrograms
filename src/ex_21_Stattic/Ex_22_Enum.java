package ex_21_Stattic;

public class Ex_22_Enum {
  public   static void main(String[] args) {
        System.out.println(Day.Monday);
      System.out.println(HexColor.Red.getHexcode());
    }
}

enum Day{Monday, Tuesday}
enum HexColor{
    Red("#FF0000"),
    Blue("#3377FF");    // Hex Codes --- Key Value pair

    private String hexcode;
    HexColor(String hexCode){ //  Contructor created as key Value pair is sued in Enum, constructor is mandatory in this case
        this.hexcode=hexCode;

    }
    String getHexcode(){
        return this.hexcode;
    }
}