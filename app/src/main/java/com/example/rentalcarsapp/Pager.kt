package com.example.rentalcarsapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rentalcarsapp.ui.theme.Blur
import com.example.rentalcarsapp.ui.theme.Primary

@Preview(showBackground = true)
@Composable
fun Pager(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {

        Text(
            text = "Luxurious Cars",
            color = Color.White,
            fontSize = 25.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(horizontal = 22.dp).padding(top = 18.dp)
        )
        Row(modifier = Modifier.padding(horizontal = 50.dp).padding(top = 12.dp, bottom = 4.dp)){
            Text(
                text = "Luxurious",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.weight(1f)
            )
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "VIP Cars",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "new",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .alpha(0.7f)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Primary)
                        .padding(horizontal = 8.dp)


                )
            }
        }
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.Bottom
        ) {
            HorizontalDivider(
                modifier = Modifier.weight(1f),
                thickness = 3.dp,
                color = MaterialTheme.colorScheme.onBackground
            )
            HorizontalDivider(
                modifier = Modifier.weight(1f),
                thickness = 0.dp,
                color = MaterialTheme.colorScheme.onBackground
            )
        }

    }
}