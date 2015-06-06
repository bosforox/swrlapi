package org.swrlapi.factory;

import checkers.nullness.quals.NonNull;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLDataRange;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.swrlapi.bridge.resolvers.OWLClassExpressionResolver;
import org.swrlapi.bridge.resolvers.OWLDataPropertyExpressionResolver;
import org.swrlapi.bridge.resolvers.OWLDataRangeResolver;
import org.swrlapi.bridge.resolvers.OWLIndividualResolver;
import org.swrlapi.bridge.resolvers.OWLObjectPropertyExpressionResolver;
import org.swrlapi.bridge.resolvers.OWLObjectResolver;
import org.swrlapi.exceptions.TargetSWRLRuleEngineException;

class DefaultOWLObjectResolver implements OWLObjectResolver
{
  private final @NonNull OWLClassExpressionResolver owlClassExpressionResolver;
  private final @NonNull OWLIndividualResolver owlIndividualResolver;
  private final @NonNull OWLObjectPropertyExpressionResolver owlObjectPropertyExpressionResolver;
  private final @NonNull OWLDataPropertyExpressionResolver owlDataPropertyExpressionResolver;
  private final @NonNull OWLDataRangeResolver owlDataRangeResolver;

  public DefaultOWLObjectResolver(@NonNull OWLDataFactory owlDataFactory)
  {
    this.owlClassExpressionResolver = new DefaultOWLClassExpressionResolver(owlDataFactory);
    this.owlIndividualResolver = new DefaultOWLIndividualResolver();
    this.owlObjectPropertyExpressionResolver = new DefaultOWLObjectPropertyExpressionResolver();
    this.owlDataPropertyExpressionResolver = new DefaultOWLDataPropertyExpressionResolver();
    this.owlDataRangeResolver = new DefaultOWLDataRangeResolver();
  }

  @Override public void recordOWLClassExpression(@NonNull String classExpressionID, @NonNull OWLClassExpression classExpression)
  {
    this.owlClassExpressionResolver.recordOWLClassExpression(classExpressionID, classExpression);
  }

  @Override public boolean recordsOWLClassExpression(@NonNull OWLClassExpression owlClassExpression)
  {
    return this.owlClassExpressionResolver.recordsOWLClassExpression(owlClassExpression);
  }

  @Override public @NonNull String resolveOWLClassExpression(@NonNull OWLClassExpression owlClassExpression)
  {
    return this.owlClassExpressionResolver.resolveOWLClassExpression(owlClassExpression);
  }

  @Override public @NonNull OWLClassExpression resolveOWLClassExpression(@NonNull String classExpressionID)
  {
    return this.owlClassExpressionResolver.resolveOWLClassExpression(classExpressionID);
  }

  @Override public void recordOWLIndividual(@NonNull String individualID, @NonNull OWLIndividual individual)
  {
    this.owlIndividualResolver.recordOWLIndividual(individualID, individual);
  }

  @Override public @NonNull OWLIndividual resolveOWLIndividual(@NonNull String individualID) throws TargetSWRLRuleEngineException
  {
    return this.owlIndividualResolver.resolveOWLIndividual(individualID);
  }

  @Override public void recordOWLObjectPropertyExpression(@NonNull String propertyExpressionID,
      @NonNull OWLObjectPropertyExpression propertyExpression)
  {
    this.owlObjectPropertyExpressionResolver.recordOWLObjectPropertyExpression(propertyExpressionID, propertyExpression);
  }

  @Override public boolean recordsOWLObjectPropertyExpression(@NonNull OWLObjectPropertyExpression propertyExpression)
  {
    return this.owlObjectPropertyExpressionResolver.recordsOWLObjectPropertyExpression(propertyExpression);
  }

  @Override public @NonNull String resolveOWLObjectPropertyExpression(@NonNull OWLObjectPropertyExpression propertyExpression)
  {
    return resolveOWLObjectPropertyExpression(propertyExpression);
  }

  @Override public @NonNull OWLObjectPropertyExpression resolveOWLObjectPropertyExpression(@NonNull String propertyExpressionID)
  {
    return this.owlObjectPropertyExpressionResolver.resolveOWLObjectPropertyExpression(propertyExpressionID);
  }

  @Override public void recordOWLDataPropertyExpression(@NonNull String propertyExpressionID,
      @NonNull OWLDataPropertyExpression propertyExpression)
  {
    this.owlDataPropertyExpressionResolver.recordOWLDataPropertyExpression(propertyExpressionID, propertyExpression);
  }

  @Override public boolean recordsOWLDataPropertyExpression(@NonNull OWLDataPropertyExpression propertyExpression)
  {
    return this.owlDataPropertyExpressionResolver.recordsOWLDataPropertyExpression(propertyExpression);
  }

  @Override public @NonNull String resolveOWLDataPropertyExpression(@NonNull OWLDataPropertyExpression propertyExpression)
  {
    return this.owlDataPropertyExpressionResolver.resolveOWLDataPropertyExpression(propertyExpression);
  }

  @Override public @NonNull OWLDataPropertyExpression resolveOWLDataPropertyExpression(@NonNull String propertyExpressionID)
  {
    return this.owlDataPropertyExpressionResolver.resolveOWLDataPropertyExpression(propertyExpressionID);
  }

  @Override public void recordOWLDataRange(@NonNull String dataRangeID, @NonNull OWLDataRange dataRange)
  {
    this.owlDataRangeResolver.recordOWLDataRange(dataRangeID, dataRange);
  }

  @Override public @NonNull OWLDataRange resolveOWLDataRange(@NonNull String dataRangeID)
  {
    return this.resolveOWLDataRange(dataRangeID);
  }
}
