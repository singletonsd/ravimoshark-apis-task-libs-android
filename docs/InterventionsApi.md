# InterventionsApi

All URIs are relative to *http://localhost:8001*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addIntervention**](InterventionsApi.md#addIntervention) | **POST** /interventions | Add one intervention.
[**deleteIntervention**](InterventionsApi.md#deleteIntervention) | **DELETE** /interventions/{id} | Delete one intervention.
[**editIntervention**](InterventionsApi.md#editIntervention) | **PUT** /interventions | Edit one intervention.
[**getInterventionById**](InterventionsApi.md#getInterventionById) | **GET** /interventions/{id} | Get one intervention.
[**getInterventions**](InterventionsApi.md#getInterventions) | **GET** /interventions | Get all interventions.

<a name="addIntervention"></a>
# **addIntervention**
> Interventions addIntervention(body)

Add one intervention.

Add one intervention.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.InterventionsApi;


InterventionsApi apiInstance = new InterventionsApi();
Interventions body = new Interventions(); // Interventions | 
try {
    Interventions result = apiInstance.addIntervention(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterventionsApi#addIntervention");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Interventions**](Interventions.md)|  |

### Return type

[**Interventions**](Interventions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIntervention"></a>
# **deleteIntervention**
> IdInteger deleteIntervention(id)

Delete one intervention.

Delete one intervention.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.InterventionsApi;


InterventionsApi apiInstance = new InterventionsApi();
Long id = 789L; // Long | id to delete or search
try {
    IdInteger result = apiInstance.deleteIntervention(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterventionsApi#deleteIntervention");
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

<a name="editIntervention"></a>
# **editIntervention**
> Interventions editIntervention(body)

Edit one intervention.

Edit one intervention.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.InterventionsApi;


InterventionsApi apiInstance = new InterventionsApi();
Interventions body = new Interventions(); // Interventions | 
try {
    Interventions result = apiInstance.editIntervention(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterventionsApi#editIntervention");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Interventions**](Interventions.md)|  |

### Return type

[**Interventions**](Interventions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInterventionById"></a>
# **getInterventionById**
> Interventions getInterventionById(id, deleted)

Get one intervention.

Get one intervention.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.InterventionsApi;


InterventionsApi apiInstance = new InterventionsApi();
Long id = 789L; // Long | id to delete or search
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
try {
    Interventions result = apiInstance.getInterventionById(id, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterventionsApi#getInterventionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id to delete or search |
 **deleted** | [**Deleted**](.md)| Get all, deleted, not deleted data. Default not deleted. | [optional]

### Return type

[**Interventions**](Interventions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInterventions"></a>
# **getInterventions**
> InlineResponse200 getInterventions(skip, limit, orderBy, filterBy, deleted, metadata, refClient, technicianId, taskId, dateFrom, dateUntil)

Get all interventions.

Get all interventions.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.InterventionsApi;


InterventionsApi apiInstance = new InterventionsApi();
Integer skip = 56; // Integer | number of item to skip
Integer limit = 56; // Integer | max records to return
String orderBy = "orderBy_example"; // String | order by property.
String filterBy = "filterBy_example"; // String | filter data.
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
Boolean metadata = true; // Boolean | If metadata is needed (for pagination controls)
String refClient = "refClient_example"; // String | Data from a desired client
String technicianId = "technicianId_example"; // String | Id from a desired technician
String taskId = "taskId_example"; // String | Id of the task associated
Date dateFrom = new Date(); // Date | Date from
Date dateUntil = new Date(); // Date | Date until
try {
    InlineResponse200 result = apiInstance.getInterventions(skip, limit, orderBy, filterBy, deleted, metadata, refClient, technicianId, taskId, dateFrom, dateUntil);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterventionsApi#getInterventions");
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
 **taskId** | **String**| Id of the task associated | [optional]
 **dateFrom** | **Date**| Date from | [optional]
 **dateUntil** | **Date**| Date until | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

