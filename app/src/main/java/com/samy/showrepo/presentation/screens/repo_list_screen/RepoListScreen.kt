package com.samy.showrepo.presentation.screens.repo_list_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samy.showrepo.R
import com.samy.showrepo.presentation.common_component.AppBar
import com.samy.showrepo.presentation.screens.repo_list_screen.component.RepoItem
import com.samy.showrepo.presentation.theme.OrangeGitHubProjectShowRepoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RepoListScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        topBar = {
            AppBar(
                title = R.string.app_name,
                showBackButton = false
            )
        }
    ) { innerPadding ->
        LazyColumn(
            Modifier.padding(innerPadding)
                .padding(horizontal = 16.dp)
                .padding(bottom = 16.dp)
        ) {
            items(listOf("Repo1", "Repo2", "Repo3", "Repo4", "Repo5")) { repoItem ->
                RepoItem()
            }
        }
    }

}

@Preview
@Composable
private fun PreviewRepoListScreen() {
    OrangeGitHubProjectShowRepoTheme  {
        RepoListScreen()
    }
}


