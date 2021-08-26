import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendPhoto;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.ArrayList;

public class Bot extends TelegramLongPollingBot {
    long chat_id;
    String lastMessage = "";
    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
    SendPhoto sendPhoto = new SendPhoto();


    @Override
    public void onUpdateReceived(Update update) {
        update.getUpdateId();
        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
        chat_id = update.getMessage().getChatId();
        String text = update.getMessage().getText();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        sendPhoto.getChatId();

        try {
            sendMessage.setText(getMessage(text));
            execute(sendMessage);

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }


    }


    public String getMessage(String msg) {
        ArrayList<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        KeyboardRow keyboardThirdRow = new KeyboardRow();
        KeyboardRow keyboardFourthRow = new KeyboardRow();

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);

        if (msg.equals("Привет") || msg.equals("Буся") || msg.equals("Кукусичка") || msg.equals("Виииии")) {
            keyboard.clear();
            keyboardFirstRow.add("Я жирная!");
            keyboardFirstRow.add("Покажи ПОПУ");
            keyboardFirstRow.add("Покажи Попу");
            keyboardFirstRow.add("Покажи Задницу");
            keyboardSecondRow.add("Покажи Жопу");
            keyboardSecondRow.add("Чья это ПОПА?");
            keyboardSecondRow.add(" Я люблю тебя");
            keyboardSecondRow.add("Я хочу ебатся");
            keyboardThirdRow.add("Я хочу поговорить");
            keyboardThirdRow.add("Жопа");
            keyboardThirdRow.add("Че носом не бикаешь?");
            keyboardFourthRow.add("Чтоб ты понимал");
            keyboardFourthRow.add("Съем");
            keyboardFourthRow.add(" Иди в жопу");
            keyboardFourthRow.add(" Чей  это котик");
            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);
            keyboard.add(keyboardThirdRow);
            keyboard.add(keyboardFourthRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Бе-Бе-Бе Не понимаю тебя";
        }

        if (msg.equals("Я жирная!")) {
            keyboard.clear();
            keyboardFirstRow.add("Виииии");
            keyboard.add(keyboardFirstRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Ты не жирная, а маленькая розовая птичка";
        }


        if (msg.equals("Покажи ПОПУ") || msg.equals("Покажи Попу") || msg.equals("Покажи Задницу") || msg.equals("Покажи Жопу")) {
            keyboard.clear();
            keyboardFirstRow.add("Ну покажи");
            keyboardFirstRow.add(" Ну");
            keyboard.add(keyboardFirstRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            String h2[] = {"Платно", "Моя ПОПА"};
            int n2 = (int) Math.floor(Math.random() * h2.length);
            return h2[n2];
        }

        if (msg.equals("Ну покажи") || msg.equals("Ну")) {
            keyboard.clear();
            keyboardFirstRow.add("Жопа");
            keyboard.add(keyboardFirstRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Нет";
        }
        if (msg.equals("Жопа")) {
            keyboard.clear();
            keyboardFirstRow.add("Съем");
            keyboard.add(keyboardFirstRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            String h4[] = {"Писька", "Ну твоя ж жопа"};
            int n4 = (int) Math.floor(Math.random() * h4.length);
            return h4[n4];
        }
        if (msg.equals("Съем")) {
            keyboard.clear();
            keyboardFirstRow.add(" Я не обижаю");
            keyboard.add(keyboardFirstRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Нельзя кукусичку обижать";
        }

        if (msg.equals("Чья это ПОПА?") || msg.equals("Чья это Попа?") || msg.equals("Чья это Задница?") || msg.equals("Чья это Жопа?")) {
            keyboard.clear();
            keyboardFirstRow.add("Виииии");
            keyboard.add(keyboardFirstRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Твоя";
        }
        if (msg.equals("Я люблю тебя")) {
            return "Я сильнее люблю тебя, желточек ты мой под листиком";
        }
        if (msg.equals("Я хочу поговорить")) {
            String h3[] = {"ЭЭЭЭЭ!!!", "Назначь мне время в календаре и я обещаю что уделю тебе все это время"};
            int n3 = (int) Math.floor(Math.random() * h3.length);
            return h3[n3];
        }
        if (msg.equals("Жопа")) {
            String h1[] = {"Писька", "Ну твоя ж жопа"};
            int n1 = (int) Math.floor(Math.random() * h1.length);
            return h1[n1];
        }
        if (msg.equals("Чтоб ты понимал")) {
            return " Бебебебебе";
        }
        if (msg.equals("Съем")) {
            return "  Нельзя кукусичку обижать";
        }
        if (msg.equals("Иди в жопу")) {
            return " Ты не даешь!";
        }
        if (msg.equals("Чей  это котик")) {
            return "Нrrgаш";
        }



            if (msg.equals("Я хочу ебатся")) {
            keyboard.clear();
            keyboardFirstRow.add("А как?");
            keyboard.add(keyboardFirstRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Выпорю";
        }
        if (msg.equals("А как?")) {
            keyboard.clear();
            keyboardFirstRow.add("Виииии");
            keyboard.add(keyboardFirstRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return " Поставлю тебя раком, силой разорву на тебе " +
                    "одежду, достану из штанов ремень одной рукой " +
                    "и выпарю тебя. Буду очень сильно бить тебя ремнем по " +
                    "заднице, чтоб у тебя кровь шла. И мне будет все равно на твои крики и слезы." +
                    " Меня это еще сильнее злит и заводит и каждый раз когда будешь умолять все сильнее и сильнее будешь получать, " +
                    "потом резко войду в тебя и буду ебать и пороть по заднице ремнем\" или \" " +
                    "Подстрою будешь идти по улице одна вечером, украду, вывезу в " +
                    "лес, брошу тебя там чтоб сама выбиралась, потом выжду какое то время и буду " +
                    "гонятся за тобой по лесу. Когда поймаю привяжу тебя к дереву сильно чтоб не" +
                    " могла двигаться разорву на заднице одежду ножом, достану кнут и буду выпаривать. " +
                    "Ты будешь крычать но не кто не придет тебе на помощь никто не спасет тебя буду я тебе шептать." +
                    " Я очень сильно буду пороть, тебе будет так больно что горло пересохнет и что ты можешь пить это будет твои слезы. " +
                    "Потом резко войду в тебя и буду ебать. Я резко выйду и резко войду. " +
                    "Ты будешь меня умолять я не буду на это обращать внимание. " +
                    "Своими просьбами доведешь меня до того что я резко остановлюсь и на чну тебя пороть. " +
                    "Потом очень медленно войду в твою задницу и все быстрее и быстрее буду входить в тебя. " +
                    "Я буду очень быстро тебя трахать. И кончу в твою жопу";
        }


        return "Бе-Бе-Бе Не понимаю тебяипипкикпип";
    }


    @Override
    public String getBotUsername() {
        return "Kukusichka";
    }

    @Override
    public String getBotToken() {
        return "1804921381:AAHTJU8tTH5j2EtJOr00tt3oXuM8y8UanpE";
    }


}




