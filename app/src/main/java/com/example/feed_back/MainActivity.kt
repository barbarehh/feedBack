package com.example.feed_back

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var chek1: CheckBox
    private lateinit var chek2: CheckBox
    private lateinit var saxeli: EditText
    private lateinit var gvari: EditText
    private lateinit var teqsti: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        chek1=findViewById(R.id.chek1)
        chek2=findViewById(R.id.chek2)
        saxeli=findViewById(R.id.saxeli)
        gvari=findViewById(R.id.gvari)
        teqsti=findViewById(R.id.teqsti)
        button=findViewById(R.id.button)
        button.setOnClickListener {
            if (chek1.isChecked && chek2.isChecked || !chek1.isChecked && !chek2.isChecked ) {
                Toast.makeText(this, "გთხოვთ,აირჩიოთ კი ან არა", Toast.LENGTH_SHORT).show()
            } else if ( saxeli.text.toString()==""||gvari.text.toString()==""
                ||teqsti.text.toString()==""){
                Toast.makeText(this, "გთხოვთ, უპასუხეთ ორივე შეკითხვას", Toast.LENGTH_SHORT).show()
            }else if(saxeli.text.toString().length<3){
                Toast.makeText(this, "სახელი არ არსებობს", Toast.LENGTH_SHORT).show()
            }else if (gvari.text.toString().length<5){
                Toast.makeText(this, "გვარი არ არსებობს", Toast.LENGTH_SHORT).show()
            }else if (teqsti.text.toString().length<10){
                Toast.makeText(this, "ტექსტი უნდა შეიცავდეს მინიმუმ 10 სიმბოლოს", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "წარმატებით გაიგზავნა :)", Toast.LENGTH_SHORT).show()
            }
        }
    }
}