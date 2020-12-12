package org.kotlinlang.discuss.kotlinjavainteroptelegrambot

import org.telegram.telegrambots.meta.api.methods.BotApiMethod
import org.telegram.telegrambots.meta.api.objects.Update
import java.io.Serializable

class WorkingBot : org.telegram.telegrambots.bots.TelegramLongPollingBot() {
    override fun getBotToken(): String = null as String
    override fun getBotUsername(): String = null as String

    override fun <T : Serializable, Method : BotApiMethod<T>> execute(method: Method): T =
        super.execute(method)

    private val handler: Action = UpdateHandler()

    override fun onUpdateReceived(update: Update?) {
        val action = handler.createExecutableForChat(update!!.message.chatId)
        execute(action)
    }
}