// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/echo.proto

package com.google.showcase.v1beta1;

public final class EchoOuterClass {
  private EchoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_EchoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_EchoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_EchoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_EchoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_ExpandRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_ExpandRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_PagedExpandRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_PagedExpandRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_PagedExpandLegacyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_PagedExpandLegacyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_PagedExpandResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_PagedExpandResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_PagedExpandResponseList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_PagedExpandResponseList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_AlphabetizedEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_AlphabetizedEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_WaitRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_WaitRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_WaitResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_WaitResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_WaitMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_WaitMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_BlockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_BlockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_showcase_v1beta1_BlockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_showcase_v1beta1_BlockResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)schema/google/showcase/v1beta1/echo.pr" +
      "oto\022\027google.showcase.v1beta1\032\034google/api" +
      "/annotations.proto\032\027google/api/client.pr" +
      "oto\032\037google/api/field_behavior.proto\032\030go" +
      "ogle/api/routing.proto\032#google/longrunni" +
      "ng/operations.proto\032\036google/protobuf/dur" +
      "ation.proto\032\037google/protobuf/timestamp.p" +
      "roto\032\027google/rpc/status.proto\"\254\001\n\013EchoRe" +
      "quest\022\021\n\007content\030\001 \001(\tH\000\022#\n\005error\030\002 \001(\0132" +
      "\022.google.rpc.StatusH\000\0223\n\010severity\030\003 \001(\0162" +
      "!.google.showcase.v1beta1.Severity\022\016\n\006he" +
      "ader\030\004 \001(\t\022\024\n\014other_header\030\005 \001(\tB\n\n\010resp" +
      "onse\"T\n\014EchoResponse\022\017\n\007content\030\001 \001(\t\0223\n" +
      "\010severity\030\002 \001(\0162!.google.showcase.v1beta" +
      "1.Severity\"x\n\rExpandRequest\022\017\n\007content\030\001" +
      " \001(\t\022!\n\005error\030\002 \001(\0132\022.google.rpc.Status\022" +
      "3\n\020stream_wait_time\030\003 \001(\0132\031.google.proto" +
      "buf.Duration\"R\n\022PagedExpandRequest\022\025\n\007co" +
      "ntent\030\001 \001(\tB\004\342A\001\002\022\021\n\tpage_size\030\002 \001(\005\022\022\n\n" +
      "page_token\030\003 \001(\t\"Z\n\030PagedExpandLegacyReq" +
      "uest\022\025\n\007content\030\001 \001(\tB\004\342A\001\002\022\023\n\013max_resul" +
      "ts\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"h\n\023PagedExp" +
      "andResponse\0228\n\tresponses\030\001 \003(\0132%.google." +
      "showcase.v1beta1.EchoResponse\022\027\n\017next_pa" +
      "ge_token\030\002 \001(\t\"(\n\027PagedExpandResponseLis" +
      "t\022\r\n\005words\030\001 \003(\t\"\203\002\n\037PagedExpandLegacyMa" +
      "ppedResponse\022`\n\014alphabetized\030\001 \003(\0132J.goo" +
      "gle.showcase.v1beta1.PagedExpandLegacyMa" +
      "ppedResponse.AlphabetizedEntry\022\027\n\017next_p" +
      "age_token\030\002 \001(\t\032e\n\021AlphabetizedEntry\022\013\n\003" +
      "key\030\001 \001(\t\022?\n\005value\030\002 \001(\01320.google.showca" +
      "se.v1beta1.PagedExpandResponseList:\0028\001\"\331" +
      "\001\n\013WaitRequest\022.\n\010end_time\030\001 \001(\0132\032.googl" +
      "e.protobuf.TimestampH\000\022(\n\003ttl\030\004 \001(\0132\031.go" +
      "ogle.protobuf.DurationH\000\022#\n\005error\030\002 \001(\0132" +
      "\022.google.rpc.StatusH\001\0228\n\007success\030\003 \001(\0132%" +
      ".google.showcase.v1beta1.WaitResponseH\001B" +
      "\005\n\003endB\n\n\010response\"\037\n\014WaitResponse\022\017\n\007co" +
      "ntent\030\001 \001(\t\"<\n\014WaitMetadata\022,\n\010end_time\030" +
      "\001 \001(\0132\032.google.protobuf.Timestamp\"\255\001\n\014Bl" +
      "ockRequest\0221\n\016response_delay\030\001 \001(\0132\031.goo" +
      "gle.protobuf.Duration\022#\n\005error\030\002 \001(\0132\022.g" +
      "oogle.rpc.StatusH\000\0229\n\007success\030\003 \001(\0132&.go" +
      "ogle.showcase.v1beta1.BlockResponseH\000B\n\n" +
      "\010response\" \n\rBlockResponse\022\017\n\007content\030\001 " +
      "\001(\t*D\n\010Severity\022\017\n\013UNNECESSARY\020\000\022\r\n\tNECE" +
      "SSARY\020\001\022\n\n\006URGENT\020\002\022\014\n\010CRITICAL\020\0032\377\013\n\004Ec" +
      "ho\022\224\003\n\004Echo\022$.google.showcase.v1beta1.Ec" +
      "hoRequest\032%.google.showcase.v1beta1.Echo" +
      "Response\"\276\002\202\323\344\223\002\027\"\022/v1beta1/echo:echo:\001*" +
      "\212\323\344\223\002\232\002\022\010\n\006header\022\031\n\006header\022\017{routing_id" +
      "=**}\022+\n\006header\022!{table_name=regions/*/zo" +
      "nes/*/**}\022\"\n\006header\022\030{super_id=projects/" +
      "*}/**\0220\n\006header\022&{table_name=projects/*/" +
      "instances/*/**}\0221\n\006header\022\'projects/*/{i" +
      "nstance_id=instances/*}/**\022\030\n\014other_head" +
      "er\022\010{baz=**}\022#\n\014other_header\022\023{qux=proje" +
      "cts/*}/**\022\212\001\n\006Expand\022&.google.showcase.v" +
      "1beta1.ExpandRequest\032%.google.showcase.v" +
      "1beta1.EchoResponse\"/\332A\rcontent,error\202\323\344" +
      "\223\002\031\"\024/v1beta1/echo:expand:\001*0\001\022z\n\007Collec" +
      "t\022$.google.showcase.v1beta1.EchoRequest\032" +
      "%.google.showcase.v1beta1.EchoResponse\" " +
      "\202\323\344\223\002\032\"\025/v1beta1/echo:collect:\001*(\001\022W\n\004Ch" +
      "at\022$.google.showcase.v1beta1.EchoRequest" +
      "\032%.google.showcase.v1beta1.EchoResponse(" +
      "\0010\001\022\216\001\n\013PagedExpand\022+.google.showcase.v1" +
      "beta1.PagedExpandRequest\032,.google.showca" +
      "se.v1beta1.PagedExpandResponse\"$\202\323\344\223\002\036\"\031" +
      "/v1beta1/echo:pagedExpand:\001*\022\240\001\n\021PagedEx" +
      "pandLegacy\0221.google.showcase.v1beta1.Pag" +
      "edExpandLegacyRequest\032,.google.showcase." +
      "v1beta1.PagedExpandResponse\"*\202\323\344\223\002$\"\037/v1" +
      "beta1/echo:pagedExpandLegacy:\001*\022\262\001\n\027Page" +
      "dExpandLegacyMapped\022+.google.showcase.v1" +
      "beta1.PagedExpandRequest\0328.google.showca" +
      "se.v1beta1.PagedExpandLegacyMappedRespon" +
      "se\"0\202\323\344\223\002*\"%/v1beta1/echo:pagedExpandLeg" +
      "acyMapped:\001*\022\211\001\n\004Wait\022$.google.showcase." +
      "v1beta1.WaitRequest\032\035.google.longrunning" +
      ".Operation\"<\312A\034\n\014WaitResponse\022\014WaitMetad" +
      "ata\202\323\344\223\002\027\"\022/v1beta1/echo:wait:\001*\022v\n\005Bloc" +
      "k\022%.google.showcase.v1beta1.BlockRequest" +
      "\032&.google.showcase.v1beta1.BlockResponse" +
      "\"\036\202\323\344\223\002\030\"\023/v1beta1/echo:block:\001*\032\021\312A\016loc" +
      "alhost:7469Bq\n\033com.google.showcase.v1bet" +
      "a1P\001Z4github.com/googleapis/gapic-showca" +
      "se/server/genproto\352\002\031Google::Showcase::V" +
      "1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.RoutingProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_showcase_v1beta1_EchoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_showcase_v1beta1_EchoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_EchoRequest_descriptor,
        new java.lang.String[] { "Content", "Error", "Severity", "Header", "OtherHeader", "Response", });
    internal_static_google_showcase_v1beta1_EchoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_showcase_v1beta1_EchoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_EchoResponse_descriptor,
        new java.lang.String[] { "Content", "Severity", });
    internal_static_google_showcase_v1beta1_ExpandRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_showcase_v1beta1_ExpandRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_ExpandRequest_descriptor,
        new java.lang.String[] { "Content", "Error", "StreamWaitTime", });
    internal_static_google_showcase_v1beta1_PagedExpandRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_showcase_v1beta1_PagedExpandRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_PagedExpandRequest_descriptor,
        new java.lang.String[] { "Content", "PageSize", "PageToken", });
    internal_static_google_showcase_v1beta1_PagedExpandLegacyRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_showcase_v1beta1_PagedExpandLegacyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_PagedExpandLegacyRequest_descriptor,
        new java.lang.String[] { "Content", "MaxResults", "PageToken", });
    internal_static_google_showcase_v1beta1_PagedExpandResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_showcase_v1beta1_PagedExpandResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_PagedExpandResponse_descriptor,
        new java.lang.String[] { "Responses", "NextPageToken", });
    internal_static_google_showcase_v1beta1_PagedExpandResponseList_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_showcase_v1beta1_PagedExpandResponseList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_PagedExpandResponseList_descriptor,
        new java.lang.String[] { "Words", });
    internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_descriptor,
        new java.lang.String[] { "Alphabetized", "NextPageToken", });
    internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_AlphabetizedEntry_descriptor =
      internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_AlphabetizedEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_PagedExpandLegacyMappedResponse_AlphabetizedEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_showcase_v1beta1_WaitRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_showcase_v1beta1_WaitRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_WaitRequest_descriptor,
        new java.lang.String[] { "EndTime", "Ttl", "Error", "Success", "End", "Response", });
    internal_static_google_showcase_v1beta1_WaitResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_showcase_v1beta1_WaitResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_WaitResponse_descriptor,
        new java.lang.String[] { "Content", });
    internal_static_google_showcase_v1beta1_WaitMetadata_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_showcase_v1beta1_WaitMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_WaitMetadata_descriptor,
        new java.lang.String[] { "EndTime", });
    internal_static_google_showcase_v1beta1_BlockRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_showcase_v1beta1_BlockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_BlockRequest_descriptor,
        new java.lang.String[] { "ResponseDelay", "Error", "Success", "Response", });
    internal_static_google_showcase_v1beta1_BlockResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_showcase_v1beta1_BlockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_showcase_v1beta1_BlockResponse_descriptor,
        new java.lang.String[] { "Content", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.RoutingProto.routing);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.RoutingProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
