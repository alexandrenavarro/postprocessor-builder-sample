package com.github.alexandrenavarro.postprocessorbuilder;

/**
 * <p>DefaultPostProcessorDescriptorBuilder.</p>
 *
 * @author anavarro - Dec 7, 2014
 *
 */
public class DefaultPostProcessorDescriptorBuilder extends AbstractPostProcessorDescriptorBuilder<DefaultPostProcessorDescriptorBuilder> {

    /**
     * Constructor.
     *
     */
    private DefaultPostProcessorDescriptorBuilder() {
    }
    
    /**
     * <p>create.</p>
     *
     * @return
     */
    public static DefaultPostProcessorDescriptorBuilder create() {
        return new DefaultPostProcessorDescriptorBuilder();
    }
    
    /**
     * {@inheritDoc}
     *
     * @see com.github.alexandrenavarro.postprocessorbuilder.AbstractPostProcessorDescriptorBuilder#build()
     */
    @Override
    public PostProcessorDescriptor build() {
        return super.build();
    }

}
