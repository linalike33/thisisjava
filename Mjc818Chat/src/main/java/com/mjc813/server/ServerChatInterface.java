package com.mjc813.server;

public interface ServerChatInterface {
	void removeChatUser(ServerChatSocket cu);
	void sendAllClients(String msg);
}
