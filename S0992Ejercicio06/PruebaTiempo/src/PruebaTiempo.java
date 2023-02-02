public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1, 10, 30);
        Tiempo t2 = new Tiempo(2, 40, 40);
        Tiempo t3 = new Tiempo(3, 35, 10);

        System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
        System.out.println(t2 + " - " + t3 + " = " + t2.resta(t3));
    }
}
