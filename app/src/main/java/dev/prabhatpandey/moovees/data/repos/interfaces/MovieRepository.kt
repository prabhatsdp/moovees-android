package dev.prabhatpandey.moovees.data.repos.interfaces

import dev.prabhatpandey.moovees.data.models.Genre
import dev.prabhatpandey.moovees.ui.models.Movie

interface MovieRepository {
    fun getAllGenres() : List<Genre>
    fun getNewReleaseMovies() : List<Movie>
}