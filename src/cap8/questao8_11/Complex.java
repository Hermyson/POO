// @Author: Hermyson Cassiano 
package cap8.questao8_11;

public class Complex {
    private float parteReal, parteReal1, parteReal2;
    private float parteImaginaria, parteImaginaria1, parteImaginaria2;
    public Complex(float parteReal1, float parteImaginaria1, 
            float parteReal2, float parteImaginaria2) {
        this.parteReal1 = parteReal1;
        this.parteImaginaria1 = parteImaginaria1;
        this.parteReal2 = parteReal2;
        this.parteImaginaria2 = parteImaginaria2;        
    }
    public Complex() {
        parteReal1 = 5;
        parteImaginaria1 = 10;
        parteReal2 = 3;
        parteImaginaria2 = 2;
    }
    public void adicao() {
        parteReal = parteReal1 + parteReal2;
        parteImaginaria = parteImaginaria1 + parteImaginaria2;
        System.out.printf("(%.1f + %.1fi) + (%.1f + %.1fi) = (%.1f + %.1fi)\n",
                parteReal1, parteImaginaria1, parteReal2, parteImaginaria2,
                parteReal, parteImaginaria);
    }
    public void subtracao() {
        parteReal = parteReal1 - parteReal2;
        parteImaginaria = parteImaginaria1 - parteImaginaria2;
        System.out.printf("(%.1f + %.1fi) - (%.1f + %.1fi) = (%.1f + %.1fi)\n",
                parteReal1, parteImaginaria1, parteReal2, parteImaginaria2,
                parteReal, parteImaginaria);
    }
}