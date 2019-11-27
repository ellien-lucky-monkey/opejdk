package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/EndPointInfo.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* 2019年11月26日 星期二 下午05时52分47秒 CST
*/

public final class EndPointInfo implements org.omg.CORBA.portable.IDLEntity
{
  public String endpointType = null;
  public int port = (int)0;

  public EndPointInfo ()
  {
  } // ctor

  public EndPointInfo (String _endpointType, int _port)
  {
    endpointType = _endpointType;
    port = _port;
  } // ctor

} // class EndPointInfo
