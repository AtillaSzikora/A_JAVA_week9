//Write another class called MyTest which has a main method.
//In the main method, instantiate your class, set all of the values,
//after that get the values from the class and print it out in one row

public class MyTest {

    public static void main(String[] args) {
	Ex1 ex1 = new Ex1(99, 6.6, "HD as HorseD***");
        ex1.getNum();
        ex1.getDnum();
        ex1.getText();

    System.out.print(ex1.getNum() + ex1.getDnum() + ex1.getText());
    System.out.print(ex1.getDnum());
    System.out.print(ex1.getText());
    }
}