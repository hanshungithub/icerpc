package cn.hassan;

import Ice.Communicator;
import Ice.Current;
import Ice.ObjectAdapter;
import IceBox.Service;
import cn.hassan.ice.book.Message;
import cn.hassan.ice.book._onlineBookDisp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OnlineBookI2 extends _onlineBookDisp implements Service {

	private static final long serialVersionUID = 7114601588161119171L;
	private Logger logger = LoggerFactory.getLogger(OnlineBookI2.class);
	private ObjectAdapter adapter;

	public void start(String s, Communicator communicator, String[] strings) {
		adapter = communicator.createObjectAdapter(s);
		Ice.Object object = this;
		adapter.add(object, communicator.stringToIdentity(s));
		adapter.activate();
		logger.error(s + "started...");
	}

	public void stop() {
		logger.error(this.adapter.getName(), "stoped");
		adapter.destroy();
	}

	public Message bookTick(Message msg, Current __current) {
		logger.error("bookTick to call " + logger.getClass().getName());
		logger.error("bookTick called" + msg.content);
		Message message = new Message();
		message.name = msg.name;
		message.type = msg.type;
		message.price = 1000;
		message.valid = true;
		message.content = msg.content;
		return message;
	}
}
