package com.samy.showrepo.presentation.common_component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.placeholder.placeholder
import com.samy.showrepo.presentation.theme.LightGray_Simmer


@Composable
fun ShimmerListItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)

    ) {
        Box(
            modifier = Modifier
                .padding(top = 12.dp, start = 12.dp)
                .size(50.dp)
                .clip(CircleShape)
                .placeholder(visible = true, color = LightGray_Simmer)
        )

        Column(
            Modifier.padding(12.dp)
        ) {
            Row {
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .width(100.dp)
                        .height(16.dp)
                        .placeholder(visible = true, color = LightGray_Simmer)
                )
                Spacer(Modifier.weight(1f))
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .width(32.dp)
                        .height(12.dp)
                        .placeholder(visible = true, color = LightGray_Simmer)
                )
            }
            Spacer(Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .width(100.dp)
                    .height(16.dp)
                    .placeholder(visible = true, color = LightGray_Simmer)
            )
            Spacer(Modifier.height(10.dp))
            Box(Modifier.padding(end = 24.dp)) {
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .fillMaxWidth()
                        .height(22.dp)
                        .placeholder(visible = true, color = LightGray_Simmer)
                )
            }


        }

    }
    Spacer(
        Modifier
            .height(4.dp)
            .fillMaxWidth()
            .background(
                LightGray_Simmer
            )
            .height(6.dp)
    )
}

@Composable
fun ShimmerList(innerPadding: PaddingValues=PaddingValues(16.dp)) {

    Box(
        Modifier.padding(
            top = innerPadding.calculateTopPadding() - 6.dp,
        )
    ) {
        Column {
            repeat(8) {
                ShimmerListItem()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewShimmerList() {
    MaterialTheme {
        Surface {
            ShimmerList() // Preview the shimmer list
        }
    }
}
