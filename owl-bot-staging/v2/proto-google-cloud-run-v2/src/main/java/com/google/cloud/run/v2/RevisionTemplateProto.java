// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/revision_template.proto

package com.google.cloud.run.v2;

public final class RevisionTemplateProto {
  private RevisionTemplateProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_RevisionTemplate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_RevisionTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_RevisionTemplate_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_RevisionTemplate_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_RevisionTemplate_AnnotationsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_RevisionTemplate_AnnotationsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/run/v2/revision_template." +
      "proto\022\023google.cloud.run.v2\032\031google/api/r" +
      "esource.proto\032!google/cloud/run/v2/k8s.m" +
      "in.proto\032)google/cloud/run/v2/vendor_set" +
      "tings.proto\032\036google/protobuf/duration.pr" +
      "oto\"\212\006\n\020RevisionTemplate\0222\n\010revision\030\001 \001" +
      "(\tB \372A\035\n\033run.googleapis.com/Revision\022A\n\006" +
      "labels\030\002 \003(\01321.google.cloud.run.v2.Revis" +
      "ionTemplate.LabelsEntry\022K\n\013annotations\030\003" +
      " \003(\01326.google.cloud.run.v2.RevisionTempl" +
      "ate.AnnotationsEntry\0225\n\007scaling\030\004 \001(\0132$." +
      "google.cloud.run.v2.RevisionScaling\0222\n\nv" +
      "pc_access\030\006 \001(\0132\036.google.cloud.run.v2.Vp" +
      "cAccess\022\035\n\025container_concurrency\030\007 \001(\005\022*" +
      "\n\007timeout\030\010 \001(\0132\031.google.protobuf.Durati" +
      "on\022\027\n\017service_account\030\t \001(\t\0222\n\ncontainer" +
      "s\030\n \003(\0132\036.google.cloud.run.v2.Container\022" +
      ",\n\007volumes\030\013 \003(\0132\033.google.cloud.run.v2.V" +
      "olume\022\024\n\014confidential\030\014 \001(\010\022H\n\025execution" +
      "_environment\030\r \001(\0162).google.cloud.run.v2" +
      ".ExecutionEnvironment\022>\n\016encryption_key\030" +
      "\016 \001(\tB&\372A#\n!cloudkms.googleapis.com/Cryp" +
      "toKey\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005val" +
      "ue\030\002 \001(\t:\0028\001\0322\n\020AnnotationsEntry\022\013\n\003key\030" +
      "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001Bj\n\027com.google.c" +
      "loud.run.v2B\025RevisionTemplateProtoP\001Z6go" +
      "ogle.golang.org/genproto/googleapis/clou" +
      "d/run/v2;runb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.run.v2.K8sMinProto.getDescriptor(),
          com.google.cloud.run.v2.VendorSettingsProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_google_cloud_run_v2_RevisionTemplate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_run_v2_RevisionTemplate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_RevisionTemplate_descriptor,
        new java.lang.String[] { "Revision", "Labels", "Annotations", "Scaling", "VpcAccess", "ContainerConcurrency", "Timeout", "ServiceAccount", "Containers", "Volumes", "Confidential", "ExecutionEnvironment", "EncryptionKey", });
    internal_static_google_cloud_run_v2_RevisionTemplate_LabelsEntry_descriptor =
      internal_static_google_cloud_run_v2_RevisionTemplate_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_run_v2_RevisionTemplate_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_RevisionTemplate_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_run_v2_RevisionTemplate_AnnotationsEntry_descriptor =
      internal_static_google_cloud_run_v2_RevisionTemplate_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_run_v2_RevisionTemplate_AnnotationsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_RevisionTemplate_AnnotationsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.run.v2.K8sMinProto.getDescriptor();
    com.google.cloud.run.v2.VendorSettingsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
