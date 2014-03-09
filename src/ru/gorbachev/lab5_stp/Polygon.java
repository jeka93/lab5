package ru.gorbacev.lab5_stp;


public abstract class Polygon implements Perimetr,Squareable {
    public String name="Многоугольник"; 
    public int id;
    private static int nextId=1;
    public double a,b,c;
    public double square;
    public double perimetr;
    public int SortType = 0;

    { id = nextId++; }
    
    abstract  void v();

    
    public  int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    
    public abstract double getA();
    
   
    public double getSquare() {
        return square;
    }

    public double getPerimetr() {
        return perimetr;
    }
    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
   
   
  
}
