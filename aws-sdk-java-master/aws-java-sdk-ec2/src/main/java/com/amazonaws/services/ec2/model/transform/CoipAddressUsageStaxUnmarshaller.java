/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CoipAddressUsage StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoipAddressUsageStaxUnmarshaller implements Unmarshaller<CoipAddressUsage, StaxUnmarshallerContext> {

    public CoipAddressUsage unmarshall(StaxUnmarshallerContext context) throws Exception {
        CoipAddressUsage coipAddressUsage = new CoipAddressUsage();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return coipAddressUsage;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("allocationId", targetDepth)) {
                    coipAddressUsage.setAllocationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("awsAccountId", targetDepth)) {
                    coipAddressUsage.setAwsAccountId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("awsService", targetDepth)) {
                    coipAddressUsage.setAwsService(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("coIp", targetDepth)) {
                    coipAddressUsage.setCoIp(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return coipAddressUsage;
                }
            }
        }
    }

    private static CoipAddressUsageStaxUnmarshaller instance;

    public static CoipAddressUsageStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CoipAddressUsageStaxUnmarshaller();
        return instance;
    }
}