package org.insbaixcamp.aplicacio

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var boton: Button
    private lateinit var imagen: ImageView
    private lateinit var frase: TextView
    private val imagenes = listOf(
        R.drawable.emilio,
        R.drawable.joseluis,
        R.drawable.mourhino,
        R.drawable.pedro,
        R.drawable.pereira,
        R.drawable.rajoy,
        R.drawable.raulll,
        R.drawable.rufi,
        R.drawable.salvador,
        R.drawable.vini
    )
    private val frases = listOf(
        "Por favor, apaguen sus teléfonos móviles. No porque vayan a interferir con el sonido... sino porque van a interferir con sus vidas",
        "¡No podéis tapar la realidad de 17 años pagando al vicepresidente de los árbitros! ¡17 años!",
        "¿Por qué? ¿Por qué Ovrebo? ¿Por qué Busacca? ¿Por qué De Bleeckere? ¿Por qué Stark? ¿Por qué en todas las semifinales pasa lo mismo? Es un equipo fantástico... pero ¿por qué? No sé si es la publicidad de UNICEF, no sé si es el poder de Villar en la UEFA... ¡no entiendo",
        "Son las cinco y no he comido",
        "Que dixes",
        "Es el vecino el que elige al alcalde y es el alcalde el que quiere que sean los vecinos el alcalde",
        "Solicítala aunque creas que no te la van a dar. Es gratis pedirla, pero si no la pides, el 'no' ya lo tienes seguro.",
        "Hasta luego, gángster, nos veremos en el infierno",
        "Holaaa soc Salvador Oliver de Habitalian Consulting",
        "Eu farei 10x se for preciso. Eles não estão preparados",

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        boton = findViewById(R.id.boton)
        imagen = findViewById(R.id.imageView)
        frase = findViewById(R.id.textView2)
        boton.setOnClickListener {
            generarFrase()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())

            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }
    }
    private fun generarFrase() {
        val numero = Random.nextInt(imagenes.size)
        imagen.setImageResource(imagenes[numero])
        frase.text = frases[numero]
    }
}
