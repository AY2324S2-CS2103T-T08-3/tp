package seedu.address.logic.commands;

import seedu.address.model.Model;
import seedu.address.logic.commands.exceptions.CommandException;
public class MarkCommand extends Command{
    public static final String COMMAND_WORD = "mark";
    public static final String MESSAGE_SUCCESS = "Contact has been marked as dead!";
    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Marks the contacts identified by the index number as dead.\n"
            + "Parameters: INDEX (must be a positive integer)\n"
            + "Example: " + COMMAND_WORD + " 1";

    @Override
    public CommandResult execute(Model model) throws CommandException{
        throw new CommandException("This method have not been implemented yet");
    }
}
