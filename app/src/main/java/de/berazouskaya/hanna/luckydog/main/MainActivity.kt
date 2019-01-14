package de.berazouskaya.hanna.luckydog.main

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import de.berazouskaya.hanna.luckydog.R
import de.berazouskaya.hanna.luckydog.main.base.BaseActivity
import kotlinx.android.synthetic.main.main_activity.*
import java.util.*
import de.berazouskaya.hanna.luckydog.main.utils.setText

class MainActivity : BaseActivity() {

    var startDateValue : Calendar = Calendar.getInstance()
    val datePickerDialog by lazy {
        val d =  DatePickerDialog(this,
        DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            startDateValue.set(Calendar.YEAR, year)
            startDateValue.set(Calendar.MONTH, month)
            startDateValue.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            startDate.setText(startDateValue.time)
        },
        startDateValue.get(Calendar.YEAR),
        startDateValue.get(Calendar.MONTH),
        startDateValue.get(Calendar.DAY_OF_MONTH))
        d.datePicker.minDate = startDateValue.timeInMillis
        d
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        startDate.setText(startDateValue.time)
        startDate.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            if (!datePickerDialog.isShowing){
                datePickerDialog.show()
            }
        }
        startDate.setOnClickListener {
            if (!datePickerDialog.isShowing){
                datePickerDialog.show()
            }
        }
    }
}