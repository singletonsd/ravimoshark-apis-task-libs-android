/*
 * Ravimoshark Contract API
 * This is an API to interact with Ravimoshark contracts database. # Introduction This API allow to create, modify and delete contracts and machines. It also interacts with machines imported from SAGE database. # User Authentication This API does not contain any kind of user validation but It request to have a valid authentication user to interact with it. For more information about user Authentication, please refer to [Ravimoshark User Authentication](https://ravimoshark.com/back/apis/auth/latest). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@ravimoshark.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ravimoshark.apis.task.calls;

import com.ravimoshark.apis.task.ApiCallback;
import com.ravimoshark.apis.task.ApiClient;
import com.ravimoshark.apis.task.ApiException;
import com.ravimoshark.apis.task.ApiResponse;
import com.ravimoshark.apis.task.Configuration;
import com.ravimoshark.apis.task.Pair;
import com.ravimoshark.apis.task.ProgressRequestBody;
import com.ravimoshark.apis.task.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ravimoshark.apis.task.model.CustomError;
import com.ravimoshark.apis.task.model.Deleted;
import com.ravimoshark.apis.task.model.IdInteger;
import com.ravimoshark.apis.task.model.ImportedMachines;
import com.ravimoshark.apis.task.model.InlineResponse2002;
import com.ravimoshark.apis.task.model.Machines;
import com.ravimoshark.apis.task.model.Reviewed;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImportedMachinesApi {
    private ApiClient apiClient;

    public ImportedMachinesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImportedMachinesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addImportedMachine
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addImportedMachineCall(ImportedMachines body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/importedMachines";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addImportedMachineValidateBeforeCall(ImportedMachines body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addImportedMachine(Async)");
        }
        
        com.squareup.okhttp.Call call = addImportedMachineCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add one imported Machine.
     * Add one imported Machine.
     * @param body  (required)
     * @return ImportedMachines
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImportedMachines addImportedMachine(ImportedMachines body) throws ApiException {
        ApiResponse<ImportedMachines> resp = addImportedMachineWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Add one imported Machine.
     * Add one imported Machine.
     * @param body  (required)
     * @return ApiResponse&lt;ImportedMachines&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImportedMachines> addImportedMachineWithHttpInfo(ImportedMachines body) throws ApiException {
        com.squareup.okhttp.Call call = addImportedMachineValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<ImportedMachines>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add one imported Machine. (asynchronously)
     * Add one imported Machine.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addImportedMachineAsync(ImportedMachines body, final ApiCallback<ImportedMachines> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addImportedMachineValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImportedMachines>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteImportedMachine
     * @param id id to delete or search (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteImportedMachineCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/importedMachines/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteImportedMachineValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteImportedMachine(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteImportedMachineCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete one imported Machine.
     * Delete one imported Machine.
     * @param id id to delete or search (required)
     * @return IdInteger
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdInteger deleteImportedMachine(Long id) throws ApiException {
        ApiResponse<IdInteger> resp = deleteImportedMachineWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Delete one imported Machine.
     * Delete one imported Machine.
     * @param id id to delete or search (required)
     * @return ApiResponse&lt;IdInteger&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IdInteger> deleteImportedMachineWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteImportedMachineValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<IdInteger>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete one imported Machine. (asynchronously)
     * Delete one imported Machine.
     * @param id id to delete or search (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteImportedMachineAsync(Long id, final ApiCallback<IdInteger> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteImportedMachineValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IdInteger>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for editImportedMachine
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call editImportedMachineCall(ImportedMachines body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/importedMachines";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call editImportedMachineValidateBeforeCall(ImportedMachines body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling editImportedMachine(Async)");
        }
        
        com.squareup.okhttp.Call call = editImportedMachineCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Edit one imported Machine.
     * Edit one imported Machine.
     * @param body  (required)
     * @return ImportedMachines
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImportedMachines editImportedMachine(ImportedMachines body) throws ApiException {
        ApiResponse<ImportedMachines> resp = editImportedMachineWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Edit one imported Machine.
     * Edit one imported Machine.
     * @param body  (required)
     * @return ApiResponse&lt;ImportedMachines&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImportedMachines> editImportedMachineWithHttpInfo(ImportedMachines body) throws ApiException {
        com.squareup.okhttp.Call call = editImportedMachineValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<ImportedMachines>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Edit one imported Machine. (asynchronously)
     * Edit one imported Machine.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call editImportedMachineAsync(ImportedMachines body, final ApiCallback<ImportedMachines> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = editImportedMachineValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImportedMachines>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getImportedMachineById
     * @param id id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getImportedMachineByIdCall(Long id, Deleted deleted, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/importedMachines/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deleted != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("deleted", deleted));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImportedMachineByIdValidateBeforeCall(Long id, Deleted deleted, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getImportedMachineById(Async)");
        }
        
        com.squareup.okhttp.Call call = getImportedMachineByIdCall(id, deleted, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get one imported Machine.
     * Get one imported Machine.
     * @param id id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @return Machines
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Machines getImportedMachineById(Long id, Deleted deleted) throws ApiException {
        ApiResponse<Machines> resp = getImportedMachineByIdWithHttpInfo(id, deleted);
        return resp.getData();
    }

    /**
     * Get one imported Machine.
     * Get one imported Machine.
     * @param id id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @return ApiResponse&lt;Machines&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Machines> getImportedMachineByIdWithHttpInfo(Long id, Deleted deleted) throws ApiException {
        com.squareup.okhttp.Call call = getImportedMachineByIdValidateBeforeCall(id, deleted, null, null);
        Type localVarReturnType = new TypeToken<Machines>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get one imported Machine. (asynchronously)
     * Get one imported Machine.
     * @param id id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImportedMachineByIdAsync(Long id, Deleted deleted, final ApiCallback<Machines> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getImportedMachineByIdValidateBeforeCall(id, deleted, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Machines>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getImportedMachines
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param reviewed only reviewed data. (optional)
     * @param refClient Data from a desired client (optional)
     * @param refContract Data from a desired contract (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getImportedMachinesCall(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, Reviewed reviewed, String refClient, Long refContract, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/importedMachines";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orderBy", orderBy));
        if (filterBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filterBy", filterBy));
        if (deleted != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("deleted", deleted));
        if (metadata != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("metadata", metadata));
        if (reviewed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reviewed", reviewed));
        if (refClient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("refClient", refClient));
        if (refContract != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("refContract", refContract));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImportedMachinesValidateBeforeCall(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, Reviewed reviewed, String refClient, Long refContract, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getImportedMachinesCall(skip, limit, orderBy, filterBy, deleted, metadata, reviewed, refClient, refContract, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all imported Machines.
     * Get all imported Machines.
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param reviewed only reviewed data. (optional)
     * @param refClient Data from a desired client (optional)
     * @param refContract Data from a desired contract (optional)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2002 getImportedMachines(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, Reviewed reviewed, String refClient, Long refContract) throws ApiException {
        ApiResponse<InlineResponse2002> resp = getImportedMachinesWithHttpInfo(skip, limit, orderBy, filterBy, deleted, metadata, reviewed, refClient, refContract);
        return resp.getData();
    }

    /**
     * Get all imported Machines.
     * Get all imported Machines.
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param reviewed only reviewed data. (optional)
     * @param refClient Data from a desired client (optional)
     * @param refContract Data from a desired contract (optional)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> getImportedMachinesWithHttpInfo(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, Reviewed reviewed, String refClient, Long refContract) throws ApiException {
        com.squareup.okhttp.Call call = getImportedMachinesValidateBeforeCall(skip, limit, orderBy, filterBy, deleted, metadata, reviewed, refClient, refContract, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all imported Machines. (asynchronously)
     * Get all imported Machines.
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param reviewed only reviewed data. (optional)
     * @param refClient Data from a desired client (optional)
     * @param refContract Data from a desired contract (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImportedMachinesAsync(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, Reviewed reviewed, String refClient, Long refContract, final ApiCallback<InlineResponse2002> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getImportedMachinesValidateBeforeCall(skip, limit, orderBy, filterBy, deleted, metadata, reviewed, refClient, refContract, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
