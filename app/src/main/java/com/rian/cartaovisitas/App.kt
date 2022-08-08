package com.rian.cartaovisitas

import android.app.Application
import com.rian.cartaovisitas.data.AppDatabase
import com.rian.cartaovisitas.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}