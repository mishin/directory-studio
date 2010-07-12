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


/**
 * This class defines a server event.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class LdapServerEvent
{
    /** The server */
    private LdapServer server;

    /** The kind of event */
    private LdapServerEventType kind;


    public LdapServerEvent( LdapServer server, LdapServerEventType kind )
    {
        super();
        this.server = server;
        this.kind = kind;
    }


    public LdapServer getServer()
    {
        return server;
    }


    public void setServer( LdapServer server )
    {
        this.server = server;
    }


    public LdapServerEventType getKind()
    {
        return kind;
    }


    public void setKind( LdapServerEventType kind )
    {
        this.kind = kind;
    }
}
