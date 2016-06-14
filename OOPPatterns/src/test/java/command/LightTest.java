package command;

import org.junit.Assert;
import org.junit.Test;
//этот класс- Клиент
public class LightTest extends Assert{
    @Test
    public void test() {
        //Этот объект - Инициатор
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        //Этот объект - Получатель запроса
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        //Создаем команду с указанием получателя
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        // Команда передается Инициатору, сначала устанавливаем команду, затем имитируем нажатие кнопки для выполнения
        simpleRemoteControl.setCommand(lightOn);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(garageDoorOpen);
        simpleRemoteControl.buttonWasPressed();
    }
}
