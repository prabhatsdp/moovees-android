package dev.prabhatpandey.moovees.data.usecases

import dev.prabhatpandey.moovees.data.models.Genre
import dev.prabhatpandey.moovees.data.repos.interfaces.MovieRepository

class GetGenreUseCase(
    private val repo: MovieRepository
) {
    fun getAllGenre() : List<Genre> {
        return repo.getAllGenres()
    }
}