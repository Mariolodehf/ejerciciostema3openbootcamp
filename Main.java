public class Main {
    public static void main(String[] args) { 
       int resultado;//variable para guardar el resultado
        resultado = suma(10, 30);  //invocamos el metodo suma

        System.out.println(resultado);//imprimimos el resultado
        }
    public static int suma(int a, int b) { //metodo suma
        int resultado = a + b;
        
        return resultado;//retornamos el resultado
} 
}