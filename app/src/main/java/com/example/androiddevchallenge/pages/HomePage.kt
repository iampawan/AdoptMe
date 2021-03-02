package com.example.androiddevchallenge.pages


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.PetData.pets
import com.example.androiddevchallenge.model.Pet

import com.example.androiddevchallenge.nav.MyNavigation
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.bluishColor
import com.example.androiddevchallenge.ui.theme.creamColor
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun HomePage(navController: NavHostController) {
    Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            item {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Adopt Me",
                        style = typography.h3.copy(
                            color = bluishColor,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(
                        text = "Available Pets",
                        style = typography.h5.copy(color = bluishColor)
                    )

                    Spacer(modifier = Modifier.height(20.dp))
                }
            }

            items(pets) {
                pets.forEach {
                    PetCard(it, onClick = { pet ->
                        navController.navigate(
                            "${MyNavigation.Details.routeName}/${
                                pet.id
                            }"
                        )
                    })
                }
            }
        }


    }
}

@Composable
fun PetCard(pet: Pet, onClick: (pet: Pet) -> Unit) {
    Card(
        elevation = 10.dp,
        backgroundColor = bluishColor,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(RoundedCornerShape(12.dp))

            .clickable { onClick(pet) },

    ) {
        Box{
            Image(
                painter = painterResource(id = pet.image),
                contentDescription = "Pet Image",
                contentScale = ContentScale.Crop,
                alignment = Alignment.CenterStart,
                colorFilter = ColorFilter.tint(color = Color.Black.copy(alpha = 0.3f), BlendMode.Darken),
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth(),
            )





                Column(modifier = Modifier.align(alignment = Alignment.CenterStart).padding(16.dp)) {
                    Text(
                        text = pet.name,
                        style = typography.h4.copy(color = Color.White, fontWeight = FontWeight.Bold)
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = pet.type,
                        style = typography.caption.copy(color = Color.White)
                    )
                    Spacer(modifier = Modifier.height(8.dp))


            }

            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd).padding(16.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(bluishColor)
            ) {
                Text(
                    text = pet.location, modifier = Modifier.padding(12.dp, 6.dp, 12.dp, 6.dp),
                    style = MaterialTheme.typography.caption.copy(color = Color.White),

                    )
            }
        }


    }
}

@Preview
@Composable
fun Prev() {
    MyTheme {
        HomePage(navController = rememberNavController())
    }

}