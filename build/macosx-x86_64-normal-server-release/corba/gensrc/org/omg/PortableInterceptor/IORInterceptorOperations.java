package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/IORInterceptorOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* 2019年11月26日 星期二 下午05时52分48秒 CST
*/


/**
   * Interceptor used to establish tagged components in the profiles within 
   * an IOR.
   * <p>
   * In some cases, a portable ORB service implementation may need to add 
   * information describing the server's or object's ORB service related 
   * capabilities to object references in order to enable the ORB service 
   * implementation in the client to function properly. 
   * <p>
   * This is supported through the <code>IORInterceptor</code> and 
   * <code>IORInfo</code> interfaces. 
   *
   * @see IORInfo
   */
public interface IORInterceptorOperations  extends org.omg.PortableInterceptor.InterceptorOperations
{

  /**
       * A server side ORB calls the <code>establish_components</code> 
       * operation on all registered <code>IORInterceptor</code> instances 
       * when it is assembling the list of components that will be included 
       * in the profile or profiles of an object reference. This operation 
       * is not necessarily called for each individual object reference. 
       * In the case of the POA, this operation is called each time POA::create_POA
       * is called.  In any case, <code>establish_components</code> is 
       * guaranteed to be called at least once for each distinct set of 
       * server policies. 
       * <p>
       * An implementation of <code>establish_components</code> must not 
       * throw exceptions. If it does, the ORB shall ignore the exception 
       * and proceed to call the next IOR Interceptor's 
       * <code>establish_components</code> operation. 
       *
       * @param info The <code>IORInfo</code> instance used by the ORB 
       *     service to query applicable policies and add components to be 
       *     included in the generated IORs.
       */
  void establish_components (org.omg.PortableInterceptor.IORInfo info);
} // interface IORInterceptorOperations
