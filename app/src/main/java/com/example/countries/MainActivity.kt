package com.example.countries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClicked(view:View){
        if (KenyacheckBox.isChecked)textresult.text="Kenya: Yes we talk English as first language"
        if (TanzaniacheckBox2.isChecked)textresult.text="Tanzania: Yes but we prefer swahili"
        if (UgandacheckBox3.isChecked)textresult.text="Uganda: Yes but we prefer uganda"
    }
    fun onSelect(view: View){
        if (yes.isChecked)textresult.text="Yes am a certified developer"
        if (no.isChecked)textresult.text="No am not certified"
    }
}