public class Main {

    public static void main(String[] args) {

        ArbolBinarioBusqueda<Integer> arbol = new ArbolBinarioBusqueda<>(50);

        arbol.add(30);
        arbol.add(70);
        arbol.add(20);
        arbol.add(40);
        arbol.add(60);
        arbol.add(80);

        System.out.println("BUSQUEDA ITERATIVA");

        if (arbol.buscarIterativo(40) != null)
            System.out.println("Elemento encontrado");

        System.out.println("\nELIMINANDO 30");
        arbol.remove(30);

        System.out.println("\nMODIFICANDO 60 -> 65");
        arbol.modificar(65, 60);

        if (arbol.buscarIterativo(65) != null)
            System.out.println("Elemento modificado correctamente");
    }
}