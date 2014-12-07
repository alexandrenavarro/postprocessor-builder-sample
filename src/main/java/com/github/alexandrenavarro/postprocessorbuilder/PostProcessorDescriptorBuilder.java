package com.github.alexandrenavarro.postprocessorbuilder;

import java.util.Properties;

/**
 * <p>PostProcessorBuilder.</p>
 *
 * @author anavarro - Dec 7, 2014
 *
 */
public class PostProcessorDescriptorBuilder {

    private String name;
    private String pluginKey;
    
    private String[] handlers;
    private String[] measures;
    private Properties properties = new Properties();
    
    
    /**
     * Constructor.
     *
     */
    protected PostProcessorDescriptorBuilder() {
    }
    
    /**
     * <p>create.</p>
     *
     * @return
     */
    public static PostProcessorDescriptorBuilder create() {
        return new PostProcessorDescriptorBuilder();
    }
    
    /**
     * <p>name.</p>
     *
     * @param name
     * @return
     */
    public PostProcessorDescriptorBuilder name(String name) {
        this.name = name;
        return this;
    }
    

    
    public PostProcessorDescriptorBuilder pluginKey(String pluginKey) {
        this.pluginKey = pluginKey;
        return this;
    }
    
    public PostProcessorDescriptorBuilder addProperty(String key, String value) {
        this.properties.put(key, value);
        return this;
    }
    
    public PostProcessorDescriptorBuilder handlers(String... handlers) {
        this.handlers = handlers;
        return this;
    }
    
    public PostProcessorDescriptorBuilder measures(String... measures) {
        this.measures = measures;
        return this;
    }
    
    
    
    
    
    /**
     * <p>build.</p>
     *
     * @return
     */
    public PostProcessorDescriptor build() {
        if (name == null || pluginKey == null) {
            throw new IllegalArgumentException("Name and pluginKey are mandatory.");
        }
        final PostProcessorDescriptor postProcessorDescriptor = new PostProcessorDescriptor(this.name, this.pluginKey);
        postProcessorDescriptor.setProperties(this.properties);
        if (this.handlers != null) {
            postProcessorDescriptor.setHandlers(this.handlers);
        }
        if (this.measures != null) {
            postProcessorDescriptor.setMeasures(this.measures);
        }
        
        return postProcessorDescriptor;
    }
    
    

}
