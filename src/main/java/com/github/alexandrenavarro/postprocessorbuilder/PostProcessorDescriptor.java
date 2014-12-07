package com.github.alexandrenavarro.postprocessorbuilder;

import java.util.Arrays;
import java.util.Properties;

/**
 * <p>PostProcessorDescriptor.</p>
 *
 * @author anavarro - Dec 7, 2014
 *
 */
public class PostProcessorDescriptor {

    private String name;
    private String pluginKey;
    private String folder;
    private String[] handlers;
    private String[] measures;
    
    
    private Properties properties = new Properties();

    public PostProcessorDescriptor() {
        super();
    }
    
    public PostProcessorDescriptor(String aName, String aPluginKey) {
        super();
        this.name = aName;
        this.pluginKey = aPluginKey;
    }


    /**
     * Returns the folder.
     *
     * @return The folder to return.
     */
    public String getFolder() {
        return this.folder;
    }


    /**
     * Sets the folder.
     *
     * @param aFolder The folder to set.
     */
    public void setFolder(String aFolder) {
        this.folder = aFolder;
    }


    /**
     * Returns the handlers.
     *
     * @return The handlers to return.
     */
    public String[] getHandlers() {
        return this.handlers;
    }


    /**
     * Sets the handlers.
     *
     * @param aHandlers The handlers to set.
     */
    public void setHandlers(String[] aHandlers) {
        this.handlers = aHandlers;
    }

    /**
     * Returns the name.
     *
     * @return The name to return.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name.
     *
     * @param aName The name to set.
     */
    public void setName(String aName) {
        this.name = aName;
    }

    /**
     * Returns the pluginKey.
     *
     * @return The pluginKey to return.
     */
    public String getPluginKey() {
        return this.pluginKey;
    }

    /**
     * Sets the pluginKey.
     *
     * @param aPluginKey The pluginKey to set.
     */
    public void setPluginKey(String aPluginKey) {
        this.pluginKey = aPluginKey;
    }

    /**
     * Returns the properties.
     *
     * @return The properties to return.
     */
    public Properties getProperties() {
        return this.properties;
    }

    /**
     * Sets the properties.
     *
     * @param aProperties The properties to set.
     */
    public void setProperties(Properties aProperties) {
        this.properties = aProperties;
    }

    /**
     * Returns the measures.
     *
     * @return The measures to return.
     */
    public String[] getMeasures() {
        return this.measures;
    }

    /**
     * Sets the measures.
     *
     * @param aMeasures The measures to set.
     */
    public void setMeasures(String[] aMeasures) {
        this.measures = aMeasures;
    }

    /**
     * {@inheritDoc}
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PostProcessorDescriptor [name=" + this.name + ", pluginKey=" + this.pluginKey + ", folder=" + this.folder + ", handlers="
                + Arrays.toString(this.handlers) + ", measures=" + Arrays.toString(this.measures) + ", properties=" + this.properties + "]";
    }
    
    
    
    
    
    
    
    



}
