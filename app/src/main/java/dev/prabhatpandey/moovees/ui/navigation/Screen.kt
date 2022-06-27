package dev.prabhatpandey.moovees.ui.navigation

sealed class Screen(val route: String){
    object MainScreen : Screen("main")
    object DetailScreen: Screen("details")

    fun withArgs(vararg args: String) : String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
