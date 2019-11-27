package org.omg.CosNaming;

/**
* org/omg/CosNaming/BindingTypeHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 2019年11月26日 星期二 下午05时52分47秒 CST
*/


/**
   * Specifies whether the given binding is for a object (that is not a
   * naming context) or for a naming context.
   */
public final class BindingTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.BindingType value = null;

  public BindingTypeHolder ()
  {
  }

  public BindingTypeHolder (org.omg.CosNaming.BindingType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.BindingTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.BindingTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.BindingTypeHelper.type ();
  }

}
