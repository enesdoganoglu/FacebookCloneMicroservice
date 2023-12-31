package com.enes.rabbitmq.consumer;

import com.enes.rabbitmq.model.CreateUserModel;
import com.enes.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserConsumer {

    private final UserProfileService userProfileService;
    @RabbitListener(queues = "auth-queue-create-user")
    public void createUserFromHandleQueue(CreateUserModel userModel){
        userProfileService.save(userModel);
        System.out.println("Kullanıcı Oluşturuldu.");
    }
}
