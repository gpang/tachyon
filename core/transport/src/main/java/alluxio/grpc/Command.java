// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/common.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.Command}
 */
public  final class Command extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.Command)
    CommandOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Command.newBuilder() to construct.
  private Command(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Command() {
    commandType_ = 0;
    data_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Command();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Command(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            alluxio.grpc.CommandType value = alluxio.grpc.CommandType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              commandType_ = rawValue;
            }
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              data_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            data_.addLong(input.readInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              data_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              data_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        data_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.CommonProto.internal_static_alluxio_grpc_Command_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.CommonProto.internal_static_alluxio_grpc_Command_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.Command.class, alluxio.grpc.Command.Builder.class);
  }

  private int bitField0_;
  public static final int COMMANDTYPE_FIELD_NUMBER = 1;
  private int commandType_;
  /**
   * <code>optional .alluxio.grpc.CommandType commandType = 1;</code>
   * @return Whether the commandType field is set.
   */
  public boolean hasCommandType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .alluxio.grpc.CommandType commandType = 1;</code>
   * @return The commandType.
   */
  public alluxio.grpc.CommandType getCommandType() {
    @SuppressWarnings("deprecation")
    alluxio.grpc.CommandType result = alluxio.grpc.CommandType.valueOf(commandType_);
    return result == null ? alluxio.grpc.CommandType.Unknown : result;
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList data_;
  /**
   * <code>repeated int64 data = 2;</code>
   * @return A list containing the data.
   */
  public java.util.List<java.lang.Long>
      getDataList() {
    return data_;
  }
  /**
   * <code>repeated int64 data = 2;</code>
   * @return The count of data.
   */
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated int64 data = 2;</code>
   * @param index The index of the element to return.
   * @return The data at the given index.
   */
  public long getData(int index) {
    return data_.getLong(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(1, commandType_);
    }
    for (int i = 0; i < data_.size(); i++) {
      output.writeInt64(2, data_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, commandType_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < data_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(data_.getLong(i));
      }
      size += dataSize;
      size += 1 * getDataList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof alluxio.grpc.Command)) {
      return super.equals(obj);
    }
    alluxio.grpc.Command other = (alluxio.grpc.Command) obj;

    if (hasCommandType() != other.hasCommandType()) return false;
    if (hasCommandType()) {
      if (commandType_ != other.commandType_) return false;
    }
    if (!getDataList()
        .equals(other.getDataList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCommandType()) {
      hash = (37 * hash) + COMMANDTYPE_FIELD_NUMBER;
      hash = (53 * hash) + commandType_;
    }
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.Command parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.Command parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.Command parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.Command parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.Command parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.Command parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.Command parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.Command parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.Command parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.Command parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.Command parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.Command parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.Command prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code alluxio.grpc.Command}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.Command)
      alluxio.grpc.CommandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.CommonProto.internal_static_alluxio_grpc_Command_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.CommonProto.internal_static_alluxio_grpc_Command_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.Command.class, alluxio.grpc.Command.Builder.class);
    }

    // Construct using alluxio.grpc.Command.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      commandType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      data_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.CommonProto.internal_static_alluxio_grpc_Command_descriptor;
    }

    @java.lang.Override
    public alluxio.grpc.Command getDefaultInstanceForType() {
      return alluxio.grpc.Command.getDefaultInstance();
    }

    @java.lang.Override
    public alluxio.grpc.Command build() {
      alluxio.grpc.Command result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public alluxio.grpc.Command buildPartial() {
      alluxio.grpc.Command result = new alluxio.grpc.Command(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.commandType_ = commandType_;
      if (((bitField0_ & 0x00000002) != 0)) {
        data_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.data_ = data_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.Command) {
        return mergeFrom((alluxio.grpc.Command)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.Command other) {
      if (other == alluxio.grpc.Command.getDefaultInstance()) return this;
      if (other.hasCommandType()) {
        setCommandType(other.getCommandType());
      }
      if (!other.data_.isEmpty()) {
        if (data_.isEmpty()) {
          data_ = other.data_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureDataIsMutable();
          data_.addAll(other.data_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.Command parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.Command) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int commandType_ = 0;
    /**
     * <code>optional .alluxio.grpc.CommandType commandType = 1;</code>
     * @return Whether the commandType field is set.
     */
    public boolean hasCommandType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .alluxio.grpc.CommandType commandType = 1;</code>
     * @return The commandType.
     */
    public alluxio.grpc.CommandType getCommandType() {
      @SuppressWarnings("deprecation")
      alluxio.grpc.CommandType result = alluxio.grpc.CommandType.valueOf(commandType_);
      return result == null ? alluxio.grpc.CommandType.Unknown : result;
    }
    /**
     * <code>optional .alluxio.grpc.CommandType commandType = 1;</code>
     * @param value The commandType to set.
     * @return This builder for chaining.
     */
    public Builder setCommandType(alluxio.grpc.CommandType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      commandType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.CommandType commandType = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommandType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      commandType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList data_ = emptyLongList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        data_ = mutableCopy(data_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int64 data = 2;</code>
     * @return A list containing the data.
     */
    public java.util.List<java.lang.Long>
        getDataList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(data_) : data_;
    }
    /**
     * <code>repeated int64 data = 2;</code>
     * @return The count of data.
     */
    public int getDataCount() {
      return data_.size();
    }
    /**
     * <code>repeated int64 data = 2;</code>
     * @param index The index of the element to return.
     * @return The data at the given index.
     */
    public long getData(int index) {
      return data_.getLong(index);
    }
    /**
     * <code>repeated int64 data = 2;</code>
     * @param index The index to set the value at.
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(
        int index, long value) {
      ensureDataIsMutable();
      data_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 data = 2;</code>
     * @param value The data to add.
     * @return This builder for chaining.
     */
    public Builder addData(long value) {
      ensureDataIsMutable();
      data_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 data = 2;</code>
     * @param values The data to add.
     * @return This builder for chaining.
     */
    public Builder addAllData(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureDataIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, data_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 data = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      data_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.Command)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.Command)
  private static final alluxio.grpc.Command DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.Command();
  }

  public static alluxio.grpc.Command getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Command>
      PARSER = new com.google.protobuf.AbstractParser<Command>() {
    @java.lang.Override
    public Command parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Command(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Command> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Command> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public alluxio.grpc.Command getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

