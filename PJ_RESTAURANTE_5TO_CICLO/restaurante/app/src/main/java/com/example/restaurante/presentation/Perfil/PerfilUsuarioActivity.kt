package com.example.restaurante.presentation.Perfil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.restaurante.databinding.ActivityPerfilUsuarioBinding
import com.example.restaurante.presentation.Perfil.EditarPerfil.EditarPerfilActivity
import com.example.restaurante.presentation.Perfil.MisDirecciones.MisDireccionesActivity
import com.example.restaurante.presentation.Perfil.MisPedidos.MisPedidosActivity
import com.example.restaurante.presentation.Perfil.MisTarjetas.MisTarjetasActivity

class PerfilUsuarioActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPerfilUsuarioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfilUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initValues()
    }

    private fun initValues() {

        binding.btnEditar.setOnClickListener {
            startActivity(Intent(this, EditarPerfilActivity::class.java))
        }
        binding.btnDirecciones.setOnClickListener {
            startActivity(Intent(this, MisDireccionesActivity::class.java))
        }

        binding.btnPedidos.setOnClickListener {
            startActivity(Intent(this, MisPedidosActivity::class.java))
        }

        binding.btnTarjetas.setOnClickListener {
            startActivity(Intent(this, MisTarjetasActivity::class.java))
        }
    }
}