

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
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.DependencyResolver;

/**
 * The type OneNoteApiClient.
 */
public class OneNoteApiClient extends BaseOrcContainer {

     /**
     * Instantiates a new OneNoteApiClient.
     *
     * @param url the url
     * @param resolver the resolver
     */
    public OneNoteApiClient(String url, DependencyResolver resolver) {
        super(url, resolver);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public OneNoteApiClient addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public OneNoteApiClient addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

     /**
     * Gets me.
     *
     * @return the me
     */
    public MeFetcher getMe() {
        return new MeFetcher("me", this);
    }
     /**
     * Gets myOrganization.
     *
     * @return the myOrganization
     */
    public MyOrganizationFetcher getMyOrganization() {
        return new MyOrganizationFetcher("myOrganization", this);
    }
}