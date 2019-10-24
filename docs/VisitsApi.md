# VisitsApi

All URIs are relative to *http://localhost:8001*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVisit**](VisitsApi.md#addVisit) | **POST** /visits | Add one visit.
[**deleteVisit**](VisitsApi.md#deleteVisit) | **DELETE** /visits/{id} | Delete one visit.
[**editVisit**](VisitsApi.md#editVisit) | **PUT** /visits | Edit one visit.
[**getVisitById**](VisitsApi.md#getVisitById) | **GET** /visits/{id} | Get one visit.
[**getVisits**](VisitsApi.md#getVisits) | **GET** /visits | Get all visits.

<a name="addVisit"></a>
# **addVisit**
> Visits addVisit(body)

Add one visit.

Add one visit.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.VisitsApi;


VisitsApi apiInstance = new VisitsApi();
Visits body = new Visits(); // Visits | 
try {
    Visits result = apiInstance.addVisit(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisitsApi#addVisit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Visits**](Visits.md)|  |

### Return type

[**Visits**](Visits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteVisit"></a>
# **deleteVisit**
> IdInteger deleteVisit(id)

Delete one visit.

Delete one visit.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.VisitsApi;


VisitsApi apiInstance = new VisitsApi();
Long id = 789L; // Long | id to delete or search
try {
    IdInteger result = apiInstance.deleteVisit(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisitsApi#deleteVisit");
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

<a name="editVisit"></a>
# **editVisit**
> Visits editVisit(body)

Edit one visit.

Edit one visit.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.VisitsApi;


VisitsApi apiInstance = new VisitsApi();
Visits body = new Visits(); // Visits | 
try {
    Visits result = apiInstance.editVisit(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisitsApi#editVisit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Visits**](Visits.md)|  |

### Return type

[**Visits**](Visits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVisitById"></a>
# **getVisitById**
> Visits getVisitById(id, deleted)

Get one visit.

Get one visit.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.VisitsApi;


VisitsApi apiInstance = new VisitsApi();
Long id = 789L; // Long | id to delete or search
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
try {
    Visits result = apiInstance.getVisitById(id, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisitsApi#getVisitById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id to delete or search |
 **deleted** | [**Deleted**](.md)| Get all, deleted, not deleted data. Default not deleted. | [optional]

### Return type

[**Visits**](Visits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVisits"></a>
# **getVisits**
> InlineResponse2003 getVisits(skip, limit, orderBy, filterBy, deleted, metadata, refClient, technicianId, dateFrom, dateUntil)

Get all visits.

Get all visits.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.VisitsApi;


VisitsApi apiInstance = new VisitsApi();
Integer skip = 56; // Integer | number of item to skip
Integer limit = 56; // Integer | max records to return
String orderBy = "orderBy_example"; // String | order by property.
String filterBy = "filterBy_example"; // String | filter data.
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
Boolean metadata = true; // Boolean | If metadata is needed (for pagination controls)
String refClient = "refClient_example"; // String | Data from a desired client
String technicianId = "technicianId_example"; // String | Id from a desired technician
Date dateFrom = new Date(); // Date | Date from
Date dateUntil = new Date(); // Date | Date until
try {
    InlineResponse2003 result = apiInstance.getVisits(skip, limit, orderBy, filterBy, deleted, metadata, refClient, technicianId, dateFrom, dateUntil);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisitsApi#getVisits");
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
 **technicianId** | **String**| Id from a desired technician | [optional]
 **dateFrom** | **Date**| Date from | [optional]
 **dateUntil** | **Date**| Date until | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

