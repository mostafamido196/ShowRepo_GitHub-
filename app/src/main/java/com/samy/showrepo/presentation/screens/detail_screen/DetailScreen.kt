package com.samy.showrepo.presentation.screens.detail_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.samy.showrepo.R
import com.samy.showrepo.presentation.common_component.AppBar
import com.samy.showrepo.presentation.navigation.Screens
import com.samy.showrepo.presentation.theme.ClickBtn
import com.samy.showrepo.presentation.theme.OrangeGitHubProjectShowRepoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavHostController, param1: String, param2: String) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        topBar = {
            AppBar(
                title = R.string.details_app_bar_title,
                showBackButton = true,
                onBackButtonClicked = {
                    navController.popBackStack()
                }
            )

        },
        content = { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        PaddingValues(
                            top = innerPadding.calculateTopPadding(),
                            bottom = 32.dp,
                            start = 28.dp,
                            end = 28.dp

                        )
                    )
            ) {
                Column(
                    modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Spacer(modifier = Modifier.height(20.dp))
                    Image(
                        painter = painterResource(id = R.drawable.ic_google), // Replace with your image
                        contentDescription = "Center Image",
                        modifier = Modifier.size(200.dp)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Language",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    val spaceBetweenRowElementPairs = 20.dp
                    val spaceBetweenTxtImg = 4.dp
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "1525",
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Spacer(modifier = Modifier.width(spaceBetweenTxtImg))
                        Icon(
                            painter = painterResource(id = R.drawable.ic_star), // Replace with your image
                            tint = Color.Yellow,
                            contentDescription = "python",
                            modifier = Modifier.size(36.dp)
                        )
                        Spacer(modifier = Modifier.width(spaceBetweenRowElementPairs))

                        Text(
                            "python",
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Spacer(modifier = Modifier.width(spaceBetweenTxtImg))
                        Box(
                            modifier = Modifier
                                .size(20.dp) // The size of the circle (adjust as needed)
                                .clip(CircleShape) // Clip the content to a circular shape
                                .background(Color.Blue), // Set the background color to blue

                        )
                        Spacer(modifier = Modifier.width(spaceBetweenRowElementPairs))

                        Text(
                            "347",
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Spacer(modifier = Modifier.width(spaceBetweenTxtImg))
                        Image(
                            painter = painterResource(id = R.drawable.ic_fork), // Replace with your image
                            contentDescription = "Icon 3",
                            modifier = Modifier.size(40.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        "Shared repository for open-sourced projects for google Ai language",
                        style = MaterialTheme.typography.titleSmall
                    )

                }
                Button(
                    onClick = {
                        navController.navigate(Screens.IssueScreen.route)
                    },
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth()
                        .height(48.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = ClickBtn,
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(8.dp) // Optional: Add rounded corners
                ) {
                    Text("Show Issues", style = MaterialTheme.typography.titleMedium)
                }
            }
        }
    )
}

@Preview
@Composable
private fun PreviewRepoListScreen() {
    OrangeGitHubProjectShowRepoTheme {
//        DetailScreen(navController, "", "")
    }
}
