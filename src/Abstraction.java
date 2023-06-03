public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);


        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
        c.changeColor();
        System.out.println(c.color);

    }
}
abstract class Animal2 {
    String color;
    Animal2() {
        this.color = "brown";
    }
    void eat() {
        System.out.println("eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    void walk(){
        System.out.println("walks");
    }
    void changeColor() {
        color = "dark brown";
    }
}

class Chicken extends Animal{
    void walk() {
        System.out.println("walks");
    }
    void changeColor() {
        color = "yellow";
    }
}