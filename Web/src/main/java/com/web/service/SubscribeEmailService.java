package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.domain.SendMessage;
import com.web.domain.Subscribe;
import com.web.repository.SendMessageRepository;
import com.web.repository.SubscribeRepository;

@Service
public class SubscribeEmailService {

	private Subscribe subscribe;
	private SendMessage sendmessage;
	private SubscribeRepository subsrepo;
	private SendMessageRepository sendmessagerepo;

	// ****************//
	// OBJECT INJECTION//
	// ****************//
	@Autowired
	public void setSubscribe(Subscribe subscribe) {
		this.subscribe = subscribe;
	}

	@Autowired
	public void setSubsrepo(SubscribeRepository subsrepo) {
		this.subsrepo = subsrepo;
	}

	@Autowired
	public void setSendmessage(SendMessage sendmessage) {
		this.sendmessage = sendmessage;
	}

	@Autowired
	public void setSendmessagerepo(SendMessageRepository sendmessagerepo) {
		this.sendmessagerepo = sendmessagerepo;
	}

	// **************//
	// OBJECT GETTER //
	// **************//
	public Subscribe getSubscribe() {
		return subscribe;
	}

	public SubscribeRepository getSubsrepo() {
		return subsrepo;
	}

	public SendMessage getSendmessage() {
		return sendmessage;
	}

	public SendMessageRepository getSendmessagerepo() {
		return sendmessagerepo;
	}

	// ********//
	// SAVE //
	// ********//

	public void SubscribeSave(Subscribe subscribe) {
		subsrepo.save(subscribe);

	}
	
	public void sendMessageSave(SendMessage sendmessage) {
		sendmessagerepo.save(sendmessage);

	}

	// ************//
	// GET ALL LIST//
	// ************//

	public List<Subscribe> getSubscribeList() {

		List<Subscribe> subscribelist = subsrepo.findAll();
		return subscribelist;

	}
	
	public List<SendMessage> getSendMessageList() {

		List<SendMessage> sendmessagelist = sendmessagerepo.findAll();
		return sendmessagelist;

	}
	

	// *******************//
	// DELETE OBJECT BY ID//
	// *******************//

	public void subscribeDelet(Long id) {

		subsrepo.deleteById(id);

	}
	
	public void sendMessageDelet(Long id) {

		sendmessagerepo.deleteById(id);

	}
	
	

}
