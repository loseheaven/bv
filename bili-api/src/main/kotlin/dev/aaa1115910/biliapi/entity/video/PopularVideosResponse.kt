package dev.aaa1115910.biliapi.entity.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PopularVideosResponse(
    val code: Int,
    val message: String,
    val ttl: Int,
    val data: PopularVideoData
)

@Serializable
data class PopularVideoData(
    val list: List<VideoInfo>,
    @SerialName("no_more")
    val noMore: Boolean
)