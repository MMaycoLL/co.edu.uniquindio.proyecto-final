package co.edu.uniquindio.proyectofinal.grafo;

public class Main {

    public static void main(String args[]) {

        Grafo<String> matriz = new Grafo<>();
//---------------------------------------------NODOS----------------------------------------//
        matriz.agregarVertice("Centro1", "Contenido generico del vertice");
        matriz.agregarVertice("Centro2", "Contenido generico del vertice");
        matriz.agregarVertice("Centro3", "Contenido generico del vertice");
        matriz.agregarVertice("Centro4", "Contenido generico del vertice");
        matriz.agregarVertice("Centro5", "Contenido generico del vertice");
        matriz.agregarVertice("Centro6", "Contenido generico del vertice");

        matriz.agregarVertice("Azul1", "Contenido generico del vertice");
        matriz.agregarVertice("Azul2", "Contenido generico del vertice");
        matriz.agregarVertice("Azul3", "Contenido generico del vertice");
        matriz.agregarVertice("Azul4", "Contenido generico del vertice");
        matriz.agregarVertice("Azul5", "Contenido generico del vertice");
        matriz.agregarVertice("Azul6", "Contenido generico del vertice");

        matriz.agregarVertice("Verde1", "Contenido generico del vertice");
        matriz.agregarVertice("Verde2", "Contenido generico del vertice");
        matriz.agregarVertice("Verde3", "Contenido generico del vertice");
        matriz.agregarVertice("Verde4", "Contenido generico del vertice");
        matriz.agregarVertice("Verde5", "Contenido generico del vertice");
        matriz.agregarVertice("Verde6", "Contenido generico del vertice");

        matriz.agregarVertice("Amarillo1", "Contenido generico del vertice");
        matriz.agregarVertice("Amarillo2", "Contenido generico del vertice");
        matriz.agregarVertice("Amarillo3", "Contenido generico del vertice");
        matriz.agregarVertice("Amarillo4", "Contenido generico del vertice");
        matriz.agregarVertice("Amarillo5", "Contenido generico del vertice");
        matriz.agregarVertice("Amarillo6", "Contenido generico del vertice");

        matriz.agregarVertice("Naranja1", "Contenido generico del vertice");
        matriz.agregarVertice("Naranja2", "Contenido generico del vertice");
        matriz.agregarVertice("Naranja3", "Contenido generico del vertice");
        matriz.agregarVertice("Naranja4", "Contenido generico del vertice");
        matriz.agregarVertice("Naranja5", "Contenido generico del vertice");
        matriz.agregarVertice("Naranja6", "Contenido generico del vertice");

        matriz.agregarVertice("Rojo1", "Contenido generico del vertice");
        matriz.agregarVertice("Rojo2", "Contenido generico del vertice");
        matriz.agregarVertice("Rojo3", "Contenido generico del vertice");
        matriz.agregarVertice("Rojo4", "Contenido generico del vertice");
        matriz.agregarVertice("Rojo5", "Contenido generico del vertice");
        matriz.agregarVertice("Rojo6", "Contenido generico del vertice");

        matriz.agregarVertice("Violeta1", "Contenido generico del vertice");
        matriz.agregarVertice("Violeta2", "Contenido generico del vertice");
        matriz.agregarVertice("Violeta3", "Contenido generico del vertice");
        matriz.agregarVertice("Violeta4", "Contenido generico del vertice");
        matriz.agregarVertice("Violeta5", "Contenido generico del vertice");
        matriz.agregarVertice("Violeta6", "Contenido generico del vertice");

        //-------------------------------PESOS---------------------------------//
        matriz.nuevoArco("Centro1", "Centro2", 3);
        matriz.nuevoArco("Centro2", "Centro3", 3);
        matriz.nuevoArco("Centro3", "Centro4", 3);
        matriz.nuevoArco("Centro4", "Centro5", 3);
        matriz.nuevoArco("Centro5", "Centro6", 3);
        matriz.nuevoArco("Centro6", "Centro1", 3);

        matriz.nuevoArco("Azul1", "Azul2", 2);
        matriz.nuevoArco("Azul2", "Azul3", 2);
        matriz.nuevoArco("Azul3", "Azul4", 2);
        matriz.nuevoArco("Azul4", "Azul5", 2);
        matriz.nuevoArco("Azul5", "Azul6", 2);
        matriz.nuevoArco("Azul6", "Azul1", 2);

        matriz.nuevoArco("Verde1", "Verde2", 2);
        matriz.nuevoArco("Verde2", "Verde3", 2);
        matriz.nuevoArco("Verde3", "Verde4", 2);
        matriz.nuevoArco("Verde4", "Verde5", 2);
        matriz.nuevoArco("Verde5", "Verde6", 2);
        matriz.nuevoArco("Verde6", "Verde1", 2);

        matriz.nuevoArco("Amarillo1", "Amarillo2", 2);
        matriz.nuevoArco("Amarillo2", "Amarillo3", 2);
        matriz.nuevoArco("Amarillo3", "Amarillo4", 2);
        matriz.nuevoArco("Amarillo4", "Amarillo5", 2);
        matriz.nuevoArco("Amarillo5", "Amarillo6", 2);
        matriz.nuevoArco("Amarillo6", "Amarillo1", 2);

        matriz.nuevoArco("Naranja1", "Naranja2", 2);
        matriz.nuevoArco("Naranja2", "Naranja3", 2);
        matriz.nuevoArco("Naranja3", "Naranja4", 2);
        matriz.nuevoArco("Naranja4", "Naranja5", 2);
        matriz.nuevoArco("Naranja5", "Naranja6", 2);
        matriz.nuevoArco("Naranja6", "Naranja1", 2);

        matriz.nuevoArco("Rojo1", "Rojo2", 2);
        matriz.nuevoArco("Rojo2", "Rojo3", 2);
        matriz.nuevoArco("Rojo3", "Rojo4", 2);
        matriz.nuevoArco("Rojo4", "Rojo5", 2);
        matriz.nuevoArco("Rojo5", "Rojo6", 2);
        matriz.nuevoArco("Rojo6", "Rojo1", 2);

        matriz.nuevoArco("Violeta1", "Violeta2", 2);
        matriz.nuevoArco("Violeta2", "Violeta3", 2);
        matriz.nuevoArco("Violeta3", "Violeta4", 2);
        matriz.nuevoArco("Violeta4", "Violeta5", 2);
        matriz.nuevoArco("Violeta5", "Violeta6", 2);
        matriz.nuevoArco("Violeta6", "Violeta1", 2);

        //-----------------------PERIFERIA-INDIVIDUAL-----------------------------------------------------------//

        matriz.nuevoArco("Azul4", "Violeta1", 1);
        matriz.nuevoArco("Violeta3", "Rojo6", 1);
        matriz.nuevoArco("Rojo2", "Naranja5", 1);
        matriz.nuevoArco("Naranja1", "Amarillo4", 1);
        matriz.nuevoArco("Amarillo6", "Verde3", 1);
        matriz.nuevoArco("Verde5", "Azul2", 1);


        //-----------------------------PERIFERIA-UNION----------------------------------------------------//

        matriz.nuevoArco("Centro6", "Azul3", 1);
        matriz.nuevoArco("Azul3", "Centro6", 1);

        matriz.nuevoArco("Centro5", "Violeta2", 1);
        matriz.nuevoArco("Violeta2", "Centro5", 1);

        matriz.nuevoArco("Centro4", "Rojo1", 1);
        matriz.nuevoArco("Rojo1", "Centro4", 1);

        matriz.nuevoArco("Centro3", "Naranja6", 1);
        matriz.nuevoArco("Naranja6", "Centro3", 1);

        matriz.nuevoArco("Centro2", "Amarillo5",1);
        matriz.nuevoArco("Amarillo5", "Centro2",1);

        matriz.nuevoArco("Centro1", "Verde4",1);
        matriz.nuevoArco("Verde4", "Centro1",1);


        System.out.println(matriz);

        System.out.println(matriz.rutaMasCorta(matriz.buscarVertice("Centro1"), matriz.buscarVertice("Rojo3")));
    }
}
