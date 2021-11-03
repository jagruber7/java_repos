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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StopStreamingSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopStreamingSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure
     * idempotency.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The streaming session ID for the StopStreamingSessionRequest.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The studioId for the StopStreamingSessionRequest.
     * </p>
     */
    private String studioId;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure
     * idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     *        specify a client token, the AWS SDK automatically generates a client token and uses it for the request to
     *        ensure idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure
     * idempotency.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     *         specify a client token, the AWS SDK automatically generates a client token and uses it for the request to
     *         ensure idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure
     * idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     *        specify a client token, the AWS SDK automatically generates a client token and uses it for the request to
     *        ensure idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopStreamingSessionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The streaming session ID for the StopStreamingSessionRequest.
     * </p>
     * 
     * @param sessionId
     *        The streaming session ID for the StopStreamingSessionRequest.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The streaming session ID for the StopStreamingSessionRequest.
     * </p>
     * 
     * @return The streaming session ID for the StopStreamingSessionRequest.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The streaming session ID for the StopStreamingSessionRequest.
     * </p>
     * 
     * @param sessionId
     *        The streaming session ID for the StopStreamingSessionRequest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopStreamingSessionRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The studioId for the StopStreamingSessionRequest.
     * </p>
     * 
     * @param studioId
     *        The studioId for the StopStreamingSessionRequest.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The studioId for the StopStreamingSessionRequest.
     * </p>
     * 
     * @return The studioId for the StopStreamingSessionRequest.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The studioId for the StopStreamingSessionRequest.
     * </p>
     * 
     * @param studioId
     *        The studioId for the StopStreamingSessionRequest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopStreamingSessionRequest withStudioId(String studioId) {
        setStudioId(studioId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopStreamingSessionRequest == false)
            return false;
        StopStreamingSessionRequest other = (StopStreamingSessionRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        return hashCode;
    }

    @Override
    public StopStreamingSessionRequest clone() {
        return (StopStreamingSessionRequest) super.clone();
    }

}