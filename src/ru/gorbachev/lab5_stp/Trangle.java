/**
 * Класс треугольник
 */
package ru.gorbacev.lab5_stp;
public class Trangle extends Polygon {
private double pol; //полупериметр
private double hight; // высота
   
    Trangle(int id, int a, int b,int c, String name)
        {this.id = id; 
        this.a=a;
        this.b=b;
        this.c=c; 
        this.name = name; 
        pol=(a+b+c)*0.5;
        hight= 2*(Math.sqrt(pol*(pol-a)*(pol-b)*(pol-c)))/a;
        }
        
    @Override
    public double getA() {
        return a;
    }
    
     public double getPol() {
        return pol;
    }
     public double getHight() {
        return hight;
    }
    
    @Override
    public void perimetr() {
        perimetr = a+b+c;
    }    

    @Override
    public void square() {
        square = pol*(pol-a)*(pol-b)*(pol-c);
    }
          
    @Override
    void v() {
        System.out.println("id="+this.getId()+", "+this.getName()+", Сторона а:"+a+",Сторона b:"+b+",Сторона с:"+c+",Высота: "+Math.ceil(hight*100)/100
                +", Полупериметр: "+this.getPol()+",Периметр: "+Math.ceil(perimetr*100)/100+", Плошадь': "+Math.ceil(square*100)/100);
    }

    
}
