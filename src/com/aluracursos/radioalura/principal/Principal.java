package com.aluracursos.radioalura.principal;
import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela");
        miPodcast.setTitulo("Cafe.Tec");

//      Canciones
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }
        System.out.println("Total de Reproducciones: " + miCancion.getTotalReproducciones());
        System.out.println("Total de Me Gusta: " + miCancion.getTotalDeMegusta());
//      Podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }
        System.out.println("Total de reproducciones :" + miPodcast.getTotalReproducciones());
        System.out.println("Total de Me Gusta :" + miPodcast.getTotalDeMegusta());

        MisFavoritos misFavoritos = new MisFavoritos();
        misFavoritos.adicione(miPodcast);
        misFavoritos.adicione(miCancion);
    }
}
