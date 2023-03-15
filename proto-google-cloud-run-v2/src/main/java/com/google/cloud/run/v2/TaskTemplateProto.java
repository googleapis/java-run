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
// source: google/cloud/run/v2/task_template.proto

package com.google.cloud.run.v2;

public final class TaskTemplateProto {
  private TaskTemplateProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_TaskTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_TaskTemplate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/run/v2/task_template.prot"
          + "o\022\023google.cloud.run.v2\032\031google/api/resou"
          + "rce.proto\032!google/cloud/run/v2/k8s.min.p"
          + "roto\032)google/cloud/run/v2/vendor_setting"
          + "s.proto\032\036google/protobuf/duration.proto\""
          + "\225\003\n\014TaskTemplate\0222\n\ncontainers\030\001 \003(\0132\036.g"
          + "oogle.cloud.run.v2.Container\022,\n\007volumes\030"
          + "\002 \003(\0132\033.google.cloud.run.v2.Volume\022\025\n\013ma"
          + "x_retries\030\003 \001(\005H\000\022*\n\007timeout\030\004 \001(\0132\031.goo"
          + "gle.protobuf.Duration\022\027\n\017service_account"
          + "\030\005 \001(\t\022H\n\025execution_environment\030\006 \001(\0162)."
          + "google.cloud.run.v2.ExecutionEnvironment"
          + "\022>\n\016encryption_key\030\007 \001(\tB&\372A#\n!cloudkms."
          + "googleapis.com/CryptoKey\0222\n\nvpc_access\030\010"
          + " \001(\0132\036.google.cloud.run.v2.VpcAccessB\t\n\007"
          + "retriesBY\n\027com.google.cloud.run.v2B\021Task"
          + "TemplateProtoP\001Z)cloud.google.com/go/run"
          + "/apiv2/runpb;runpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.run.v2.K8sMinProto.getDescriptor(),
              com.google.cloud.run.v2.VendorSettingsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_run_v2_TaskTemplate_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_run_v2_TaskTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_TaskTemplate_descriptor,
            new java.lang.String[] {
              "Containers",
              "Volumes",
              "MaxRetries",
              "Timeout",
              "ServiceAccount",
              "ExecutionEnvironment",
              "EncryptionKey",
              "VpcAccess",
              "Retries",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.run.v2.K8sMinProto.getDescriptor();
    com.google.cloud.run.v2.VendorSettingsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
