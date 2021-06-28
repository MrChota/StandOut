package com.standout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import wei.mark.standout.StandOutWindow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StandOutWindow.closeAll(this, AppWindow::class.java)
        StandOutWindow.show(this, AppWindow::class.java, 1)
        finish()
    }
}