package com.github.alexandrenavarro.postprocessorbuilder;

import java.util.Properties;

/**
 * <p>CustumPostProcessorDescriptorBuilder.</p>
 *
 * @author anavarro - Dec 7, 2014
 *
 */
public class CustomPostProcessorDescriptorBuilder extends PostProcessorDescriptorBuilder {

    private String[] leafLevels;
    
    /**
     * Constructor.
     *
     */
    private CustomPostProcessorDescriptorBuilder() {
        super();
    }
    
    public static CustomPostProcessorDescriptorBuilder create() {
        return new CustomPostProcessorDescriptorBuilder();
    }
    
    
    /**
     * <p>leafLevels.</p>
     *
     * @param leafLevels
     * @return
     */
    public CustomPostProcessorDescriptorBuilder leafLevels(String... leafLevels) {
        this.leafLevels = leafLevels;
        return this;
    }
    
    
    /**
     * {@inheritDoc}
     *
     * @see com.github.alexandrenavarro.postprocessorbuilder.PostProcessorDescriptorBuilder#name(java.lang.String)
     */
    public CustomPostProcessorDescriptorBuilder name(String aName) {
        return (CustomPostProcessorDescriptorBuilder) super.name(aName);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.github.alexandrenavarro.postprocessorbuilder.PostProcessorDescriptorBuilder#pluginKey(java.lang.String)
     */
    @Override
    public CustomPostProcessorDescriptorBuilder pluginKey(String aPluginKey) {
        return (CustomPostProcessorDescriptorBuilder) super.pluginKey(aPluginKey);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.github.alexandrenavarro.postprocessorbuilder.PostProcessorDescriptorBuilder#addProperty(java.lang.String, java.lang.String)
     */
    @Override
    public CustomPostProcessorDescriptorBuilder addProperty(String aKey, String aValue) {
        return (CustomPostProcessorDescriptorBuilder) super.addProperty(aKey, aValue);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.github.alexandrenavarro.postprocessorbuilder.PostProcessorDescriptorBuilder#handlers(java.lang.String[])
     */
    @Override
    public CustomPostProcessorDescriptorBuilder handlers(String... aHandlers) {
        return (CustomPostProcessorDescriptorBuilder) super.handlers(aHandlers);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.github.alexandrenavarro.postprocessorbuilder.PostProcessorDescriptorBuilder#measures(java.lang.String[])
     */
    @Override
    public CustomPostProcessorDescriptorBuilder measures(String... aMeasures) {
        return (CustomPostProcessorDescriptorBuilder) super.measures(aMeasures);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.github.alexandrenavarro.postprocessorbuilder.PostProcessorDescriptorBuilder#build()
     */
    @Override
    public PostProcessorDescriptor build() {
        final PostProcessorDescriptor postProcessorDescriptor = super.build();
        final Properties properties = postProcessorDescriptor.getProperties();
        properties.put("leafLevel", leafLevels);        
        return postProcessorDescriptor;
    }

}
