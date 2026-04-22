package com.tp3_moviles.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.tp3_moviles.databinding.ActivityDetalleBinding;
import com.tp3_moviles.model.Libro;
import com.tp3_moviles.viewmodel.DetalleViewModel;

public class DetalleActivity extends AppCompatActivity {

    private ActivityDetalleBinding binding;
    private DetalleViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(DetalleViewModel.class);

        binding.btnVolver.setOnClickListener(v -> finish());

        Libro libro = (Libro) getIntent().getSerializableExtra("libro");

        if (libro != null) {
            viewModel.setLibro(libro);
        }

        // Observar y cargar UI
        viewModel.getLibro().observe(this, l -> {
            if (l != null) {
                binding.tvTitulo.setText(l.getTitulo());
                binding.tvAutor.setText("Autor: " + l.getAutor());
                binding.tvDescripcion.setText(l.getDescripcion());
                binding.tvAnio.setText("Año: " + l.getAnio());
                binding.tvPaginas.setText("Páginas: " + l.getPaginas());

                // Categorías (las juntamos en texto)
                binding.tvCategorias.setText("Categorías: " + String.join(", ", l.getCategorias()));

                binding.imageView.setImageResource(l.getPortada());
            }
        });
    }
}