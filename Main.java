/*public class Main {
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
*/
/* 
//funcion vacia - void: no retorna nada

public class Main {
    public static void main(String[] args) { 
        suma(10, 30);  //invocamos el metodo suma

        }//se opera directamente en el metodo
    public static void suma(int a, int b) { //metodo suma
        int resultado;//variable para guardar el resultado
        resultado = a + b;//operacion
        
        System.out.println(resultado);//imprimimos el resultado
}
}
*/
//las funciones main contienen el codigo que se ejecuta
//los parametros son variables que se pasan al metodo y solo existen dentro del metodo o funcion
//el tipo de retorno se ubica antes del nombre del metodo o funcion Ej: public static =>int<= suma(int a, int b)
//El cuerpo de la funcion o metodo es todo lo que esta entre las llaves {}
//dos formas de pasarle parámetros o valores a una funcion o metodo: paso por valor o paso por referencia paso por valor: se pasa una copia del valor de la variable, se copia el valor y el tipo de dato de la variable y se pasa a la funcion, se crea un doble dato del procedimiento al llamar la función
//paso por referencia: se pasa la dirección de memoria de la variable como parámetro,  se pasa la variable y el tipo de dato de la variable y se pasa a la funcion, y se modifica se crea un doble dato del procedimiento al llamar la función, no crea una copia del valor de la variable
//Ejemplo paso por referencia:
public class Main {
    public static void main(String[] args) {
        Potato miPotato = new Potato();//creamos un objeto de tipo potato
        miPotato.QuitarBrazo();//invocamos el metodo QuitaBrazo
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        System.out.println(miPotato.brazos);//imprimimos el valor de la variable brazos

    }

    public static int suma(int a, int b) { //metodo suma
        return a + b;//retornamos el resultado
    }
}
    class Potato {
        public int brazos = 0;//variable de instancia

    public void QuitarBrazo() {
        this.brazos --;//operacion
    }
//this: hace referencia al objeto actual
 }