/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudsearchv2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DeleteAnalysisSchemeRequest Marshaller
 */

public class DeleteAnalysisSchemeRequestMarshaller
        implements
        Marshaller<Request<DeleteAnalysisSchemeRequest>, DeleteAnalysisSchemeRequest> {

    public Request<DeleteAnalysisSchemeRequest> marshall(
            DeleteAnalysisSchemeRequest deleteAnalysisSchemeRequest) {

        if (deleteAnalysisSchemeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteAnalysisSchemeRequest> request = new DefaultRequest<DeleteAnalysisSchemeRequest>(
                deleteAnalysisSchemeRequest, "AmazonCloudSearchv2");
        request.addParameter("Action", "DeleteAnalysisScheme");
        request.addParameter("Version", "2013-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteAnalysisSchemeRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils
                    .fromString(deleteAnalysisSchemeRequest.getDomainName()));
        }

        if (deleteAnalysisSchemeRequest.getAnalysisSchemeName() != null) {
            request.addParameter("AnalysisSchemeName", StringUtils
                    .fromString(deleteAnalysisSchemeRequest
                            .getAnalysisSchemeName()));
        }

        return request;
    }

}
