package com.uriel.itesogram.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.parse.ParseObject
import com.parse.ParseQuery
import com.uriel.itesogram.R
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find

class SaveInParse : AppCompatActivity() {

    private lateinit var etValue: EditText
    private lateinit var btnSaveValue: Button
    private lateinit var tvValue: TextView
    private lateinit var btnGetValue: Button

    private val CLASS_NAME = "Tarea"
    private val EXPEDIENT = "expediente"
    private val VALUE = "valor"
    private val ESTUDENT_EXPEDIENT = "il729912"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save_in_parse)

        etValue = find(R.id.activity_save_in_parse_et_value)
        btnSaveValue = find(R.id.activity_save_in_parse_btn_save_value)
        tvValue = find(R.id.activity_save_in_parse_tv_value)
        btnGetValue = find(R.id.activity_save_in_parse_btn_get_value)

        btnSaveValue.setOnClickListener {
            val value = etValue.text.toString()
            etValue.setText("")

            val studentObj = ParseObject(CLASS_NAME)
            studentObj.put(EXPEDIENT, ESTUDENT_EXPEDIENT)
            studentObj.put(VALUE, value)
            studentObj.saveInBackground()
        }

        btnGetValue.setOnClickListener {
            doAsync {
                val query = ParseQuery<ParseObject>(CLASS_NAME)
                query.whereEqualTo(EXPEDIENT, ESTUDENT_EXPEDIENT)
                query.addDescendingOrder("createdAt")
                query.getFirstInBackground {obj, e->
                    if (e == null) {
                        tvValue.text = obj[VALUE] as String
                    } else {
                        error {e}
                    }
                }
            }
        }
    }
}
