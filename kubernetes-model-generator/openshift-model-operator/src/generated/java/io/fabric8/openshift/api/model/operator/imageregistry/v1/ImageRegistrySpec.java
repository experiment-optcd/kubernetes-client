
package io.fabric8.openshift.api.model.operator.imageregistry.v1;

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
import io.fabric8.kubernetes.api.model.Affinity;
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
import io.fabric8.kubernetes.api.model.Toleration;
import io.fabric8.kubernetes.api.model.TopologySpreadConstraint;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "affinity",
    "defaultRoute",
    "disableRedirect",
    "httpSecret",
    "logLevel",
    "logging",
    "managementState",
    "nodeSelector",
    "observedConfig",
    "operatorLogLevel",
    "proxy",
    "readOnly",
    "replicas",
    "requests",
    "resources",
    "rolloutStrategy",
    "routes",
    "storage",
    "tolerations",
    "topologySpreadConstraints",
    "unsupportedConfigOverrides"
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
public class ImageRegistrySpec implements Editable<ImageRegistrySpecBuilder> , KubernetesResource
{

    @JsonProperty("affinity")
    private Affinity affinity;
    @JsonProperty("defaultRoute")
    private Boolean defaultRoute;
    @JsonProperty("disableRedirect")
    private Boolean disableRedirect;
    @JsonProperty("httpSecret")
    private String httpSecret;
    @JsonProperty("logLevel")
    private String logLevel;
    @JsonProperty("logging")
    private Long logging;
    @JsonProperty("managementState")
    private String managementState;
    @JsonProperty("nodeSelector")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, String> nodeSelector = new LinkedHashMap<>();
    @JsonProperty("observedConfig")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    private Object observedConfig;
    @JsonProperty("operatorLogLevel")
    private String operatorLogLevel;
    @JsonProperty("proxy")
    private ImageRegistryConfigProxy proxy;
    @JsonProperty("readOnly")
    private Boolean readOnly;
    @JsonProperty("replicas")
    private Integer replicas;
    @JsonProperty("requests")
    private ImageRegistryConfigRequests requests;
    @JsonProperty("resources")
    private ResourceRequirements resources;
    @JsonProperty("rolloutStrategy")
    private String rolloutStrategy;
    @JsonProperty("routes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ImageRegistryConfigRoute> routes = new ArrayList<>();
    @JsonProperty("storage")
    private ImageRegistryConfigStorage storage;
    @JsonProperty("tolerations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Toleration> tolerations = new ArrayList<>();
    @JsonProperty("topologySpreadConstraints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TopologySpreadConstraint> topologySpreadConstraints = new ArrayList<>();
    @JsonProperty("unsupportedConfigOverrides")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    private Object unsupportedConfigOverrides;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageRegistrySpec() {
    }

    public ImageRegistrySpec(Affinity affinity, Boolean defaultRoute, Boolean disableRedirect, String httpSecret, String logLevel, Long logging, String managementState, Map<String, String> nodeSelector, Object observedConfig, String operatorLogLevel, ImageRegistryConfigProxy proxy, Boolean readOnly, Integer replicas, ImageRegistryConfigRequests requests, ResourceRequirements resources, String rolloutStrategy, List<ImageRegistryConfigRoute> routes, ImageRegistryConfigStorage storage, List<Toleration> tolerations, List<TopologySpreadConstraint> topologySpreadConstraints, Object unsupportedConfigOverrides) {
        super();
        this.affinity = affinity;
        this.defaultRoute = defaultRoute;
        this.disableRedirect = disableRedirect;
        this.httpSecret = httpSecret;
        this.logLevel = logLevel;
        this.logging = logging;
        this.managementState = managementState;
        this.nodeSelector = nodeSelector;
        this.observedConfig = observedConfig;
        this.operatorLogLevel = operatorLogLevel;
        this.proxy = proxy;
        this.readOnly = readOnly;
        this.replicas = replicas;
        this.requests = requests;
        this.resources = resources;
        this.rolloutStrategy = rolloutStrategy;
        this.routes = routes;
        this.storage = storage;
        this.tolerations = tolerations;
        this.topologySpreadConstraints = topologySpreadConstraints;
        this.unsupportedConfigOverrides = unsupportedConfigOverrides;
    }

    @JsonProperty("affinity")
    public Affinity getAffinity() {
        return affinity;
    }

    @JsonProperty("affinity")
    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    @JsonProperty("defaultRoute")
    public Boolean getDefaultRoute() {
        return defaultRoute;
    }

    @JsonProperty("defaultRoute")
    public void setDefaultRoute(Boolean defaultRoute) {
        this.defaultRoute = defaultRoute;
    }

    @JsonProperty("disableRedirect")
    public Boolean getDisableRedirect() {
        return disableRedirect;
    }

    @JsonProperty("disableRedirect")
    public void setDisableRedirect(Boolean disableRedirect) {
        this.disableRedirect = disableRedirect;
    }

    @JsonProperty("httpSecret")
    public String getHttpSecret() {
        return httpSecret;
    }

    @JsonProperty("httpSecret")
    public void setHttpSecret(String httpSecret) {
        this.httpSecret = httpSecret;
    }

    @JsonProperty("logLevel")
    public String getLogLevel() {
        return logLevel;
    }

    @JsonProperty("logLevel")
    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    @JsonProperty("logging")
    public Long getLogging() {
        return logging;
    }

    @JsonProperty("logging")
    public void setLogging(Long logging) {
        this.logging = logging;
    }

    @JsonProperty("managementState")
    public String getManagementState() {
        return managementState;
    }

    @JsonProperty("managementState")
    public void setManagementState(String managementState) {
        this.managementState = managementState;
    }

    @JsonProperty("nodeSelector")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    @JsonProperty("nodeSelector")
    public void setNodeSelector(Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
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

    @JsonProperty("proxy")
    public ImageRegistryConfigProxy getProxy() {
        return proxy;
    }

    @JsonProperty("proxy")
    public void setProxy(ImageRegistryConfigProxy proxy) {
        this.proxy = proxy;
    }

    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @JsonProperty("replicas")
    public Integer getReplicas() {
        return replicas;
    }

    @JsonProperty("replicas")
    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    @JsonProperty("requests")
    public ImageRegistryConfigRequests getRequests() {
        return requests;
    }

    @JsonProperty("requests")
    public void setRequests(ImageRegistryConfigRequests requests) {
        this.requests = requests;
    }

    @JsonProperty("resources")
    public ResourceRequirements getResources() {
        return resources;
    }

    @JsonProperty("resources")
    public void setResources(ResourceRequirements resources) {
        this.resources = resources;
    }

    @JsonProperty("rolloutStrategy")
    public String getRolloutStrategy() {
        return rolloutStrategy;
    }

    @JsonProperty("rolloutStrategy")
    public void setRolloutStrategy(String rolloutStrategy) {
        this.rolloutStrategy = rolloutStrategy;
    }

    @JsonProperty("routes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<ImageRegistryConfigRoute> getRoutes() {
        return routes;
    }

    @JsonProperty("routes")
    public void setRoutes(List<ImageRegistryConfigRoute> routes) {
        this.routes = routes;
    }

    @JsonProperty("storage")
    public ImageRegistryConfigStorage getStorage() {
        return storage;
    }

    @JsonProperty("storage")
    public void setStorage(ImageRegistryConfigStorage storage) {
        this.storage = storage;
    }

    @JsonProperty("tolerations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<Toleration> getTolerations() {
        return tolerations;
    }

    @JsonProperty("tolerations")
    public void setTolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
    }

    @JsonProperty("topologySpreadConstraints")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<TopologySpreadConstraint> getTopologySpreadConstraints() {
        return topologySpreadConstraints;
    }

    @JsonProperty("topologySpreadConstraints")
    public void setTopologySpreadConstraints(List<TopologySpreadConstraint> topologySpreadConstraints) {
        this.topologySpreadConstraints = topologySpreadConstraints;
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

    @JsonIgnore
    public ImageRegistrySpecBuilder edit() {
        return new ImageRegistrySpecBuilder(this);
    }

    @JsonIgnore
    public ImageRegistrySpecBuilder toBuilder() {
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
