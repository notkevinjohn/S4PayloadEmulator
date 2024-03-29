package Events;

import java.util.EventObject;

public class CompleteConnectEvent extends EventObject 
{
	private static final long serialVersionUID = -1298252356347935141L;
	public String ip;
	public int port;
	public String name;
	public String type;

	public CompleteConnectEvent (Object source, String _ip, int _port, String name, String type)
	{
		super(source);
		ip = _ip;
		port = _port;
		this.name = name;
		this.type = type;
	}
}
