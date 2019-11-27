package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/ServerManagerHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* 2019年11月26日 星期二 下午05时52分47秒 CST
*/


/** Interface used to combine the Activator and Locator when both are
    * implemented together in the same process, as is currently the case
    * for our implementation.
    */
public final class ServerManagerHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.ServerManager value = null;

  public ServerManagerHolder ()
  {
  }

  public ServerManagerHolder (com.sun.corba.se.PortableActivationIDL.ServerManager initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.ServerManagerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.ServerManagerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.ServerManagerHelper.type ();
  }

}
