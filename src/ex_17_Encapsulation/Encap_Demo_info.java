package ex_17_Encapsulation;
//Encapsulation is OOPs concept where we have hide the attributes and they can be shown with their
// behavior only. Attributes are like Variables etc.
public class Encap_Demo_info {
   public static void main(String[] args) {
    BadExample1 be = new BadExample1("Prakarsh","Password");
       System.out.println(be.username);
       System.out.println(be.password);
       be.password = "Hello";
       System.out.println(be.password);



       goodExample1 ge = new goodExample1("Prakarsh","Password");
        String pass = ge.getPassword();
        //String pass = ge.setPassword(); //It will be not allowed, as we have stopped it in the class
       ge.setPassword("Prakarsh@123456",true); // When we can change the password
       String pass1 = ge.getPassword();
       System.out.println(pass1);
       ge.setPassword("Prakarsh@123456",false); // When we can change the password

    }
}
class BadExample1{
    public String username;
    public String password;

    public BadExample1(String username, String password) {
    this.username = username;
    this.password = password;
    }
}
class goodExample1{

    goodExample1(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

   /* public void setPassword(String password) {
        this.password = password;
    }
*/  // We are not allowing the user to set the password hence here we removed the setter for the password

    public void setPassword(String password, Boolean allowed_to_change) {
        if (allowed_to_change == true) {
            this.password = password;
        }else{
            System.out.println("Not Allowed");
        }
    } // This we are doing to give the access based upon condition

    private String username;
    private String password;




}
