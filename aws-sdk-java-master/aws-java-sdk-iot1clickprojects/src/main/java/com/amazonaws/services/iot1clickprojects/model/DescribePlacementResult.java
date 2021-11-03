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
package com.amazonaws.services.iot1clickprojects.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DescribePlacement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePlacementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object describing the placement.
     * </p>
     */
    private PlacementDescription placement;

    /**
     * <p>
     * An object describing the placement.
     * </p>
     * 
     * @param placement
     *        An object describing the placement.
     */

    public void setPlacement(PlacementDescription placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * An object describing the placement.
     * </p>
     * 
     * @return An object describing the placement.
     */

    public PlacementDescription getPlacement() {
        return this.placement;
    }

    /**
     * <p>
     * An object describing the placement.
     * </p>
     * 
     * @param placement
     *        An object describing the placement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePlacementResult withPlacement(PlacementDescription placement) {
        setPlacement(placement);
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
        if (getPlacement() != null)
            sb.append("Placement: ").append(getPlacement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePlacementResult == false)
            return false;
        DescribePlacementResult other = (DescribePlacementResult) obj;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        return hashCode;
    }

    @Override
    public DescribePlacementResult clone() {
        try {
            return (DescribePlacementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}