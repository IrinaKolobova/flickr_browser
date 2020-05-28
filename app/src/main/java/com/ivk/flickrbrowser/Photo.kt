package com.ivk.flickrbrowser

class Photo(val title: String, val autor: String, val authorId: String, val link: String, val tags: String, val image: String) {

    override fun toString(): String {
        return "Photo(title='$title', autor='$autor', authorId='$authorId', link='$link', tags='$tags', image='$image')"
    }
}