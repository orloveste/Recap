package RedHat.Lambda_and_serverless;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class GreetingsLambda{
    @Inject
    GreetingService service;

    @RequestMapping(path = "/greeting/{name}", method = RequestMethod.GET, produces = "text/plain")

    public String handleRequest(@PathVariable("name") String name) {
        return service.greeting(name);
    }
}
