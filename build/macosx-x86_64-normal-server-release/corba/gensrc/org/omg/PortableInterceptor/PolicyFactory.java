package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/PolicyFactory.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* 2019年11月26日 星期二 下午05时52分48秒 CST
*/


/**
   * Enables policy types to be constructed using 
   * <code>CORBA.ORB.create_policy</code>.
   * <p>
   * A portable ORB service implementation registers an instance of the 
   * <code>PolicyFactory</code> interface during ORB initialization in order 
   * to enable its policy types to be constructed using 
   * <code>CORBA.ORB.create_policy</code>. The POA is required to preserve 
   * any policy which is registered with <code>ORBInitInfo</code> in this 
   * manner.
   *
   * @see ORBInitInfo#register_policy_factory
   */
public interface PolicyFactory extends PolicyFactoryOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface PolicyFactory
