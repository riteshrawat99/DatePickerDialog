package com.pupup.datepickerdialog

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datePickerDialog : Button = findViewById(R.id.dialog_button)
        val getDate : TextView = findViewById(R.id.getDate)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        datePickerDialog.setOnClickListener {
            val dpd = DatePickerDialog(this,DatePickerDialog.OnDateSetListener { datePicker, i, i2, i3 ->
                getDate.text= "${i}/${i2+1}/${i3}"
            },year,month,day)
            dpd.show()
        }
    }
}