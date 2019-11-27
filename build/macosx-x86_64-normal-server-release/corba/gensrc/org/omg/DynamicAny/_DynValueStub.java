package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/_DynValueStub.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/ellien/jdk/jdk8/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* 2019年11月26日 星期二 下午05时52分47秒 CST
*/


/**
    * DynValue objects support the manipulation of IDL non-boxed value types.
    * The DynValue interface can represent both null and non-null value types.
    * For a DynValue representing a non-null value type, the DynValue's components comprise
    * the public and private members of the value type, including those inherited from concrete base value types,
    * in the order of definition. A DynValue representing a null value type has no components
    * and a current position of -1.
    * <P>Warning: Indiscriminantly changing the contents of private value type members can cause the value type
    * implementation to break by violating internal constraints. Access to private members is provided to support
    * such activities as ORB bridging and debugging and should not be used to arbitrarily violate
    * the encapsulation of the value type. 
    */
public class _DynValueStub extends org.omg.CORBA.portable.ObjectImpl implements org.omg.DynamicAny.DynValue
{
  final public static java.lang.Class _opsClass = DynValueOperations.class;



  /**
          * Returns the name of the member at the current position.
          * This operation may return an empty string since the TypeCode of the value being
          * manipulated may not contain the names of members.
          *
          * @exception TypeMismatch if the DynValue represents a null value type.
          * @exception InvalidValue if the current position does not indicate a member
          */
  public String current_member_name () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("current_member_name", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.current_member_name ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // current_member_name


  /**
          * Returns the TCKind associated with the member at the current position.
          *
          * @exception TypeMismatch if the DynValue represents a null value type.
          * @exception InvalidValue if the current position does not indicate a member
          */
  public org.omg.CORBA.TCKind current_member_kind () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("current_member_kind", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.current_member_kind ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // current_member_kind


  /**
          * Returns a sequence of NameValuePairs describing the name and the value of each member
          * in the value type.
          * The sequence contains members in the same order as the declaration order of members
          * as indicated by the DynValue's TypeCode. The current position is not affected.
          * The member names in the returned sequence will be empty strings if the DynValue's TypeCode
          * does not contain member names.
          *
          * @exception InvalidValue if this object represents a null value type
          */
  public org.omg.DynamicAny.NameValuePair[] get_members () throws org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_members", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_members ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_members


  /**
          * Initializes the value type's members from a sequence of NameValuePairs.
          * The operation sets the current position to zero if the passed sequences has non-zero length. Otherwise,
          * if an empty sequence is passed, the current position is set to -1.
          * A null value type can be initialized to a non-null value type using this method.
          * <P>Members must appear in the NameValuePairs in the order in which they appear in the IDL specification
          * of the value type as indicated by the DynValue's TypeCode or they must be empty strings.
          * The operation makes no attempt to assign member values based on member names.
          *
          * @exception TypeMismatch if the member names supplied in the passed sequence do not match the
          *            corresponding member name in the DynValue's TypeCode and they are not empty strings
          * @exception InvalidValue if the passed sequence has a number of elements that disagrees
          *            with the number of members as indicated by the DynValue's TypeCode
          */
  public void set_members (org.omg.DynamicAny.NameValuePair[] value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("set_members", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.set_members (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // set_members


  /**
          * Returns a sequence of NameDynAnyPairs describing the name and the value of each member
          * in the value type.
          * The sequence contains members in the same order as the declaration order of members
          * as indicated by the DynValue's TypeCode. The current position is not affected.
          * The member names in the returned sequence will be empty strings if the DynValue's TypeCode
          * does not contain member names.
          *
          * @exception InvalidValue if this object represents a null value type
          */
  public org.omg.DynamicAny.NameDynAnyPair[] get_members_as_dyn_any () throws org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_members_as_dyn_any", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_members_as_dyn_any ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_members_as_dyn_any


  /**
          * Initializes the value type's members from a sequence of NameDynAnyPairs.
          * The operation sets the current position to zero if the passed sequences has non-zero length. Otherwise,
          * if an empty sequence is passed, the current position is set to -1.
          * A null value type can be initialized to a non-null value type using this method.
          * <P>Members must appear in the NameDynAnyPairs in the order in which they appear in the IDL specification
          * of the value type as indicated by the DynValue's TypeCode or they must be empty strings.
          * The operation makes no attempt to assign member values based on member names.
          *
          * @exception TypeMismatch if the member names supplied in the passed sequence do not match the
          *            corresponding member name in the DynValue's TypeCode and they are not empty strings
          * @exception InvalidValue if the passed sequence has a number of elements that disagrees
          *            with the number of members as indicated by the DynValue's TypeCode
          */
  public void set_members_as_dyn_any (org.omg.DynamicAny.NameDynAnyPair[] value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("set_members_as_dyn_any", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.set_members_as_dyn_any (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // set_members_as_dyn_any


  /**
          * Returns true if the DynValueCommon represents a null value type.
          */
  public boolean is_null ()
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("is_null", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.is_null ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // is_null


  /**
          * Changes the representation of a DynValueCommon to a null value type.
          */
  public void set_to_null ()
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("set_to_null", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.set_to_null ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // set_to_null


  /**
          * Replaces a null value type with a newly constructed value. Its components are initialized
          * to default values as in DynAnyFactory.create_dyn_any_from_type_code.
          * If the DynValueCommon represents a non-null value type, then this operation has no effect. 
          */
  public void set_to_value ()
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("set_to_value", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.set_to_value ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // set_to_value


  /**
          * Returns the TypeCode associated with this DynAny object.
          * A DynAny object is created with a TypeCode value assigned to it.
          * This TypeCode value determines the type of the value handled through the DynAny object.
          * Note that the TypeCode associated with a DynAny object is initialized at the time the
          * DynAny is created and cannot be changed during lifetime of the DynAny object.
          *
          * @return The TypeCode associated with this DynAny object
          */
  public org.omg.CORBA.TypeCode type ()
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("type", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.type ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // type


  /**
          * Initializes the value associated with a DynAny object with the value
          * associated with another DynAny object.
          * The current position of the target DynAny is set to zero for values that have components
          * and to -1 for values that do not have components.
          *
          * @param dyn_any
          * @exception TypeMismatch if the type of the passed DynAny is not equivalent to the type of target DynAny
          */
  public void assign (org.omg.DynamicAny.DynAny dyn_any) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("assign", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.assign (dyn_any);
      } finally {
          _servant_postinvoke ($so);
      }
  } // assign


  /**
          * Initializes the value associated with a DynAny object with the value contained in an any.
          * The current position of the target DynAny is set to zero for values that have components
          * and to -1 for values that do not have components.
          *
          * @exception TypeMismatch if the type of the passed Any is not equivalent to the type of target DynAny
          * @exception InvalidValue if the passed Any does not contain a legal value (such as a null string)
          */
  public void from_any (org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("from_any", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.from_any (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // from_any


  /**
          * Creates an any value from a DynAny object.
          * A copy of the TypeCode associated with the DynAny object is assigned to the resulting any.
          * The value associated with the DynAny object is copied into the any.
          *
          * @return a new Any object with the same value and TypeCode
          */
  public org.omg.CORBA.Any to_any ()
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("to_any", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.to_any ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // to_any


  /**
          * Compares two DynAny values for equality.
          * Two DynAny values are equal if their TypeCodes are equivalent and, recursively, all component DynAnys
          * have equal values.
          * The current position of the two DynAnys being compared has no effect on the result of equal.
          *
          * @return true of the DynAnys are equal, false otherwise
          */
  public boolean equal (org.omg.DynamicAny.DynAny dyn_any)
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("equal", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.equal (dyn_any);
      } finally {
          _servant_postinvoke ($so);
      }
  } // equal


  /**
          * Destroys a DynAny object.
          * This operation frees any resources used to represent the data value associated with a DynAny object.
          * It must be invoked on references obtained from one of the creation operations on the ORB interface
          * or on a reference returned by DynAny.copy() to avoid resource leaks.
          * Invoking destroy on component DynAny objects (for example, on objects returned by the
          * current_component operation) does nothing.
          * Destruction of a DynAny object implies destruction of all DynAny objects obtained from it.
          * That is, references to components of a destroyed DynAny become invalid.
          * Invocations on such references raise OBJECT_NOT_EXIST.
          * It is possible to manipulate a component of a DynAny beyond the life time of the DynAny
          * from which the component was obtained by making a copy of the component with the copy operation
          * before destroying the DynAny from which the component was obtained.
          */
  public void destroy ()
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("destroy", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.destroy ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // destroy


  /**
          * Creates a new DynAny object whose value is a deep copy of the DynAny on which it is invoked.
          * The operation is polymorphic, that is, invoking it on one of the types derived from DynAny,
          * such as DynStruct, creates the derived type but returns its reference as the DynAny base type.
          *
          * @return a deep copy of the DynAny object
          */
  public org.omg.DynamicAny.DynAny copy ()
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("copy", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.copy ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // copy


  /**
          * Inserts a boolean value into the DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_boolean (boolean value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_boolean", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_boolean (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_boolean


  /**
          * Inserts a byte value into the DynAny. The IDL octet data type is mapped to the Java byte data type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_octet (byte value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_octet", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_octet (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_octet


  /**
          * Inserts a char value into the DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_char (char value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_char", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_char (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_char


  /**
          * Inserts a short value into the DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_short (short value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_short", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_short (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_short


  /**
          * Inserts a short value into the DynAny. The IDL ushort data type is mapped to the Java short data type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_ushort (short value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_ushort", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_ushort (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_ushort


  /**
          * Inserts an integer value into the DynAny. The IDL long data type is mapped to the Java int data type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_long (int value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_long", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_long (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_long


  /**
          * Inserts an integer value into the DynAny. The IDL ulong data type is mapped to the Java int data type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_ulong (int value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_ulong", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_ulong (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_ulong


  /**
          * Inserts a float value into the DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_float (float value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_float", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_float (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_float


  /**
          * Inserts a double value into the DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_double (double value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_double", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_double (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_double


  /**
          * Inserts a string value into the DynAny.
          * Both bounded and unbounded strings are inserted using this method.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception InvalidValue if the string inserted is longer than the bound of a bounded string
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_string (String value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_string", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_string (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_string


  /**
          * Inserts a reference to a CORBA object into the DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_reference (org.omg.CORBA.Object value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_reference", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_reference (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_reference


  /**
          * Inserts a TypeCode object into the DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_typecode (org.omg.CORBA.TypeCode value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_typecode", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_typecode (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_typecode


  /**
          * Inserts a long value into the DynAny. The IDL long long data type is mapped to the Java long data type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_longlong (long value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_longlong", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_longlong (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_longlong


  /**
          * Inserts a long value into the DynAny.
          * The IDL unsigned long long data type is mapped to the Java long data type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_ulonglong (long value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_ulonglong", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_ulonglong (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_ulonglong


  /**
          * Inserts a char value into the DynAny. The IDL wchar data type is mapped to the Java char data type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_wchar (char value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_wchar", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_wchar (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_wchar


  /**
          * Inserts a string value into the DynAny.
          * Both bounded and unbounded strings are inserted using this method.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception InvalidValue if the string inserted is longer than the bound of a bounded string
          */
  public void insert_wstring (String value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_wstring", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_wstring (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_wstring


  /**
          * Inserts an Any value into the Any represented by this DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_any (org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_any", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_any (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_any


  /**
          * Inserts the Any value contained in the parameter DynAny into the Any represented by this DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_dyn_any (org.omg.DynamicAny.DynAny value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_dyn_any", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_dyn_any (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_dyn_any


  /**
          * Inserts a reference to a Serializable object into this DynAny.
          * The IDL ValueBase type is mapped to the Java Serializable type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_val (java.io.Serializable value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("insert_val", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.insert_val (value);
      } finally {
          _servant_postinvoke ($so);
      }
  } // insert_val


  /**
          * Extracts the boolean value from this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public boolean get_boolean () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_boolean", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_boolean ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_boolean


  /**
          * Extracts the byte value from this DynAny. The IDL octet data type is mapped to the Java byte data type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public byte get_octet () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_octet", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_octet ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_octet


  /**
          * Extracts the char value from this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public char get_char () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_char", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_char ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_char


  /**
          * Extracts the short value from this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public short get_short () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_short", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_short ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_short


  /**
          * Extracts the short value from this DynAny. The IDL ushort data type is mapped to the Java short data type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public short get_ushort () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_ushort", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_ushort ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_ushort


  /**
          * Extracts the integer value from this DynAny. The IDL long data type is mapped to the Java int data type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public int get_long () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_long", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_long ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_long


  /**
          * Extracts the integer value from this DynAny. The IDL ulong data type is mapped to the Java int data type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public int get_ulong () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_ulong", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_ulong ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_ulong


  /**
          * Extracts the float value from this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public float get_float () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_float", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_float ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_float


  /**
          * Extracts the double value from this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public double get_double () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_double", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_double ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_double


  /**
          * Extracts the string value from this DynAny.
          * Both bounded and unbounded strings are extracted using this method.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public String get_string () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_string", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_string ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_string


  /**
          * Extracts the reference to a CORBA Object from this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public org.omg.CORBA.Object get_reference () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_reference", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_reference ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_reference


  /**
          * Extracts the TypeCode object from this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public org.omg.CORBA.TypeCode get_typecode () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_typecode", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_typecode ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_typecode


  /**
          * Extracts the long value from this DynAny. The IDL long long data type is mapped to the Java long data type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public long get_longlong () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_longlong", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_longlong ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_longlong


  /**
          * Extracts the long value from this DynAny.
          * The IDL unsigned long long data type is mapped to the Java long data type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public long get_ulonglong () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_ulonglong", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_ulonglong ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_ulonglong


  /**
          * Extracts the long value from this DynAny. The IDL wchar data type is mapped to the Java char data type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public char get_wchar () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_wchar", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_wchar ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_wchar


  /**
          * Extracts the string value from this DynAny.
          * Both bounded and unbounded strings are extracted using this method.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public String get_wstring () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_wstring", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_wstring ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_wstring


  /**
          * Extracts an Any value contained in the Any represented by this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public org.omg.CORBA.Any get_any () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_any", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_any ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_any


  /**
          * Extracts the Any value contained in the Any represented by this DynAny and returns it wrapped
          * into a new DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public org.omg.DynamicAny.DynAny get_dyn_any () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_dyn_any", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_dyn_any ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_dyn_any


  /**
          * Extracts a Serializable object from this DynAny.
          * The IDL ValueBase type is mapped to the Java Serializable type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public java.io.Serializable get_val () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("get_val", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.get_val ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // get_val


  /**
          * Sets the current position to index. The current position is indexed 0 to n-1, that is,
          * index zero corresponds to the first component. The operation returns true if the resulting
          * current position indicates a component of the DynAny and false if index indicates
          * a position that does not correspond to a component.
          * Calling seek with a negative index is legal. It sets the current position to -1 to indicate
          * no component and returns false. Passing a non-negative index value for a DynAny that does not
          * have a component at the corresponding position sets the current position to -1 and returns false.
          */
  public boolean seek (int index)
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("seek", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.seek (index);
      } finally {
          _servant_postinvoke ($so);
      }
  } // seek


  /**
          * Is equivalent to seek(0).
          */
  public void rewind ()
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("rewind", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         $self.rewind ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // rewind


  /**
          * Advances the current position to the next component.
          * The operation returns true while the resulting current position indicates a component, false otherwise.
          * A false return value leaves the current position at -1.
          * Invoking next on a DynAny without components leaves the current position at -1 and returns false.
          */
  public boolean next ()
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("next", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.next ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // next


  /**
          * Returns the number of components of a DynAny.
          * For a DynAny without components, it returns zero.
          * The operation only counts the components at the top level.
          * For example, if component_count is invoked on a DynStruct with a single member,
          * the return value is 1, irrespective of the type of the member.
          * <UL>
          * <LI>For sequences, the operation returns the current number of elements.
          * <LI>For structures, exceptions, and value types, the operation returns the number of members.
          * <LI>For arrays, the operation returns the number of elements.
          * <LI>For unions, the operation returns 2 if the discriminator indicates that a named member is active,
          * otherwise, it returns 1.
          * <LI>For DynFixed and DynEnum, the operation returns zero.
          * </UL>
          */
  public int component_count ()
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("component_count", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.component_count ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // component_count


  /**
          * Returns the DynAny for the component at the current position.
          * It does not advance the current position, so repeated calls to current_component
          * without an intervening call to rewind, next, or seek return the same component.
          * The returned DynAny object reference can be used to get/set the value of the current component.
          * If the current component represents a complex type, the returned reference can be narrowed
          * based on the TypeCode to get the interface corresponding to the to the complex type.
          * Calling current_component on a DynAny that cannot have components,
          * such as a DynEnum or an empty exception, raises TypeMismatch.
          * Calling current_component on a DynAny whose current position is -1 returns a nil reference.
          * The iteration operations, together with current_component, can be used
          * to dynamically compose an any value. After creating a dynamic any, such as a DynStruct,
          * current_component and next can be used to initialize all the components of the value.
          * Once the dynamic value is completely initialized, to_any creates the corresponding any value.
          *
          * @exception TypeMismatch If called on a DynAny that cannot have components,
          * such as a DynEnum or an empty exception
          */
  public org.omg.DynamicAny.DynAny current_component () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch
  {
      org.omg.CORBA.portable.ServantObject $so = _servant_preinvoke ("current_component", _opsClass);
      DynValueOperations  $self = (DynValueOperations) $so.servant;

      try {
         return $self.current_component ();
      } finally {
          _servant_postinvoke ($so);
      }
  } // current_component

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/DynamicAny/DynValue:1.0", 
    "IDL:omg.org/DynamicAny/DynValueCommon:1.0", 
    "IDL:omg.org/DynamicAny/DynAny:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _DynValueStub
