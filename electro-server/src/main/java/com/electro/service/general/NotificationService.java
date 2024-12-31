package com.electro.service.general;

import com.electro.model.reponse.general.NotificationResponse;

public interface NotificationService {

    void pushNotification(String uniqueKey, NotificationResponse notification);

}
