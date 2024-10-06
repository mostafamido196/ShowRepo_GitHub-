package com.samy.showrepo.presentation.screens.issuse_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.samy.showrepo.R
import com.samy.showrepo.presentation.common_component.AppBar
import com.samy.showrepo.presentation.common_component.ErrorScreen
import com.samy.showrepo.presentation.common_component.ShimmerList
import com.samy.showrepo.presentation.screens.issuse_screen.component.IssueItem
import com.samy.showrepo.presentation.screens.repo_list_screen.component.RepoItem
import com.samy.showrepo.presentation.theme.OrangeGitHubProjectShowRepoTheme
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IssueListScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        topBar = {
            AppBar(
                title = R.string.issues_app_bar_title,
                showBackButton = true,
                onBackButtonClicked = {
                    navController.popBackStack()

                }
            )
        }
    ) { innerPadding ->

        var isLoading by remember { mutableStateOf(1) }

        LaunchedEffect(Unit) {
            delay(2 * 1000)
//            isLoading = 2
//            delay(2 * 1000)
            isLoading = 3
        }

        when (isLoading) {
            1 -> {
                ShimmerList(innerPadding)
            }

//            2 -> {
//                ErrorScreen(innerPadding)
//            }

            else -> {
                IssueList(innerPadding)
            }
        }

    }

}

@Composable
fun IssueList(innerPadding: PaddingValues) {
    LazyColumn(
        Modifier
            .padding(innerPadding)
            .padding(horizontal = 16.dp)
            .padding(bottom = 16.dp)
    ) {
        items(listOf("Repo1", "Repo2", "Repo3", "Repo4", "Repo5")) { repoItem ->
            IssueItem()
        }
    }
}

@Preview
@Composable
private fun PreviewIssueListScreen() {
    OrangeGitHubProjectShowRepoTheme {
//        IssueListScreen()
    }
}


