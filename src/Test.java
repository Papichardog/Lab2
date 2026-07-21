//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    ListaSimpleEnlazada lista = new ListaSimpleEnlazada();

    System.out.println("=== Lista Simplemente Enlazada de enteros ===\n");

    // 1. Insertar elementos
    System.out.println("--- Insertando elementos: 10, 20, 30, 40, 50 ---");
    lista.insertar(10);
    lista.insertar(20);
    lista.insertar(30);
    lista.insertar(40);
    lista.insertar(50);

    System.out.println("Contenido de la lista: " + lista);
    System.out.println("Longitud de la lista: " + lista.obtenerLongitud());

    // 2. Modificar un elemento
    System.out.println("\n--- Modificando el elemento en la posicion 2 (30 -> 99) ---");
    boolean modificado = lista.modificarElemento(2, 99);
    System.out.println("Modificacion exitosa: " + modificado);
    System.out.println("Contenido de la lista: " + lista);

    // 3. Borrar un elemento existente
    System.out.println("\n--- Borrando el valor 20 ---");
    boolean borrado = lista.borrar(20);
    System.out.println("Borrado exitoso: " + borrado);
    System.out.println("Contenido de la lista: " + lista);
    System.out.println("Longitud de la lista: " + lista.obtenerLongitud());

    // 4. Intentar borrar un valor que no existe
    System.out.println("\n--- Intentando borrar el valor 1000 (no existe) ---");
    boolean borradoFallido = lista.borrar(1000);
    System.out.println("Borrado exitoso: " + borradoFallido);

    // 5. Intentar modificar una posicion fuera de rango
    System.out.println("\n--- Intentando modificar la posicion 10 (fuera de rango) ---");
    boolean modificacionFallida = lista.modificarElemento(10, 5);
    System.out.println("Modificacion exitosa: " + modificacionFallida);

    // 6. Insertar un nuevo elemento tras las operaciones anteriores
    System.out.println("\n--- Insertando el valor 60 ---");
    lista.insertar(60);
    System.out.println("Contenido de la lista: " + lista);
    System.out.println("Longitud de la lista: " + lista.obtenerLongitud());

    // 7. Vaciar la lista para probar el caso "estaVacia"
    System.out.println("\n--- Borrando todos los elementos ---");
    while (!lista.estaVacia()) {
        lista.borrar(lista.obtenerPrimero());
    }
    System.out.println("Contenido de la lista: " + lista);
    System.out.println("¿Esta vacia? " + lista.estaVacia());
}

