package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ObjectReferenceFactory.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* 2019年11月26日 星期二 下午05时52分48秒 CST
*/


/** The object reference factory.  This provides the capability of
  * creating an object reference.
  */
public interface ObjectReferenceFactory extends org.omg.CORBA.portable.ValueBase
{

  /** make_object creates a CORBA object reference according
      * to the data in this template, with the given repository ID and
      * object ID.
      */
  public abstract org.omg.CORBA.Object make_object (String repositoryId, byte[] object_id);

} // interface ObjectReferenceFactory
