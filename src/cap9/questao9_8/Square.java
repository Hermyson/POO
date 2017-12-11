// @Author: Hermyson Cassiano 
package cap9.questao9_8;

public class Square extends Rectangle{
    
   
    public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4 )  
    {
         super(x1,y1,x2,y2,x3,y3,x4,y4);
    }
    
    
    public double getLado()
    {
        return getLargura();
    }
    
    
    public String toString()
    {
        return ("\nAs coordenadas de Square s„o:\n "+
                getPoint1() +"," + getPoint2() +"," + getPoint3() + "," + getPoint4() +
                "\nO lado È: " + getLado()  + "\n¡rea È: " + getArea())+"\n";
    }
    
}
