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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentTemplateVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnvironmentTemplateVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * To view environment template major version detail data, include <code>majorVersion</code>.
     * </p>
     */
    private String majorVersion;
    /**
     * <p>
     * To view environment template minor version detail data, include <code>minorVersion</code>.
     * </p>
     */
    private String minorVersion;
    /**
     * <p>
     * The name of the environment template.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * To view environment template major version detail data, include <code>majorVersion</code>.
     * </p>
     * 
     * @param majorVersion
     *        To view environment template major version detail data, include <code>majorVersion</code>.
     */

    public void setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
    }

    /**
     * <p>
     * To view environment template major version detail data, include <code>majorVersion</code>.
     * </p>
     * 
     * @return To view environment template major version detail data, include <code>majorVersion</code>.
     */

    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * <p>
     * To view environment template major version detail data, include <code>majorVersion</code>.
     * </p>
     * 
     * @param majorVersion
     *        To view environment template major version detail data, include <code>majorVersion</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentTemplateVersionRequest withMajorVersion(String majorVersion) {
        setMajorVersion(majorVersion);
        return this;
    }

    /**
     * <p>
     * To view environment template minor version detail data, include <code>minorVersion</code>.
     * </p>
     * 
     * @param minorVersion
     *        To view environment template minor version detail data, include <code>minorVersion</code>.
     */

    public void setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
    }

    /**
     * <p>
     * To view environment template minor version detail data, include <code>minorVersion</code>.
     * </p>
     * 
     * @return To view environment template minor version detail data, include <code>minorVersion</code>.
     */

    public String getMinorVersion() {
        return this.minorVersion;
    }

    /**
     * <p>
     * To view environment template minor version detail data, include <code>minorVersion</code>.
     * </p>
     * 
     * @param minorVersion
     *        To view environment template minor version detail data, include <code>minorVersion</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentTemplateVersionRequest withMinorVersion(String minorVersion) {
        setMinorVersion(minorVersion);
        return this;
    }

    /**
     * <p>
     * The name of the environment template.
     * </p>
     * 
     * @param templateName
     *        The name of the environment template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the environment template.
     * </p>
     * 
     * @return The name of the environment template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the environment template.
     * </p>
     * 
     * @param templateName
     *        The name of the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentTemplateVersionRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
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
        if (getMajorVersion() != null)
            sb.append("MajorVersion: ").append(getMajorVersion()).append(",");
        if (getMinorVersion() != null)
            sb.append("MinorVersion: ").append(getMinorVersion()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnvironmentTemplateVersionRequest == false)
            return false;
        GetEnvironmentTemplateVersionRequest other = (GetEnvironmentTemplateVersionRequest) obj;
        if (other.getMajorVersion() == null ^ this.getMajorVersion() == null)
            return false;
        if (other.getMajorVersion() != null && other.getMajorVersion().equals(this.getMajorVersion()) == false)
            return false;
        if (other.getMinorVersion() == null ^ this.getMinorVersion() == null)
            return false;
        if (other.getMinorVersion() != null && other.getMinorVersion().equals(this.getMinorVersion()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMajorVersion() == null) ? 0 : getMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getMinorVersion() == null) ? 0 : getMinorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public GetEnvironmentTemplateVersionRequest clone() {
        return (GetEnvironmentTemplateVersionRequest) super.clone();
    }

}