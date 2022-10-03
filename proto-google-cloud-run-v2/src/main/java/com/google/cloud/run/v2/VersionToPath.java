/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/k8s.min.proto

package com.google.cloud.run.v2;

/**
 *
 *
 * <pre>
 * VersionToPath maps a specific version of a secret to a relative file to mount
 * to, relative to VolumeMount's mount_path.
 * </pre>
 *
 * Protobuf type {@code google.cloud.run.v2.VersionToPath}
 */
public final class VersionToPath extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.run.v2.VersionToPath)
    VersionToPathOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VersionToPath.newBuilder() to construct.
  private VersionToPath(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VersionToPath() {
    path_ = "";
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VersionToPath();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.run.v2.K8sMinProto
        .internal_static_google_cloud_run_v2_VersionToPath_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.run.v2.K8sMinProto
        .internal_static_google_cloud_run_v2_VersionToPath_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.run.v2.VersionToPath.class,
            com.google.cloud.run.v2.VersionToPath.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object path_;
  /**
   *
   *
   * <pre>
   * Required. The relative path of the secret in the container.
   * </pre>
   *
   * <code>string path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The relative path of the secret in the container.
   * </pre>
   *
   * <code>string path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object version_;
  /**
   *
   *
   * <pre>
   * The Cloud Secret Manager secret version.
   * Can be 'latest' for the latest value or an integer for a specific version.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The Cloud Secret Manager secret version.
   * Can be 'latest' for the latest value or an integer for a specific version.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODE_FIELD_NUMBER = 3;
  private int mode_;
  /**
   *
   *
   * <pre>
   * Integer octal mode bits to use on this file, must be a value between
   * 01 and 0777 (octal). If 0 or not set, the Volume's default mode will be
   * used.
   * Notes
   * * Internally, a umask of 0222 will be applied to any non-zero value.
   * * This is an integer representation of the mode bits. So, the octal
   * integer value should look exactly as the chmod numeric notation with a
   * leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or
   * 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or
   * 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493
   * (base-10).
   * * This might be in conflict with other options that affect the
   * file mode, like fsGroup, and the result can be other mode bits set.
   * </pre>
   *
   * <code>int32 mode = 3;</code>
   *
   * @return The mode.
   */
  @java.lang.Override
  public int getMode() {
    return mode_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    if (mode_ != 0) {
      output.writeInt32(3, mode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    if (mode_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, mode_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.run.v2.VersionToPath)) {
      return super.equals(obj);
    }
    com.google.cloud.run.v2.VersionToPath other = (com.google.cloud.run.v2.VersionToPath) obj;

    if (!getPath().equals(other.getPath())) return false;
    if (!getVersion().equals(other.getVersion())) return false;
    if (getMode() != other.getMode()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + getMode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.run.v2.VersionToPath parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.VersionToPath parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.VersionToPath parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.VersionToPath parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.VersionToPath parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.VersionToPath parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.VersionToPath parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.VersionToPath parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.VersionToPath parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.VersionToPath parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.VersionToPath parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.VersionToPath parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.run.v2.VersionToPath prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * VersionToPath maps a specific version of a secret to a relative file to mount
   * to, relative to VolumeMount's mount_path.
   * </pre>
   *
   * Protobuf type {@code google.cloud.run.v2.VersionToPath}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.run.v2.VersionToPath)
      com.google.cloud.run.v2.VersionToPathOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_VersionToPath_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_VersionToPath_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.run.v2.VersionToPath.class,
              com.google.cloud.run.v2.VersionToPath.Builder.class);
    }

    // Construct using com.google.cloud.run.v2.VersionToPath.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      path_ = "";

      version_ = "";

      mode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_VersionToPath_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.VersionToPath getDefaultInstanceForType() {
      return com.google.cloud.run.v2.VersionToPath.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.run.v2.VersionToPath build() {
      com.google.cloud.run.v2.VersionToPath result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.VersionToPath buildPartial() {
      com.google.cloud.run.v2.VersionToPath result =
          new com.google.cloud.run.v2.VersionToPath(this);
      result.path_ = path_;
      result.version_ = version_;
      result.mode_ = mode_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.run.v2.VersionToPath) {
        return mergeFrom((com.google.cloud.run.v2.VersionToPath) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.run.v2.VersionToPath other) {
      if (other == com.google.cloud.run.v2.VersionToPath.getDefaultInstance()) return this;
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (other.getMode() != 0) {
        setMode(other.getMode());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                path_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                version_ = input.readStringRequireUtf8();

                break;
              } // case 18
            case 24:
              {
                mode_ = input.readInt32();

                break;
              } // case 24
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     *
     *
     * <pre>
     * Required. The relative path of the secret in the container.
     * </pre>
     *
     * <code>string path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The relative path of the secret in the container.
     * </pre>
     *
     * <code>string path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The relative path of the secret in the container.
     * </pre>
     *
     * <code>string path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      path_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The relative path of the secret in the container.
     * </pre>
     *
     * <code>string path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPath() {

      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The relative path of the secret in the container.
     * </pre>
     *
     * <code>string path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      path_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     *
     *
     * <pre>
     * The Cloud Secret Manager secret version.
     * Can be 'latest' for the latest value or an integer for a specific version.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The Cloud Secret Manager secret version.
     * Can be 'latest' for the latest value or an integer for a specific version.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The Cloud Secret Manager secret version.
     * Can be 'latest' for the latest value or an integer for a specific version.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      version_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Secret Manager secret version.
     * Can be 'latest' for the latest value or an integer for a specific version.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {

      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Cloud Secret Manager secret version.
     * Can be 'latest' for the latest value or an integer for a specific version.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      version_ = value;
      onChanged();
      return this;
    }

    private int mode_;
    /**
     *
     *
     * <pre>
     * Integer octal mode bits to use on this file, must be a value between
     * 01 and 0777 (octal). If 0 or not set, the Volume's default mode will be
     * used.
     * Notes
     * * Internally, a umask of 0222 will be applied to any non-zero value.
     * * This is an integer representation of the mode bits. So, the octal
     * integer value should look exactly as the chmod numeric notation with a
     * leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or
     * 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or
     * 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493
     * (base-10).
     * * This might be in conflict with other options that affect the
     * file mode, like fsGroup, and the result can be other mode bits set.
     * </pre>
     *
     * <code>int32 mode = 3;</code>
     *
     * @return The mode.
     */
    @java.lang.Override
    public int getMode() {
      return mode_;
    }
    /**
     *
     *
     * <pre>
     * Integer octal mode bits to use on this file, must be a value between
     * 01 and 0777 (octal). If 0 or not set, the Volume's default mode will be
     * used.
     * Notes
     * * Internally, a umask of 0222 will be applied to any non-zero value.
     * * This is an integer representation of the mode bits. So, the octal
     * integer value should look exactly as the chmod numeric notation with a
     * leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or
     * 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or
     * 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493
     * (base-10).
     * * This might be in conflict with other options that affect the
     * file mode, like fsGroup, and the result can be other mode bits set.
     * </pre>
     *
     * <code>int32 mode = 3;</code>
     *
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(int value) {

      mode_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Integer octal mode bits to use on this file, must be a value between
     * 01 and 0777 (octal). If 0 or not set, the Volume's default mode will be
     * used.
     * Notes
     * * Internally, a umask of 0222 will be applied to any non-zero value.
     * * This is an integer representation of the mode bits. So, the octal
     * integer value should look exactly as the chmod numeric notation with a
     * leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or
     * 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or
     * 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493
     * (base-10).
     * * This might be in conflict with other options that affect the
     * file mode, like fsGroup, and the result can be other mode bits set.
     * </pre>
     *
     * <code>int32 mode = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMode() {

      mode_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.run.v2.VersionToPath)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.run.v2.VersionToPath)
  private static final com.google.cloud.run.v2.VersionToPath DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.run.v2.VersionToPath();
  }

  public static com.google.cloud.run.v2.VersionToPath getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VersionToPath> PARSER =
      new com.google.protobuf.AbstractParser<VersionToPath>() {
        @java.lang.Override
        public VersionToPath parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<VersionToPath> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VersionToPath> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.run.v2.VersionToPath getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
