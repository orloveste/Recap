package RedHat.Lambda_and_serverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import javax.inject.Inject;

public class GreetingsLambda implements RequestHandler {
    @Inject
    GreetingService service;

    @Override
    public String handleRequest(Object o, Context context) {
        return service.greeting(name);
    }


}
