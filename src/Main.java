public class Main {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // constructor
        p1.setColour("Blue");
        System.out.println(p1.getColour());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColour("Yellow");
        System.out.println(p1.getColour());
//        BankAccount myAcc = new BankAccount();
//        myAcc.userName = "bitanAtarthy";
//       myAcc.password = "abcdefghi"; not possible
//        myAcc.setPassword("abcdefghi");
    }
}
//class BankAccount {
//    // Access Modifiers
//    // Private, Default, Protected, Public
//    public String userName;
//    private String password;
//    public void setPassword(String pwd){
//        password = pwd;
//    }
//}


class Pen {
 private String colour;
 private int tip;

 String getColour() {
     return this.colour;
 }
 int getTip() {
     return this.tip;
 }
 void setColour(String colour){
     this.colour = colour;
 }
 void setTip(int newTip){
     tip = newTip;
 }
}

//class Student {
//    String name;
//    int age;
//    float percentage; // cgpa
//
//    void calcPercentage(int phy, int chem, int maths){
//        percentage = (phy+chem+maths)/3;
//    }
//}



