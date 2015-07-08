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
package com.microsoft.services.onenote.fetchers;

import com.microsoft.services.onenote.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.Readable;

/**
 * The type  SiteCollection
 .
 */
public class SiteCollectionFetcher extends OrcEntityFetcher<SiteCollection,SiteCollectionOperations> 
                                     implements Readable<SiteCollection> {

     /**
     * Instantiates a new SiteCollectionFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public SiteCollectionFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, SiteCollection.class, SiteCollectionOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public SiteCollectionFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public SiteCollectionFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

        
     /**
     * Gets sites.
     *
     * @return the sites
     */
    public OrcCollectionFetcher<Site, SiteFetcher, SiteCollectionOperations> getSites() {
        return new OrcCollectionFetcher<Site, SiteFetcher, SiteCollectionOperations>("sites", this, Site.class, SiteCollectionOperations.class);
    }

    /**
     * Gets site.
     *
     * @return the site
     */
    public SiteFetcher getSite(String id){
         return new OrcCollectionFetcher<Site, SiteFetcher, SiteCollectionOperations>("sites", this, Site.class, SiteCollectionOperations.class).getById(id);
    }

}
