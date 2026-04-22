package com.tp3_moviles.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.tp3_moviles.R;
import com.tp3_moviles.model.Libro;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {

    private List<Libro> listaLibros;
    private MutableLiveData<Libro> libroEncontrado;

    public MainViewModel() {
        listaLibros = new ArrayList<>();
        libroEncontrado = new MutableLiveData<>();

        listaLibros.add(new Libro(
                "El Principito",
                "Antoine de Saint-Exupéry",
                96,
                1943,
                List.of("Fábula", "Filosofía"),
                R.drawable.principito,
                "Un piloto perdido en el desierto conoce a un pequeño príncipe proveniente de otro planeta. A través de sus historias, el niño relata sus viajes y las enseñanzas que obtuvo, mostrando una profunda reflexión sobre la amistad, el amor y el sentido de la vida."
        ));

        listaLibros.add(new Libro(
                "Platero y yo",
                "Juan Ramón Jiménez",
                138,
                1914,
                List.of("Narrativa", "Poesía"),
                R.drawable.platero,
                "La obra narra la relación entre un hombre y su burro, Platero, en un pequeño pueblo andaluz. A través de capítulos breves y poéticos, se describen escenas cotidianas cargadas de sensibilidad, ternura y reflexión sobre la vida, la naturaleza y la inocencia."
        ));

        listaLibros.add(new Libro(
                "El Héroe de las Eras",
                "Brandon Sanderson",
                572,
                2008,
                List.of("Fantasía", "Épico"),
                R.drawable.heroe,
                "En el cierre de la primera trilogía de Nacidos de la Bruma, el mundo se encuentra al borde del colapso. Vin y Elend intentan salvar a la humanidad mientras fuerzas antiguas y poderosas se liberan. La profecía del Héroe de las Eras se pone a prueba en un desenlace lleno de sacrificio, revelaciones y destino."
        ));

        listaLibros.add(new Libro(
                "El retrato de Dorian Gray",
                "Oscar Wilde",
                254,
                1890,
                List.of("Clásico", "Filosofía", "Drama"),
                R.drawable.dorian,
                "La historia sigue a Dorian Gray, un joven de extraordinaria belleza que desea permanecer siempre joven mientras su retrato envejece en su lugar. Influenciado por una visión hedonista de la vida, Dorian se sumerge en una existencia de excesos y corrupción moral. Mientras su apariencia se mantiene intacta, el retrato refleja las consecuencias de sus actos, mostrando el deterioro de su alma."
        ));

        listaLibros.add(new Libro(
                "Las Crónicas de Narnia",
                "C.S. Lewis",
                767,
                1956,
                List.of("Fantasía", "Aventura", "Juvenil"),
                R.drawable.narnia,
                "La saga sigue las aventuras de varios niños que descubren el mundo mágico de Narnia, un lugar donde los animales hablan y la magia es real. A lo largo de los distintos libros, los protagonistas enfrentan batallas entre el bien y el mal, guiados por el león Aslan, símbolo de justicia y sabiduría. Cada historia combina elementos de fantasía con enseñanzas sobre el valor, la fe y la redención."
        ));
    }

    public LiveData<Libro> getLibroEncontrado() {
        return libroEncontrado;
    }

    public void buscarLibro(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            libroEncontrado.setValue(null);
            return;
        }

        for (Libro libro : listaLibros) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                libroEncontrado.setValue(libro);
                return;
            }
        }

        libroEncontrado.setValue(null);
    }
}