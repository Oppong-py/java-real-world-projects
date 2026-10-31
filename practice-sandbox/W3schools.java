public class W3schools {
    public static void main(String[] args){
        //Assigning variables:
        String name = "Oppong";
        int sum = 7 + 8;
        String sum_message = "The sum of 7 and 8 is ";
        String pi_message = "The value for pi is ";

        //Displaying Results
        System.out.println("Hello " + name);
        System.out.println(7 + 7);
        System.out.println(sum_message + sum);

        //Declaring a constant variable
        //By Java convention, constant variables are declared in all
        //uppercase letters
        final double PI = 3.14159;
        System.out.println(pi_message + PI);

        //The f is to make the number a float or double
        System.out.println(17.99f);

        //The d is to make the number a float or double
        System.out.println(19.99d);

        //Greeting the user
        String first_name = "Kwabena";
        String last_name = "Oppong";
        String greet_message = "Hello " + first_name + " " + last_name;

        System.out.println(greet_message);

        //Printing out a number
        int x = 5;
        int y = 6;

        //This priints the actual sum of the two numbers
        System.out.println("The sum is " + (x + y));

        //This prints the two numbers together
        System.out.println("The sum is " + x + y);

        int a = 7, b = 8, c = 9;
        System.out.println("The sum of a, b and c is " + (a + b + c));

        //Declaring a float and double variable with scientific notation
        float f1 = 784e5f;
        double d1 = 2132e9d;

        System.out.println(f1);
        System.out.println(d1);

        //Declaring a boolean variable
        boolean istaken = true;
        System.out.println(istaken);

        //Declaring a char variable
        char grade = 'A';
        char grade_1 = 65; //ASCII value for A
        System.out.println(grade);
        System.out.println(grade_1);

        //Declaring a string variable
        String greeting = "Hello Oppong";
        System.out.println(greeting);

        int items = 7;
        float cost_per_item = 9.99f;
        float total_cost = items * cost_per_item;
        char currency = '$';

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + cost_per_item);
        System.out.println("Total cost = " + currency + total_cost);

        //Using the var keyword. 
        //The var keyword lets the compiler automatically 
        //detect the type of a variable based on the value 
        //you assign to it

        var my_name = "Oppong";
        var my_age = 25;    
        var my_height = 5.11f;
        var my_weight = 70.3d;
        var my_grade = 'A';
        var is_student = true;

        System.out.println("My name is " + my_name);
        System.out.println("My age is " + my_age);
        System.out.println("My height is " + my_height);
        System.out.println("My weight is " + my_weight);
        System.out.println("My grade is " + my_grade);
        System.out.println("Is student: " + is_student);

        //Type Casting 
        int my_int = 7;
        double my_double = my_int; //Automatic casting: int to double
        System.out.println(my_int);
        System.out.println(my_double);

        float my_float = 7.8976f;
        int my_int_1 = (int) my_float; //Manual casting: double to int
        System.out.println(my_float); 
        System.out.println(my_int_1);

        //Declaring two double variables and comparing them
        double num_1 = 9d;
        double num_2 = 4d;
        System.out.println(num_1 > num_2);

        String me_last = "Oppong";
        String me_first = "Kwabena";
        System.out.println("My name is " + me_last.toUpperCase());
        System.out.println("You can call me " + me_first.toLowerCase());
        System.out.println("The index of 'n' in my last name is " + me_last.indexOf('n'));
        System.out.println(me_first.charAt(5));
        String me_middle = " Adutwum ";
        System.out.println("Middle name: " + "[" + me_middle + "]");
        System.out.println("Middle name: " + "[" + me_middle.trim() + "]");

        String message_1 = "Hello Oppong";
        String message_2 = "Hello Oppong";

        String message_3 = "Hi Oppong";
        System.out.println(message_1.equals(message_2));
        System.out.println(message_1.equals(message_3));

        String me_full = me_first.concat(me_middle).concat(me_last);
        System.out.println("My full name is " + me_full);





    }
    
}
