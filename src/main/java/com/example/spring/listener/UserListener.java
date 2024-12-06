package com.example.spring.listener;

import com.example.spring.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccess(LoginSuccessEvent event) {
        log.info("Successfully logged in {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccess2(LoginSuccessEvent event) {
        log.info("Successfully logged in {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccess3(LoginSuccessEvent event) {
        log.info("Successfully logged in {}", event.getUser());
    }
}
