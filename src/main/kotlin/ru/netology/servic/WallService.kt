package ru.netology.servic

import ru.netology.data.Post

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        for ((index, post) in posts.withIndex()) {
        posts[index] = post.copy(id = post.id + 1)
        }
        println(posts.component1()) //TODO()
        return posts.last()
    }


    fun update(post: Post): Boolean {
        for (i in posts) {
            if (post.id == i.id) {
                val (
                _, ownerId, fromId, createdBy, _, text, replyOwnerId, replyPostId, friendsOnly, comments,
                copyright, likes, reposts, views, donut, postType, signerId, canPin, canDelete, canEdit,
                isPinned, markedAsAds, isFavorite, postponedId
            ) = post
            }
        }
        return true
    }
}