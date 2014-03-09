package ru.gorbacev.lab5_stp;

public class Rectangle extends Polygon{
   private double diagonal;
    private double pol;
    private double area1;
    private double poldiag;
            
   Rectangle(int id, int a, int b, String name)
        {this.id = id; 
        this.a=a;
        this.b=b;
        this.name = name; 
        diagonal= Math.sqrt((a*a)+(b*b));
        area1 = Math.sqrt(pol*(pol-a)*(pol-b)*(pol-diagonal)); 
        pol=(a+b+diagonal)/2;
        poldiag = 2*((a*a)+(b+b));
                }
       
    public double getDiagonal(){
        return diagonal;
    }

    public double getArea1(){
       return area1; 
    }
    public double getPol(){
        return pol;
    }

    public double getPolDiag(){
        return poldiag;
    }

    @Override
    public double getA() {
        return a;
    }
      

    @Override
    public void perimetr() {
        perimetr= a+b+a+b;
    }

    @Override
    public void square() {
        square = a*b;
    }
    
   
    @Override
    void v() {
 System.out.println("id= "+this.getId()+",Сторона a:"+a+",Сторона b:"+b+", "+this.getName()+", Плошадь треугольника в периметре: "+Math.ceil(this.getArea1()*100)/100+", полудиагональ "+Math.ceil(this.getPolDiag()*100)/100  +", Периметр: "+Math.ceil(perimetr*100)/100 +", Плошадь: "+Math.ceil(square*100)/100);
    }

    

}
