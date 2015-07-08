/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.onenote;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Notes.
*/
public class Notes extends ODataBaseEntity {

    public Notes(){
        setODataType("#Microsoft.OneNote.Api.Notes");
    }
            
    private String id;
     
    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getId() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setId(String value) { 
        this.id = value; 
        valueChanged("id", value);

    }
    
        
    private java.util.List<Notebook> notebooks = null;
    
    
     
    /**
    * Gets the notebooks.
    *
    * @return the java.util.List<Notebook>
    */
    public java.util.List<Notebook> getNotebooks() {
        return this.notebooks; 
    }

    /**
    * Sets the notebooks.
    *
    * @param value the java.util.List<Notebook>
    */
    public void setNotebooks(java.util.List<Notebook> value) { 
        this.notebooks = value; 
        valueChanged("notebooks", value);

    }
    
        
    private java.util.List<Section> sections = null;
    
    
     
    /**
    * Gets the sections.
    *
    * @return the java.util.List<Section>
    */
    public java.util.List<Section> getSections() {
        return this.sections; 
    }

    /**
    * Sets the sections.
    *
    * @param value the java.util.List<Section>
    */
    public void setSections(java.util.List<Section> value) { 
        this.sections = value; 
        valueChanged("sections", value);

    }
    
        
    private java.util.List<SectionGroup> sectionGroups = null;
    
    
     
    /**
    * Gets the section Groups.
    *
    * @return the java.util.List<SectionGroup>
    */
    public java.util.List<SectionGroup> getSectionGroups() {
        return this.sectionGroups; 
    }

    /**
    * Sets the section Groups.
    *
    * @param value the java.util.List<SectionGroup>
    */
    public void setSectionGroups(java.util.List<SectionGroup> value) { 
        this.sectionGroups = value; 
        valueChanged("sectionGroups", value);

    }
    
        
    private java.util.List<Page> pages = null;
    
    
     
    /**
    * Gets the pages.
    *
    * @return the java.util.List<Page>
    */
    public java.util.List<Page> getPages() {
        return this.pages; 
    }

    /**
    * Sets the pages.
    *
    * @param value the java.util.List<Page>
    */
    public void setPages(java.util.List<Page> value) { 
        this.pages = value; 
        valueChanged("pages", value);

    }
    
        
    private java.util.List<Resource> resources = null;
    
    
     
    /**
    * Gets the resources.
    *
    * @return the java.util.List<Resource>
    */
    public java.util.List<Resource> getResources() {
        return this.resources; 
    }

    /**
    * Sets the resources.
    *
    * @param value the java.util.List<Resource>
    */
    public void setResources(java.util.List<Resource> value) { 
        this.resources = value; 
        valueChanged("resources", value);

    }
}

