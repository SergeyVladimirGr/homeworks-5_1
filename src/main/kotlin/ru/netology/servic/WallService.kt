package ru.netology.servic

import ru.netology.data.Post

object WallService {
    private var posts = emptyArray<Post>()

    fun clear() {
        posts = emptyArray<Post>()
    }

    fun add(post: Post): Post {
        val postId = post.copy(id = if (posts.isEmpty()) 1 else posts.last().id + 1)
        posts += postId
        return posts.last()
    }


    fun update(post: Post): Boolean {
        var result = false
        val (id, ownerId, fromId, createdBy, _, text, replyOwnerId, replyPostId, friendsOnly,
            comments, copyright, likes, reposts, views, donut, postType, signerId, canPin,
            canDelete, canEdit, isPinned, markedAsAds, isFavorite, postponedId) = post
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(ownerId = ownerId, fromId = fromId, createdBy = createdBy, text = text,
                    replyOwnerId = replyOwnerId, replyPostId = replyPostId, friendsOnly = friendsOnly,
                    comments = comments, copyright = copyright, likes = likes, reposts = reposts, views = views,
                    donut = donut, postType = postType, signerId = signerId, canPin = canPin, canDelete = canDelete,
                    canEdit = canEdit, isPinned = isPinned, markedAsAds = markedAsAds, isFavorite = isFavorite,
                    postponedId = postponedId)
                result = true
            }
        }
        return result
    }
}