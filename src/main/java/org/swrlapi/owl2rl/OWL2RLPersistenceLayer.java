package org.swrlapi.owl2rl;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.Set;

/**
 * Interface defining methods necessary to persist OWL 2 RL rule selections. Implementations will likely use OWL
 * annotation properties to store these selections.
 *
 * @see org.swrlapi.factory.DefaultOWL2RLPersistenceLayer
 */
public interface OWL2RLPersistenceLayer
{
  /**
   * @return The enabled OWL 2 RL rules
   */
  @NonNull Set<OWL2RLNames.OWL2RLRule> getEnabledRules();

  /**
   * @param rules The OWL 2 RL rule to enable
   */
  void setEnabledRules(@NonNull Set<OWL2RLNames.OWL2RLRule> rules);

  /**
   * @param rule The OWL 2 RL rule to disable
   */
  void setDisabledRule(OWL2RLNames.OWL2RLRule rule);

  /**
   * @param rules The OWL 2 RL rules to disable
   */
  void setDisabledRules(@NonNull Set<OWL2RLNames.OWL2RLRule> rules);

  /**
   * Disable all rules
   */
  void disableAll();
}
