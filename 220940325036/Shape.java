
/*Q3 : Write a program to create a class named shape. In this class we have three
        sub classes circle, triangle and square, each class has two member function
        named draw () and erase (). Create these using Runtime Polymorphism concepts*/

public class Shape {
    void draw(){
        System.out.println("Drawing Shape");
    }
    void erase(){
        System.out.println("Erasing Shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing circle");
    }
    void erase(){
        System.out.println("Erasing circle");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle");
    }
    void erase(){
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }
    void erase(){
        System.out.println("Erasing Square");
    }
}
class Abc{
    public static void main(String[] args) {
        Shape cir =new Circle();
        Shape tri =new Triangle();
        Shape squ=new Square();
        cir.draw();
        cir.erase();
        tri.draw();
        tri.erase();
        squ.draw();
        squ.erase();
    }
}
