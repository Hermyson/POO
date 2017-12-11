// @Author: Hermyson Cassiano 
package cap10.questao10_13;

public class Shape 
{
	public double comprimento = 0.0;
	public double largura = 0.0;
	public double area = 0.0;

	public double obterArea(){
	    area = largura * comprimento;
	    return area;
	}
	
}
