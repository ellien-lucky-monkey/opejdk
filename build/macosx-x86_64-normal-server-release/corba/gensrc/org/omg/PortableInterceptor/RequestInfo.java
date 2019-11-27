package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/RequestInfo.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* 2019年11月26日 星期二 下午05时52分48秒 CST
*/


/**
   * Request Information, accessible to Interceptors.
   * <p>
   * Each interception point is given an object through which the 
   * Interceptor can access request information. Client-side and server-side 
   * interception points are concerned with different information, so there 
   * are two information objects: <code>ClientRequestInfo</code> is passed 
   * to the client-side interception points and <code>ServerRequestInfo</code>
   * is passed to the server-side interception points. But there is 
   * information that is common to both, so they both inherit from a common 
   * interface: <code>RequestInfo</code>.
   *
   * @see ClientRequestInfo
   * @see ServerRequestInfo
   */
public interface RequestInfo extends RequestInfoOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface RequestInfo
