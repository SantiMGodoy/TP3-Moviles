package com.tp3_moviles;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.tp3_moviles.databinding.ActivityMainBinding;
import com.tp3_moviles.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        binding.btnBuscar.setOnClickListener(v -> {
            String texto = binding.editTextBuscar.getText().toString();
            viewModel.buscarLibro(texto);
        });

        viewModel.getLibroEncontrado().observe(this, libro -> {
            if (libro != null) {
                Intent intent = new Intent(MainActivity.this, com.tp3_moviles.view.DetalleActivity.class);
                intent.putExtra("libro", libro);
                startActivity(intent);
            } else {
                binding.editTextBuscar.setError("Libro no encontrado");
            }
        });
    }
}