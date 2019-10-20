# ImportedMachinesApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addImportedMachine**](ImportedMachinesApi.md#addImportedMachine) | **POST** /importedMachines | Add one imported Machine.
[**deleteImportedMachine**](ImportedMachinesApi.md#deleteImportedMachine) | **DELETE** /importedMachines/{id} | Delete one imported Machine.
[**editImportedMachine**](ImportedMachinesApi.md#editImportedMachine) | **PUT** /importedMachines | Edit one imported Machine.
[**getImportedMachineById**](ImportedMachinesApi.md#getImportedMachineById) | **GET** /importedMachines/{id} | Get one imported Machine.
[**getImportedMachines**](ImportedMachinesApi.md#getImportedMachines) | **GET** /importedMachines | Get all imported Machines.

<a name="addImportedMachine"></a>
# **addImportedMachine**
> ImportedMachines addImportedMachine(body)

Add one imported Machine.

Add one imported Machine.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.ImportedMachinesApi;


ImportedMachinesApi apiInstance = new ImportedMachinesApi();
ImportedMachines body = new ImportedMachines(); // ImportedMachines | 
try {
    ImportedMachines result = apiInstance.addImportedMachine(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportedMachinesApi#addImportedMachine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ImportedMachines**](ImportedMachines.md)|  |

### Return type

[**ImportedMachines**](ImportedMachines.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteImportedMachine"></a>
# **deleteImportedMachine**
> IdInteger deleteImportedMachine(id)

Delete one imported Machine.

Delete one imported Machine.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.ImportedMachinesApi;


ImportedMachinesApi apiInstance = new ImportedMachinesApi();
Long id = 789L; // Long | id to delete or search
try {
    IdInteger result = apiInstance.deleteImportedMachine(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportedMachinesApi#deleteImportedMachine");
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

<a name="editImportedMachine"></a>
# **editImportedMachine**
> ImportedMachines editImportedMachine(body)

Edit one imported Machine.

Edit one imported Machine.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.ImportedMachinesApi;


ImportedMachinesApi apiInstance = new ImportedMachinesApi();
ImportedMachines body = new ImportedMachines(); // ImportedMachines | 
try {
    ImportedMachines result = apiInstance.editImportedMachine(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportedMachinesApi#editImportedMachine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ImportedMachines**](ImportedMachines.md)|  |

### Return type

[**ImportedMachines**](ImportedMachines.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getImportedMachineById"></a>
# **getImportedMachineById**
> Machines getImportedMachineById(id, deleted)

Get one imported Machine.

Get one imported Machine.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.ImportedMachinesApi;


ImportedMachinesApi apiInstance = new ImportedMachinesApi();
Long id = 789L; // Long | id to delete or search
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
try {
    Machines result = apiInstance.getImportedMachineById(id, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportedMachinesApi#getImportedMachineById");
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

<a name="getImportedMachines"></a>
# **getImportedMachines**
> InlineResponse2002 getImportedMachines(skip, limit, orderBy, filterBy, deleted, metadata, reviewed, refClient, refContract)

Get all imported Machines.

Get all imported Machines.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.ImportedMachinesApi;


ImportedMachinesApi apiInstance = new ImportedMachinesApi();
Integer skip = 56; // Integer | number of item to skip
Integer limit = 56; // Integer | max records to return
String orderBy = "orderBy_example"; // String | order by property.
String filterBy = "filterBy_example"; // String | filter data.
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
Boolean metadata = true; // Boolean | If metadata is needed (for pagination controls)
Reviewed reviewed = new Reviewed(); // Reviewed | only reviewed data.
String refClient = "refClient_example"; // String | Data from a desired client
Long refContract = 789L; // Long | Data from a desired contract
try {
    InlineResponse2002 result = apiInstance.getImportedMachines(skip, limit, orderBy, filterBy, deleted, metadata, reviewed, refClient, refContract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportedMachinesApi#getImportedMachines");
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
 **reviewed** | [**Reviewed**](.md)| only reviewed data. | [optional]
 **refClient** | **String**| Data from a desired client | [optional]
 **refContract** | **Long**| Data from a desired contract | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

