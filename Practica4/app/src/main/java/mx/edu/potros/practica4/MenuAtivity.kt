package mx.edu.potros.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuAtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_ativity)

        var btnAntojitos:Button=findViewById(R.id.button_antojitos) as Button

        btnAntojitos.setOnClickListener {
            cambiarPantalla("antojitos")
        }

        var btnEspecialidades:Button=findViewById(R.id.button_especialidades) as Button

        btnEspecialidades.setOnClickListener {
            cambiarPantalla("especialidades")
        }

        var btnCombinations:Button=findViewById(R.id.button_combinations) as Button

        btnCombinations.setOnClickListener {
            cambiarPantalla("combinations")
        }

        var btnTortas:Button=findViewById(R.id.button_tortas) as Button

        btnTortas.setOnClickListener {
            cambiarPantalla("tortas")
        }
        var btnSopas:Button=findViewById(R.id.button_sopas) as Button

        btnSopas.setOnClickListener {
            cambiarPantalla("sopas")
        }
        var btnDrinks:Button=findViewById(R.id.button_drinks) as Button

        btnDrinks.setOnClickListener {
            cambiarPantalla("drinks")
        }

    }

    fun cambiarPantalla(tipoMenu:String){
        var intent: Intent = Intent(this,ProductosActivity::class.java)
        intent.putExtra("menuTipo",tipoMenu)
        startActivity(intent)
    }
}