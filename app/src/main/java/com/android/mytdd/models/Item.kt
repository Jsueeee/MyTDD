package com.android.mytdd.models


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("bloggerlink")
    val bloggerlink: String,
    @SerializedName("bloggername")
    val bloggername: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("link")
    val link: String,
    @SerializedName("postdate")
    val postdate: String,
    @SerializedName("title")
    val title: String
)