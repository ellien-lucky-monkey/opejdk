package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerAlreadyRegistered.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* 2019年11月26日 星期二 下午05时52分47秒 CST
*/

public final class ServerAlreadyRegistered extends org.omg.CORBA.UserException
{
  public int serverId = (int)0;

  public ServerAlreadyRegistered ()
  {
    super(ServerAlreadyRegisteredHelper.id());
  } // ctor

  public ServerAlreadyRegistered (int _serverId)
  {
    super(ServerAlreadyRegisteredHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerAlreadyRegistered (String $reason, int _serverId)
  {
    super(ServerAlreadyRegisteredHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerAlreadyRegistered
