package com.tjkt.app3abdylla_navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailSiswa(navController: Int?){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        Text(
            text = "Informasi Sekolah",
            fontSize = 20.sp
        )
        Card(
            shape = RoundedCornerShape(16.dp),


            ) {
            Column(
                modifier = Modifier
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                Text(text = "Data Siswa")
                Image(painter = painterResource(R.drawable.abdyllaan),
                    contentDescription = "Abdylla Adhiyasa Nugroho",
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape)
                        .align(Alignment.CenterHorizontally)
                )
                InfoRow("Nama", "Budi")
                InfoRow("Kelas", "XI RPL")
                InfoRow("Alamat", "Kudus")
            }
        }

        Card(
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(4.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(text = "Data Guru")
                Image(painter = painterResource(R.drawable.abdyllaan),
                    contentDescription = "Abdylla Adhiyasa Nugroho",
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape)
                        .align(Alignment.CenterHorizontally)
                )
                InfoRow("Nama", "Pak Andi")
                InfoRow("Mapel", "PCC")
            }
        }

    }
}



@Composable
fun InfoRow(label: String, value: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = label)
        Text(text = value)
    }
}
