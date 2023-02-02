public class PruebaAnimales {
    public static void main(String[] args) {

        Pinguino pingu = new Pinguino(Sexo.MACHO);
        pingu.come("palomitas");
        pingu.desliza();

        Perro rex = new Perro(Sexo.HEMBRA);
        rex.duerme();
        rex.sienta();
        rex.caza();
        rex.ladra();

        Lagarto connors = new Lagarto(Sexo.MACHO);
        connors.escondete();
        connors.duerme();
    }
}
