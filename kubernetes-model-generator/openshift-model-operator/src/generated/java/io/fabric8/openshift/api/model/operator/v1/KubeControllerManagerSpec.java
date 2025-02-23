
package io.fabric8.openshift.api.model.operator.v1;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "failedRevisionLimit",
    "forceRedeploymentReason",
    "logLevel",
    "managementState",
    "observedConfig",
    "operatorLogLevel",
    "succeededRevisionLimit",
    "unsupportedConfigOverrides",
    "useMoreSecureServiceCA"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class KubeControllerManagerSpec implements Editable<KubeControllerManagerSpecBuilder> , KubernetesResource
{

    @JsonProperty("failedRevisionLimit")
    private Integer failedRevisionLimit;
    @JsonProperty("forceRedeploymentReason")
    private String forceRedeploymentReason;
    @JsonProperty("logLevel")
    private String logLevel;
    @JsonProperty("managementState")
    private String managementState;
    @JsonProperty("observedConfig")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    private Object observedConfig;
    @JsonProperty("operatorLogLevel")
    private String operatorLogLevel;
    @JsonProperty("succeededRevisionLimit")
    private Integer succeededRevisionLimit;
    @JsonProperty("unsupportedConfigOverrides")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    private Object unsupportedConfigOverrides;
    @JsonProperty("useMoreSecureServiceCA")
    private Boolean useMoreSecureServiceCA;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public KubeControllerManagerSpec() {
    }

    public KubeControllerManagerSpec(Integer failedRevisionLimit, String forceRedeploymentReason, String logLevel, String managementState, Object observedConfig, String operatorLogLevel, Integer succeededRevisionLimit, Object unsupportedConfigOverrides, Boolean useMoreSecureServiceCA) {
        super();
        this.failedRevisionLimit = failedRevisionLimit;
        this.forceRedeploymentReason = forceRedeploymentReason;
        this.logLevel = logLevel;
        this.managementState = managementState;
        this.observedConfig = observedConfig;
        this.operatorLogLevel = operatorLogLevel;
        this.succeededRevisionLimit = succeededRevisionLimit;
        this.unsupportedConfigOverrides = unsupportedConfigOverrides;
        this.useMoreSecureServiceCA = useMoreSecureServiceCA;
    }

    @JsonProperty("failedRevisionLimit")
    public Integer getFailedRevisionLimit() {
        return failedRevisionLimit;
    }

    @JsonProperty("failedRevisionLimit")
    public void setFailedRevisionLimit(Integer failedRevisionLimit) {
        this.failedRevisionLimit = failedRevisionLimit;
    }

    @JsonProperty("forceRedeploymentReason")
    public String getForceRedeploymentReason() {
        return forceRedeploymentReason;
    }

    @JsonProperty("forceRedeploymentReason")
    public void setForceRedeploymentReason(String forceRedeploymentReason) {
        this.forceRedeploymentReason = forceRedeploymentReason;
    }

    @JsonProperty("logLevel")
    public String getLogLevel() {
        return logLevel;
    }

    @JsonProperty("logLevel")
    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    @JsonProperty("managementState")
    public String getManagementState() {
        return managementState;
    }

    @JsonProperty("managementState")
    public void setManagementState(String managementState) {
        this.managementState = managementState;
    }

    @JsonProperty("observedConfig")
    public Object getObservedConfig() {
        return observedConfig;
    }

    @JsonProperty("observedConfig")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    public void setObservedConfig(Object observedConfig) {
        this.observedConfig = observedConfig;
    }

    @JsonProperty("operatorLogLevel")
    public String getOperatorLogLevel() {
        return operatorLogLevel;
    }

    @JsonProperty("operatorLogLevel")
    public void setOperatorLogLevel(String operatorLogLevel) {
        this.operatorLogLevel = operatorLogLevel;
    }

    @JsonProperty("succeededRevisionLimit")
    public Integer getSucceededRevisionLimit() {
        return succeededRevisionLimit;
    }

    @JsonProperty("succeededRevisionLimit")
    public void setSucceededRevisionLimit(Integer succeededRevisionLimit) {
        this.succeededRevisionLimit = succeededRevisionLimit;
    }

    @JsonProperty("unsupportedConfigOverrides")
    public Object getUnsupportedConfigOverrides() {
        return unsupportedConfigOverrides;
    }

    @JsonProperty("unsupportedConfigOverrides")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    public void setUnsupportedConfigOverrides(Object unsupportedConfigOverrides) {
        this.unsupportedConfigOverrides = unsupportedConfigOverrides;
    }

    @JsonProperty("useMoreSecureServiceCA")
    public Boolean getUseMoreSecureServiceCA() {
        return useMoreSecureServiceCA;
    }

    @JsonProperty("useMoreSecureServiceCA")
    public void setUseMoreSecureServiceCA(Boolean useMoreSecureServiceCA) {
        this.useMoreSecureServiceCA = useMoreSecureServiceCA;
    }

    @JsonIgnore
    public KubeControllerManagerSpecBuilder edit() {
        return new KubeControllerManagerSpecBuilder(this);
    }

    @JsonIgnore
    public KubeControllerManagerSpecBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
