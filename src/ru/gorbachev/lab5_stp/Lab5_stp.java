package ru.gorbacev.lab5_stp;
 
import ru.gorbacev.lab5_stp.SortMode; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*; 
 
public class Lab5_stp { 
    public static int key = -1; 
    public static Polygon test = null; 
    public static List<Polygon> baze = new ArrayList(); 
     
    public static void main(String[] args) throws IOException { 
       
         
        while(key!=0) 
        {   System.out.println("*--------------------------*"); 
            System.out.println("1 - Создать  Квадрат"); 
            System.out.println("2 - Создать Треугольник"); 
            System.out.println("3 - Создать Параллелограмм"); 
            System.out.println("4 - Создать Прямоугольник"); 
            System.out.println("5 - Вывод с детальной информацией"); 
            System.out.println("6 - Удаление по id"); 
            System.out.println("7 - Запустить сортировку"); 
            System.out.println("8 - Вычеслить плошадь тела"); 
            System.out.println("9 - Вычислить периметр тела"); 
            System.out.println("0 - Вывод"); 
            System.out.println("*--------------------------*"); 
            InputStreamReader isr = new InputStreamReader(System.in);  
            BufferedReader br = new BufferedReader(isr);  
 
            Scanner in = new Scanner(System.in); 
            key = in.nextInt(); 
            switch(key) 
            { 
                case 1: 
                    System.out.println("Введите id: "); 
                    int id = in.nextInt(); 
                    System.out.println("Введите сторону a: "); 
                    int a = in.nextInt(); 
                    String name = "Квадрат"; 
                    System.out.println("На какое место добавить(всего-"+baze.size()+",dдобавить на любое место - 0)"); 
                    int pos = in.nextInt(); 
                    pos = pos -1; 
                    if(baze.size()!=0 && pos != -1)  
                         {baze.add(pos,new Square(id,a,name));} 
                      else {baze.add(new Square(id,a,name));} 
                     
                    break; 
 
 
                case 2: 
                    System.out.println("Введите id: "); 
                    id = in.nextInt(); 
                    System.out.println("Введите сторону a: "); 
                    a = in.nextInt(); 
                    System.out.println("Введите сторону b: "); 
                    int b = in.nextInt(); 
                    System.out.println("Введите сторону c: "); 
                    int c = in.nextInt();                     
                    name = "Треугольник"; 
                    System.out.println("На какое место добавить(всего-"+baze.size()+",добавить на любое - 0)"); 
                    pos = in.nextInt(); 
                    pos = pos -1; 
                    if(baze.size()!=0 && pos != -1)  
                         {baze.add(pos,new Trangle(id,a,b,c,name));} 
                    else {baze.add(new Trangle(id,a,b,c,name));} 
                                    
                    break; 
 
 
                case 4: 
                    System.out.println("Введите id: "); 
                    id = in.nextInt(); 
                    name = "Прямоугольник"; 
                    System.out.println("Введите сторону a: "); 
                    a = in.nextInt(); 
                    System.out.println("Введите сторону b: "); 
                    b = in.nextInt(); 
                    System.out.println("На какое место добавить(всего-"+baze.size()+",добавить на любое - 0)"); 
                    pos = in.nextInt(); 
                    pos = pos -1; 
                    if(baze.size()!=0 && pos != -1)  
                         {baze.add(pos,new Rectangle(id,a,b,name));} 
                    else {baze.add(new Rectangle(id,a,b,name));} 
 
                    
                    break;   
               
                 case 3: 
                    System.out.println("Введите id: "); 
                    id = in.nextInt(); 
                    name = "Параллелограмм"; 
                    System.out.println("Введите сторону a: "); 
                    a = in.nextInt(); 
                    System.out.println("Введите сторону b: ");                     b = in.nextInt(); 
                    System.out.println("Введите угол: "); 
                    int y = in.nextInt(); 
                    System.out.println("На какое место добавить(всего-"+baze.size()+",добавить на любое - 0)"); 
                    pos = in.nextInt(); 
                    pos = pos -1; 
                    if(baze.size()!=0 && pos != -1)  
                         {baze.add(pos,new Parallel(id, a,b,y, name));} 
                    else {baze.add(new Parallel(id, a,b, y, name));} 
                     
                    break;  
 
               case 5: 
                   for(Polygon test: baze) 
                  { 
                      test.v(); 
                  } 
                  break; 
                    
              case 6: 
                  System.out.print("Введите id: "); 
                  int id1 = in.nextInt(); 
                  for(int i = 0; i < baze.size(); i++) 
                  { 
                   test = (Polygon) baze.get(i); 
                   if (test.id == id1)  
                   { 
                        baze.remove(i); 
                        System.out.println("Удаление произведено!");  
                        i = baze.size(); 
                   } 
                   } 
                  break; 
              case 7: 
                System.out.println("*--------------------------*"); 
                System.out.println("1 - по возрастанию id"); 
                System.out.println("2 - по убыванию id"); 
                System.out.println("3 - по возрастанию имени"); 
                System.out.println("4 - по убыванию id"); 
                System.out.println("5 - по возрастанибю периметра"); 
                System.out.println("6 - по убыванию периметра"); 
                System.out.println("7 - по возрастанию площади"); 
                System.out.println("8 - по убыванию плошади"); 
                                   
                String mode = br.readLine(); // читаем строку из буфера ввода 
                if (mode.isEmpty()) break; // прерываем цикл, если строка пустая 
                boolean sortUp = mode.equals("2")||mode.equals("4")||mode.equals("6")||mode.equals("8");  
                int  sortMode=0;  
                if (mode.equals("3")||mode.equals("4")) sortMode=1;  
                    else if (mode.equals("5")||mode.equals("6")) sortMode=2;  
                        else if (mode.equals("7")||mode.equals("8")) sortMode=3; 
                     Collections.sort(baze,new SortMode(sortUp,sortMode));  
                 
                        for(Polygon test: baze) 
                        { 
                            test.v(); 
                        } 
                  break; 
               
              case 8: 
                  System.out.print("Введите id: "); 
                  id1 = in.nextInt(); 
                  for(int i = 0; i < baze.size(); i++) 
                  { 
                   test = (Polygon) baze.get(i); 
                   if (test.id == id1)  
                   { 
                       test.square(); 
                       baze.set(i,test); 
                        System.out.println("Площадь посчитана! ");  
                         
                   } 
                   } 
                  break; 
              case 9: 
                  System.out.print("Введите id: "); 
                  id1 = in.nextInt(); 
                  for(int i = 0; i < baze.size(); i++) 
                  { 
                   test = (Polygon) baze.get(i); 
                   if (test.id == id1)  
                   { 
                        
                       test.perimetr(); 
                       baze.set(i,test); 
                        System.out.println("Периметр посчитан!!");  
                         
                   } 
                   } 
                  break; 
              
                   
            } 
        } 
    } 
} 
