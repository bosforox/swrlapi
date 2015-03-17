package org.swrlapi.builtins.arguments.impl;

import java.util.Collections;
import java.util.Set;

import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.swrlapi.builtins.arguments.SWRLBuiltInArgument;
import org.swrlapi.builtins.arguments.SWRLMultiValueVariableBuiltInArgument;
import org.swrlapi.builtins.arguments.SWRLVariableBuiltInArgument;
import org.swrlapi.exceptions.SWRLAPIException;

abstract class SWRLBuiltInArgumentImpl implements SWRLBuiltInArgument
{
	private static final long serialVersionUID = 1L;

	private String boundVariableName = null;

	@Override
	public boolean isVariable()
	{
		return false;
	}

	@Override
	public boolean isMultiValueVariable()
	{
		return false;
	}

	@Override
	public SWRLVariableBuiltInArgument asVariable()
	{
		throw new SWRLAPIException("Not a SWRLVariableBuiltInArgument");
	}

	@Override
	public SWRLMultiValueVariableBuiltInArgument asMultiValueVariable()
	{
		throw new SWRLAPIException("Not a SWRLMultiVariableBuiltInArgument");
	}

	@Override
	public boolean wasBoundVariable()
	{
		return this.boundVariableName != null;
	}

	@Override
	public String getBoundVariableName()
	{
		return this.boundVariableName;
	}

	@Override
	public void setBoundVariableName(String boundVariableName)
	{
		this.boundVariableName = boundVariableName;
	}

	@Override
	public boolean containsEntityInSignature(OWLEntity owlEntity)
	{
		return false; // TODO
	}

	@Override
	public Set<OWLEntity> getSignature()
	{
		return Collections.emptySet(); // TODO
	}

	@Override
	public Set<OWLAnonymousIndividual> getAnonymousIndividuals()
	{
		return Collections.emptySet(); // TODO
	}

	@Override
	public Set<OWLClass> getClassesInSignature()
	{
		return Collections.emptySet(); // TODO
	}

	@Override
	public Set<OWLDataProperty> getDataPropertiesInSignature()
	{
		return Collections.emptySet(); // TODO
	}

	@Override
	public Set<OWLObjectProperty> getObjectPropertiesInSignature()
	{
		return Collections.emptySet(); // TODO
	}

	@Override
	public Set<OWLNamedIndividual> getIndividualsInSignature()
	{
		return Collections.emptySet(); // TODO
	}

	@Override
	public Set<OWLDatatype> getDatatypesInSignature()
	{
		return Collections.emptySet(); // TODO
	}

	@Override
	public Set<OWLClassExpression> getNestedClassExpressions()
	{
		return Collections.emptySet(); // TODO
	}

	@Override
	public boolean isTopEntity()
	{
		return false;
	}

	@Override
	public boolean isBottomEntity()
	{
		return false;
	}
}
