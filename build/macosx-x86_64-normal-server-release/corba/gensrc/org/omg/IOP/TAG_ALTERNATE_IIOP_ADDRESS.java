package org.omg.IOP;


/**
* org/omg/IOP/TAG_ALTERNATE_IIOP_ADDRESS.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* 2019年11月26日 星期二 下午05时52分48秒 CST
*/

public interface TAG_ALTERNATE_IIOP_ADDRESS
{

  /**
       * In cases where the same object key is used for more than one 
       * internet location, the following standard IOR Component is defined 
       * for support in IIOP version 1.2. 
       * <p>
       * The <code>TAG_ALTERNATE_IIOP_ADDRESS</code> component has an 
       * associated value of type:
       * <code>
       *   <pre>
       *     struct { 
       *         string HostID, 
       *         short Port 
       *     }; 
       *   </pre>
       * </code>
       * encoded as a CDR encapsulation. 
       * <p>
       * Zero or more instances of the <code>TAG_ALTERNATE_IIOP_ADDRESS</code> 
       * component type may be included in a version 1.2 
       * <code>TAG_INTERNET_IOP</code> Profile. Each of these alternative 
       * addresses may be used by the client orb, in addition to the host 
       * and port address expressed in the body of the Profile. In cases 
       * where one or more <code>TAG_ALTERNATE_IIOP_ADDRESS</code> components 
       * are present in a <code>TAG_INTERNET_IOP</code> Profile, no order of 
       * use is prescribed by Version 1.2 of IIOP.
       */
  public static final int value = (int)(3L);
}
