package Section6.CarpetCostCalculator;

import java.sql.PreparedStatement;
import java.util.PrimitiveIterator;

/*
The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms.
To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet.
For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters.
To cover the floor with a carpet that costs $8 per square meter would cost $960.
3. Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.
Write the following methods (instance methods):
* Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.
TEST EXAMPLE
→ TEST CODE:
Carpet carpet = new Carpet(3.5);
Floor floor = new Floor(2.75, 4.0);
Calculator calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
carpet = new Carpet(1.5);
floor = new Floor(5.4, 4.5);
calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
→ OUTPUT
total= 38.5
total= 36.45
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 3 classes.
NOTE: Do not add a main method to the solution code.
 */
public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor,Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return carpet.getCost() * floor.getArea();
    }

    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }

}
