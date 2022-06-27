package dev.prabhatpandey.moovees.ui.screens.main

import android.widget.Space
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.PlatformParagraphStyle
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import dev.prabhatpandey.moovees.R
import dev.prabhatpandey.moovees.data.repos.impls.MovieRepositoryImpl
import dev.prabhatpandey.moovees.data.repos.interfaces.MovieRepository
import dev.prabhatpandey.moovees.data.usecases.GetGenreUseCase
import dev.prabhatpandey.moovees.data.usecases.GetMoviesUseCase
import dev.prabhatpandey.moovees.ui.components.buttons.SimpleTextButton
import dev.prabhatpandey.moovees.ui.components.cards.BannerCard
import dev.prabhatpandey.moovees.ui.components.cards.MovieCard
import dev.prabhatpandey.moovees.ui.components.text.BigHeading
import dev.prabhatpandey.moovees.ui.components.widgets.CustomChip
import dev.prabhatpandey.moovees.ui.components.widgets.MainAppBar
import dev.prabhatpandey.moovees.ui.models.Movie
import dev.prabhatpandey.moovees.ui.navigation.Screen
import dev.prabhatpandey.moovees.ui.theme.MooveesTheme

@OptIn(ExperimentalPagerApi::class, ExperimentalMaterialApi::class)
@Composable
fun MainScreen(navigate: (screen: Screen) -> Unit) {

    val repo = MovieRepositoryImpl()
    val getGenre = GetGenreUseCase(repo)
    val getMovies = GetMoviesUseCase(repo)
    MooveesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MainAppBar()
                HorizontalPager(
                    count = 3,
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    BannerCard(
                        onClick = {},
                        movie = Movie(
                            name = "Multiverse Of Madness",
                            R.drawable.image_25,
                            0,
                            0.0
                        )
                    )
                }
                Spacer(
                    modifier = Modifier.height(16.dp)
                )
                BigHeading(
                    text = "Genre",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                )
                LazyRow(
                    modifier = Modifier.padding(top = 8.dp),
                    contentPadding = PaddingValues(horizontal = 12.dp)
                ) {
                    itemsIndexed(items = getGenre.getAllGenre()) { i, genre ->
                        CustomChip(isChecked = i == 0, text = genre.name, onClick = {})
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(start = 16.dp, end = 8.dp)
                ) {
                    BigHeading(
                        text = "New Releases",
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    SimpleTextButton(text = "View All", onClick = {})
                }

                LazyRow(
                    modifier = Modifier.padding(top = 8.dp),
                    contentPadding = PaddingValues(horizontal = 8.dp)
                ) {
                    itemsIndexed(items = getMovies.execute()) { i, movie ->
                        MovieCard(onClick = {}, movie = movie)
                    }
                }

            }
        }
    }
}


@Preview(showBackground = true, backgroundColor = 0xFF161E29)
@Composable
fun PreviewMainScreen() {
    MainScreen(navigate = {})
}
