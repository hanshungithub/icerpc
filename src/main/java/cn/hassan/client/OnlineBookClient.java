package cn.hassan.client;

import Ice.Communicator;
import Ice.ObjectPrx;
import cn.hassan.ice.book.Message;
import cn.hassan.ice.book.onlineBookPrx;
import cn.hassan.ice.book.onlineBookPrxHelper;

public class OnlineBookClient {

	public static void main(String[] args) {
		Communicator ic = null;
		try {
			ic = Ice.Util.initialize(args);
			ObjectPrx base = ic.stringToProxy("OnlineBook:default -p 10000");
			onlineBookPrx onlineBookPrx = onlineBookPrxHelper.checkedCast(base);
			if (onlineBookPrx != null) {
				Message message = new Message();
				message.name = "Zeroc ICE";
				message.type = 1;
				message.valid = false;
				message.price = 99;
				message.content = "ICE is the fast RPC Framework";
				Message result = onlineBookPrx.bookTick(message);
				System.out.println(result.price);
			}else {
				System.out.println("error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (ic != null) {
				ic.destroy();
			}
		}
	}
}
