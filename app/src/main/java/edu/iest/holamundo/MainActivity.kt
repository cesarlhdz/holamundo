package edu.iest.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var tvGreeting: TextView? = null
    //private lateinit var tvGreeting: TextView //lateinit solo para var global de Vistas

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // var tvGreeting: TextView
        setContentView(R.layout.activity_main)
        //tvGreeting = findViewById(R.id.tvSaludo)
        cambiarMensaje()
        cambiarMensaje()
        // tvGreeting.text = getString(R.string.despedida)
    }

    private fun cambiarMensaje(){
        val mensaje_original:String
        mensaje_original = tvGreeting?.text.toString()
            Toast.makeText(this,"Tu mensaje original era "+mensaje_original+ " :) ",Toast.LENGTH_LONG).show()
    }

    private fun cambiarMensaje(tipo:Int){
        if(tipo == 1){
            tvGreeting!!.text = getString(R.string.despedida)
        } else {
            Toast.makeText(this, "El tipo es $tipo", Toast.LENGTH_SHORT).show()
        }
    }
}
