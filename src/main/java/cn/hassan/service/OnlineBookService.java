package cn.hassan.service;

import Ice.Communicator;
import Ice.ObjectAdapter;
import cn.hassan.OnlineBookI;

public class OnlineBookService {
	public static void main(String[] args) {
		//创建一个通信器对象
		Communicator ic = null;
		try {
			//初始化通信器对象
			ic = Ice.Util.initialize(args);
			/*
			 * 创建名为 onlineBook 的 ObjectAdapter,并初始化之。
			 * 参数"onlineBook"：表示适配器的名字。
			 * 参数"default -p 10000"：表示适配器使用缺省协议（TCP/IP）
			 * 在端口 10000处监听到来的请求。
			 */
			ObjectAdapter onlineBookAdapter = ic.createObjectAdapterWithEndpoints("onlineBook", "default -p 10000");
			//处理逻辑的对象 ，此对象是返回给客户端的
			OnlineBookI bookI = new OnlineBookI();
			// 将 bookI 添加到适配器，并命名为"onlineBookService" 对客户端提供的名称为onlineBookService
			onlineBookAdapter.add(bookI, Ice.Util.stringToIdentity("onlineBookService"));
			onlineBookAdapter.activate();
			ic.waitForShutdown();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (ic != null) {
				ic.destroy();
			}
		}
	}
}
