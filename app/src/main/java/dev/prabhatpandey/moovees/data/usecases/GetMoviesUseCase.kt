package dev.prabhatpandey.moovees.data.usecases

import dev.prabhatpandey.moovees.data.repos.impls.MovieRepositoryImpl
import dev.prabhatpandey.moovees.data.repos.interfaces.MovieRepository

class GetMoviesUseCase(
    private val repo: MovieRepository
) {
    fun execute() = repo.getNewReleaseMovies()
}