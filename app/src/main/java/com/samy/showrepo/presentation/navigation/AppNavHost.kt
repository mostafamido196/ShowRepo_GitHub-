package com.samy.showrepo.presentation.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.samy.showrepo.presentation.screens.repo_list_screen.RepoListScreen
import com.samy.showrepo.presentation.theme.OrangeGitHubProjectShowRepoTheme
import com.samy.showrepo.presentation.theme.SetStatusBarStyle


@Composable
fun AppNavHost(

) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.RepoListScreen.route
    ) {
        composable(route = Screens.RepoListScreen.route) {
            RepoListScreen()
           // LaunchedEffect(Unit) {
//                navController.navigate(Screens.RepoDetailsScreen.passOwnerAndName("Seif", "Kotlin"))
           // }
        }

        composable(
            route = Screens.RepoDetailsScreen.route,
            arguments = listOf(
                navArgument(OWNER_ARGUMENT_KEY){
                    type = NavType.StringType
                },
                navArgument(NAME_ARGUMENT_KEY){
                    type = NavType.StringType
                }
            )
        ){ navBackStackEntry ->
            val owner = navBackStackEntry.arguments?.getString(OWNER_ARGUMENT_KEY)
            val name = navBackStackEntry.arguments?.getString(NAME_ARGUMENT_KEY)
            LaunchedEffect(Unit) {
                Log.d("Details", "owner:$owner, name: $name")
            }
            // repo details screen
        }

    }

}