public class Lagarto extends Animal{
    public Lagarto() {}

    public Lagarto(Sexo s) {
        super(s);
    }

    public void tomaElSol() {
        System.out.println("Estoy tomando el Sol");
    }

    public void mueveCola() {
        System.out.println("Muevo cola");
    }

    public void escondete() {
        System.out.println("Me he escondido, ya no me puedes ver");
    }
}
