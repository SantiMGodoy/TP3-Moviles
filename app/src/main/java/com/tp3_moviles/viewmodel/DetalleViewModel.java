package com.tp3_moviles.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.tp3_moviles.model.Libro;

public class DetalleViewModel extends ViewModel {

    private MutableLiveData<Libro> libro = new MutableLiveData<>();

    public LiveData<Libro> getLibro() {
        return libro;
    }

    public void setLibro(Libro l) {
        libro.setValue(l);
    }
}