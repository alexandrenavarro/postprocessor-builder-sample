package com.github.alexandrenavarro.postprocessorbuilder;

/**
 * <p>Main.</p>
 *
 * @author anavarro - Dec 7, 2014
 *
 */
public class Main {

    /**
     * Constructor.
     *
     */
    public Main() {
    }

    /**
     * <p>main.</p>
     *
     * @param args
     */
    public static void main(String[] args) {

        final PostProcessorDescriptor postProcessorDescriptor = new PostProcessorDescriptor("name", "key");

        String[] s = { "a", "b" };

        // PostProcessorDescriptor postProcessorDescriptor2 = PostProcessorDescriptorBuilder2.postProcessorDescriptor()
        // .withName("name")
        // .withHandlers(s)
        // .build();

        final PostProcessorDescriptor postProcessorDescriptor3 = DefaultPostProcessorDescriptorBuilder.create()
            .name("name")
            .pluginKey("pluginKey")
            .handlers("handler1", "handler2")
            .measures("measure1", "measures2")
            .addProperty("key1", "value2")
            .addProperty("key2", "value2")
            .build();

        // Java > Code Style > Formatter
        // Function Call > Qualified invocations
        // Wrap All Element, every element except first if not necessary
        // Force split

        System.out.println("postProcessorDescriptor3=" + postProcessorDescriptor3);

        final PostProcessorDescriptor postProcessorDescriptor4 = CustomPostProcessorDescriptorBuilder.create()
            .name("name2")
            .pluginKey("pluginKey2")
            .handlers("handler1", "handler2")
            .measures("measure1", "measures2")
            .addProperty("key1", "value2")
            .addProperty("key2", "value2")
            .leafLevels("leafLevel1")
            .build();

        System.out.println("postProcessorDescriptor4=" + postProcessorDescriptor4);

    }

}
