package com.example.ec3.model

import com.google.gson.annotations.SerializedName

data class Chuck(
    val categories: List<String>,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("icon_url")
    val iconUrl: String,
    val id: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    val url: String,
    val value: String
)
