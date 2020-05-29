package Day44_Exceptions;

public class ClassNotes {
    /*

    Exceptions:

        unchecked & checked:
        Try & catch block:
        multi-catch block:
        finally block:
        throws:
        throw:

   Exceptions:
           - Unwanted or unexpected events
           - There are 2 types of exceptions:
                    unchecked (unexpected events): checked while running the code and exception printed on console
                        runTimeException is the parent of ALL unchecked exception classes

                    checked (unwanted event): checks while you are writing the code and underlines the codes error
                        needs to be fixed IMMEDIATELY

          Ex:
            Index out of bound exceptions

            try & catch blocks:
                - used for handling exceptions and allowing them to be voided or for them to work
            try {
                STORES THE CODE WITH THE EXCEPTION
                } catch(ExceptionClass VariableName){
                    can be left blank or can add a code
                        }
            Try block MUST be created with the catch block, cannot be created alone
        - if the exception in the TRY block works, then the catch statement will not work/print
        - if the exception in the TRY block does NOT work, then the catch statement WILL work/print

                printsStackTrace(): used when reporting, used to print the stack trace of the exception

                getMessage(): used to return the description of the exception

        Multi-catch Blocks:
            -  used for reporting multiple/different exceptions

            -

        FInally:
            - always gets executed regardless of the exception

            Thread.sleep(long: millisecond): makes the current execution thread wait for the specific time entered in ()






























     */
}
