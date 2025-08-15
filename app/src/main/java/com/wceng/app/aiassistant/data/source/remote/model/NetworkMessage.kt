package com.wceng.app.aiassistant.data.source.remote.model

import com.wceng.app.aiassistant.data.source.local.model2.MessageEntity

data class NetworkMessage(
    val content: String,
    val sender: String
)

fun MessageEntity.asNetwork(sender: String) = NetworkMessage(
    content = content,
    sender = sender
)