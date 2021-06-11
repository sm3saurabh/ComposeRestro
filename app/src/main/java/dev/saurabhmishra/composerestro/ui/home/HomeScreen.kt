package dev.saurabhmishra.composerestro.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.saurabhmishra.composerestro.R
import dev.saurabhmishra.composerestro.ui.theme.ComposeRestroTheme

@Composable
fun HomeScreen() {
  Scaffold {
    Column(
      modifier = Modifier.padding(16.dp)
    ) {
      Image(
        painter = painterResource(id = R.drawable.ic_memory_24),
        contentDescription = null,
        modifier = Modifier
          .height(150.dp)
          .fillMaxWidth()
          .clip(shape = RoundedCornerShape(4.dp)),
        contentScale = ContentScale.FillHeight
      )

      Spacer(modifier = Modifier.height(16.dp))

      Text(
        "My name is Saurabh Mishra",
        style = MaterialTheme.typography.h6,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
      )
      Text("I am 24 years old", style = MaterialTheme.typography.body2)
      Text("I am a human being", style = MaterialTheme.typography.body2)
    }
  }


}

@Preview
@Composable
fun PreviewHomeScreen() {
  ComposeRestroTheme {
    HomeScreen()
  }
}