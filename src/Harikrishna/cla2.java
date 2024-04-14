package Harikrishna;
public class cla2
{
int mfgyear;
String company;
String model;

//  non parameterized constructor creation
  cla2 ()
{
    this.mfgyear = 2020;
    this.company = "Hyundai";
    this.model = "verna";
}
// parameterized constructor
 cla2 (int mfgyear,String company,String model)
{
    this.mfgyear = mfgyear;
    this.company = company;
    this.model = model;
}
//method creation
public void displayInfo()
{
    System.out.println("car information");
    System.out.println("manufacturing year is "+ mfgyear);
    System.out.println("Company name is "+ company);
    System.out.println("Model name is "+ model);
}
//mainmethod
public static void main (String[] args)
{
     cla2 c = new cla2();
    c.displayInfo();
    cla2 c1 = new cla2(2021,"kia","sonet");   // parameterized cons calling
    c1.displayInfo();

}}