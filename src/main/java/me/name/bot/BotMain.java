package me.name.bot;

import me.name.bot.secrets.*;
import me.name.bot.listeners.TextChannelListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class BotMain {
    public static JDA jda;

    public static void main(String[] args) throws Exception
    {

        jda = JDABuilder.createLight(DiscordToken.getTestOAuth2Token(), GatewayIntent.GUILD_MESSAGES)
                .setActivity(Activity.listening("dir bei $help"))
                .setStatus(OnlineStatus.ONLINE)
                .build();

        jda.addEventListener(new TextChannelListener());

    }
}
