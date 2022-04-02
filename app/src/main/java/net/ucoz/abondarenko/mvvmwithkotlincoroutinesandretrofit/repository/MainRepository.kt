package net.ucoz.abondarenko.mvvmwithkotlincoroutinesandretrofit.repository

import net.ucoz.abondarenko.mvvmwithkotlincoroutinesandretrofit.network.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {
    suspend fun getAllMovies() = retrofitService.getAllMovies()
}