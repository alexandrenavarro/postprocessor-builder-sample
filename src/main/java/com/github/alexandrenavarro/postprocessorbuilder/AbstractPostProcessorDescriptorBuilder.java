package com.github.alexandrenavarro.postprocessorbuilder;

import java.util.Properties;

/**
 * <p>AbstractPostProcessorDescriptorBuilder.</p>
 *
 * @author anavarro - Dec 7, 2014
 * @param <B>
 *
 */
public abstract class AbstractPostProcessorDescriptorBuilder<B extends AbstractPostProcessorDescriptorBuilder<B>> {

    protected String name;
    protected String pluginKey;
    
    protected String[] handlers;
    protected String[] measures;
    protected Properties properties = new Properties();

    
    
    /**
     * Constructor.
     *
     */
    protected AbstractPostProcessorDescriptorBuilder() {
        super();
    }
    
    
    /**
     * <p>name.</p>
     *
     * @param name
     * @return
     */
    public B name(String name) {
        this.name = name;
        return ((B) this);
    }
    

    
    public B pluginKey(String pluginKey) {
        this.pluginKey = pluginKey;
        return (B) this;
    }
    
    public B addProperty(String key, String value) {
        this.properties.put(key, value);
        return (B) this;
    }
    
    public B handlers(String... handlers) {
        this.handlers = handlers;
        return (B) this;
    }
    
    public B measures(String... measures) {
        this.measures = measures;
        return (B) this;
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
