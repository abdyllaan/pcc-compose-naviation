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
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun DetailSiswa(id: Int?, navController: NavController){
    val siswa = getAllSiswaData().find { it.id == id }
    siswa?.let {
        Column(
            Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            Text(
                text = "Detail Siswa",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Card(
                shape = RoundedCornerShape(16.dp),
            ) {
                Column(
                    Modifier
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(text = "Data Siswa")
                    Image(painter = painterResource(it.fotoSiswa),
                        contentDescription = it.namaSiswa,
                        Modifier
                            .size(120.dp)
                            .clip(CircleShape)
                            .align(Alignment.CenterHorizontally)
                    )
                    InfoRow("Nama", it.namaSiswa)
                    InfoRow("Kelas", it.kelasSiswa)
                    InfoRow("Alamat", it.alamat)
                    InfoRow("Hobi", it.hobi)
                    InfoRow("Umur", it.umur.toString())
                    InfoRow("Nomor HP", it.noHp)
                    InfoRow("Email", it.email)
                }
            }
            Button(
                onClick = {
                    navController.popBackStack()
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Kembali")
            }
        }
    }?: run {
        Text("Data siswa tidak ditemukan")
    }
}
@Composable
fun InfoRow(label: String, value: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = label, fontWeight = FontWeight.Bold)
        Text(text = value)
    }
}