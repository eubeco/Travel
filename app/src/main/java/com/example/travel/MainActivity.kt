package com.example.travel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array_cards_view = ArrayList<CardView>()
        array_cards_view.add(CardView("Card1", R.drawable.ballena))
        array_cards_view.add(CardView("Card2", R.drawable.margaritas ))
        array_cards_view.add(CardView("Card3", R.drawable.bosque))
        array_cards_view.add(CardView("Card4", R.drawable.rio))
        array_cards_view.add(CardView("Card5", R.drawable.rocosas))
        array_cards_view.add(CardView("Card6", R.drawable.sunset))
        array_cards_view.add(CardView("Card7", R.drawable.tortuga))
        array_cards_view.add(CardView("Card8", R.drawable.tucan))

        val lista_cards_view = findViewById(R.id.lista_cards_view) as ListView

        val adaptador = CardViewAdapter(this, array_cards_view)

        lista_cards_view.adapter = adaptador

        lista_cards_view.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, v: View, position: Int, id: Long) {
                Toast.makeText(this@MainActivity, "" + position, Toast.LENGTH_SHORT).show()
            }
        })
    }
}
