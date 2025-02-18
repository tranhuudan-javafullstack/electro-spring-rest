package com.electro.service.chat;

import com.electro.model.request.chat.MessageRequest;
import com.electro.model.reponse.chat.MessageResponse;
import com.electro.service.CrudService;

public interface MessageService extends CrudService<Long, MessageRequest, MessageResponse> {}
