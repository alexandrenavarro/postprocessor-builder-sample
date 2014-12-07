package com.github.alexandrenavarro.postprocessorbuilder;

import java.util.Properties;

/**
 * <p>CustumPostProcessorDescriptorBuilder.</p>
 *
 * @author anavarro - Dec 7, 2014
 *
 */
public class CustomPostProcessorDescriptorBuilder extends AbstractPostProcessorDescriptorBuilder<CustomPostProcessorDescriptorBuilder> {

    private String[] leafLevels;
    
    /**
     * Constructor.
     *
     */
    private CustomPostProcessorDescriptorBuilder() {
        super();
    }
    
    /**
     * <p>create.</p>
     *
     * @return
     */
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
     * @see com.github.alexandrenavarro.postprocessorbuilder.AbstractPostProcessorDescriptorBuilder#build()
     */
    @Override
    public PostProcessorDescriptor build() {
        final PostProcessorDescriptor postProcessorDescriptor = super.build();
        final Properties properties = postProcessorDescriptor.getProperties();
        properties.put("leafLevel", leafLevels);        
        return postProcessorDescriptor;
    }

}
