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

import com.ravimoshark.apis.task.ApiException;
import com.ravimoshark.apis.task.model.CustomError;
import com.ravimoshark.apis.task.model.Deleted;
import com.ravimoshark.apis.task.model.InlineResponse2005;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PiecesApi
 */
@Ignore
public class PiecesApiTest {

    private final PiecesApi api = new PiecesApi();

    /**
     * Get all pieces.
     *
     * Get all pieces.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPiecesTest() throws ApiException {
        Integer skip = null;
        Integer limit = null;
        String orderBy = null;
        String filterBy = null;
        Deleted deleted = null;
        Boolean metadata = null;
        InlineResponse2005 response = api.getPieces(skip, limit, orderBy, filterBy, deleted, metadata);

        // TODO: test validations
    }
}