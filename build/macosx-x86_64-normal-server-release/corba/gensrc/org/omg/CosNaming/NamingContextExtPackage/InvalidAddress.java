package org.omg.CosNaming.NamingContextExtPackage;


/**
* org/omg/CosNaming/NamingContextExtPackage/InvalidAddress.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 2019年11月26日 星期二 下午05时52分47秒 CST
*/

public final class InvalidAddress extends org.omg.CORBA.UserException
{

  public InvalidAddress ()
  {
    super(InvalidAddressHelper.id());
  } // ctor


  public InvalidAddress (String $reason)
  {
    super(InvalidAddressHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidAddress
