package com.uriel.itesogram.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.uriel.itesogram.R
import org.jetbrains.anko.find

class ActivityRegister : AppCompatActivity() {

    private lateinit var etEmail: EditText
    private lateinit var etName: EditText
    private lateinit var etPassword: EditText
    private lateinit var rbtngGenders: RadioGroup
    private lateinit var rbtnFemale: RadioButton
    private lateinit var rbtnMale: RadioButton
    private lateinit var rbtnOther: RadioButton
    private lateinit var btnRegister: Button

    private val USER_EMAIL = "userEmail"
    private val USER_NAME = "userName"
    private val USER_PASSWORD = "userPassword"
    private val USER_GENDER = "userGender"

    private val FEMALE = "female"
    private val MALE = "male"
    private val OTHER = "other"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        findViews()

        btnRegister.setOnClickListener {
            Toast.makeText(this, "Nice!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun findViews() {
        etEmail = find(R.id.activity_register_et_email)
        etName = find(R.id.activity_register_et_name)
        etPassword = find(R.id.activity_register_et_password)
        rbtngGenders = find(R.id.activity_register_rbtng_genders)
        rbtnFemale = find(R.id.activity_register_rbtn_female)
        rbtnMale = find(R.id.activity_register_rbtn_male)
        rbtnOther = find(R.id.activity_register_rbtn_other)
        btnRegister = find(R.id.activity_register_btn_register)
    }

    /*override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        Toast.makeText(this, "RESTORE", Toast.LENGTH_SHORT).show()

        val email = savedInstanceState.getString(USER_EMAIL)
        val name = savedInstanceState.getString(USER_NAME)
        val password = savedInstanceState.getString(USER_PASSWORD)
        val gender = savedInstanceState.getString(USER_GENDER)

        etEmail.setText(email)
        etName.setText(name)
        etPassword.setText(password)
        when(gender) {
            FEMALE -> {
                rbtnFemale.isChecked
            } MALE -> {
                rbtnMale.isChecked
            } OTHER -> {
                rbtnOther.isChecked
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Toast.makeText(this, "SAVE", Toast.LENGTH_SHORT).show()

        val email = etEmail.text.toString()
        val name = etName.text.toString()
        val password = etPassword.text.toString()
        val gender = when(rbtngGenders.checkedRadioButtonId) {
            rbtnMale.id -> {
                MALE
            } rbtnOther.id -> {
                OTHER
            } else -> {
                FEMALE
            }
        }

        outState.putString(USER_EMAIL, email)
        outState.putString(USER_NAME, name)
        outState.putString(USER_PASSWORD, password)
        outState.putString(USER_GENDER, gender)
    }*/
}
