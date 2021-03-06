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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeVpcClassicLinkDnsSupportRequest Marshaller
 */

public class DescribeVpcClassicLinkDnsSupportRequestMarshaller
        implements
        Marshaller<Request<DescribeVpcClassicLinkDnsSupportRequest>, DescribeVpcClassicLinkDnsSupportRequest> {

    public Request<DescribeVpcClassicLinkDnsSupportRequest> marshall(
            DescribeVpcClassicLinkDnsSupportRequest describeVpcClassicLinkDnsSupportRequest) {

        if (describeVpcClassicLinkDnsSupportRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpcClassicLinkDnsSupportRequest> request = new DefaultRequest<DescribeVpcClassicLinkDnsSupportRequest>(
                describeVpcClassicLinkDnsSupportRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVpcClassicLinkDnsSupport");
        request.addParameter("Version", "2016-04-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> vpcIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcClassicLinkDnsSupportRequest
                .getVpcIds();
        if (!vpcIdsList.isEmpty() || !vpcIdsList.isAutoConstruct()) {
            int vpcIdsListIndex = 1;

            for (String vpcIdsListValue : vpcIdsList) {
                if (vpcIdsListValue != null) {
                    request.addParameter("VpcIds." + vpcIdsListIndex,
                            StringUtils.fromString(vpcIdsListValue));
                }
                vpcIdsListIndex++;
            }
        }

        if (describeVpcClassicLinkDnsSupportRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils
                    .fromInteger(describeVpcClassicLinkDnsSupportRequest
                            .getMaxResults()));
        }

        if (describeVpcClassicLinkDnsSupportRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeVpcClassicLinkDnsSupportRequest
                            .getNextToken()));
        }

        return request;
    }

}
