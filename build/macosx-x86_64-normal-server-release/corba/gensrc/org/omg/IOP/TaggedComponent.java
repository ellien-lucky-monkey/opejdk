package org.omg.IOP;


/**
* org/omg/IOP/TaggedComponent.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* 2019年11月26日 星期二 下午05时52分48秒 CST
*/

public final class TaggedComponent implements org.omg.CORBA.portable.IDLEntity
{

  /** The tag, represented as a component id. */
  public int tag = (int)0;

  /** The component data associated with the component id. */
  public byte component_data[] = null;

  public TaggedComponent ()
  {
  } // ctor

  public TaggedComponent (int _tag, byte[] _component_data)
  {
    tag = _tag;
    component_data = _component_data;
  } // ctor

} // class TaggedComponent
