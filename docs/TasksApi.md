# TasksApi

All URIs are relative to *http://localhost:8001*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTask**](TasksApi.md#addTask) | **POST** /tasks | Add one task.
[**deleteTask**](TasksApi.md#deleteTask) | **DELETE** /tasks/{id} | Delete one task.
[**editTask**](TasksApi.md#editTask) | **PUT** /tasks | Edit one task.
[**getTaskById**](TasksApi.md#getTaskById) | **GET** /tasks/{id} | Get one task.
[**getTasks**](TasksApi.md#getTasks) | **GET** /tasks | Get all tasks.

<a name="addTask"></a>
# **addTask**
> Tasks addTask(body)

Add one task.

Add one task.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.TasksApi;


TasksApi apiInstance = new TasksApi();
Tasks body = new Tasks(); // Tasks | 
try {
    Tasks result = apiInstance.addTask(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#addTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Tasks**](Tasks.md)|  |

### Return type

[**Tasks**](Tasks.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTask"></a>
# **deleteTask**
> IdInteger deleteTask(id)

Delete one task.

Delete one task.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.TasksApi;


TasksApi apiInstance = new TasksApi();
Long id = 789L; // Long | id to delete or search
try {
    IdInteger result = apiInstance.deleteTask(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#deleteTask");
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

<a name="editTask"></a>
# **editTask**
> Tasks editTask(body)

Edit one task.

Edit one task.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.TasksApi;


TasksApi apiInstance = new TasksApi();
Tasks body = new Tasks(); // Tasks | 
try {
    Tasks result = apiInstance.editTask(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#editTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Tasks**](Tasks.md)|  |

### Return type

[**Tasks**](Tasks.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskById"></a>
# **getTaskById**
> Tasks getTaskById(id, deleted)

Get one task.

Get one task.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.TasksApi;


TasksApi apiInstance = new TasksApi();
Long id = 789L; // Long | id to delete or search
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
try {
    Tasks result = apiInstance.getTaskById(id, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#getTaskById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id to delete or search |
 **deleted** | [**Deleted**](.md)| Get all, deleted, not deleted data. Default not deleted. | [optional]

### Return type

[**Tasks**](Tasks.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTasks"></a>
# **getTasks**
> InlineResponse2001 getTasks(skip, limit, orderBy, filterBy, deleted, metadata, refClient, finished, technicianId, dateFixFrom, dateCallUntil, dateCallFrom, dateFixUntil)

Get all tasks.

Get all tasks.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.TasksApi;


TasksApi apiInstance = new TasksApi();
Integer skip = 56; // Integer | number of item to skip
Integer limit = 56; // Integer | max records to return
String orderBy = "orderBy_example"; // String | order by property.
String filterBy = "filterBy_example"; // String | filter data.
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
Boolean metadata = true; // Boolean | If metadata is needed (for pagination controls)
String refClient = "refClient_example"; // String | Data from a desired client
Finished finished = new Finished(); // Finished | Get all, finished or unfinished task. Default not finished.
String technicianId = "technicianId_example"; // String | Data from a desired technician
Date dateFixFrom = new Date(); // Date | Date fix from
Date dateCallUntil = new Date(); // Date | Date call until
Date dateCallFrom = new Date(); // Date | Date call from
Date dateFixUntil = new Date(); // Date | Date fix until
try {
    InlineResponse2001 result = apiInstance.getTasks(skip, limit, orderBy, filterBy, deleted, metadata, refClient, finished, technicianId, dateFixFrom, dateCallUntil, dateCallFrom, dateFixUntil);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#getTasks");
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
 **finished** | [**Finished**](.md)| Get all, finished or unfinished task. Default not finished. | [optional]
 **technicianId** | **String**| Data from a desired technician | [optional]
 **dateFixFrom** | **Date**| Date fix from | [optional]
 **dateCallUntil** | **Date**| Date call until | [optional]
 **dateCallFrom** | **Date**| Date call from | [optional]
 **dateFixUntil** | **Date**| Date fix until | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

