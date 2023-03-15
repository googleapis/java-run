// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/job.proto

package com.google.cloud.run.v2;

public interface ExecutionReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.ExecutionReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the execution.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the execution.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Creation timestamp of the execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Creation timestamp of the execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Creation timestamp of the execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Creation timestamp of the execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completion_time = 3;</code>
   * @return Whether the completionTime field is set.
   */
  boolean hasCompletionTime();
  /**
   * <pre>
   * Creation timestamp of the execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completion_time = 3;</code>
   * @return The completionTime.
   */
  com.google.protobuf.Timestamp getCompletionTime();
  /**
   * <pre>
   * Creation timestamp of the execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp completion_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCompletionTimeOrBuilder();
}