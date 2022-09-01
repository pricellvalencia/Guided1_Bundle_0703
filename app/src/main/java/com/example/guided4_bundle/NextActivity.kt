package com.example.guided4_bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    private lateinit var nama: TextView
    private lateinit var nim: TextView
    private lateinit var fakultas: TextView
    private lateinit var prodi: TextView
    lateinit var mBundle: Bundle

    lateinit var vNama: String
    lateinit var vNim: String
    lateinit var vFakultas: String
    lateinit var vProdi: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        getBundle()
        setText()
    }

    fun getBundle() {
        //mengambil bundle dari acticity sebelumnya dengan menggunakan key register
        mBundle = intent.getBundleExtra("register")!!
        //mengambil data dari bundle
        vNama = mBundle.getString("nama")!!
        vNim = mBundle.getString("nim")!!
        vFakultas = mBundle.getString("fakultas")!!
        vProdi = mBundle.getString("prodi")!!
    }

    fun setText() {
        nama = findViewById(R.id.tvNama)
        nama.setText(vNama)
        nim = findViewById(R.id.tvNim)
        nim.setText(vNim)
        fakultas = findViewById(R.id.tvFakultas)
        fakultas.setText(vFakultas)
        prodi = findViewById(R.id.tvProdi)
        prodi.setText(vProdi)
    }
}