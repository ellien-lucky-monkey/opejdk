package com.sun.corba.se.spi.activation.InitialNameServicePackage;


/**
* com/sun/corba/se/spi/activation/InitialNameServicePackage/NameAlreadyBound.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* 2019年11月26日 星期二 下午05时52分47秒 CST
*/

public final class NameAlreadyBound extends org.omg.CORBA.UserException
{

  public NameAlreadyBound ()
  {
    super(NameAlreadyBoundHelper.id());
  } // ctor


  public NameAlreadyBound (String $reason)
  {
    super(NameAlreadyBoundHelper.id() + "  " + $reason);
  } // ctor

} // class NameAlreadyBound
