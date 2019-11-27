package org.omg.IOP;


/**
* org/omg/IOP/Encoding.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* 2019年11月26日 星期二 下午05时52分48秒 CST
*/

public final class Encoding implements org.omg.CORBA.portable.IDLEntity
{

  /**
       * The encoding format.
       */
  public short format = (short)0;

  /**
       * The major version of this Encoding format.
       */
  public byte major_version = (byte)0;

  /**
       * The minor version of this Encoding format.
       */
  public byte minor_version = (byte)0;

  public Encoding ()
  {
  } // ctor

  public Encoding (short _format, byte _major_version, byte _minor_version)
  {
    format = _format;
    major_version = _major_version;
    minor_version = _minor_version;
  } // ctor

} // class Encoding
