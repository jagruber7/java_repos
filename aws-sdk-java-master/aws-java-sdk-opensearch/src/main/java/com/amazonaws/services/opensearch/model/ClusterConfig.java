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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for the domain cluster, such as the type and number of instances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance type for an OpenSearch cluster. UltraWarm instance types are not supported for data instances.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of instances in the specified domain cluster.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-dedicatedmasternodes"
     * target="_blank">Dedicated master nodes in Amazon OpenSearch Service </a> for more information.
     * </p>
     */
    private Boolean dedicatedMasterEnabled;
    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html"
     * target="_blank">Configuring a multi-AZ domain in Amazon OpenSearch Service </a> for more information.
     * </p>
     */
    private Boolean zoneAwarenessEnabled;
    /**
     * <p>
     * The zone awareness configuration for a domain when zone awareness is enabled.
     * </p>
     */
    private ZoneAwarenessConfig zoneAwarenessConfig;
    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     */
    private String dedicatedMasterType;
    /**
     * <p>
     * Total number of dedicated master nodes, active and on standby, for the cluster.
     * </p>
     */
    private Integer dedicatedMasterCount;
    /**
     * <p>
     * True to enable UltraWarm storage.
     * </p>
     */
    private Boolean warmEnabled;
    /**
     * <p>
     * The instance type for the OpenSearch cluster's warm nodes.
     * </p>
     */
    private String warmType;
    /**
     * <p>
     * The number of UltraWarm nodes in the cluster.
     * </p>
     */
    private Integer warmCount;
    /**
     * <p>
     * Specifies the <code>ColdStorageOptions</code> config for a Domain
     * </p>
     */
    private ColdStorageOptions coldStorageOptions;

    /**
     * <p>
     * The instance type for an OpenSearch cluster. UltraWarm instance types are not supported for data instances.
     * </p>
     * 
     * @param instanceType
     *        The instance type for an OpenSearch cluster. UltraWarm instance types are not supported for data
     *        instances.
     * @see OpenSearchPartitionInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for an OpenSearch cluster. UltraWarm instance types are not supported for data instances.
     * </p>
     * 
     * @return The instance type for an OpenSearch cluster. UltraWarm instance types are not supported for data
     *         instances.
     * @see OpenSearchPartitionInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type for an OpenSearch cluster. UltraWarm instance types are not supported for data instances.
     * </p>
     * 
     * @param instanceType
     *        The instance type for an OpenSearch cluster. UltraWarm instance types are not supported for data
     *        instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public ClusterConfig withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type for an OpenSearch cluster. UltraWarm instance types are not supported for data instances.
     * </p>
     * 
     * @param instanceType
     *        The instance type for an OpenSearch cluster. UltraWarm instance types are not supported for data
     *        instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public ClusterConfig withInstanceType(OpenSearchPartitionInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of instances in the specified domain cluster.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances in the specified domain cluster.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances in the specified domain cluster.
     * </p>
     * 
     * @return The number of instances in the specified domain cluster.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances in the specified domain cluster.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances in the specified domain cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfig withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-dedicatedmasternodes"
     * target="_blank">Dedicated master nodes in Amazon OpenSearch Service </a> for more information.
     * </p>
     * 
     * @param dedicatedMasterEnabled
     *        A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     *        "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-dedicatedmasternodes"
     *        target="_blank">Dedicated master nodes in Amazon OpenSearch Service </a> for more information.
     */

    public void setDedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-dedicatedmasternodes"
     * target="_blank">Dedicated master nodes in Amazon OpenSearch Service </a> for more information.
     * </p>
     * 
     * @return A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     *         "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-dedicatedmasternodes"
     *         target="_blank">Dedicated master nodes in Amazon OpenSearch Service </a> for more information.
     */

    public Boolean getDedicatedMasterEnabled() {
        return this.dedicatedMasterEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-dedicatedmasternodes"
     * target="_blank">Dedicated master nodes in Amazon OpenSearch Service </a> for more information.
     * </p>
     * 
     * @param dedicatedMasterEnabled
     *        A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     *        "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-dedicatedmasternodes"
     *        target="_blank">Dedicated master nodes in Amazon OpenSearch Service </a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfig withDedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
        setDedicatedMasterEnabled(dedicatedMasterEnabled);
        return this;
    }

    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-dedicatedmasternodes"
     * target="_blank">Dedicated master nodes in Amazon OpenSearch Service </a> for more information.
     * </p>
     * 
     * @return A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     *         "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-dedicatedmasternodes"
     *         target="_blank">Dedicated master nodes in Amazon OpenSearch Service </a> for more information.
     */

    public Boolean isDedicatedMasterEnabled() {
        return this.dedicatedMasterEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html"
     * target="_blank">Configuring a multi-AZ domain in Amazon OpenSearch Service </a> for more information.
     * </p>
     * 
     * @param zoneAwarenessEnabled
     *        A boolean value to indicate whether zone awareness is enabled. See <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html"
     *        target="_blank">Configuring a multi-AZ domain in Amazon OpenSearch Service </a> for more information.
     */

    public void setZoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html"
     * target="_blank">Configuring a multi-AZ domain in Amazon OpenSearch Service </a> for more information.
     * </p>
     * 
     * @return A boolean value to indicate whether zone awareness is enabled. See <a
     *         href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html"
     *         target="_blank">Configuring a multi-AZ domain in Amazon OpenSearch Service </a> for more information.
     */

    public Boolean getZoneAwarenessEnabled() {
        return this.zoneAwarenessEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html"
     * target="_blank">Configuring a multi-AZ domain in Amazon OpenSearch Service </a> for more information.
     * </p>
     * 
     * @param zoneAwarenessEnabled
     *        A boolean value to indicate whether zone awareness is enabled. See <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html"
     *        target="_blank">Configuring a multi-AZ domain in Amazon OpenSearch Service </a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfig withZoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
        setZoneAwarenessEnabled(zoneAwarenessEnabled);
        return this;
    }

    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html"
     * target="_blank">Configuring a multi-AZ domain in Amazon OpenSearch Service </a> for more information.
     * </p>
     * 
     * @return A boolean value to indicate whether zone awareness is enabled. See <a
     *         href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html"
     *         target="_blank">Configuring a multi-AZ domain in Amazon OpenSearch Service </a> for more information.
     */

    public Boolean isZoneAwarenessEnabled() {
        return this.zoneAwarenessEnabled;
    }

    /**
     * <p>
     * The zone awareness configuration for a domain when zone awareness is enabled.
     * </p>
     * 
     * @param zoneAwarenessConfig
     *        The zone awareness configuration for a domain when zone awareness is enabled.
     */

    public void setZoneAwarenessConfig(ZoneAwarenessConfig zoneAwarenessConfig) {
        this.zoneAwarenessConfig = zoneAwarenessConfig;
    }

    /**
     * <p>
     * The zone awareness configuration for a domain when zone awareness is enabled.
     * </p>
     * 
     * @return The zone awareness configuration for a domain when zone awareness is enabled.
     */

    public ZoneAwarenessConfig getZoneAwarenessConfig() {
        return this.zoneAwarenessConfig;
    }

    /**
     * <p>
     * The zone awareness configuration for a domain when zone awareness is enabled.
     * </p>
     * 
     * @param zoneAwarenessConfig
     *        The zone awareness configuration for a domain when zone awareness is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfig withZoneAwarenessConfig(ZoneAwarenessConfig zoneAwarenessConfig) {
        setZoneAwarenessConfig(zoneAwarenessConfig);
        return this;
    }

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * 
     * @param dedicatedMasterType
     *        The instance type for a dedicated master node.
     * @see OpenSearchPartitionInstanceType
     */

    public void setDedicatedMasterType(String dedicatedMasterType) {
        this.dedicatedMasterType = dedicatedMasterType;
    }

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * 
     * @return The instance type for a dedicated master node.
     * @see OpenSearchPartitionInstanceType
     */

    public String getDedicatedMasterType() {
        return this.dedicatedMasterType;
    }

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * 
     * @param dedicatedMasterType
     *        The instance type for a dedicated master node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public ClusterConfig withDedicatedMasterType(String dedicatedMasterType) {
        setDedicatedMasterType(dedicatedMasterType);
        return this;
    }

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * 
     * @param dedicatedMasterType
     *        The instance type for a dedicated master node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public ClusterConfig withDedicatedMasterType(OpenSearchPartitionInstanceType dedicatedMasterType) {
        this.dedicatedMasterType = dedicatedMasterType.toString();
        return this;
    }

    /**
     * <p>
     * Total number of dedicated master nodes, active and on standby, for the cluster.
     * </p>
     * 
     * @param dedicatedMasterCount
     *        Total number of dedicated master nodes, active and on standby, for the cluster.
     */

    public void setDedicatedMasterCount(Integer dedicatedMasterCount) {
        this.dedicatedMasterCount = dedicatedMasterCount;
    }

    /**
     * <p>
     * Total number of dedicated master nodes, active and on standby, for the cluster.
     * </p>
     * 
     * @return Total number of dedicated master nodes, active and on standby, for the cluster.
     */

    public Integer getDedicatedMasterCount() {
        return this.dedicatedMasterCount;
    }

    /**
     * <p>
     * Total number of dedicated master nodes, active and on standby, for the cluster.
     * </p>
     * 
     * @param dedicatedMasterCount
     *        Total number of dedicated master nodes, active and on standby, for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfig withDedicatedMasterCount(Integer dedicatedMasterCount) {
        setDedicatedMasterCount(dedicatedMasterCount);
        return this;
    }

    /**
     * <p>
     * True to enable UltraWarm storage.
     * </p>
     * 
     * @param warmEnabled
     *        True to enable UltraWarm storage.
     */

    public void setWarmEnabled(Boolean warmEnabled) {
        this.warmEnabled = warmEnabled;
    }

    /**
     * <p>
     * True to enable UltraWarm storage.
     * </p>
     * 
     * @return True to enable UltraWarm storage.
     */

    public Boolean getWarmEnabled() {
        return this.warmEnabled;
    }

    /**
     * <p>
     * True to enable UltraWarm storage.
     * </p>
     * 
     * @param warmEnabled
     *        True to enable UltraWarm storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfig withWarmEnabled(Boolean warmEnabled) {
        setWarmEnabled(warmEnabled);
        return this;
    }

    /**
     * <p>
     * True to enable UltraWarm storage.
     * </p>
     * 
     * @return True to enable UltraWarm storage.
     */

    public Boolean isWarmEnabled() {
        return this.warmEnabled;
    }

    /**
     * <p>
     * The instance type for the OpenSearch cluster's warm nodes.
     * </p>
     * 
     * @param warmType
     *        The instance type for the OpenSearch cluster's warm nodes.
     * @see OpenSearchWarmPartitionInstanceType
     */

    public void setWarmType(String warmType) {
        this.warmType = warmType;
    }

    /**
     * <p>
     * The instance type for the OpenSearch cluster's warm nodes.
     * </p>
     * 
     * @return The instance type for the OpenSearch cluster's warm nodes.
     * @see OpenSearchWarmPartitionInstanceType
     */

    public String getWarmType() {
        return this.warmType;
    }

    /**
     * <p>
     * The instance type for the OpenSearch cluster's warm nodes.
     * </p>
     * 
     * @param warmType
     *        The instance type for the OpenSearch cluster's warm nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchWarmPartitionInstanceType
     */

    public ClusterConfig withWarmType(String warmType) {
        setWarmType(warmType);
        return this;
    }

    /**
     * <p>
     * The instance type for the OpenSearch cluster's warm nodes.
     * </p>
     * 
     * @param warmType
     *        The instance type for the OpenSearch cluster's warm nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchWarmPartitionInstanceType
     */

    public ClusterConfig withWarmType(OpenSearchWarmPartitionInstanceType warmType) {
        this.warmType = warmType.toString();
        return this;
    }

    /**
     * <p>
     * The number of UltraWarm nodes in the cluster.
     * </p>
     * 
     * @param warmCount
     *        The number of UltraWarm nodes in the cluster.
     */

    public void setWarmCount(Integer warmCount) {
        this.warmCount = warmCount;
    }

    /**
     * <p>
     * The number of UltraWarm nodes in the cluster.
     * </p>
     * 
     * @return The number of UltraWarm nodes in the cluster.
     */

    public Integer getWarmCount() {
        return this.warmCount;
    }

    /**
     * <p>
     * The number of UltraWarm nodes in the cluster.
     * </p>
     * 
     * @param warmCount
     *        The number of UltraWarm nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfig withWarmCount(Integer warmCount) {
        setWarmCount(warmCount);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>ColdStorageOptions</code> config for a Domain
     * </p>
     * 
     * @param coldStorageOptions
     *        Specifies the <code>ColdStorageOptions</code> config for a Domain
     */

    public void setColdStorageOptions(ColdStorageOptions coldStorageOptions) {
        this.coldStorageOptions = coldStorageOptions;
    }

    /**
     * <p>
     * Specifies the <code>ColdStorageOptions</code> config for a Domain
     * </p>
     * 
     * @return Specifies the <code>ColdStorageOptions</code> config for a Domain
     */

    public ColdStorageOptions getColdStorageOptions() {
        return this.coldStorageOptions;
    }

    /**
     * <p>
     * Specifies the <code>ColdStorageOptions</code> config for a Domain
     * </p>
     * 
     * @param coldStorageOptions
     *        Specifies the <code>ColdStorageOptions</code> config for a Domain
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfig withColdStorageOptions(ColdStorageOptions coldStorageOptions) {
        setColdStorageOptions(coldStorageOptions);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getDedicatedMasterEnabled() != null)
            sb.append("DedicatedMasterEnabled: ").append(getDedicatedMasterEnabled()).append(",");
        if (getZoneAwarenessEnabled() != null)
            sb.append("ZoneAwarenessEnabled: ").append(getZoneAwarenessEnabled()).append(",");
        if (getZoneAwarenessConfig() != null)
            sb.append("ZoneAwarenessConfig: ").append(getZoneAwarenessConfig()).append(",");
        if (getDedicatedMasterType() != null)
            sb.append("DedicatedMasterType: ").append(getDedicatedMasterType()).append(",");
        if (getDedicatedMasterCount() != null)
            sb.append("DedicatedMasterCount: ").append(getDedicatedMasterCount()).append(",");
        if (getWarmEnabled() != null)
            sb.append("WarmEnabled: ").append(getWarmEnabled()).append(",");
        if (getWarmType() != null)
            sb.append("WarmType: ").append(getWarmType()).append(",");
        if (getWarmCount() != null)
            sb.append("WarmCount: ").append(getWarmCount()).append(",");
        if (getColdStorageOptions() != null)
            sb.append("ColdStorageOptions: ").append(getColdStorageOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterConfig == false)
            return false;
        ClusterConfig other = (ClusterConfig) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getDedicatedMasterEnabled() == null ^ this.getDedicatedMasterEnabled() == null)
            return false;
        if (other.getDedicatedMasterEnabled() != null && other.getDedicatedMasterEnabled().equals(this.getDedicatedMasterEnabled()) == false)
            return false;
        if (other.getZoneAwarenessEnabled() == null ^ this.getZoneAwarenessEnabled() == null)
            return false;
        if (other.getZoneAwarenessEnabled() != null && other.getZoneAwarenessEnabled().equals(this.getZoneAwarenessEnabled()) == false)
            return false;
        if (other.getZoneAwarenessConfig() == null ^ this.getZoneAwarenessConfig() == null)
            return false;
        if (other.getZoneAwarenessConfig() != null && other.getZoneAwarenessConfig().equals(this.getZoneAwarenessConfig()) == false)
            return false;
        if (other.getDedicatedMasterType() == null ^ this.getDedicatedMasterType() == null)
            return false;
        if (other.getDedicatedMasterType() != null && other.getDedicatedMasterType().equals(this.getDedicatedMasterType()) == false)
            return false;
        if (other.getDedicatedMasterCount() == null ^ this.getDedicatedMasterCount() == null)
            return false;
        if (other.getDedicatedMasterCount() != null && other.getDedicatedMasterCount().equals(this.getDedicatedMasterCount()) == false)
            return false;
        if (other.getWarmEnabled() == null ^ this.getWarmEnabled() == null)
            return false;
        if (other.getWarmEnabled() != null && other.getWarmEnabled().equals(this.getWarmEnabled()) == false)
            return false;
        if (other.getWarmType() == null ^ this.getWarmType() == null)
            return false;
        if (other.getWarmType() != null && other.getWarmType().equals(this.getWarmType()) == false)
            return false;
        if (other.getWarmCount() == null ^ this.getWarmCount() == null)
            return false;
        if (other.getWarmCount() != null && other.getWarmCount().equals(this.getWarmCount()) == false)
            return false;
        if (other.getColdStorageOptions() == null ^ this.getColdStorageOptions() == null)
            return false;
        if (other.getColdStorageOptions() != null && other.getColdStorageOptions().equals(this.getColdStorageOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getDedicatedMasterEnabled() == null) ? 0 : getDedicatedMasterEnabled().hashCode());
        hashCode = prime * hashCode + ((getZoneAwarenessEnabled() == null) ? 0 : getZoneAwarenessEnabled().hashCode());
        hashCode = prime * hashCode + ((getZoneAwarenessConfig() == null) ? 0 : getZoneAwarenessConfig().hashCode());
        hashCode = prime * hashCode + ((getDedicatedMasterType() == null) ? 0 : getDedicatedMasterType().hashCode());
        hashCode = prime * hashCode + ((getDedicatedMasterCount() == null) ? 0 : getDedicatedMasterCount().hashCode());
        hashCode = prime * hashCode + ((getWarmEnabled() == null) ? 0 : getWarmEnabled().hashCode());
        hashCode = prime * hashCode + ((getWarmType() == null) ? 0 : getWarmType().hashCode());
        hashCode = prime * hashCode + ((getWarmCount() == null) ? 0 : getWarmCount().hashCode());
        hashCode = prime * hashCode + ((getColdStorageOptions() == null) ? 0 : getColdStorageOptions().hashCode());
        return hashCode;
    }

    @Override
    public ClusterConfig clone() {
        try {
            return (ClusterConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.ClusterConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}