package org.omg.DynamicAny.DynAnyPackage;


/**
* org/omg/DynamicAny/DynAnyPackage/InvalidValue.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* 2019年11月26日 星期二 下午05时52分47秒 CST
*/

public final class InvalidValue extends org.omg.CORBA.UserException
{

  public InvalidValue ()
  {
    super(InvalidValueHelper.id());
  } // ctor


  public InvalidValue (String $reason)
  {
    super(InvalidValueHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidValue
