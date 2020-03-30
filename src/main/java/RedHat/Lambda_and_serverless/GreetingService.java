package RedHat.Lambda_and_serverless;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public String greeting(String name){
        return "Hello "+ name;
    }
}
