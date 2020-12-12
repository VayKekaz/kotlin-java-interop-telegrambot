package org.kotlinlang.discuss.kotlinjavainteroptelegrambot

import org.telegram.telegrambots.meta.api.interfaces.BotApiObject
import org.telegram.telegrambots.meta.api.methods.BotApiMethod
import org.telegram.telegrambots.meta.api.methods.send.SendMessage

class UpdateHandler : Action {
    override fun createExecutableForChat(chatId: Long): BotApiMethod<out BotApiObject> {
        return SendMessage()
    }
}
