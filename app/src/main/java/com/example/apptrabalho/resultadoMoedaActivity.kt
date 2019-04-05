package com.example.apptrabalho

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado_moeda.*

class resultadoMoedaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_moeda)


        val dados : Bundle = intent.extras
        val num = dados.getInt("num")


        if(num == 0){

            ivmoeda.setImageResource(R.drawable.moeda_cara)
            tvCaraouCoroa.setText("Cara !!")
        }else if(num == 1){

            ivmoeda.setImageResource(R.drawable.moeda_coroa)
            tvCaraouCoroa.setText("Coroa !!!")
        }else{

            ivmoeda.setImageResource(R.drawable.homem_procura)
            tvCaraouCoroa.setText("Moeda não Encontrada")
        }

        BVoltar.setOnClickListener {
            finish()
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }


    }
}
