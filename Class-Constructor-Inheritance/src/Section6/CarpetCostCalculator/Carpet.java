package Section6.CarpetCostCalculator;
/*
The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms.
To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet.
For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters.
To cover the floor with a carpet that costs $8 per square meter would cost $960.
2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.
The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.
In case the cost parameter is less than 0 it needs to set the cost field value to 0.
Write the following methods (instance methods):
* Method named getCost without any parameters, it needs to return the value of cost field

 */
public class Carpet {
    private double cost;

    public Carpet(double cost){

        if(cost < 0){
            cost = 0;
        }

        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
