package cn.hassan;

import Ice.Communicator;
import Ice.Current;
import Ice.ObjectAdapter;
import IceBox.Service;
import cn.hassan.ice.message._SMSServieDisp;

public class SMSServiceI2 extends _SMSServieDisp implements Service {

	private ObjectAdapter adapter;

	public void start(String s, Communicator communicator, String[] strings) {
		adapter = communicator.createObjectAdapter(s);
		Ice.Object object = this;
		adapter.add(object, communicator.stringToIdentity(s));
		adapter.activate();
	}

	public void stop() {
		adapter.destroy();
	}

	public void sendSms(String msg, Current __current) {
		System.out.println("send message-->" + msg);
	}
}
