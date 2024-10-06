package com.samy.showrepo.presentation.common_component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samy.showrepo.R
import com.samy.showrepo.presentation.theme.ErrorBtn
import com.samy.showrepo.presentation.theme.OrangeGitHubProjectShowRepoTheme
import com.samy.showrepo.presentation.theme.shapes

@Composable
fun ErrorScreen(innerPadding: PaddingValues, onRetryClick:()->Unit={}) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_error), // replace with your image
            contentDescription = "Error Image",
            modifier = Modifier
                .size(280.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Oops! Something went wrong.",
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Please try again later.",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { onRetryClick()},
            modifier = Modifier
                .fillMaxWidth()
                .border(BorderStroke(2.dp, ErrorBtn), shape = shapes.small),
            shape = shapes.small,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = ErrorBtn
            )
        ) {
            Text(text = "RETRY", style = MaterialTheme.typography.titleMedium)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewErrorScreen() {
    OrangeGitHubProjectShowRepoTheme {
        ErrorScreen(PaddingValues(16.dp))
    }
}