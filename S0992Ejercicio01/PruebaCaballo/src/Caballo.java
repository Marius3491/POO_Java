public class Caballo {
    String nombre;
    String color;
    int edad;
    int carrerasGanadas;

    Caballo(String n, String c, int e, int cg){
        this.nombre = n;
        this.color = c;
        this.edad = e;
        this.carrerasGanadas = cg;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void cabalga(){
        System.out.println("*SONIDO DE TROTE*");
    }

    public void relincha(){
        System.out.println("*SONIDO DE RELINCHE*");
    }

    public void come(){
        System.out.println("*SONIDO DE COMER*");
    }
}
