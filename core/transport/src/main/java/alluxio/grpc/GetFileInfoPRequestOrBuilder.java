// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

public interface GetFileInfoPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.file.GetFileInfoPRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** the id of the file 
   * </pre>
   *
   * <code>optional int64 fileId = 1;</code>
   * @return Whether the fileId field is set.
   */
  boolean hasFileId();
  /**
   * <pre>
   ** the id of the file 
   * </pre>
   *
   * <code>optional int64 fileId = 1;</code>
   * @return The fileId.
   */
  long getFileId();

  /**
   * <code>optional .alluxio.grpc.file.GetFileInfoPOptions options = 2;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <code>optional .alluxio.grpc.file.GetFileInfoPOptions options = 2;</code>
   * @return The options.
   */
  alluxio.grpc.GetFileInfoPOptions getOptions();
  /**
   * <code>optional .alluxio.grpc.file.GetFileInfoPOptions options = 2;</code>
   */
  alluxio.grpc.GetFileInfoPOptionsOrBuilder getOptionsOrBuilder();
}
