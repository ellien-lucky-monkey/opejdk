package org.omg.CosNaming;

/**
* org/omg/CosNaming/NamingContextHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 2019年11月26日 星期二 下午05时52分47秒 CST
*/


/** 
 * A naming context is an object that contains a set of name bindings in 
 * which each name is unique. Different names can be bound to an object 
 * in the same or different contexts at the same time. <p>
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 */
public final class NamingContextHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.NamingContext value = null;

  public NamingContextHolder ()
  {
  }

  public NamingContextHolder (org.omg.CosNaming.NamingContext initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.NamingContextHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.NamingContextHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.NamingContextHelper.type ();
  }

}
