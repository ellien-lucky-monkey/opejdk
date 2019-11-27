package org.omg.IOP;


/**
* org/omg/IOP/CodecFactoryOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* 2019年11月26日 星期二 下午05时52分48秒 CST
*/


/**
   * <code>Codecs</code> are obtained from the <code>CodecFactory</code>. 
   * The <code>CodecFactory</code> is obtained through a call to 
   * <code>ORB.resolve_initial_references( "CodecFactory" )</code>.
   */
public interface CodecFactoryOperations 
{

  /**
       * Create a <code>Codec</code> of the given encoding.
       * <p>
       * @param enc The encoding for which to create a <code>Codec</code>.
       * @return A <code>Codec</code> obtained with the given encoding.
       * @exception UnknownEncoding thrown if this factory cannot create a 
       *     <code>Codec</code> of the given encoding.
       */
  org.omg.IOP.Codec create_codec (org.omg.IOP.Encoding enc) throws org.omg.IOP.CodecFactoryPackage.UnknownEncoding;
} // interface CodecFactoryOperations
