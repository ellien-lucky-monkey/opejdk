package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynFixedOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* 2019年11月26日 星期二 下午05时52分47秒 CST
*/


/**
    * DynFixed objects support the manipulation of IDL fixed values.
    * Because IDL does not have a generic type that can represent fixed types with arbitrary
    * number of digits and arbitrary scale, the operations use the IDL string type.
    */
public interface DynFixedOperations  extends org.omg.DynamicAny.DynAnyOperations
{

  /**
          * Returns the value of a DynFixed.
          */
  String get_value ();

  /**
          * Sets the value of the DynFixed.
          * The val string must contain a fixed string constant in the same format as used for IDL fixed-point literals.
          * However, the trailing d or D is optional. The return value is true if val can be represented as the DynFixed
          * without loss of precision. If val has more fractional digits than can be represented in the DynFixed,
          * fractional digits are truncated and the return value is false.
          *
          * @exception TypeMismatch If val does not contain a valid fixed-point literal or contains extraneous
          *            characters other than leading or trailing white space
          * @exception InvalidValue If val contains a value whose scale exceeds that of the DynFixed
          *            or is not initialized
          */
  boolean set_value (String val) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue;
} // interface DynFixedOperations
