// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/vendor_settings.proto

package com.google.cloud.run.v2;

public final class VendorSettingsProto {
  private VendorSettingsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_VpcAccess_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_VpcAccess_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_BinaryAuthorization_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_BinaryAuthorization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_run_v2_RevisionScaling_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_RevisionScaling_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/run/v2/vendor_settings.pr" +
      "oto\022\023google.cloud.run.v2\032\031google/api/res" +
      "ource.proto\"\324\001\n\tVpcAccess\022:\n\tconnector\030\001" +
      " \001(\tB\'\372A$\n\"vpcaccess.googleapis.com/Conn" +
      "ector\0228\n\006egress\030\002 \001(\0162(.google.cloud.run" +
      ".v2.VpcAccess.VpcEgress\"Q\n\tVpcEgress\022\032\n\026" +
      "VPC_EGRESS_UNSPECIFIED\020\000\022\017\n\013ALL_TRAFFIC\020" +
      "\001\022\027\n\023PRIVATE_RANGES_ONLY\020\002\"a\n\023BinaryAuth" +
      "orization\022\025\n\013use_default\030\001 \001(\010H\000\022 \n\030brea" +
      "kglass_justification\030\002 \001(\tB\021\n\017binauthz_m" +
      "ethod\"I\n\017RevisionScaling\022\032\n\022min_instance" +
      "_count\030\001 \001(\005\022\032\n\022max_instance_count\030\002 \001(\005" +
      "*\231\001\n\016IngressTraffic\022\037\n\033INGRESS_TRAFFIC_U" +
      "NSPECIFIED\020\000\022\027\n\023INGRESS_TRAFFIC_ALL\020\001\022!\n" +
      "\035INGRESS_TRAFFIC_INTERNAL_ONLY\020\002\022*\n&INGR" +
      "ESS_TRAFFIC_INTERNAL_LOAD_BALANCER\020\003*}\n\024" +
      "ExecutionEnvironment\022%\n!EXECUTION_ENVIRO" +
      "NMENT_UNSPECIFIED\020\000\022\036\n\032EXECUTION_ENVIRON" +
      "MENT_GEN1\020\001\022\036\n\032EXECUTION_ENVIRONMENT_GEN" +
      "2\020\002*p\n\035EncryptionKeyRevocationAction\0220\n," +
      "ENCRYPTION_KEY_REVOCATION_ACTION_UNSPECI" +
      "FIED\020\000\022\017\n\013PREVENT_NEW\020\001\022\014\n\010SHUTDOWN\020\002Bh\n" +
      "\027com.google.cloud.run.v2B\023VendorSettings" +
      "ProtoP\001Z6google.golang.org/genproto/goog" +
      "leapis/cloud/run/v2;runb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_run_v2_VpcAccess_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_run_v2_VpcAccess_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_VpcAccess_descriptor,
        new java.lang.String[] { "Connector", "Egress", });
    internal_static_google_cloud_run_v2_BinaryAuthorization_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_run_v2_BinaryAuthorization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_BinaryAuthorization_descriptor,
        new java.lang.String[] { "UseDefault", "BreakglassJustification", "BinauthzMethod", });
    internal_static_google_cloud_run_v2_RevisionScaling_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_run_v2_RevisionScaling_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_run_v2_RevisionScaling_descriptor,
        new java.lang.String[] { "MinInstanceCount", "MaxInstanceCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
