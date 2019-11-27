package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ORBInitializerOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* 2019年11月26日 星期二 下午05时52分48秒 CST
*/


/**
   * Facilitates interceptor registration and ORB initialization.
   * <p>
   * Interceptors are intended to be a means by which ORB services gain 
   * access to ORB processing, effectively becoming part of the ORB. 
   * Since Interceptors are part of the ORB, when <code>ORB.init</code> 
   * returns an ORB, the Interceptors shall have been registered. 
   * Interceptors cannot be registered on an ORB after it has been 
   * returned by a call to <code>ORB.init</code>.
   * <p>
   * An Interceptor is registered by registering an associated 
   * <code>ORBInitializer</code> object which implements the 
   * <code>ORBInitializer</code> interface. When an ORB is initializing, 
   * it shall call each registered <code>ORBInitializer</code>, passing it 
   * an <code>ORBInitInfo</code> object which is used to register its 
   * Interceptor.
   * <p>
   * <b>Registering ORB Initializers in Java</b>
   * <p>
   * ORBInitializers are registered via Java ORB properties.
   * <p>
   * The property names are of the form: 
   *   <blockquote><code>
   *     org.omg.PortableInterceptor.ORBInitializerClass.&lt;Service&gt;
   *   </code></blockquote>
   * where <code>&lt;Service&gt;</code> is the string name of a class 
   * which implements 
   *   <blockquote><code>
   *     org.omg.PortableInterceptor.ORBInitializer
   *   </code></blockquote>
   * To avoid name collisions, the reverse DNS name convention should be 
   * used. For example, if company X has three initializers, it could define 
   * the following properties: 
   * <ul>
   *   <li><code>
   *     org.omg.PortableInterceptor.ORBInitializerClass.com.x.Init1
   *   </code></li>
   *   <li><code>
   *     org.omg.PortableInterceptor.ORBInitializerClass.com.x.Init2
   *   </code></li>
   *   <li><code>
   *     org.omg.PortableInterceptor.ORBInitializerClass.com.x.Init3
   *   </code></li>
   * </ul>
   * During ORB.init, these ORB properties which begin with 
   * <code>org.omg.PortableInterceptor.ORBInitializerClass</code> shall be 
   * collected, the <code>&lt;Service&gt;</code> portion of each property 
   * shall be extracted, an object shall be instantiated with the 
   * <code>&lt;Service&gt;</code> string as its class name, and the 
   * <code>pre_init</code> and <code>post_init</code> methods shall be 
   * called on that object. If there are any exceptions, the ORB shall 
   * ignore them and proceed. 
   * <p>
   * <b><i>Example</i></b>
   * <p>
   * A client-side logging service written by company X, for example, may 
   * have the following ORBInitializer implementation: 
   * <code><pre>
   * package com.x.logging;
   * 
   * import org.omg.PortableInterceptor.Interceptor; 
   * import org.omg.PortableInterceptor.ORBInitializer; 
   * import org.omg.PortableInterceptor.ORBInitInfo; 
   * 
   * public class LoggingService implements ORBInitializer { 
   *     void pre_init( ORBInitInfo info ) { 
   *         // Instantiate the Logging Service s Interceptor. 
   *         Interceptor interceptor = new LoggingInterceptor(); 
   *
   *         // Register the Logging Service s Interceptor. 
   *         info.add_client_request_interceptor( interceptor ); 
   *     } 
   * 
   *     void post_init( ORBInitInfo info ) { 
   *         // This service does not need two init points. 
   *     } 
   * } 
   * </pre></code>
   * To run a program called <code>MyApp</code> using this logging 
   * service, the user could type: 
   *   <blockquote><code>
   *     java 
   *-Dorg.omg.PortableInterceptor.ORBInitializerClass.com.x.Logging.LoggingService 
   *     MyApp
   *   </code></blockquote>
   * <p>
   * <b>Notes about Registering Interceptors</b>
   * <p>
   * Request Interceptors are registered on a per-ORB basis. 
   * <p>
   * To achieve virtual per-object Interceptors, query the policies on the 
   * target from within the interception points to determine whether they 
   * should do any work. 
   * <p>
   * To achieve virtual per-POA Interceptors, instantiate each POA with a 
   * different ORB. While Interceptors may be ordered administratively, 
   * there is no concept of order with respect to the registration of 
   * Interceptors. Request Interceptors are concerned with service contexts. 
   * Service contexts have no order, so there is no purpose for request 
   * Interceptors to have an order. IOR Interceptors are concerned with 
   * tagged components. Tagged components also have no order, so there 
   * is no purpose for IOR Interceptors to have an order. 
   * <p>
   * Registration code should avoid using the ORB (i.e., calling 
   * <code>ORB.init</code> with the provided <code>orb_id</code>). Since 
   * registration occurs during ORB initialization, results of invocations 
   * on this ORB while it is in this state are undefined. 
   * 
   * @see ORBInitInfo
   */
public interface ORBInitializerOperations 
{

  /** 
       * Called during ORB initialization.  If it is expected that initial 
       * services registered by an interceptor will be used by other 
       * interceptors, then those initial services shall be registered at 
       * this point via calls to 
       * <code>ORBInitInfo.register_initial_reference</code>. 
       * 
       * @param info provides initialization attributes and operations by 
       *     which Interceptors can be registered.
       */
  void pre_init (org.omg.PortableInterceptor.ORBInitInfo info);

  /**
       * Called during ORB initialization. If a service must resolve initial 
       * references as part of its initialization, it can assume that all 
       * initial references will be available at this point. 
       * <p>
       * Calling the <code>post_init</code> operations is not the final 
       * task of ORB initialization. The final task, following the 
       * <code>post_init</code> calls, is attaching the lists of registered 
       * interceptors to the ORB. Therefore, the ORB does not contain the 
       * interceptors during calls to <code>post_init</code>. If an 
       * ORB-mediated call is made from within <code>post_init</code>, no 
       * request interceptors will be invoked on that call. 
       * Likewise, if an operation is performed which causes an IOR to be 
       * created, no IOR interceptors will be invoked. 
       *
       * @param info provides initialization attributes and 
       *     operations by which Interceptors can be registered.
       */
  void post_init (org.omg.PortableInterceptor.ORBInitInfo info);
} // interface ORBInitializerOperations
