package ru.gorbacev.lab5_stp;

public class Square extends Polygon{
    private double radius; // радиус описанной окружности
    private double diagonal; // диагональ квадрата
    
    
    Square(int id, int a, String name){
        this.id = id; 
        this.a=a;
        this.name = name; 
        radius=a*Math.sqrt(2)/2;
        diagonal=a*Math.sqrt(2);
        
    }
        public double getRadius(){
         return radius;
    }

    public double getDiagonal(){ //диагональ
        return diagonal;
    }

    @Override
    public double getA() {
        return a;
    }
    
    

    @Override
    public void perimetr() {
        perimetr = a*4;
    }

    @Override
    public void square() {
        square = a*a;
    }

   @Override
    void v() {
        System.out.println(getTime() + "; "+"id= "+this.getId()+", "+this.getName()+",Сторона а:"+a+", Радиус окружности: "+Math.ceil(this.getRadius()*100)/100+", Диагональ: "+Math.ceil(this.getDiagonal()*100)/100 +", Периметр: "+Math.ceil(perimetr*100)/100+", Плошадь: "+Math.ceil(square*100)/100);
    }

    

    

    

}
