# ContractsApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addContract**](ContractsApi.md#addContract) | **POST** /contracts | Add one contract.
[**deleteContract**](ContractsApi.md#deleteContract) | **DELETE** /contracts/{refContract} | Delete one contract.
[**editContract**](ContractsApi.md#editContract) | **PUT** /contracts | Edit one contract.
[**getContractById**](ContractsApi.md#getContractById) | **GET** /contracts/{refContract} | Get one contract.
[**getContracts**](ContractsApi.md#getContracts) | **GET** /contracts | Get all contracts.

<a name="addContract"></a>
# **addContract**
> Contracts addContract(body)

Add one contract.

Add one contract.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.ContractsApi;


ContractsApi apiInstance = new ContractsApi();
Contracts body = new Contracts(); // Contracts | 
try {
    Contracts result = apiInstance.addContract(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#addContract");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Contracts**](Contracts.md)|  |

### Return type

[**Contracts**](Contracts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContract"></a>
# **deleteContract**
> RefContract deleteContract(refContract)

Delete one contract.

Delete one contract.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.ContractsApi;


ContractsApi apiInstance = new ContractsApi();
Long refContract = 789L; // Long | id to delete or search
try {
    RefContract result = apiInstance.deleteContract(refContract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#deleteContract");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refContract** | **Long**| id to delete or search |

### Return type

[**RefContract**](RefContract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editContract"></a>
# **editContract**
> Contracts editContract(body)

Edit one contract.

Edit one contract.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.ContractsApi;


ContractsApi apiInstance = new ContractsApi();
Contracts body = new Contracts(); // Contracts | 
try {
    Contracts result = apiInstance.editContract(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#editContract");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Contracts**](Contracts.md)|  |

### Return type

[**Contracts**](Contracts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContractById"></a>
# **getContractById**
> Contracts getContractById(refContract, deleted)

Get one contract.

Get one contract.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.ContractsApi;


ContractsApi apiInstance = new ContractsApi();
Long refContract = 789L; // Long | id to delete or search
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
try {
    Contracts result = apiInstance.getContractById(refContract, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#getContractById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refContract** | **Long**| id to delete or search |
 **deleted** | [**Deleted**](.md)| Get all, deleted, not deleted data. Default not deleted. | [optional]

### Return type

[**Contracts**](Contracts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContracts"></a>
# **getContracts**
> InlineResponse2001 getContracts(skip, limit, orderBy, filterBy, deleted, metadata, valid, reviewed, refClient)

Get all contracts.

Get all contracts.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.ContractsApi;


ContractsApi apiInstance = new ContractsApi();
Integer skip = 56; // Integer | number of item to skip
Integer limit = 56; // Integer | max records to return
String orderBy = "orderBy_example"; // String | order by property.
String filterBy = "filterBy_example"; // String | filter data.
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
Boolean metadata = true; // Boolean | If metadata is needed (for pagination controls)
Valid valid = new Valid(); // Valid | Only valid data.
Reviewed reviewed = new Reviewed(); // Reviewed | only reviewed data.
String refClient = "refClient_example"; // String | Data from a desired client
try {
    InlineResponse2001 result = apiInstance.getContracts(skip, limit, orderBy, filterBy, deleted, metadata, valid, reviewed, refClient);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#getContracts");
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
 **valid** | [**Valid**](.md)| Only valid data. | [optional]
 **reviewed** | [**Reviewed**](.md)| only reviewed data. | [optional]
 **refClient** | **String**| Data from a desired client | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

