package day11constructorsmethodcallstatickeyword;
import java.util.Scanner;
public class Runner {
 public static void main(String[] args) {

     //Create an object from "Car" class
Car audi = new Car();
  System.out.println(audi.make);//Toyota
  System.out.println(audi.model);//Prius

Car bmw = new Car("BMW","M5",2022,500000);
  System.out.println(bmw.make);//BMW
  System.out.println(bmw.model);//M5


Car mercedes = new Car("mercedes","C300",2023,60500);
  System.out.println(mercedes.make);//Mercedes
  System.out.println(mercedes.model);//C300

     Car itCar = new Car("Rolce Royce","M500",2023);
     System.out.println(itCar.model);
     System.out.println(itCar.model);
     System.out.println(itCar.year);

     Static01 obj1 = new Static01();
     Static01 obj2 = new Static01();
     Static01 obj3 = new Static01();
     System.out.println(obj3.nonStaticCounter);//1
     System.out.println(obj3.staticCounter);//3

 }
}
