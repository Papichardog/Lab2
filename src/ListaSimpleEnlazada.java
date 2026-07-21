public class ListaSimpleEnlazada {
    private Nodo primero;
    private int longitud;

    public ListaSimpleEnlazada() {
        this.primero = null;
        this.longitud = 0;
    }

    //Inserta un nuevo elemento al final de la lista.

    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.obtenerSiguiente() != null) {
                actual = actual.obtenerSiguiente();
            }
            actual.enlazarSiguiente(nuevo);
        }
        longitud++;
    }

    //Borra la primera ocurrencia del valor indicado.
     //Retorna true si se eliminó un nodo, false si no se encontró el valor.

    public boolean borrar(int valor) {
        if (primero == null) {
            return false;
        }

        // Caso especial: el valor está en el primer nodo
        if (primero.obtenerValor() == valor) {
            primero = primero.obtenerSiguiente();
            longitud--;
            return true;
        }

        Nodo actual = primero;
        Nodo anterior = null;

        while (actual != null && actual.obtenerValor() != valor) {
            anterior = actual;
            actual = actual.obtenerSiguiente();
        }

        // No se encontró el valor
        if (actual == null) {
            return false;
        }

        // Se enlaza el anterior con el siguiente del nodo eliminado
        anterior.enlazarSiguiente(actual.obtenerSiguiente());
        longitud--;
        return true;
    }

   // Modifica el valor almacenado en la posición indicada (0-indexado).
     //Retorna true si la modificación fue exitosa, false si la posición
      //está fuera de rango.

    public boolean modificarElemento(int posicion, int nuevoValor) {
        if (posicion < 0 || posicion >= longitud) {
            return false;
        }

        Nodo actual = primero;
        for (int i = 0; i < posicion; i++) {
            actual = actual.obtenerSiguiente();
        }
        actual.asignarValor(nuevoValor);
        return true;
    }


     //Retorna la cantidad de elementos que contiene la lista.

    public int obtenerLongitud() {
        return longitud;
    }

    //Indica si la lista está vacía.

    public boolean estaVacia() {
        return longitud == 0;
    }

    //Retorna el valor almacenado en el primer nodo de la lista.
     //Lanza una excepción si la lista está vacía.

    public int obtenerPrimero() {
        if (primero == null) {
            throw new IllegalStateException("La lista esta vacia");
        }
        return primero.obtenerValor();
    }
}
