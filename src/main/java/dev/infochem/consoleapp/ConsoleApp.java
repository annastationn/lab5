package dev.infochem.consoleapp;
import dev.infochem.consoleapp.Commands.Command;

import java.util.LinkedHashMap;
public class ConsoleApp {
    //хэшмапа команд. Ключ - имя команды; Значение - класс-оболочка команды
    public static LinkedHashMap<String, Command> commandList = new LinkedHashMap<>();
    private Command clear;
    private Command executeScript;
    private Command exit;
    private Command filterGreaterThanType;
    private Command help;
    private Command history;
    private Command info;
    private Command insert;
    private Command minByName;
    private Command printUniqueAnnualTurnover;
    private Command removeGreaterKeyNull;
    private Command removeKeyNull;
    private Command removeLower;
    private Command save;
    private Command show;
    private Command update;

    public ConsoleApp(Command... commands) {
        this.help = commands[0];
        this.info = commands[1];
        this.show = commands[2];
        this.insert = commands[3];
        this.update = commands[4];
        this.removeKeyNull = commands[5];
        this.clear = commands[6];
        this.save = commands[7];
        this.executeScript = commands[8];
        this.exit = commands[9];
        this.removeGreaterKeyNull = commands[10];
        this.removeLower = commands[11];
        this.history = commands[12];
        this.minByName = commands[13];
        this.printUniqueAnnualTurnover = commands[14];
        this.filterGreaterThanType = commands[15];
    }

    public void help(String arguments){
        help.execute(arguments);
    }

    public void info(String arguments){
        info.execute(arguments);
    }

    public void show(String arguments){
        show.execute(arguments);
    }

    public void insert(String arguments){
        insert.execute(arguments);
    }

    public void update(String arguments){
        update.execute(arguments);
    }

    public void removeKeyNull(String arguments){
        removeKeyNull.execute(arguments);
    }

    public void clear(String arguments){
        clear.execute(arguments);
    }

    public void save(String arguments){
        save.execute(arguments);
    }

    public void executeScript(String arguments){
        executeScript.execute(arguments);
    }

    public void exit(String arguments){
        exit.execute(arguments);
    }

    public void removeGreaterKeyNull(String arguments){
        removeGreaterKeyNull.execute(arguments);
    }

    public void removeLower(String arguments){
        removeLower.execute(arguments);
    }

    public void history(String arguments){
        history.execute(arguments);
    }

    public void minByName(String arguments){
        minByName.execute(arguments);
    }

    public void printUniqueAnnualTurnover(String arguments){
        printUniqueAnnualTurnover.execute(arguments);
    }

    public void filterGreaterThanType(String arguments){
        filterGreaterThanType.execute(arguments);
    }
}