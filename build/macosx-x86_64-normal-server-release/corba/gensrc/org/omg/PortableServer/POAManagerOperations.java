package org.omg.PortableServer;


/**
* org/omg/PortableServer/POAManagerOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/PortableServer/poa.idl
* 2019年11月26日 星期二 下午05时52分48秒 CST
*/


/**
	 * Each POA object has an associated POAManager object. 
	 * A POA manager may be associated with one or more 
	 * POA objects. A POA manager encapsulates the processing 
	 * state of the POAs it is associated with.
	 */
public interface POAManagerOperations 
{

  /**
  	 * This operation changes the state of the POA manager 
  	 * to active, causing associated POAs to start processing
  	 * requests.
  	 * @exception AdapterInactive is raised if the operation is
  	 *            invoked on the POAManager in inactive state.
  	 */
  void activate () throws org.omg.PortableServer.POAManagerPackage.AdapterInactive;

  /**
  	 * This operation changes the state of the POA manager 
  	 * to holding, causing associated POAs to queue incoming
  	 * requests.
  	 * @param wait_for_completion if FALSE, the operation 
  	 *            returns immediately after changing state.  
  	 *            If TRUE, it waits for all active requests 
  	 *            to complete. 
  	 * @exception AdapterInactive is raised if the operation is
  	 *            invoked on the POAManager in inactive state.
  	 */
  void hold_requests (boolean wait_for_completion) throws org.omg.PortableServer.POAManagerPackage.AdapterInactive;

  /**
  	 * This operation changes the state of the POA manager 
  	 * to discarding. This causes associated POAs to discard
  	 * incoming requests.
  	 * @param wait_for_completion if FALSE, the operation 
  	 *            returns immediately after changing state.  
  	 *            If TRUE, it waits for all active requests 
  	 *            to complete. 
  	 * @exception AdapterInactive is raised if the operation is
  	 *            invoked on the POAManager in inactive state.
  	 */
  void discard_requests (boolean wait_for_completion) throws org.omg.PortableServer.POAManagerPackage.AdapterInactive;

  /**
  	 * This operation changes the state of the POA manager 
  	 * to inactive, causing associated POAs to reject the
  	 * requests that have not begun executing as well as
  	 * as any new requests.
  	 * @param etherealize_objects a flag to indicate whether
  	 *        to invoke the etherealize operation of the
  	 *        associated servant manager for all active 
  	 *        objects.
  	 * @param wait_for_completion if FALSE, the operation 
  	 *            returns immediately after changing state.  
  	 *            If TRUE, it waits for all active requests 
  	 *            to complete. 
  	 * @exception AdapterInactive is raised if the operation is
  	 *            invoked on the POAManager in inactive state.
  	 */
  void deactivate (boolean etherealize_objects, boolean wait_for_completion) throws org.omg.PortableServer.POAManagerPackage.AdapterInactive;

  /**
  	 * This operation returns the state of the POA manager.
  	 */
  org.omg.PortableServer.POAManagerPackage.State get_state ();
} // interface POAManagerOperations