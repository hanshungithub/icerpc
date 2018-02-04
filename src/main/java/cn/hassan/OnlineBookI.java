package cn.hassan;

import Ice.Current;
import cn.hassan.ice.book.Message;
import cn.hassan.ice.book._onlineBookDisp;

public class OnlineBookI extends _onlineBookDisp {
	public Message bookTick(Message msg, Current __current) {
		Message message = new Message();
		message.name = msg.name;
		message.type = msg.type;
		message.price = 1000;
		message.valid = true;
		message.content = msg.content;
		return message;
	}
}
