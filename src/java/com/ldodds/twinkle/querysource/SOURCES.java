package com.ldodds.twinkle.querysource;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

public class SOURCES
{
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.ldodds.com/twinkle/sources/";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final Resource ENDPOINT = m_model.createResource(NS + "Endpoint");
    
    public static final Property DEFAULT_GRAPH = m_model.createProperty(NS + "defaultGraph");

    public static final Property USERNAME = m_model.createProperty(NS + "username");
    public static final Property PASSWORD = m_model.createProperty(NS + "password");
}
