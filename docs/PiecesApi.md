# PiecesApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPieces**](PiecesApi.md#getPieces) | **GET** /pieces | Get all pieces.

<a name="getPieces"></a>
# **getPieces**
> InlineResponse2005 getPieces(skip, limit, orderBy, filterBy, deleted, metadata)

Get all pieces.

Get all pieces.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.task.ApiException;
//import com.ravimoshark.apis.task.calls.PiecesApi;


PiecesApi apiInstance = new PiecesApi();
Integer skip = 56; // Integer | number of item to skip
Integer limit = 56; // Integer | max records to return
String orderBy = "orderBy_example"; // String | order by property.
String filterBy = "filterBy_example"; // String | filter data.
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
Boolean metadata = true; // Boolean | If metadata is needed (for pagination controls)
try {
    InlineResponse2005 result = apiInstance.getPieces(skip, limit, orderBy, filterBy, deleted, metadata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PiecesApi#getPieces");
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

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

