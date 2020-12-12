package org.kotlinlang.discuss.kotlinjavainteroptelegrambot.mocklib;

import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.io.Serializable;

public abstract class TelegramLongPollingBot {
    abstract void onUpdate(Update update);

    public <T extends Serializable, Method extends BotApiMethod<? extends T>>
    T execute(Method method) {
        return null;
    }
}
