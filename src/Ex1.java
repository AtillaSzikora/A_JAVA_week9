/*
Write a class, which has 3 variables:
an integer, initialized with -1
a double, initialized with 0.0
a String, initialized as an empty string
Every variables have to be private. Define a constructor with no parameters, and define another one,
where you can set the initial values of the variables.
Publish setter and getter methods to set and/or get the values of the variables.
 */

public class Ex1 {
    private int num = -1;
    private double dnum = 0.0;
    private String text = null;

    public Ex1(int num, double dnum, String text) {
        this.num = num;
        this.dnum = dnum;
        this.text = text;
    }

    public void noParameters() {}

    public void setNum(int num) {}
    public void setDnum(double dnum) {}
    public void setText(String text) {}

    public int getNum() {return num;}
    public double getDnum() {return dnum;}
    public String getText() {return text;}
}