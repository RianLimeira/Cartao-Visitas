package com.rian.cartaovisitas.data

import kotlinx.coroutines.runBlocking

class BusinessCardRepository(private val dao: BusinessCardDao) {

    fun insert(businessCard: BusinessCard) = runBlocking {
        dao.insert(businessCard)
    }

    fun getAll() = dao.getAll()
}