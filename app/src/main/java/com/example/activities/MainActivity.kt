package com.example.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        getMenuInflater().inflate(R.menu.main_menu, menu)
        menu?.findItem(R.id.about)?.setIntent(
            Intent(this, AboutActivity::class.java)
        )
        return true;
    }
}


