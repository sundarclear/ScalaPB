// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.struct

import scala.collection.JavaConverters._

/** `Value` represents a dynamically typed value which can be either
  * null, a number, a string, a boolean, a recursive struct value, or a
  * list of values. A producer of value is expected to set one of that
  * variants, absence of any variant indicates an error.
  *
  * The JSON representation for `Value` is JSON value.
  */
@SerialVersionUID(0L)
final case class Value(
    kind: com.google.protobuf.struct.Value.Kind = com.google.protobuf.struct.Value.Kind.Empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Value] with com.trueaccord.lenses.Updatable[Value] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (kind.nullValue.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, kind.nullValue.get.value) }
      if (kind.numberValue.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, kind.numberValue.get) }
      if (kind.stringValue.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeStringSize(3, kind.stringValue.get) }
      if (kind.boolValue.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, kind.boolValue.get) }
      if (kind.structValue.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(kind.structValue.get.serializedSize) + kind.structValue.get.serializedSize }
      if (kind.listValue.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(kind.listValue.get.serializedSize) + kind.listValue.get.serializedSize }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: com.google.protobuf.CodedOutputStream): Unit = {
      kind.nullValue.foreach { __v =>
        _output__.writeEnum(1, __v.value)
      };
      kind.numberValue.foreach { __v =>
        _output__.writeDouble(2, __v)
      };
      kind.stringValue.foreach { __v =>
        _output__.writeString(3, __v)
      };
      kind.boolValue.foreach { __v =>
        _output__.writeBool(4, __v)
      };
      kind.structValue.foreach { __v =>
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      kind.listValue.foreach { __v =>
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.struct.Value = {
      var __kind = this.kind
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __kind = com.google.protobuf.struct.Value.Kind.NullValue(com.google.protobuf.struct.NullValue.fromValue(_input__.readEnum()))
          case 17 =>
            __kind = com.google.protobuf.struct.Value.Kind.NumberValue(_input__.readDouble())
          case 26 =>
            __kind = com.google.protobuf.struct.Value.Kind.StringValue(_input__.readString())
          case 32 =>
            __kind = com.google.protobuf.struct.Value.Kind.BoolValue(_input__.readBool())
          case 42 =>
            __kind = com.google.protobuf.struct.Value.Kind.StructValue(com.trueaccord.scalapb.LiteParser.readMessage(_input__, kind.structValue.getOrElse(com.google.protobuf.struct.Struct.defaultInstance)))
          case 50 =>
            __kind = com.google.protobuf.struct.Value.Kind.ListValue(com.trueaccord.scalapb.LiteParser.readMessage(_input__, kind.listValue.getOrElse(com.google.protobuf.struct.ListValue.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.struct.Value(
          kind = __kind
      )
    }
    def getNullValue: com.google.protobuf.struct.NullValue = kind.nullValue.getOrElse(com.google.protobuf.struct.NullValue.NULL_VALUE)
    def withNullValue(__v: com.google.protobuf.struct.NullValue): Value = copy(kind = com.google.protobuf.struct.Value.Kind.NullValue(__v))
    def getNumberValue: Double = kind.numberValue.getOrElse(0.0)
    def withNumberValue(__v: Double): Value = copy(kind = com.google.protobuf.struct.Value.Kind.NumberValue(__v))
    def getStringValue: String = kind.stringValue.getOrElse("")
    def withStringValue(__v: String): Value = copy(kind = com.google.protobuf.struct.Value.Kind.StringValue(__v))
    def getBoolValue: Boolean = kind.boolValue.getOrElse(false)
    def withBoolValue(__v: Boolean): Value = copy(kind = com.google.protobuf.struct.Value.Kind.BoolValue(__v))
    def getStructValue: com.google.protobuf.struct.Struct = kind.structValue.getOrElse(com.google.protobuf.struct.Struct.defaultInstance)
    def withStructValue(__v: com.google.protobuf.struct.Struct): Value = copy(kind = com.google.protobuf.struct.Value.Kind.StructValue(__v))
    def getListValue: com.google.protobuf.struct.ListValue = kind.listValue.getOrElse(com.google.protobuf.struct.ListValue.defaultInstance)
    def withListValue(__v: com.google.protobuf.struct.ListValue): Value = copy(kind = com.google.protobuf.struct.Value.Kind.ListValue(__v))
    def clearKind: Value = copy(kind = com.google.protobuf.struct.Value.Kind.Empty)
    def withKind(__v: com.google.protobuf.struct.Value.Kind): Value = copy(kind = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => kind.nullValue.map(_.valueDescriptor).getOrElse(null)
        case 2 => kind.numberValue.getOrElse(null)
        case 3 => kind.stringValue.getOrElse(null)
        case 4 => kind.boolValue.getOrElse(null)
        case 5 => kind.structValue.getOrElse(null)
        case 6 => kind.listValue.getOrElse(null)
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.struct.Value
}

object Value extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.struct.Value] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.struct.Value, com.google.protobuf.Value] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.struct.Value] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.struct.Value, com.google.protobuf.Value] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.struct.Value): com.google.protobuf.Value = {
    val javaPbOut = com.google.protobuf.Value.newBuilder
    scalaPbSource.kind.nullValue.map(_.value).foreach(javaPbOut.setNullValueValue)
    scalaPbSource.kind.numberValue.foreach(javaPbOut.setNumberValue)
    scalaPbSource.kind.stringValue.foreach(javaPbOut.setStringValue)
    scalaPbSource.kind.boolValue.foreach(javaPbOut.setBoolValue)
    scalaPbSource.kind.structValue.map(com.google.protobuf.struct.Struct.toJavaProto(_)).foreach(javaPbOut.setStructValue)
    scalaPbSource.kind.listValue.map(com.google.protobuf.struct.ListValue.toJavaProto(_)).foreach(javaPbOut.setListValue)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.Value): com.google.protobuf.struct.Value = com.google.protobuf.struct.Value(
    kind = javaPbSource.getKindCase.getNumber match {
      case 1 => com.google.protobuf.struct.Value.Kind.NullValue(com.google.protobuf.struct.NullValue.fromJavaValue(javaPbSource.getNullValue))
      case 2 => com.google.protobuf.struct.Value.Kind.NumberValue(javaPbSource.getNumberValue.doubleValue)
      case 3 => com.google.protobuf.struct.Value.Kind.StringValue(javaPbSource.getStringValue)
      case 4 => com.google.protobuf.struct.Value.Kind.BoolValue(javaPbSource.getBoolValue.booleanValue)
      case 5 => com.google.protobuf.struct.Value.Kind.StructValue(com.google.protobuf.struct.Struct.fromJavaProto(javaPbSource.getStructValue))
      case 6 => com.google.protobuf.struct.Value.Kind.ListValue(com.google.protobuf.struct.ListValue.fromJavaProto(javaPbSource.getListValue))
      case _ => com.google.protobuf.struct.Value.Kind.Empty
    }
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.struct.Value = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.struct.Value(
      kind = __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => com.google.protobuf.struct.Value.Kind.NullValue(com.google.protobuf.struct.NullValue.fromValue(__e.getNumber))) orElse
__fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[Double]].map(com.google.protobuf.struct.Value.Kind.NumberValue(_)) orElse
__fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[String]].map(com.google.protobuf.struct.Value.Kind.StringValue(_)) orElse
__fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[Boolean]].map(com.google.protobuf.struct.Value.Kind.BoolValue(_)) orElse
__fieldsMap.get(__fields.get(4)).asInstanceOf[scala.Option[com.google.protobuf.struct.Struct]].map(com.google.protobuf.struct.Value.Kind.StructValue(_)) orElse
__fieldsMap.get(__fields.get(5)).asInstanceOf[scala.Option[com.google.protobuf.struct.ListValue]].map(com.google.protobuf.struct.Value.Kind.ListValue(_)) getOrElse com.google.protobuf.struct.Value.Kind.Empty
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = StructProto.descriptor.getMessageTypes.get(1)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 5 => __out = com.google.protobuf.struct.Struct
      case 6 => __out = com.google.protobuf.struct.ListValue
    }
  __out
  }
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    __field.getNumber match {
      case 1 => com.google.protobuf.struct.NullValue
    }
  }
  lazy val defaultInstance = com.google.protobuf.struct.Value(
  )
  sealed trait Kind extends com.trueaccord.scalapb.GeneratedOneof {
    def isEmpty: Boolean = false
    def isDefined: Boolean = true
    def number: Int
    def isNullValue: Boolean = false
    def isNumberValue: Boolean = false
    def isStringValue: Boolean = false
    def isBoolValue: Boolean = false
    def isStructValue: Boolean = false
    def isListValue: Boolean = false
    def nullValue: scala.Option[com.google.protobuf.struct.NullValue] = None
    def numberValue: scala.Option[Double] = None
    def stringValue: scala.Option[String] = None
    def boolValue: scala.Option[Boolean] = None
    def structValue: scala.Option[com.google.protobuf.struct.Struct] = None
    def listValue: scala.Option[com.google.protobuf.struct.ListValue] = None
  }
  object Kind extends {
    @SerialVersionUID(0L)
    case object Empty extends com.google.protobuf.struct.Value.Kind {
      override def isEmpty: Boolean = true
      override def isDefined: Boolean = false
      override def number: Int = 0
    }
  
    @SerialVersionUID(0L)
    case class NullValue(value: com.google.protobuf.struct.NullValue) extends com.google.protobuf.struct.Value.Kind {
      override def isNullValue: Boolean = true
      override def nullValue: scala.Option[com.google.protobuf.struct.NullValue] = Some(value)
      override def number: Int = 1
    }
    @SerialVersionUID(0L)
    case class NumberValue(value: Double) extends com.google.protobuf.struct.Value.Kind {
      override def isNumberValue: Boolean = true
      override def numberValue: scala.Option[Double] = Some(value)
      override def number: Int = 2
    }
    @SerialVersionUID(0L)
    case class StringValue(value: String) extends com.google.protobuf.struct.Value.Kind {
      override def isStringValue: Boolean = true
      override def stringValue: scala.Option[String] = Some(value)
      override def number: Int = 3
    }
    @SerialVersionUID(0L)
    case class BoolValue(value: Boolean) extends com.google.protobuf.struct.Value.Kind {
      override def isBoolValue: Boolean = true
      override def boolValue: scala.Option[Boolean] = Some(value)
      override def number: Int = 4
    }
    @SerialVersionUID(0L)
    case class StructValue(value: com.google.protobuf.struct.Struct) extends com.google.protobuf.struct.Value.Kind {
      override def isStructValue: Boolean = true
      override def structValue: scala.Option[com.google.protobuf.struct.Struct] = Some(value)
      override def number: Int = 5
    }
    @SerialVersionUID(0L)
    case class ListValue(value: com.google.protobuf.struct.ListValue) extends com.google.protobuf.struct.Value.Kind {
      override def isListValue: Boolean = true
      override def listValue: scala.Option[com.google.protobuf.struct.ListValue] = Some(value)
      override def number: Int = 6
    }
  }
  implicit class ValueLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.struct.Value]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.struct.Value](_l) {
    def nullValue: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.struct.NullValue] = field(_.getNullValue)((c_, f_) => c_.copy(kind = com.google.protobuf.struct.Value.Kind.NullValue(f_)))
    def numberValue: com.trueaccord.lenses.Lens[UpperPB, Double] = field(_.getNumberValue)((c_, f_) => c_.copy(kind = com.google.protobuf.struct.Value.Kind.NumberValue(f_)))
    def stringValue: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getStringValue)((c_, f_) => c_.copy(kind = com.google.protobuf.struct.Value.Kind.StringValue(f_)))
    def boolValue: com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.getBoolValue)((c_, f_) => c_.copy(kind = com.google.protobuf.struct.Value.Kind.BoolValue(f_)))
    def structValue: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.struct.Struct] = field(_.getStructValue)((c_, f_) => c_.copy(kind = com.google.protobuf.struct.Value.Kind.StructValue(f_)))
    def listValue: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.struct.ListValue] = field(_.getListValue)((c_, f_) => c_.copy(kind = com.google.protobuf.struct.Value.Kind.ListValue(f_)))
    def kind: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.struct.Value.Kind] = field(_.kind)((c_, f_) => c_.copy(kind = f_))
  }
  final val NULL_VALUE_FIELD_NUMBER = 1
  final val NUMBER_VALUE_FIELD_NUMBER = 2
  final val STRING_VALUE_FIELD_NUMBER = 3
  final val BOOL_VALUE_FIELD_NUMBER = 4
  final val STRUCT_VALUE_FIELD_NUMBER = 5
  final val LIST_VALUE_FIELD_NUMBER = 6
}
