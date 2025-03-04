package fr.cyril.customerdataservice.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: CustomerService.proto")
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final String SERVICE_NAME = "CustomerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest,
      fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse> getGetAllCustomersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllCustomers",
      requestType = fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest.class,
      responseType = fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest,
      fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse> getGetAllCustomersMethod() {
    io.grpc.MethodDescriptor<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest, fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse> getGetAllCustomersMethod;
    if ((getGetAllCustomersMethod = CustomerServiceGrpc.getGetAllCustomersMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetAllCustomersMethod = CustomerServiceGrpc.getGetAllCustomersMethod) == null) {
          CustomerServiceGrpc.getGetAllCustomersMethod = getGetAllCustomersMethod = 
              io.grpc.MethodDescriptor.<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest, fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "getAllCustomers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("getAllCustomers"))
                  .build();
          }
        }
     }
     return getGetAllCustomersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest,
      fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> getGetCustomerByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCustomerById",
      requestType = fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest.class,
      responseType = fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest,
      fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> getGetCustomerByIdMethod() {
    io.grpc.MethodDescriptor<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest, fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> getGetCustomerByIdMethod;
    if ((getGetCustomerByIdMethod = CustomerServiceGrpc.getGetCustomerByIdMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCustomerByIdMethod = CustomerServiceGrpc.getGetCustomerByIdMethod) == null) {
          CustomerServiceGrpc.getGetCustomerByIdMethod = getGetCustomerByIdMethod = 
              io.grpc.MethodDescriptor.<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest, fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "getCustomerById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("getCustomerById"))
                  .build();
          }
        }
     }
     return getGetCustomerByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest,
      fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse> getAddCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCustomer",
      requestType = fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest.class,
      responseType = fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest,
      fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse> getAddCustomerMethod() {
    io.grpc.MethodDescriptor<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest, fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse> getAddCustomerMethod;
    if ((getAddCustomerMethod = CustomerServiceGrpc.getAddCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getAddCustomerMethod = CustomerServiceGrpc.getAddCustomerMethod) == null) {
          CustomerServiceGrpc.getAddCustomerMethod = getAddCustomerMethod = 
              io.grpc.MethodDescriptor.<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest, fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "addCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("addCustomer"))
                  .build();
          }
        }
     }
     return getAddCustomerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CustomerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllCustomers(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest request,
        io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllCustomersMethod(), responseObserver);
    }

    /**
     */
    public void getCustomerById(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest request,
        io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerByIdMethod(), responseObserver);
    }

    /**
     */
    public void addCustomer(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest request,
        io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddCustomerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllCustomersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest,
                fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse>(
                  this, METHODID_GET_ALL_CUSTOMERS)))
          .addMethod(
            getGetCustomerByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest,
                fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse>(
                  this, METHODID_GET_CUSTOMER_BY_ID)))
          .addMethod(
            getAddCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest,
                fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse>(
                  this, METHODID_ADD_CUSTOMER)))
          .build();
    }
  }

  /**
   */
  public static final class CustomerServiceStub extends io.grpc.stub.AbstractStub<CustomerServiceStub> {
    private CustomerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllCustomers(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest request,
        io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllCustomersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerById(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest request,
        io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCustomer(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest request,
        io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddCustomerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CustomerServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse getAllCustomers(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllCustomersMethod(), getCallOptions(), request);
    }

    /**
     */
    public fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse getCustomerById(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse addCustomer(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddCustomerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomerServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse> getAllCustomers(
        fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllCustomersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> getCustomerById(
        fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse> addCustomer(
        fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddCustomerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_CUSTOMERS = 0;
  private static final int METHODID_GET_CUSTOMER_BY_ID = 1;
  private static final int METHODID_ADD_CUSTOMER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_CUSTOMERS:
          serviceImpl.getAllCustomers((fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest) request,
              (io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_BY_ID:
          serviceImpl.getCustomerById((fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest) request,
              (io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse>) responseObserver);
          break;
        case METHODID_ADD_CUSTOMER:
          serviceImpl.addCustomer((fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest) request,
              (io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerService");
    }
  }

  private static final class CustomerServiceFileDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier {
    CustomerServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerServiceMethodDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CustomerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerServiceFileDescriptorSupplier())
              .addMethod(getGetAllCustomersMethod())
              .addMethod(getGetCustomerByIdMethod())
              .addMethod(getAddCustomerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
