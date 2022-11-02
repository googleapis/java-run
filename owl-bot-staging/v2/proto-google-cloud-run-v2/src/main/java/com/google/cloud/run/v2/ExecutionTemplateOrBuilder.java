// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/execution_template.proto

package com.google.cloud.run.v2;

public interface ExecutionTemplateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.ExecutionTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * KRM-style labels for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * KRM-style labels for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * KRM-style labels for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * KRM-style labels for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */

  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * KRM-style labels for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 2;</code>
   */
  int getAnnotationsCount();
  /**
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 2;</code>
   */
  boolean containsAnnotations(
      java.lang.String key);
  /**
   * Use {@link #getAnnotationsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotations();
  /**
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotationsMap();
  /**
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 2;</code>
   */

  /* nullable */
java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 2;</code>
   */

  java.lang.String getAnnotationsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Specifies the maximum desired number of tasks the execution should run at
   * given time. Must be &lt;= task_count.
   * When the job is run, if this field is 0 or unset, the maximum possible
   * value will be used for that execution.
   * The actual number of tasks running in steady state will be less than this
   * number when there are fewer tasks waiting to be completed remaining,
   * i.e. when the work left to do is less than max parallelism.
   * </pre>
   *
   * <code>int32 parallelism = 3;</code>
   * @return The parallelism.
   */
  int getParallelism();

  /**
   * <pre>
   * Specifies the desired number of tasks the execution should run.
   * Setting to 1 means that parallelism is limited to 1 and the success of
   * that task signals the success of the execution.
   * More info:
   * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   * </pre>
   *
   * <code>int32 task_count = 4;</code>
   * @return The taskCount.
   */
  int getTaskCount();

  /**
   * <pre>
   * Required. Describes the task(s) that will be created when executing an execution.
   * </pre>
   *
   * <code>.google.cloud.run.v2.TaskTemplate template = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the template field is set.
   */
  boolean hasTemplate();
  /**
   * <pre>
   * Required. Describes the task(s) that will be created when executing an execution.
   * </pre>
   *
   * <code>.google.cloud.run.v2.TaskTemplate template = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The template.
   */
  com.google.cloud.run.v2.TaskTemplate getTemplate();
  /**
   * <pre>
   * Required. Describes the task(s) that will be created when executing an execution.
   * </pre>
   *
   * <code>.google.cloud.run.v2.TaskTemplate template = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.run.v2.TaskTemplateOrBuilder getTemplateOrBuilder();
}