package cn.hassan.client;

import Ice.Communicator;
import Ice.ObjectPrx;
import cn.hassan.ice.message.SMSServiePrx;
import cn.hassan.ice.message.SMSServiePrxHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SMSClient {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(SMSClient.class);
		Communicator ic = null;
		try {
			String[] initParams = new String[]{"--Ice.Default.Locator=IceGrid/Locator:tcp -h localhost -p 4061"};
			ic = Ice.Util.initialize(initParams);
			ObjectPrx objectPrx = ic.stringToProxy("SMSService");
			SMSServiePrx smsServiePrx = SMSServiePrxHelper.checkedCast(objectPrx);
			String msg = "发短息";
			smsServiePrx.sendSms(msg);
		} catch (Exception e) {
			logger.error("连接失败");
		}
	}
}
