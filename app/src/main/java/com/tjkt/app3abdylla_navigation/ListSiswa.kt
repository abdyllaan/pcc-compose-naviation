package com.tjkt.app3abdylla_navigation

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

//@Composable
//fun ListSiswa(navController: NavController){
//    Column(
//        Modifier
//            .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text(text = "Screen A")
//        Button(
//            onClick = {
//                navController.navigate(Routes.screenB)
//            }
//        ) {
//            Text(text = " Go to screen B")
//        }
//    }
//}


@Composable
fun LazyColumnListSiswa(navController: NavController) {
    val myList = getAllSiswaData()
    val context = LocalContext.current
    Column(Modifier.fillMaxSize().statusBarsPadding().padding(16.dp)) {
        Text(text = "Daftar Siswa", fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(16.dp))

        LazyColumn {
            itemsIndexed(myList) { index, item ->
                SiswaItem(item = item,
                    onClick = {
                        Toast.makeText(
                            context,
                            "Clicked ${item.namaSiswa}",
                            Toast.LENGTH_SHORT
                        ).show()
                         navController.navigate(Routes.detailRoute(item.id))
                    }
                )
            }
        }
    }
}

@Composable
fun SiswaItem(item: SiswaData,onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable{onClick()}
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
        ){
            Image(
                painter = painterResource(item.fotoSiswa),
                contentDescription = "abdyllaan"
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column{
            Text(text = item.namaSiswa, fontWeight = FontWeight.Bold, fontSize = 16.sp)
            Text(text = item.kelasSiswa)
        }
    }
}