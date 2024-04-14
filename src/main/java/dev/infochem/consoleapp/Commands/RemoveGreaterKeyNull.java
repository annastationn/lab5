package dev.infochem.consoleapp.Commands;
import dev.infochem.consoleapp.CommandHandler;
import dev.infochem.consoleapp.ConsoleApp;
import dev.infochem.consoleapp.Organization;

public class RemoveGreaterKeyNull implements Command {
    private CommandHandler commandHandler = new CommandHandler();
    public RemoveGreaterKeyNull(CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("remove_greater_key", this);
    }
    @Override
    public void execute(String arguments) {
         commandHandler.removeGreaterKey(arguments);
    }
}
