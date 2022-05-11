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
        id = 6,
        comments = Comments(),
        copyright = Copyright(),
        donut = Donut(),
        likes = Likes(50),
        reposts = Reposts(),
        views = Views()
    )

    WallService.add(post)
    WallService.add(post)
    WallService.add(post)

    val result = WallService.update(post1)
    println(result)
}