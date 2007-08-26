/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License. 
 *  
 */

package org.apache.directory.studio.ldapbrowser.core.jobs;


import org.apache.directory.studio.connection.core.Connection;
import org.apache.directory.studio.connection.core.StudioProgressMonitor;
import org.apache.directory.studio.ldapbrowser.core.model.IEntry;
import org.apache.directory.studio.ldapbrowser.core.model.ModelModificationException;


public abstract class AbstractModificationJob extends AbstractAsyncBulkJob
{

    protected void executeBulkJob( StudioProgressMonitor pm ) throws ModelModificationException
    {

        try
        {
            this.executeAsyncModificationJob( pm );
        }
        finally
        {
            // reload affected attributes
            String[] affectedAttributeNames = getAffectedAttributeNames();
            InitializeAttributesJob.initializeAttributes( getModifiedEntry(), affectedAttributeNames, pm );
        }
    }


    protected Connection[] getConnections()
    {
        return new Connection[]
            { getModifiedEntry().getBrowserConnection().getConnection() };
    }


    protected Object[] getLockedObjects()
    {
        return new Object[]
            { getModifiedEntry() };
    }


    protected abstract void executeAsyncModificationJob( StudioProgressMonitor pm ) throws ModelModificationException;


    protected abstract IEntry getModifiedEntry();


    protected abstract String[] getAffectedAttributeNames();

}
