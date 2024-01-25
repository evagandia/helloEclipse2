package u2.calculadora;

public class Calculadora {
    private static int result;
    
    public void sumar (int n) {
    	result += n;
    }
    
    public void restar (int n) {
    	result -= n;
    }
    
    public void multiplicar (int n) {
    	result *= n;
    }
    
    public void dividir (int n) {
    	result /= n;
    }
    
    public void limpiar () {
    	result = 0;
    }
    
    
    public int getResult() {
    	return result;
    }
    
    
    public static void main(String [] args) {
    	Calculadora calc = new Calculadora();
    	calc.sumar(5);
		System.out.println("El resultado de la suma es " + calc.getResult());
	    calc.restar(2);
		System.out.println("El resultado de la resta es " + calc.getResult());
	    calc.multiplicar(2);
		System.out.println("El resultado de la multiplicacion es " + calc.getResult());
	    calc.dividir(2);
		System.out.println("El resultado de la division es " + calc.getResult());
	    calc.limpiar();
	    System.out.println("El valor de la variable result es " + calc.getResult());
    }
}
