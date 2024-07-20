//Ejercio Basico Programacion Orientada a Objetos Java
//Clase Contador
public class Contador {

    private int cont;

    //constructor por defecto
    public Contador() {    
    }

    //constructor con parametros
    public Contador(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    //constructor copia
    public Contador(final Contador c) {
        cont = c.cont; 
    }

    //getter 
    public int getCont() {
        return cont;
    }

    //setter 
    public void setCont(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    //metodo incrementar contador
    public void incrementar() {
        cont++;
    }

    //metodo decrementar contador
    public void decrementar() {
        cont--;
        if (cont < 0) {
            cont = 0;
        }
    }
}//Fin de la clase Contador

//Un metodo main para probar la clase puede ser este:

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //utilizar el constructor por defecto
    Contador contador1 = new Contador();

    int n;
    System.out.printIn("Introduce valor para inicializar el contador: ");
    n = sc.nexInt();

    //asignar un valor al contador
    contador1.setCont(n);
    //incrementar el contador
    contado.incrementar();
    //mostrar el valor actual
    System.out.printIn(contador1.getCont());

    contador1.incrementar();
    contador1.incrementar();

    //mostrar el valor actual
    System.out.printIn(contador1.getCont());

    //restar 1 el valor del contador
    contador1.decrementar();

    //mostrar el valor actual
    System.out.printIn(contador1.getCont());

    //crear un nuevo objeto Contador con valor inicial 10
    Contador contador2 = new Contador(10);

    //incrementar y decrementar el contador2 y mostrar su valor
    contador2.incrementar();
    System.out.printIn(contador2.getCont());
    contador2.decrementar();
    System.out.printIn(contador2.getCont());

    //crear un objeto contado utilizando el constructor copia
    //se crea el objeto contador3 como copia de contador2
    Contador contador3 = new Contador(contador2);

    //mostrar el valor de contador3
    System.out.printIn(contador3.getCont());

}//Ejercicio basico POO Java. Clase Principal
