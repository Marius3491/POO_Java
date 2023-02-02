public class PruebaCaballo {
    public static void main(String[] args) {
            //Creamos
        Caballo a = new Caballo("Epona", "marron", 6, 24);
        Caballo l = new Caballo("Sleipnir", "negro", 8, 61);
            //Muestra de atributos y de instancias.
        System.out.println("Hola, me llamo " + a.getNombre());
        a.cabalga();
        a.relincha();

        System.out.println("Hola, yo soy " + l.getNombre());
        l.come();
        l.cabalga();
    }
}
