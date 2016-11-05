// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

import scala.collection.JavaConverters._

/** Describes a message type.
  *
  * @param reservedName
  *   Reserved field names, which may not be used by fields in the same message.
  *   A given name may only be reserved once.
  */
@SerialVersionUID(0L)
final case class DescriptorProto(
    name: scala.Option[String] = None,
    field: scala.collection.Seq[com.google.protobuf.descriptor.FieldDescriptorProto] = Nil,
    extension: scala.collection.Seq[com.google.protobuf.descriptor.FieldDescriptorProto] = Nil,
    nestedType: scala.collection.Seq[com.google.protobuf.descriptor.DescriptorProto] = Nil,
    enumType: scala.collection.Seq[com.google.protobuf.descriptor.EnumDescriptorProto] = Nil,
    extensionRange: scala.collection.Seq[com.google.protobuf.descriptor.DescriptorProto.ExtensionRange] = Nil,
    oneofDecl: scala.collection.Seq[com.google.protobuf.descriptor.OneofDescriptorProto] = Nil,
    options: scala.Option[com.google.protobuf.descriptor.MessageOptions] = None,
    reservedRange: scala.collection.Seq[com.google.protobuf.descriptor.DescriptorProto.ReservedRange] = Nil,
    reservedName: scala.collection.Seq[String] = Nil
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[DescriptorProto] with com.trueaccord.lenses.Updatable[DescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (name.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, name.get) }
      field.foreach(field => __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(field.serializedSize) + field.serializedSize)
      extension.foreach(extension => __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(extension.serializedSize) + extension.serializedSize)
      nestedType.foreach(nestedType => __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(nestedType.serializedSize) + nestedType.serializedSize)
      enumType.foreach(enumType => __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(enumType.serializedSize) + enumType.serializedSize)
      extensionRange.foreach(extensionRange => __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(extensionRange.serializedSize) + extensionRange.serializedSize)
      oneofDecl.foreach(oneofDecl => __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(oneofDecl.serializedSize) + oneofDecl.serializedSize)
      if (options.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(options.get.serializedSize) + options.get.serializedSize }
      reservedRange.foreach(reservedRange => __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(reservedRange.serializedSize) + reservedRange.serializedSize)
      reservedName.foreach(reservedName => __size += com.google.protobuf.CodedOutputStream.computeStringSize(10, reservedName))
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
      name.foreach { __v =>
        _output__.writeString(1, __v)
      };
      field.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      nestedType.foreach { __v =>
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      enumType.foreach { __v =>
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      extensionRange.foreach { __v =>
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      extension.foreach { __v =>
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      options.foreach { __v =>
        _output__.writeTag(7, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      oneofDecl.foreach { __v =>
        _output__.writeTag(8, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      reservedRange.foreach { __v =>
        _output__.writeTag(9, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      reservedName.foreach { __v =>
        _output__.writeString(10, __v)
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.DescriptorProto = {
      var __name = this.name
      val __field = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.FieldDescriptorProto] ++= this.field)
      val __extension = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.FieldDescriptorProto] ++= this.extension)
      val __nestedType = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.DescriptorProto] ++= this.nestedType)
      val __enumType = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.EnumDescriptorProto] ++= this.enumType)
      val __extensionRange = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.DescriptorProto.ExtensionRange] ++= this.extensionRange)
      val __oneofDecl = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.OneofDescriptorProto] ++= this.oneofDecl)
      var __options = this.options
      val __reservedRange = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.DescriptorProto.ReservedRange] ++= this.reservedRange)
      val __reservedName = (scala.collection.immutable.Vector.newBuilder[String] ++= this.reservedName)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Some(_input__.readString())
          case 18 =>
            __field += com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.FieldDescriptorProto.defaultInstance)
          case 50 =>
            __extension += com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.FieldDescriptorProto.defaultInstance)
          case 26 =>
            __nestedType += com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.DescriptorProto.defaultInstance)
          case 34 =>
            __enumType += com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.EnumDescriptorProto.defaultInstance)
          case 42 =>
            __extensionRange += com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.DescriptorProto.ExtensionRange.defaultInstance)
          case 66 =>
            __oneofDecl += com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.OneofDescriptorProto.defaultInstance)
          case 58 =>
            __options = Some(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(com.google.protobuf.descriptor.MessageOptions.defaultInstance)))
          case 74 =>
            __reservedRange += com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.DescriptorProto.ReservedRange.defaultInstance)
          case 82 =>
            __reservedName += _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.DescriptorProto(
          name = __name,
          field = __field.result(),
          extension = __extension.result(),
          nestedType = __nestedType.result(),
          enumType = __enumType.result(),
          extensionRange = __extensionRange.result(),
          oneofDecl = __oneofDecl.result(),
          options = __options,
          reservedRange = __reservedRange.result(),
          reservedName = __reservedName.result()
      )
    }
    def getName: String = name.getOrElse("")
    def clearName: DescriptorProto = copy(name = None)
    def withName(__v: String): DescriptorProto = copy(name = Some(__v))
    def clearField = copy(field = scala.collection.Seq.empty)
    def addField(__vs: com.google.protobuf.descriptor.FieldDescriptorProto*): DescriptorProto = addAllField(__vs)
    def addAllField(__vs: TraversableOnce[com.google.protobuf.descriptor.FieldDescriptorProto]): DescriptorProto = copy(field = field ++ __vs)
    def withField(__v: scala.collection.Seq[com.google.protobuf.descriptor.FieldDescriptorProto]): DescriptorProto = copy(field = __v)
    def clearExtension = copy(extension = scala.collection.Seq.empty)
    def addExtension(__vs: com.google.protobuf.descriptor.FieldDescriptorProto*): DescriptorProto = addAllExtension(__vs)
    def addAllExtension(__vs: TraversableOnce[com.google.protobuf.descriptor.FieldDescriptorProto]): DescriptorProto = copy(extension = extension ++ __vs)
    def withExtension(__v: scala.collection.Seq[com.google.protobuf.descriptor.FieldDescriptorProto]): DescriptorProto = copy(extension = __v)
    def clearNestedType = copy(nestedType = scala.collection.Seq.empty)
    def addNestedType(__vs: com.google.protobuf.descriptor.DescriptorProto*): DescriptorProto = addAllNestedType(__vs)
    def addAllNestedType(__vs: TraversableOnce[com.google.protobuf.descriptor.DescriptorProto]): DescriptorProto = copy(nestedType = nestedType ++ __vs)
    def withNestedType(__v: scala.collection.Seq[com.google.protobuf.descriptor.DescriptorProto]): DescriptorProto = copy(nestedType = __v)
    def clearEnumType = copy(enumType = scala.collection.Seq.empty)
    def addEnumType(__vs: com.google.protobuf.descriptor.EnumDescriptorProto*): DescriptorProto = addAllEnumType(__vs)
    def addAllEnumType(__vs: TraversableOnce[com.google.protobuf.descriptor.EnumDescriptorProto]): DescriptorProto = copy(enumType = enumType ++ __vs)
    def withEnumType(__v: scala.collection.Seq[com.google.protobuf.descriptor.EnumDescriptorProto]): DescriptorProto = copy(enumType = __v)
    def clearExtensionRange = copy(extensionRange = scala.collection.Seq.empty)
    def addExtensionRange(__vs: com.google.protobuf.descriptor.DescriptorProto.ExtensionRange*): DescriptorProto = addAllExtensionRange(__vs)
    def addAllExtensionRange(__vs: TraversableOnce[com.google.protobuf.descriptor.DescriptorProto.ExtensionRange]): DescriptorProto = copy(extensionRange = extensionRange ++ __vs)
    def withExtensionRange(__v: scala.collection.Seq[com.google.protobuf.descriptor.DescriptorProto.ExtensionRange]): DescriptorProto = copy(extensionRange = __v)
    def clearOneofDecl = copy(oneofDecl = scala.collection.Seq.empty)
    def addOneofDecl(__vs: com.google.protobuf.descriptor.OneofDescriptorProto*): DescriptorProto = addAllOneofDecl(__vs)
    def addAllOneofDecl(__vs: TraversableOnce[com.google.protobuf.descriptor.OneofDescriptorProto]): DescriptorProto = copy(oneofDecl = oneofDecl ++ __vs)
    def withOneofDecl(__v: scala.collection.Seq[com.google.protobuf.descriptor.OneofDescriptorProto]): DescriptorProto = copy(oneofDecl = __v)
    def getOptions: com.google.protobuf.descriptor.MessageOptions = options.getOrElse(com.google.protobuf.descriptor.MessageOptions.defaultInstance)
    def clearOptions: DescriptorProto = copy(options = None)
    def withOptions(__v: com.google.protobuf.descriptor.MessageOptions): DescriptorProto = copy(options = Some(__v))
    def clearReservedRange = copy(reservedRange = scala.collection.Seq.empty)
    def addReservedRange(__vs: com.google.protobuf.descriptor.DescriptorProto.ReservedRange*): DescriptorProto = addAllReservedRange(__vs)
    def addAllReservedRange(__vs: TraversableOnce[com.google.protobuf.descriptor.DescriptorProto.ReservedRange]): DescriptorProto = copy(reservedRange = reservedRange ++ __vs)
    def withReservedRange(__v: scala.collection.Seq[com.google.protobuf.descriptor.DescriptorProto.ReservedRange]): DescriptorProto = copy(reservedRange = __v)
    def clearReservedName = copy(reservedName = scala.collection.Seq.empty)
    def addReservedName(__vs: String*): DescriptorProto = addAllReservedName(__vs)
    def addAllReservedName(__vs: TraversableOnce[String]): DescriptorProto = copy(reservedName = reservedName ++ __vs)
    def withReservedName(__v: scala.collection.Seq[String]): DescriptorProto = copy(reservedName = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => name.getOrElse(null)
        case 2 => field
        case 6 => extension
        case 3 => nestedType
        case 4 => enumType
        case 5 => extensionRange
        case 8 => oneofDecl
        case 7 => options.getOrElse(null)
        case 9 => reservedRange
        case 10 => reservedName
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.DescriptorProto
}

object DescriptorProto extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.DescriptorProto] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.DescriptorProto, com.google.protobuf.DescriptorProtos.DescriptorProto] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.DescriptorProto] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.DescriptorProto, com.google.protobuf.DescriptorProtos.DescriptorProto] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.DescriptorProto): com.google.protobuf.DescriptorProtos.DescriptorProto = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.DescriptorProto.newBuilder
    scalaPbSource.name.foreach(javaPbOut.setName)
    javaPbOut.addAllField(scalaPbSource.field.map(com.google.protobuf.descriptor.FieldDescriptorProto.toJavaProto(_)).asJava)
    javaPbOut.addAllExtension(scalaPbSource.extension.map(com.google.protobuf.descriptor.FieldDescriptorProto.toJavaProto(_)).asJava)
    javaPbOut.addAllNestedType(scalaPbSource.nestedType.map(com.google.protobuf.descriptor.DescriptorProto.toJavaProto(_)).asJava)
    javaPbOut.addAllEnumType(scalaPbSource.enumType.map(com.google.protobuf.descriptor.EnumDescriptorProto.toJavaProto(_)).asJava)
    javaPbOut.addAllExtensionRange(scalaPbSource.extensionRange.map(com.google.protobuf.descriptor.DescriptorProto.ExtensionRange.toJavaProto(_)).asJava)
    javaPbOut.addAllOneofDecl(scalaPbSource.oneofDecl.map(com.google.protobuf.descriptor.OneofDescriptorProto.toJavaProto(_)).asJava)
    scalaPbSource.options.map(com.google.protobuf.descriptor.MessageOptions.toJavaProto(_)).foreach(javaPbOut.setOptions)
    javaPbOut.addAllReservedRange(scalaPbSource.reservedRange.map(com.google.protobuf.descriptor.DescriptorProto.ReservedRange.toJavaProto(_)).asJava)
    javaPbOut.addAllReservedName(scalaPbSource.reservedName.asJava)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.DescriptorProto): com.google.protobuf.descriptor.DescriptorProto = com.google.protobuf.descriptor.DescriptorProto(
    name = if (javaPbSource.hasName) Some(javaPbSource.getName) else None,
    field = javaPbSource.getFieldList.asScala.map(com.google.protobuf.descriptor.FieldDescriptorProto.fromJavaProto(_)),
    extension = javaPbSource.getExtensionList.asScala.map(com.google.protobuf.descriptor.FieldDescriptorProto.fromJavaProto(_)),
    nestedType = javaPbSource.getNestedTypeList.asScala.map(com.google.protobuf.descriptor.DescriptorProto.fromJavaProto(_)),
    enumType = javaPbSource.getEnumTypeList.asScala.map(com.google.protobuf.descriptor.EnumDescriptorProto.fromJavaProto(_)),
    extensionRange = javaPbSource.getExtensionRangeList.asScala.map(com.google.protobuf.descriptor.DescriptorProto.ExtensionRange.fromJavaProto(_)),
    oneofDecl = javaPbSource.getOneofDeclList.asScala.map(com.google.protobuf.descriptor.OneofDescriptorProto.fromJavaProto(_)),
    options = if (javaPbSource.hasOptions) Some(com.google.protobuf.descriptor.MessageOptions.fromJavaProto(javaPbSource.getOptions)) else None,
    reservedRange = javaPbSource.getReservedRangeList.asScala.map(com.google.protobuf.descriptor.DescriptorProto.ReservedRange.fromJavaProto(_)),
    reservedName = javaPbSource.getReservedNameList.asScala
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.DescriptorProto = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.descriptor.DescriptorProto(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.FieldDescriptorProto]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.FieldDescriptorProto]],
      __fieldsMap.getOrElse(__fields.get(3), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.DescriptorProto]],
      __fieldsMap.getOrElse(__fields.get(4), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.EnumDescriptorProto]],
      __fieldsMap.getOrElse(__fields.get(5), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.DescriptorProto.ExtensionRange]],
      __fieldsMap.getOrElse(__fields.get(6), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.OneofDescriptorProto]],
      __fieldsMap.get(__fields.get(7)).asInstanceOf[scala.Option[com.google.protobuf.descriptor.MessageOptions]],
      __fieldsMap.getOrElse(__fields.get(8), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.DescriptorProto.ReservedRange]],
      __fieldsMap.getOrElse(__fields.get(9), Nil).asInstanceOf[scala.collection.Seq[String]]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.descriptor.getMessageTypes.get(2)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 2 => __out = com.google.protobuf.descriptor.FieldDescriptorProto
      case 6 => __out = com.google.protobuf.descriptor.FieldDescriptorProto
      case 3 => __out = com.google.protobuf.descriptor.DescriptorProto
      case 4 => __out = com.google.protobuf.descriptor.EnumDescriptorProto
      case 5 => __out = com.google.protobuf.descriptor.DescriptorProto.ExtensionRange
      case 8 => __out = com.google.protobuf.descriptor.OneofDescriptorProto
      case 7 => __out = com.google.protobuf.descriptor.MessageOptions
      case 9 => __out = com.google.protobuf.descriptor.DescriptorProto.ReservedRange
    }
  __out
  }
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.descriptor.DescriptorProto(
  )
  @SerialVersionUID(0L)
  final case class ExtensionRange(
      start: scala.Option[Int] = None,
      end: scala.Option[Int] = None
      ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[ExtensionRange] with com.trueaccord.lenses.Updatable[ExtensionRange] {
      @transient
      private[this] var __serializedSizeCachedValue: Int = 0
      private[this] def __computeSerializedValue(): Int = {
        var __size = 0
        if (start.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, start.get) }
        if (end.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, end.get) }
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
        start.foreach { __v =>
          _output__.writeInt32(1, __v)
        };
        end.foreach { __v =>
          _output__.writeInt32(2, __v)
        };
      }
      def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.DescriptorProto.ExtensionRange = {
        var __start = this.start
        var __end = this.end
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 8 =>
              __start = Some(_input__.readInt32())
            case 16 =>
              __end = Some(_input__.readInt32())
            case tag => _input__.skipField(tag)
          }
        }
        com.google.protobuf.descriptor.DescriptorProto.ExtensionRange(
            start = __start,
            end = __end
        )
      }
      def getStart: Int = start.getOrElse(0)
      def clearStart: ExtensionRange = copy(start = None)
      def withStart(__v: Int): ExtensionRange = copy(start = Some(__v))
      def getEnd: Int = end.getOrElse(0)
      def clearEnd: ExtensionRange = copy(end = None)
      def withEnd(__v: Int): ExtensionRange = copy(end = Some(__v))
      def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
        __field.getNumber match {
          case 1 => start.getOrElse(null)
          case 2 => end.getOrElse(null)
        }
      }
      override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.protobuf.descriptor.DescriptorProto.ExtensionRange
  }
  
  object ExtensionRange extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.DescriptorProto.ExtensionRange] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.DescriptorProto.ExtensionRange, com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange] {
    implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.DescriptorProto.ExtensionRange] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.DescriptorProto.ExtensionRange, com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange] = this
    def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.DescriptorProto.ExtensionRange): com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange = {
      val javaPbOut = com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.newBuilder
      scalaPbSource.start.foreach(javaPbOut.setStart)
      scalaPbSource.end.foreach(javaPbOut.setEnd)
      javaPbOut.build
    }
    def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange): com.google.protobuf.descriptor.DescriptorProto.ExtensionRange = com.google.protobuf.descriptor.DescriptorProto.ExtensionRange(
      start = if (javaPbSource.hasStart) Some(javaPbSource.getStart.intValue) else None,
      end = if (javaPbSource.hasEnd) Some(javaPbSource.getEnd.intValue) else None
    )
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.DescriptorProto.ExtensionRange = {
      require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
      val __fields = descriptor.getFields
      com.google.protobuf.descriptor.DescriptorProto.ExtensionRange(
        __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[Int]],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[Int]]
      )
    }
    def descriptor: com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.descriptor.DescriptorProto.descriptor.getNestedTypes.get(0)
    def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
    def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
    lazy val defaultInstance = com.google.protobuf.descriptor.DescriptorProto.ExtensionRange(
    )
    implicit class ExtensionRangeLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.DescriptorProto.ExtensionRange]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.DescriptorProto.ExtensionRange](_l) {
      def start: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getStart)((c_, f_) => c_.copy(start = Some(f_)))
      def optionalStart: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.start)((c_, f_) => c_.copy(start = f_))
      def end: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getEnd)((c_, f_) => c_.copy(end = Some(f_)))
      def optionalEnd: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.end)((c_, f_) => c_.copy(end = f_))
    }
    final val START_FIELD_NUMBER = 1
    final val END_FIELD_NUMBER = 2
  }
  
  /** Range of reserved tag numbers. Reserved tag numbers may not be used by
    * fields or extension ranges in the same message. Reserved ranges may
    * not overlap.
    *
    * @param start
    *   Inclusive.
    * @param end
    *   Exclusive.
    */
  @SerialVersionUID(0L)
  final case class ReservedRange(
      start: scala.Option[Int] = None,
      end: scala.Option[Int] = None
      ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[ReservedRange] with com.trueaccord.lenses.Updatable[ReservedRange] {
      @transient
      private[this] var __serializedSizeCachedValue: Int = 0
      private[this] def __computeSerializedValue(): Int = {
        var __size = 0
        if (start.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, start.get) }
        if (end.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, end.get) }
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
        start.foreach { __v =>
          _output__.writeInt32(1, __v)
        };
        end.foreach { __v =>
          _output__.writeInt32(2, __v)
        };
      }
      def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.DescriptorProto.ReservedRange = {
        var __start = this.start
        var __end = this.end
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 8 =>
              __start = Some(_input__.readInt32())
            case 16 =>
              __end = Some(_input__.readInt32())
            case tag => _input__.skipField(tag)
          }
        }
        com.google.protobuf.descriptor.DescriptorProto.ReservedRange(
            start = __start,
            end = __end
        )
      }
      def getStart: Int = start.getOrElse(0)
      def clearStart: ReservedRange = copy(start = None)
      def withStart(__v: Int): ReservedRange = copy(start = Some(__v))
      def getEnd: Int = end.getOrElse(0)
      def clearEnd: ReservedRange = copy(end = None)
      def withEnd(__v: Int): ReservedRange = copy(end = Some(__v))
      def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
        __field.getNumber match {
          case 1 => start.getOrElse(null)
          case 2 => end.getOrElse(null)
        }
      }
      override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.protobuf.descriptor.DescriptorProto.ReservedRange
  }
  
  object ReservedRange extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.DescriptorProto.ReservedRange] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.DescriptorProto.ReservedRange, com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange] {
    implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.DescriptorProto.ReservedRange] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.DescriptorProto.ReservedRange, com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange] = this
    def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.DescriptorProto.ReservedRange): com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange = {
      val javaPbOut = com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.newBuilder
      scalaPbSource.start.foreach(javaPbOut.setStart)
      scalaPbSource.end.foreach(javaPbOut.setEnd)
      javaPbOut.build
    }
    def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange): com.google.protobuf.descriptor.DescriptorProto.ReservedRange = com.google.protobuf.descriptor.DescriptorProto.ReservedRange(
      start = if (javaPbSource.hasStart) Some(javaPbSource.getStart.intValue) else None,
      end = if (javaPbSource.hasEnd) Some(javaPbSource.getEnd.intValue) else None
    )
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.DescriptorProto.ReservedRange = {
      require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
      val __fields = descriptor.getFields
      com.google.protobuf.descriptor.DescriptorProto.ReservedRange(
        __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[Int]],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[Int]]
      )
    }
    def descriptor: com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.descriptor.DescriptorProto.descriptor.getNestedTypes.get(1)
    def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
    def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
    lazy val defaultInstance = com.google.protobuf.descriptor.DescriptorProto.ReservedRange(
    )
    implicit class ReservedRangeLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.DescriptorProto.ReservedRange]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.DescriptorProto.ReservedRange](_l) {
      def start: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getStart)((c_, f_) => c_.copy(start = Some(f_)))
      def optionalStart: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.start)((c_, f_) => c_.copy(start = f_))
      def end: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getEnd)((c_, f_) => c_.copy(end = Some(f_)))
      def optionalEnd: com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.end)((c_, f_) => c_.copy(end = f_))
    }
    final val START_FIELD_NUMBER = 1
    final val END_FIELD_NUMBER = 2
  }
  
  implicit class DescriptorProtoLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.DescriptorProto]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.DescriptorProto](_l) {
    def name: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getName)((c_, f_) => c_.copy(name = Some(f_)))
    def optionalName: com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def field: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.FieldDescriptorProto]] = field(_.field)((c_, f_) => c_.copy(field = f_))
    def extension: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.FieldDescriptorProto]] = field(_.extension)((c_, f_) => c_.copy(extension = f_))
    def nestedType: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.DescriptorProto]] = field(_.nestedType)((c_, f_) => c_.copy(nestedType = f_))
    def enumType: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.EnumDescriptorProto]] = field(_.enumType)((c_, f_) => c_.copy(enumType = f_))
    def extensionRange: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.DescriptorProto.ExtensionRange]] = field(_.extensionRange)((c_, f_) => c_.copy(extensionRange = f_))
    def oneofDecl: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.OneofDescriptorProto]] = field(_.oneofDecl)((c_, f_) => c_.copy(oneofDecl = f_))
    def options: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MessageOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Some(f_)))
    def optionalOptions: com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.descriptor.MessageOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def reservedRange: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.DescriptorProto.ReservedRange]] = field(_.reservedRange)((c_, f_) => c_.copy(reservedRange = f_))
    def reservedName: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[String]] = field(_.reservedName)((c_, f_) => c_.copy(reservedName = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val FIELD_FIELD_NUMBER = 2
  final val EXTENSION_FIELD_NUMBER = 6
  final val NESTED_TYPE_FIELD_NUMBER = 3
  final val ENUM_TYPE_FIELD_NUMBER = 4
  final val EXTENSION_RANGE_FIELD_NUMBER = 5
  final val ONEOF_DECL_FIELD_NUMBER = 8
  final val OPTIONS_FIELD_NUMBER = 7
  final val RESERVED_RANGE_FIELD_NUMBER = 9
  final val RESERVED_NAME_FIELD_NUMBER = 10
}
