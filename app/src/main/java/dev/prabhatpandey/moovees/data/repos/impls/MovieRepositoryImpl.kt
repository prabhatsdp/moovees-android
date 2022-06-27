package dev.prabhatpandey.moovees.data.repos.impls

import dev.prabhatpandey.moovees.R
import dev.prabhatpandey.moovees.data.models.Genre
import dev.prabhatpandey.moovees.data.repos.interfaces.MovieRepository
import dev.prabhatpandey.moovees.ui.models.Movie

class MovieRepositoryImpl : MovieRepository {
    override fun getAllGenres(): List<Genre> {
        return listOf(
            Genre("Drama"),
            Genre("Action"),
            Genre("Romance"),
            Genre("Comedy"),
            Genre("Entertainment"),
            Genre("Thriller"),
            Genre("Sci-Fi"),
            Genre("Documentary"),
        )
    }

    override fun getNewReleaseMovies(): List<Movie> {
        return listOf(
            Movie(
                "Captain Marvel",
                R.drawable.image_18,
                ratingsCount = 100_000,
                ratingsAverage = 4.5
            ),
            Movie(
                "Jurassic World",
                R.drawable.image_28,
                ratingsCount = 100_000,
                ratingsAverage = 3.7
            ),
            Movie(
                "Aquaman",
                R.drawable.image_27,
                ratingsCount = 100_000,
                ratingsAverage = 3.9
            )
        )
    }
}