package org.omg.PortableServer;


/**
* org/omg/PortableServer/Current.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/PortableServer/poa.idl
* 2019年11月26日 星期二 下午05时52分48秒 CST
*/


/**
	 * The PortableServer::Current interface, derived from 
	 * CORBA::Current, provides method implementations with 
	 * access to the identity of the object on which the 
	 * method was invoked. The Current interface is provided 
	 * to support servants that implement multiple objects, 
	 * but can be used within the context of POA-dispatched 
	 * method invocations on any servant. To provide location 
	 * transparency, ORBs are required to support use of 
	 * Current in the context of both locally and remotely 
	 * invoked operations. An instance of Current can be 
	 * obtained by the application by issuing the 
	 * CORBA::ORB::resolve_initial_references("POACurrent") 
	 * operation. Thereafter, it can be used within the 
	 * context of a method dispatched by the POA to obtain 
	 * the POA and ObjectId that identify the object on 
	 * which that operation was invoked.
	 */
public interface Current extends CurrentOperations, org.omg.CORBA.Current, org.omg.CORBA.portable.IDLEntity 
{
} // interface Current
