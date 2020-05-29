package Day45_Exceptions;

public class ClassNotes {
    /*
    Throws: adding Throws Exception in the method line, allows the exception to work ONLY in that method body

        public static void method() THROWS EXCEPTION {
                exception code & statements}

        disadvantage - the exception is not completely gone, its just gone from the method
            - when called in another method, it will need to be handled (fixed) again



throw: manually throwing the exception, DOES NOT HANDLE
    object: new ExceptionClass();
    throw Object;
    Ex:
        throw new RuntimeException();

custom exception:
    how to create custom unchecked exception?
                A: by extending RunTimeException class
    how to create custom checked exception?
                A: by extending Exception class
Exception topic:
        checked & unchecked
        try& catch
        multi-catch block
        finally block
        throw
        throws
        custom exception
next: final keyword
        abstraction
        ploymorphisim
        Collections
        lambda
        Maps




































     */
}
