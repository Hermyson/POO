// @Author: Hermyson Cassiano 
package cap11.questao11_18;

public class OrdenandosBlocoCatch {
	public static void main(String[] args){
		try{
            getExceptionB();
        }catch(ExceptionA ea){
            ea.printStackTrace();
        }

        try{
            getExceptionC();
        }catch(Exception ea){
            ea.printStackTrace();
        }
    }
    public static void getExceptionB() throws ExceptionB{
        throw new ExceptionB("ExceptionB");
    }
    public static void getExceptionC() throws ExceptionC{
        throw new ExceptionC("ExceptionC");
    }



}
