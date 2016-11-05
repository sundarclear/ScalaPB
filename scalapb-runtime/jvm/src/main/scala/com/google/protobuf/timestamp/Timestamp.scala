// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.timestamp

import scala.collection.JavaConverters._

/** A Timestamp represents a point in time independent of any time zone
  * or calendar, represented as seconds and fractions of seconds at
  * nanosecond resolution in UTC Epoch time. It is encoded using the
  * Proleptic Gregorian Calendar which extends the Gregorian calendar
  * backwards to year one. It is encoded assuming all minutes are 60
  * seconds long, i.e. leap seconds are "smeared" so that no leap second
  * table is needed for interpretation. Range is from
  * 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z.
  * By restricting to that range, we ensure that we can convert to
  * and from  RFC 3339 date strings.
  * See [https://www.ietf.org/rfc/rfc3339.txt](https://www.ietf.org/rfc/rfc3339.txt).
  *
  * Example 1: Compute Timestamp from POSIX `time()`.
  *
  *     Timestamp timestamp;
  *     timestamp.set_seconds(time(NULL));
  *     timestamp.set_nanos(0);
  *
  * Example 2: Compute Timestamp from POSIX `gettimeofday()`.
  *
  *     struct timeval tv;
  *     gettimeofday(&amp;tv, NULL);
  *
  *     Timestamp timestamp;
  *     timestamp.set_seconds(tv.tv_sec);
  *     timestamp.set_nanos(tv.tv_usec * 1000);
  *
  * Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.
  *
  *     FILETIME ft;
  *     GetSystemTimeAsFileTime(&amp;ft);
  *     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;
  *
  *     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z
  *     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.
  *     Timestamp timestamp;
  *     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));
  *     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100));
  *
  * Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.
  *
  *     long millis = System.currentTimeMillis();
  *
  *     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)
  *         .setNanos((int) ((millis % 1000) * 1000000)).build();
  *
  *
  * Example 5: Compute Timestamp from current time in Python.
  *
  *     now = time.time()
  *     seconds = int(now)
  *     nanos = int((now - seconds) * 10**9)
  *     timestamp = Timestamp(seconds=seconds, nanos=nanos)
  *
  * @param seconds
  *   Represents seconds of UTC time since Unix epoch
  *   1970-01-01T00:00:00Z. Must be from from 0001-01-01T00:00:00Z to
  *   9999-12-31T23:59:59Z inclusive.
  * @param nanos
  *   Non-negative fractions of a second at nanosecond resolution. Negative
  *   second values with fractions must still have non-negative nanos values
  *   that count forward in time. Must be from 0 to 999,999,999
  *   inclusive.
  */
@SerialVersionUID(0L)
final case class Timestamp(
    seconds: Long = 0L,
    nanos: Int = 0
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Timestamp] with com.trueaccord.lenses.Updatable[Timestamp] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (seconds != 0L) { __size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, seconds) }
      if (nanos != 0) { __size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, nanos) }
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
      {
        val __v = seconds
        if (__v != 0L) {
          _output__.writeInt64(1, __v)
        }
      };
      {
        val __v = nanos
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.timestamp.Timestamp = {
      var __seconds = this.seconds
      var __nanos = this.nanos
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __seconds = _input__.readInt64()
          case 16 =>
            __nanos = _input__.readInt32()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.timestamp.Timestamp(
          seconds = __seconds,
          nanos = __nanos
      )
    }
    def withSeconds(__v: Long): Timestamp = copy(seconds = __v)
    def withNanos(__v: Int): Timestamp = copy(nanos = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = seconds
          if (__t != 0L) __t else null
        }
        case 2 => {
          val __t = nanos
          if (__t != 0) __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.timestamp.Timestamp
}

object Timestamp extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.timestamp.Timestamp] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.timestamp.Timestamp, com.google.protobuf.Timestamp] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.timestamp.Timestamp] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.timestamp.Timestamp, com.google.protobuf.Timestamp] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.timestamp.Timestamp): com.google.protobuf.Timestamp = {
    val javaPbOut = com.google.protobuf.Timestamp.newBuilder
    javaPbOut.setSeconds(scalaPbSource.seconds)
    javaPbOut.setNanos(scalaPbSource.nanos)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.Timestamp): com.google.protobuf.timestamp.Timestamp = com.google.protobuf.timestamp.Timestamp(
    seconds = javaPbSource.getSeconds.longValue,
    nanos = javaPbSource.getNanos.intValue
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.timestamp.Timestamp = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.timestamp.Timestamp(
      __fieldsMap.getOrElse(__fields.get(0), 0L).asInstanceOf[Long],
      __fieldsMap.getOrElse(__fields.get(1), 0).asInstanceOf[Int]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = TimestampProto.descriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.timestamp.Timestamp(
  )
  implicit class TimestampLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.timestamp.Timestamp]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.timestamp.Timestamp](_l) {
    def seconds: com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.seconds)((c_, f_) => c_.copy(seconds = f_))
    def nanos: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.nanos)((c_, f_) => c_.copy(nanos = f_))
  }
  final val SECONDS_FIELD_NUMBER = 1
  final val NANOS_FIELD_NUMBER = 2
}
