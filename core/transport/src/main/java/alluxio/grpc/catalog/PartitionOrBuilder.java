// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog/catalog_master.proto

package alluxio.grpc.catalog;

public interface PartitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.catalog.Partition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .alluxio.grpc.catalog.PartitionSpec partitionSpec = 1;</code>
   */
  boolean hasPartitionSpec();
  /**
   * <code>optional .alluxio.grpc.catalog.PartitionSpec partitionSpec = 1;</code>
   */
  alluxio.grpc.catalog.PartitionSpec getPartitionSpec();
  /**
   * <code>optional .alluxio.grpc.catalog.PartitionSpec partitionSpec = 1;</code>
   */
  alluxio.grpc.catalog.PartitionSpecOrBuilder getPartitionSpecOrBuilder();

  /**
   * <code>optional .alluxio.grpc.catalog.Layout layout = 2;</code>
   */
  boolean hasLayout();
  /**
   * <code>optional .alluxio.grpc.catalog.Layout layout = 2;</code>
   */
  alluxio.grpc.catalog.Layout getLayout();
  /**
   * <code>optional .alluxio.grpc.catalog.Layout layout = 2;</code>
   */
  alluxio.grpc.catalog.LayoutOrBuilder getLayoutOrBuilder();
}
