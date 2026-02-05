package com.tjkt.app3abdylla_navigation

data class SiswaData(
    val id: Int,
    val namaSiswa: String,
    val kelasSiswa: String,
    val alamat: String,
    val hobi: String,
    val umur: Int,
    val noHp: String,
    val email: String,
    val fotoSiswa: Int
)

fun getAllSiswaData(): List<SiswaData> {
    return listOf(
        SiswaData(0, "Andi", "TJKT 3", "Kudus", "Ngoding", 17, "081234567801", "andi@gmail.com", R.drawable.abdyllaan),
        SiswaData(0, "Bima", "TJKT 3", "Pati", "Gaming", 18, "081234567802", "bima@gmail.com", R.drawable.abdyllaan),
        SiswaData(0, "Cahya", "TJKT 3", "Jepara", "Desain", 17, "081234567803", "cahya@gmail.com", R.drawable.abdyllaan),
        SiswaData(0, "Dimas", "TJKT 3", "Semarang", "Editing Video", 18, "081234567804", "dimas@gmail.com", R.drawable.abdyllaan),
        SiswaData(0, "Eka", "TJKT 3", "Kudus", "Fotografi", 17, "081234567805", "eka@gmail.com", R.drawable.abdyllaan),
        SiswaData(0, "Farhan", "TJKT 3", "Pati", "Ngoding", 18, "081234567806", "farhan@gmail.com", R.drawable.abdyllaan),
        SiswaData(0, "Gilang", "TJKT 3", "Jepara", "Olahraga", 17, "081234567807", "gilang@gmail.com", R.drawable.abdyllaan),
        SiswaData(0, "Hafiz", "TJKT 3", "Semarang", "Membaca", 18, "081234567808", "hafiz@gmail.com", R.drawable.abdyllaan),
        SiswaData(0, "Iqbal", "TJKT 3", "Kudus", "Musik", 17, "081234567809", "iqbal@gmail.com", R.drawable.abdyllaan),
        SiswaData(0, "Anin", "TJKT 3", "Pati", "Traveling", 18, "081234567810", "anin@gmail.com", R.drawable.abdyllaan)
    ).mapIndexed { index, siswa ->
        siswa.copy(id = index)
    }
}
