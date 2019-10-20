# LocationsApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLocation**](LocationsApi.md#addLocation) | **POST** /locations | Add one location.
[**deleteLocation**](LocationsApi.md#deleteLocation) | **DELETE** /locations/{id} copy | Delete one location.
[**editLocation**](LocationsApi.md#editLocation) | **PUT** /locations | Edit one location.
[**getLocationById**](LocationsApi.md#getLocationById) | **GET** /locations/{id} copy | Get one Location.
[**getLocations**](LocationsApi.md#getLocations) | **GET** /locations | Get all locations.

<a name="addLocation"></a>
# **addLocation**
> Locations addLocation(body)

Add one location.

Add one location.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
Locations body = new Locations(); // Locations | 
try {
    Locations result = apiInstance.addLocation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#addLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Locations**](Locations.md)|  |

### Return type

[**Locations**](Locations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLocation"></a>
# **deleteLocation**
> IdInteger deleteLocation(id)

Delete one location.

Delete one location.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
Long id = 789L; // Long | id to delete or search
try {
    IdInteger result = apiInstance.deleteLocation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#deleteLocation");
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

<a name="editLocation"></a>
# **editLocation**
> Locations editLocation(body)

Edit one location.

Edit one location.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
Locations body = new Locations(); // Locations | 
try {
    Locations result = apiInstance.editLocation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#editLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Locations**](Locations.md)|  |

### Return type

[**Locations**](Locations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLocationById"></a>
# **getLocationById**
> Locations getLocationById(id, deleted)

Get one Location.

Get one location.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
Long id = 789L; // Long | id to delete or search
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
try {
    Locations result = apiInstance.getLocationById(id, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getLocationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id to delete or search |
 **deleted** | [**Deleted**](.md)| Get all, deleted, not deleted data. Default not deleted. | [optional]

### Return type

[**Locations**](Locations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocations"></a>
# **getLocations**
> InlineResponse2003 getLocations(skip, limit, orderBy, filterBy, deleted, metadata, refClient, refContract)

Get all locations.

Get all locations.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
Integer skip = 56; // Integer | number of item to skip
Integer limit = 56; // Integer | max records to return
String orderBy = "orderBy_example"; // String | order by property.
String filterBy = "filterBy_example"; // String | filter data.
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
Boolean metadata = true; // Boolean | If metadata is needed (for pagination controls)
String refClient = "refClient_example"; // String | Data from a desired client
Long refContract = 789L; // Long | Data from a desired contract
try {
    InlineResponse2003 result = apiInstance.getLocations(skip, limit, orderBy, filterBy, deleted, metadata, refClient, refContract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getLocations");
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

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

