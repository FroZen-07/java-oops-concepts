public class Polymorphism {
    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        System.out.println(calc.sum(1,4));
//        System.out.println(calc.sum(1,4, 7));
//        System.out.println(calc.sum(1.7f,4.9f));

        Deer d = new Deer();
        d.eat();
    }
}
// Compile Time (Method Overloading) and Run Time (Method Overriding)
// Overloading
class Calculator {
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}

// Overriding
class Animal1 {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal1 {
    void eat() {
        System.out.println("eats grass");
    }
}
