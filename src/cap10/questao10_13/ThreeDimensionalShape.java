// @Author: Hermyson Cassiano 
package cap10.questao10_13;

public class ThreeDimensionalShape extends Shape
{	
	public double volume = 0.0;
	public double altura = 0.0;
	public String nome = "tridimensional";

	
	public ThreeDimensionalShape(double c, double l, double a) {
	    super();
	    super.comprimento = c;
	    super.largura = l;
	    altura = a;
	}
	public double obterVolume(){
	    volume = altura * super.obterArea();
	    return volume;
	}
}
