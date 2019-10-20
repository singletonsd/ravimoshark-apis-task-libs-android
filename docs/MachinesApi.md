# MachinesApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMachine**](MachinesApi.md#addMachine) | **POST** /machines | Add one machine.
[**deleteMachine**](MachinesApi.md#deleteMachine) | **DELETE** /machines/{id} | Delete one machine.
[**editMachine**](MachinesApi.md#editMachine) | **PUT** /machines | Edit one machine.
[**getMachineById**](MachinesApi.md#getMachineById) | **GET** /machines/{id} | Get one Machine.
[**getMachines**](MachinesApi.md#getMachines) | **GET** /machines | Get all machines.

<a name="addMachine"></a>
# **addMachine**
> Machines addMachine(body)

Add one machine.

Add one machine.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.MachinesApi;


MachinesApi apiInstance = new MachinesApi();
Machines body = new Machines(); // Machines | 
try {
    Machines result = apiInstance.addMachine(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#addMachine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Machines**](Machines.md)|  |

### Return type

[**Machines**](Machines.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMachine"></a>
# **deleteMachine**
> IdInteger deleteMachine(id)

Delete one machine.

Delete one machine.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.MachinesApi;


MachinesApi apiInstance = new MachinesApi();
Long id = 789L; // Long | id to delete or search
try {
    IdInteger result = apiInstance.deleteMachine(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#deleteMachine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id to delete or search |

### Return type

[**IdInteger**](IdInteger.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editMachine"></a>
# **editMachine**
> Machines editMachine(body)

Edit one machine.

Edit one machine.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.MachinesApi;


MachinesApi apiInstance = new MachinesApi();
Machines body = new Machines(); // Machines | 
try {
    Machines result = apiInstance.editMachine(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#editMachine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Machines**](Machines.md)|  |

### Return type

[**Machines**](Machines.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMachineById"></a>
# **getMachineById**
> Machines getMachineById(id, deleted)

Get one Machine.

Get one machine.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.MachinesApi;


MachinesApi apiInstance = new MachinesApi();
Long id = 789L; // Long | id to delete or search
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
try {
    Machines result = apiInstance.getMachineById(id, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#getMachineById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id to delete or search |
 **deleted** | [**Deleted**](.md)| Get all, deleted, not deleted data. Default not deleted. | [optional]

### Return type

[**Machines**](Machines.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMachines"></a>
# **getMachines**
> InlineResponse2004 getMachines(skip, limit, orderBy, filterBy, deleted, metadata, refClient, refContract)

Get all machines.

Get all machines.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.MachinesApi;


MachinesApi apiInstance = new MachinesApi();
Integer skip = 56; // Integer | number of item to skip
Integer limit = 56; // Integer | max records to return
String orderBy = "orderBy_example"; // String | order by property.
String filterBy = "filterBy_example"; // String | filter data.
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
Boolean metadata = true; // Boolean | If metadata is needed (for pagination controls)
String refClient = "refClient_example"; // String | Data from a desired client
Long refContract = 789L; // Long | Data from a desired contract
try {
    InlineResponse2004 result = apiInstance.getMachines(skip, limit, orderBy, filterBy, deleted, metadata, refClient, refContract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinesApi#getMachines");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| number of item to skip | [optional]
 **limit** | **Integer**| max records to return | [optional]
 **orderBy** | **String**| order by property. | [optional]
 **filterBy** | **String**| filter data. | [optional]
 **deleted** | [**Deleted**](.md)| Get all, deleted, not deleted data. Default not deleted. | [optional]
 **metadata** | **Boolean**| If metadata is needed (for pagination controls) | [optional]
 **refClient** | **String**| Data from a desired client | [optional]
 **refContract** | **Long**| Data from a desired contract | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

