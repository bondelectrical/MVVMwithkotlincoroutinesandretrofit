package net.ucoz.abondarenko.mvvmwithkotlincoroutinesandretrofit.util

import net.ucoz.abondarenko.mvvmwithkotlincoroutinesandretrofit.model.Movie

object ValidationUtil {

    fun validateMovie(movie: Movie) : Boolean {
        if (movie.name.isNotEmpty() && movie.category.isNotEmpty()) {
            return true
        }
        return false
    }
}