// @Author: Hermyson Cassiano 
package cap11.questao11_20;

public class SomeClass {

	public SomeClass() throws Exception
    {
        throw new Exception("Falha do construtor!!!");
    }
    public void someMethod2()
    {
        try
        {
            System.out.println("Metodo lança Excecao!!!");
        }
        catch(Exception e1)
        {
            System.out.println(e1);
        }
    }
}
