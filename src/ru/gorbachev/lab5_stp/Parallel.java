package ru.gorbacev.lab5_stp;

public class Parallel extends Polygon {
    private double pol;//полупериметр
    private double y;//угол
    static final double  PI= 3.14;
    private double amountDiag;
   
    Parallel(int id, int a, int b, int y, String name){
        this.id = id;
        this.a=a;
        this.b=b;
        this.y=y;
        this.name = name;
        
     }
    
    public double getRadian(){
      return (y*PI)/180;
    }
    
    @Override
    public double getA() {
       return a;
    }
    
    @Override
    public void perimetr() {
        perimetr = a+b+a+b;
    }

    @Override
    public void square() {
        square = a*b*Math.sin(getRadian());
    }
   
    @Override
    void v() {
        System.out.println(getTime() + "; "+"id= "+this.getId()+", Имя:"+this.getName()+",Сторона a:"+a+",Сторона b:"+b+",Угол в радианах: "+Math.ceil(this.getRadian()*100)/100+",Второй угол "+Math.ceil(180-y*100)/100+", Периметр: "+Math.ceil(perimetr*100)/100+", Площадь: "+Math.ceil(square*100)/100); 
    }
}
