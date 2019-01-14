package de.berazouskaya.hanna.luckydog.main.utils

import android.widget.EditText
import java.text.SimpleDateFormat
import java.util.*

fun EditText.setText(date : Date) {
    this.setText(SimpleDateFormat.getDateInstance().format(date))
}