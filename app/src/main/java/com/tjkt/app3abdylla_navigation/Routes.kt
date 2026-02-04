package com.tjkt.app3abdylla_navigation

object Routes {
    const val screenA = "screen_A"
    const val screenB = "detail/{id}"

    fun detailRoute(id: Int): String {
        return "detail/$id"
    }}
