package org.kotlinlang.discuss.kotlinjavainteroptelegrambot.mocklib

import org.telegram.telegrambots.meta.api.methods.BotApiMethod
import org.telegram.telegrambots.meta.api.objects.Update
import java.io.Serializable

abstract class TelegramLongPollingBotKt {
    abstract fun onUpdate(update: Update?)

    fun <T : Serializable, Method : BotApiMethod<T>>
            execute(method: Method): T {
        return null as T
    }
}