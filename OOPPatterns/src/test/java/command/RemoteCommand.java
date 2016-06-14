package command;

import org.junit.Assert;
import org.junit.Test;

//этот класс- Клиент
public class RemoteCommand extends Assert{
    @Test
    public void test() {
        //Этот объект - Инициатор
        RemoteControl remoteControl = new RemoteControl();
        //Этот объект - Получатель запроса
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living Room");
        GarageDoor garageDoor = new GarageDoor("");

        //Создаем команду с указанием получателя
        LightOnCommand livingRoomlightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomlightoff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenlightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenlightoff = new LightOffCommand(kitchenLight);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        // Команда передается Инициатору, сначала устанавливаем команду, затем имитируем нажатие кнопки для выполнения
        remoteControl.setCommand(0, livingRoomlightOn, livingRoomlightoff);
        remoteControl.setCommand(1, kitchenlightOn, kitchenlightoff);
        remoteControl.setCommand(2, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(3, stereoOnCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();

    }
}
