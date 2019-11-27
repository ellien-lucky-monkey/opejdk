package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/BadServerDefinition.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* 2019年11月26日 星期二 下午05时52分47秒 CST
*/

public final class BadServerDefinition extends org.omg.CORBA.UserException
{
  public String reason = null;

  public BadServerDefinition ()
  {
    super(BadServerDefinitionHelper.id());
  } // ctor

  public BadServerDefinition (String _reason)
  {
    super(BadServerDefinitionHelper.id());
    reason = _reason;
  } // ctor


  public BadServerDefinition (String $reason, String _reason)
  {
    super(BadServerDefinitionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class BadServerDefinition
