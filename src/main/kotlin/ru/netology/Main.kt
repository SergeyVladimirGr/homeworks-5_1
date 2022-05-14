package ru.netology

import ru.netology.data.*
import ru.netology.servic.WallService

fun main() {
    val post = Post(
        comments = Comments(),
        copyright = Copyright(),
        donut = Donut(),
        likes = Likes(5),
        reposts = Reposts(),
        views = Views()
    )
    val post1 = Post(
        id = 3,
        comments = Comments(),
        copyright = Copyright(),
        donut = Donut(),
        likes = Likes(50),
        reposts = Reposts(),
        views = Views()
    )

    val resultId1 = WallService.add(post)
    val resultId2 = WallService.add(post)
    val resultId3 = WallService.add(post)
    println(resultId1)
    println(resultId2)
    println(resultId3)

    val result = WallService.update(post1)
    println(result)
}