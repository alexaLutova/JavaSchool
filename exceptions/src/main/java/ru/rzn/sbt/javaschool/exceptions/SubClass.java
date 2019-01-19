package ru.rzn.sbt.javaschool.exceptions;
import ru.rzn.sbt.javaschool.exceptions.utils.SomeService;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {
    public static final String DONE = "DONE";
@Override
public String callService(SomeService service) throws FileNotFoundException {

    try{
        service.doSomething();
    }
    catch(FileNotFoundException e){
        throw e;
    }
    catch (Exception e){
        throw new RuntimeException(e.getMessage(),e);
    }
    return DONE;
}

}
