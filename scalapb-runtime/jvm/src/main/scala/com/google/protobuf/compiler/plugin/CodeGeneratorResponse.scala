// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.compiler.plugin

import scala.collection.JavaConverters._

/** The plugin writes an encoded CodeGeneratorResponse to stdout.
  *
  * @param error
  *   Error message.  If non-empty, code generation failed.  The plugin process
  *   should exit with status code zero even if it reports an error in this way.
  *  
  *   This should be used to indicate errors in .proto files which prevent the
  *   code generator from generating correct code.  Errors which indicate a
  *   problem in protoc itself -- such as the input CodeGeneratorRequest being
  *   unparseable -- should be reported by writing a message to stderr and
  *   exiting with a non-zero status code.
  */
@SerialVersionUID(0L)
final case class CodeGeneratorResponse(
    error: scala.Option[String] = None,
    file: scala.collection.Seq[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File] = Nil
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[CodeGeneratorResponse] with com.trueaccord.lenses.Updatable[CodeGeneratorResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (error.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, error.get) }
      file.foreach(file => __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(file.serializedSize) + file.serializedSize)
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
      error.foreach { __v =>
        _output__.writeString(1, __v)
      };
      file.foreach { __v =>
        _output__.writeTag(15, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.compiler.plugin.CodeGeneratorResponse = {
      var __error = this.error
      val __file = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File] ++= this.file)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __error = Some(_input__.readString())
          case 122 =>
            __file += com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.compiler.plugin.CodeGeneratorResponse(
          error = __error,
          file = __file.result()
      )
    }
    def getError: String = error.getOrElse("")
    def clearError: CodeGeneratorResponse = copy(error = None)
    def withError(__v: String): CodeGeneratorResponse = copy(error = Some(__v))
    def clearFile = copy(file = scala.collection.Seq.empty)
    def addFile(__vs: com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File*): CodeGeneratorResponse = addAllFile(__vs)
    def addAllFile(__vs: TraversableOnce[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File]): CodeGeneratorResponse = copy(file = file ++ __vs)
    def withFile(__v: scala.collection.Seq[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File]): CodeGeneratorResponse = copy(file = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => error.getOrElse(null)
        case 15 => file
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.compiler.plugin.CodeGeneratorResponse
}

object CodeGeneratorResponse extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.CodeGeneratorResponse] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.compiler.plugin.CodeGeneratorResponse, com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.CodeGeneratorResponse] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.compiler.plugin.CodeGeneratorResponse, com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.compiler.plugin.CodeGeneratorResponse): com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse = {
    val javaPbOut = com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.newBuilder
    scalaPbSource.error.foreach(javaPbOut.setError)
    javaPbOut.addAllFile(scalaPbSource.file.map(com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File.toJavaProto(_)).asJava)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse): com.google.protobuf.compiler.plugin.CodeGeneratorResponse = com.google.protobuf.compiler.plugin.CodeGeneratorResponse(
    error = if (javaPbSource.hasError) Some(javaPbSource.getError) else None,
    file = javaPbSource.getFileList.asScala.map(com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File.fromJavaProto(_))
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.compiler.plugin.CodeGeneratorResponse = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.compiler.plugin.CodeGeneratorResponse(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File]]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = PluginProto.descriptor.getMessageTypes.get(1)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 15 => __out = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File
    }
  __out
  }
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.compiler.plugin.CodeGeneratorResponse(
  )
  /** Represents a single generated file.
    *
    * @param name
    *   The file name, relative to the output directory.  The name must not
    *   contain "." or ".." components and must be relative, not be absolute (so,
    *   the file cannot lie outside the output directory).  "/" must be used as
    *   the path separator, not "&92;".
    *  
    *   If the name is omitted, the content will be appended to the previous
    *   file.  This allows the generator to break large files into small chunks,
    *   and allows the generated text to be streamed back to protoc so that large
    *   files need not reside completely in memory at one time.  Note that as of
    *   this writing protoc does not optimize for this -- it will read the entire
    *   CodeGeneratorResponse before writing files to disk.
    * @param insertionPoint
    *   If non-empty, indicates that the named file should already exist, and the
    *   content here is to be inserted into that file at a defined insertion
    *   point.  This feature allows a code generator to extend the output
    *   produced by another code generator.  The original generator may provide
    *   insertion points by placing special annotations in the file that look
    *   like:
    *     &#64;&#64;protoc_insertion_point(NAME)
    *   The annotation can have arbitrary text before and after it on the line,
    *   which allows it to be placed in a comment.  NAME should be replaced with
    *   an identifier naming the point -- this is what other generators will use
    *   as the insertion_point.  Code inserted at this point will be placed
    *   immediately above the line containing the insertion point (thus multiple
    *   insertions to the same point will come out in the order they were added).
    *   The double-&#64; is intended to make it unlikely that the generated code
    *   could contain things that look like insertion points by accident.
    *  
    *   For example, the C++ code generator places the following line in the
    *   .pb.h files that it generates:
    *     // &#64;&#64;protoc_insertion_point(namespace_scope)
    *   This line appears within the scope of the file's package namespace, but
    *   outside of any particular class.  Another plugin can then specify the
    *   insertion_point "namespace_scope" to generate additional classes or
    *   other declarations that should be placed in this scope.
    *  
    *   Note that if the line containing the insertion point begins with
    *   whitespace, the same whitespace will be added to every line of the
    *   inserted text.  This is useful for languages like Python, where
    *   indentation matters.  In these languages, the insertion point comment
    *   should be indented the same amount as any inserted code will need to be
    *   in order to work correctly in that context.
    *  
    *   The code generator that generates the initial file and the one which
    *   inserts into it must both run as part of a single invocation of protoc.
    *   Code generators are executed in the order in which they appear on the
    *   command line.
    *  
    *   If |insertion_point| is present, |name| must also be present.
    * @param content
    *   The file contents.
    */
  @SerialVersionUID(0L)
  final case class File(
      name: scala.Option[String] = None,
      insertionPoint: scala.Option[String] = None,
      content: scala.Option[String] = None
      ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[File] with com.trueaccord.lenses.Updatable[File] {
      @transient
      private[this] var __serializedSizeCachedValue: Int = 0
      private[this] def __computeSerializedValue(): Int = {
        var __size = 0
        if (name.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, name.get) }
        if (insertionPoint.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeStringSize(2, insertionPoint.get) }
        if (content.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeStringSize(15, content.get) }
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
        insertionPoint.foreach { __v =>
          _output__.writeString(2, __v)
        };
        content.foreach { __v =>
          _output__.writeString(15, __v)
        };
      }
      def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File = {
        var __name = this.name
        var __insertionPoint = this.insertionPoint
        var __content = this.content
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __name = Some(_input__.readString())
            case 18 =>
              __insertionPoint = Some(_input__.readString())
            case 122 =>
              __content = Some(_input__.readString())
            case tag => _input__.skipField(tag)
          }
        }
        com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File(
            name = __name,
            insertionPoint = __insertionPoint,
            content = __content
        )
      }
      def getName: String = name.getOrElse("")
      def clearName: File = copy(name = None)
      def withName(__v: String): File = copy(name = Some(__v))
      def getInsertionPoint: String = insertionPoint.getOrElse("")
      def clearInsertionPoint: File = copy(insertionPoint = None)
      def withInsertionPoint(__v: String): File = copy(insertionPoint = Some(__v))
      def getContent: String = content.getOrElse("")
      def clearContent: File = copy(content = None)
      def withContent(__v: String): File = copy(content = Some(__v))
      def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
        __field.getNumber match {
          case 1 => name.getOrElse(null)
          case 2 => insertionPoint.getOrElse(null)
          case 15 => content.getOrElse(null)
        }
      }
      override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File
  }
  
  object File extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File, com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File] {
    implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File, com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File] = this
    def toJavaProto(scalaPbSource: com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File): com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File = {
      val javaPbOut = com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File.newBuilder
      scalaPbSource.name.foreach(javaPbOut.setName)
      scalaPbSource.insertionPoint.foreach(javaPbOut.setInsertionPoint)
      scalaPbSource.content.foreach(javaPbOut.setContent)
      javaPbOut.build
    }
    def fromJavaProto(javaPbSource: com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File): com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File(
      name = if (javaPbSource.hasName) Some(javaPbSource.getName) else None,
      insertionPoint = if (javaPbSource.hasInsertionPoint) Some(javaPbSource.getInsertionPoint) else None,
      content = if (javaPbSource.hasContent) Some(javaPbSource.getContent) else None
    )
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File = {
      require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
      val __fields = descriptor.getFields
      com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File(
        __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[String]],
        __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[String]]
      )
    }
    def descriptor: com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.descriptor.getNestedTypes.get(0)
    def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
    def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
    lazy val defaultInstance = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File(
    )
    implicit class FileLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File](_l) {
      def name: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getName)((c_, f_) => c_.copy(name = Some(f_)))
      def optionalName: com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
      def insertionPoint: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getInsertionPoint)((c_, f_) => c_.copy(insertionPoint = Some(f_)))
      def optionalInsertionPoint: com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.insertionPoint)((c_, f_) => c_.copy(insertionPoint = f_))
      def content: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getContent)((c_, f_) => c_.copy(content = Some(f_)))
      def optionalContent: com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.content)((c_, f_) => c_.copy(content = f_))
    }
    final val NAME_FIELD_NUMBER = 1
    final val INSERTION_POINT_FIELD_NUMBER = 2
    final val CONTENT_FIELD_NUMBER = 15
  }
  
  implicit class CodeGeneratorResponseLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.compiler.plugin.CodeGeneratorResponse]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.compiler.plugin.CodeGeneratorResponse](_l) {
    def error: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getError)((c_, f_) => c_.copy(error = Some(f_)))
    def optionalError: com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.error)((c_, f_) => c_.copy(error = f_))
    def file: com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File]] = field(_.file)((c_, f_) => c_.copy(file = f_))
  }
  final val ERROR_FIELD_NUMBER = 1
  final val FILE_FIELD_NUMBER = 15
}
