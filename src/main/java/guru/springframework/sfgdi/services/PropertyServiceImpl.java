package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World-Property";
    }
}
