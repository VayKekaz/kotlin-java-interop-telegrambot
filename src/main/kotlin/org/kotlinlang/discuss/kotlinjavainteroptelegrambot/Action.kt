package org.kotlinlang.discuss.kotlinjavainteroptelegrambot

import org.telegram.telegrambots.meta.api.interfaces.BotApiObject
import org.telegram.telegrambots.meta.api.methods.BotApiMethod

interface Action {
    fun createExecutableForChat(chatId: Long): BotApiMethod<out BotApiObject>
}
