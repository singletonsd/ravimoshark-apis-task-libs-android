# TechniciansApi

All URIs are relative to *http://localhost:8001*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTechnician**](TechniciansApi.md#addTechnician) | **POST** /technicians | Add one technician.
[**deleteTechnician**](TechniciansApi.md#deleteTechnician) | **DELETE** /technicians/{id} | Delete one technician.
[**editTechnician**](TechniciansApi.md#editTechnician) | **PUT** /technicians | Edit one technician.
[**getTechnicianById**](TechniciansApi.md#getTechnicianById) | **GET** /technicians/{id} | Get one technician.
[**getTechnicians**](TechniciansApi.md#getTechnicians) | **GET** /technicians | Get all technicians.

<a name="addTechnician"></a>
# **addTechnician**
> Technicians addTechnician(body)

Add one technician.

Add one technician.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.TechniciansApi;


TechniciansApi apiInstance = new TechniciansApi();
Technicians body = new Technicians(); // Technicians | 
try {
    Technicians result = apiInstance.addTechnician(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechniciansApi#addTechnician");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Technicians**](Technicians.md)|  |

### Return type

[**Technicians**](Technicians.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTechnician"></a>
# **deleteTechnician**
> IdInteger deleteTechnician(id)

Delete one technician.

Delete one technician.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.TechniciansApi;


TechniciansApi apiInstance = new TechniciansApi();
Long id = 789L; // Long | id to delete or search
try {
    IdInteger result = apiInstance.deleteTechnician(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechniciansApi#deleteTechnician");
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

<a name="editTechnician"></a>
# **editTechnician**
> Technicians editTechnician(body)

Edit one technician.

Edit one technician.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.TechniciansApi;


TechniciansApi apiInstance = new TechniciansApi();
Technicians body = new Technicians(); // Technicians | 
try {
    Technicians result = apiInstance.editTechnician(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechniciansApi#editTechnician");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Technicians**](Technicians.md)|  |

### Return type

[**Technicians**](Technicians.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTechnicianById"></a>
# **getTechnicianById**
> Technicians getTechnicianById(id, deleted)

Get one technician.

Get one technician.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.TechniciansApi;


TechniciansApi apiInstance = new TechniciansApi();
Long id = 789L; // Long | id to delete or search
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
try {
    Technicians result = apiInstance.getTechnicianById(id, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechniciansApi#getTechnicianById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id to delete or search |
 **deleted** | [**Deleted**](.md)| Get all, deleted, not deleted data. Default not deleted. | [optional]

### Return type

[**Technicians**](Technicians.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTechnicians"></a>
# **getTechnicians**
> InlineResponse2002 getTechnicians(skip, limit, orderBy, filterBy, deleted, metadata, refClient)

Get all technicians.

Get all technicians.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.TechniciansApi;


TechniciansApi apiInstance = new TechniciansApi();
Integer skip = 56; // Integer | number of item to skip
Integer limit = 56; // Integer | max records to return
String orderBy = "orderBy_example"; // String | order by property.
String filterBy = "filterBy_example"; // String | filter data.
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
Boolean metadata = true; // Boolean | If metadata is needed (for pagination controls)
String refClient = "refClient_example"; // String | Data from a desired client
try {
    InlineResponse2002 result = apiInstance.getTechnicians(skip, limit, orderBy, filterBy, deleted, metadata, refClient);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TechniciansApi#getTechnicians");
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

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

