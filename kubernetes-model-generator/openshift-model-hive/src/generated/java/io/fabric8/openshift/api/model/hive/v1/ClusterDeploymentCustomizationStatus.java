
package io.fabric8.openshift.api.model.hive.v1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
import io.fabric8.openshift.api.model.customresourcestatus.conditions.v1.Condition;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clusterDeploymentRef",
    "clusterPoolRef",
    "conditions",
    "lastAppliedConfiguration"
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
public class ClusterDeploymentCustomizationStatus implements Editable<ClusterDeploymentCustomizationStatusBuilder> , KubernetesResource
{

    @JsonProperty("clusterDeploymentRef")
    private LocalObjectReference clusterDeploymentRef;
    @JsonProperty("clusterPoolRef")
    private LocalObjectReference clusterPoolRef;
    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Condition> conditions = new ArrayList<>();
    @JsonProperty("lastAppliedConfiguration")
    private String lastAppliedConfiguration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClusterDeploymentCustomizationStatus() {
    }

    public ClusterDeploymentCustomizationStatus(LocalObjectReference clusterDeploymentRef, LocalObjectReference clusterPoolRef, List<Condition> conditions, String lastAppliedConfiguration) {
        super();
        this.clusterDeploymentRef = clusterDeploymentRef;
        this.clusterPoolRef = clusterPoolRef;
        this.conditions = conditions;
        this.lastAppliedConfiguration = lastAppliedConfiguration;
    }

    @JsonProperty("clusterDeploymentRef")
    public LocalObjectReference getClusterDeploymentRef() {
        return clusterDeploymentRef;
    }

    @JsonProperty("clusterDeploymentRef")
    public void setClusterDeploymentRef(LocalObjectReference clusterDeploymentRef) {
        this.clusterDeploymentRef = clusterDeploymentRef;
    }

    @JsonProperty("clusterPoolRef")
    public LocalObjectReference getClusterPoolRef() {
        return clusterPoolRef;
    }

    @JsonProperty("clusterPoolRef")
    public void setClusterPoolRef(LocalObjectReference clusterPoolRef) {
        this.clusterPoolRef = clusterPoolRef;
    }

    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<Condition> getConditions() {
        return conditions;
    }

    @JsonProperty("conditions")
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    @JsonProperty("lastAppliedConfiguration")
    public String getLastAppliedConfiguration() {
        return lastAppliedConfiguration;
    }

    @JsonProperty("lastAppliedConfiguration")
    public void setLastAppliedConfiguration(String lastAppliedConfiguration) {
        this.lastAppliedConfiguration = lastAppliedConfiguration;
    }

    @JsonIgnore
    public ClusterDeploymentCustomizationStatusBuilder edit() {
        return new ClusterDeploymentCustomizationStatusBuilder(this);
    }

    @JsonIgnore
    public ClusterDeploymentCustomizationStatusBuilder toBuilder() {
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
