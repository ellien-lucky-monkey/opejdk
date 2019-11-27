package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/WrongPolicy.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/PortableServer/poa.idl
* 2019年11月26日 星期二 下午05时52分48秒 CST
*/

public final class WrongPolicy extends org.omg.CORBA.UserException
{

  public WrongPolicy ()
  {
    super(WrongPolicyHelper.id());
  } // ctor


  public WrongPolicy (String $reason)
  {
    super(WrongPolicyHelper.id() + "  " + $reason);
  } // ctor

} // class WrongPolicy
