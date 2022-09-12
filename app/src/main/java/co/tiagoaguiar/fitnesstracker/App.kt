package co.tiagoaguiar.fitnesstracker

import android.app.Application
import co.tiagoaguiar.fitnesstracker.Model.AppDatebase

class App : Application() {

    lateinit var db: AppDatebase

    override fun onCreate() {
        super.onCreate()
        db = AppDatebase.getDatabase(this)
    }
}