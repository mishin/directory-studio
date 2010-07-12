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

package org.apache.directory.studio.ldapservers.model;


import java.util.ArrayList;
import java.util.List;


/**
 * The {@link AbstractLdapServerInstance} interface defines the required methods
 * to implement an LDAP Server instance.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public abstract class AbstractLdapServerInstance extends LdapServer
{
    /** The associated LDAP Server Adapter */
    private LdapServerAdapter serverAdapter;

    /** The status of the server instance */
    private LdapServerStatus status = LdapServerStatus.STOPPED;

    private List<LdapServerListener> listeners = new ArrayList<LdapServerListener>();


    public void start() throws Exception
    {
        // Changing the status of the server to 'starting' and notifying listeners
        setStatus( LdapServerStatus.STARTING );
        notifyListenersServerStarting();

        // Changing the status of the server to 'started' and notifying listeners
        setStatus( LdapServerStatus.STARTED );
        notifyListenersServerStarted();
    }


    /**
     * TODO notifyListenersServerStarting.
     *
     */
    private void notifyListenersServerStarting()
    {
//        for ( LdapServerListener listener : listeners.toArray( new LdapServerListener[0] ) )
//        {
//            listener.ldapServerInstanceStarting( this );
//        }
    }


    /**
     * TODO notifyListenersServerStarting.
     *
     */
    private void notifyListenersServerStarted()
    {
//        for ( LdapServerListener listener : listeners.toArray( new LdapServerListener[0] ) )
//        {
//            listener.ldapServerInstanceStarted( this );
//        }
    }


    public void stop() throws Exception
    {

    }


    public void restart() throws Exception
    {

    }


    public LdapServerStatus getStatus()
    {
        return status;
    }


    /**
     * TODO setStatus.
     *
     * @param status
     */
    protected void setStatus( LdapServerStatus status )
    {
        this.status = status;
    }
}
