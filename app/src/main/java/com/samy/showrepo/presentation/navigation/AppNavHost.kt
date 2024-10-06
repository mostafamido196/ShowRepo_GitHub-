package com.samy.showrepo.presentation.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.samy.showrepo.presentation.screens.detail_screen.DetailScreen
import com.samy.showrepo.presentation.screens.issuse_screen.IssueListScreen
import com.samy.showrepo.presentation.screens.repo_list_screen.RepoListScreen


@Composable
fun AppNavHost(

) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.RepoListScreen.route
    ) {
        composable(route = Screens.RepoListScreen.route) {
            RepoListScreen(navController = navController)
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
            DetailScreen(navController,name.toString(),owner.toString())
            // repo details screen
        }
        composable(route = Screens.IssueScreen.route) {
            IssueListScreen(navController)
        }


    }

}