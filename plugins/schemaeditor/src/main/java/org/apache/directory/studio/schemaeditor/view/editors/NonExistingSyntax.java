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
package org.apache.directory.studio.schemaeditor.view.editors;


/**
 * This class implements the Non Existing Syntax.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class NonExistingSyntax
{
    /** The None syntax name */
    public static final String NONE = "(None)"; //$NON-NLS-1$

    /** The name */
    private String name;


    /**
     * Creates a new instance of NonExistingSyntax.
     *
     * @param name
     *      the name the NonExistingSyntax
     */
    public NonExistingSyntax( String name )
    {
        this.name = name;
    }


    /**
     * Gets the name of the NonExistingSyntax.
     *
     * @return
     *      the name of the NonExistingSyntax
     */
    public String getName()
    {
        return name;
    }


    /**
     * Gets the displayable name of the NonExistingSyntax.
     *
     * @return
     *      the displayable name of the NonExistingSyntax
     */
    public String getDisplayName()
    {
        if ( name.equals( NONE ) )
        {
            return NONE;
        }
        else
        {
            return name + "   " + "(This syntax doesnt exist)";
        }
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals( Object obj )
    {
        if ( obj instanceof NonExistingSyntax )
        {
            return name.equalsIgnoreCase( ( ( NonExistingSyntax ) obj ).getName() );
        }

        return false;
    }
}