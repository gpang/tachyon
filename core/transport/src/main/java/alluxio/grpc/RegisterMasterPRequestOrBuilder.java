// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/meta_master.proto

package alluxio.grpc;

public interface RegisterMasterPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.meta.RegisterMasterPRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 masterId = 1;</code>
   * @return Whether the masterId field is set.
   */
  boolean hasMasterId();
  /**
   * <code>optional int64 masterId = 1;</code>
   * @return The masterId.
   */
  long getMasterId();

  /**
   * <code>optional .alluxio.grpc.meta.RegisterMasterPOptions options = 2;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <code>optional .alluxio.grpc.meta.RegisterMasterPOptions options = 2;</code>
   * @return The options.
   */
  alluxio.grpc.RegisterMasterPOptions getOptions();
  /**
   * <code>optional .alluxio.grpc.meta.RegisterMasterPOptions options = 2;</code>
   */
  alluxio.grpc.RegisterMasterPOptionsOrBuilder getOptionsOrBuilder();
}
