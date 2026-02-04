package com.tjkt.app3abdylla_navigation

data class SiswaData(
    val id: Int,
    val namaSiswa: String,
    val kelasSiswa: String,
    val fotoSiswa: Int
)

fun getAllSiswaData(): List<SiswaData> {
    return listOf(
        SiswaData(
            0,
            "abdylla",
            "TJKT 3",
            R.drawable.abdyllaan
        ),
        SiswaData(
            0,
            "adhiyasa",
            "TJKT 3",
            R.drawable.abdyllaan
        ),
        SiswaData(
            0,
            "nugroho",
            "TJKT 3",
            R.drawable.abdyllaan
        )
    ).mapIndexed { index, siswa ->
        siswa.copy(id = index)
    }
}
