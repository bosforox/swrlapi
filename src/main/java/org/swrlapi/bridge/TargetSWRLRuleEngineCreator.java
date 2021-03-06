package org.swrlapi.bridge;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.swrlapi.bridge.SWRLRuleEngineBridge;
import org.swrlapi.bridge.TargetSWRLRuleEngine;
import org.swrlapi.core.SWRLRuleEngineManager;
import org.swrlapi.exceptions.TargetSWRLRuleEngineException;

/**
 * A creator for a SWRL rule engine
 *
 * @see SWRLRuleEngineManager
 */
public interface TargetSWRLRuleEngineCreator
{
  /**
   * @param bridge A SWRL rule engine bridge associated with the engine
   * @return A target SWRL rule engine
   * @throws TargetSWRLRuleEngineException If an exception occurs during creation
   */
  @NonNull TargetSWRLRuleEngine create(@NonNull SWRLRuleEngineBridge bridge) throws TargetSWRLRuleEngineException;

  /**
   * @return The name of the target rule engine
   */
  @NonNull String getRuleEngineName();
}
