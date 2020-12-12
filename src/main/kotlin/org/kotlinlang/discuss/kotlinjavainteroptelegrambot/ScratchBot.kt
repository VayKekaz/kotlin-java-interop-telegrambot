package org.kotlinlang.discuss.kotlinjavainteroptelegrambot

import org.kotlinlang.discuss.kotlinjavainteroptelegrambot.mocklib.TelegramLongPollingBot
import org.kotlinlang.discuss.kotlinjavainteroptelegrambot.mocklib.TelegramLongPollingBotKt
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject
import org.telegram.telegrambots.meta.api.methods.BotApiMethod
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update

class ScratchBotWithJava : TelegramLongPollingBot() {

    private val handler: Action = UpdateHandler()
    override fun onUpdate(update: Update?) {
        val action = handler.createExecutableForChat(update!!.message.chatId)
        execute(action)
    }
}

class ScratchBotWithKotlin : TelegramLongPollingBotKt() {

    private val handler: Action = UpdateHandler()
    override fun onUpdate(update: Update?) {
        val action = handler.createExecutableForChat(update!!.message.chatId)
        execute(action)
    }
}

private interface Action {
    fun createExecutableForChat(chatId: Long): BotApiMethod<out BotApiObject>
}

private class UpdateHandler : Action {
    override fun createExecutableForChat(chatId: Long): BotApiMethod<out BotApiObject> {
        return SendMessage()
    }
}