//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.plandefinition

import com.icure.fhir.mapping.domain.fhir.r4b.age.Age
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.datarequirement.DataRequirement
import com.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.range.Range
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4b.relatedartifact.RelatedArtifact
import com.icure.fhir.mapping.domain.fhir.r4b.timing.Timing
import com.icure.fhir.mapping.domain.fhir.r4b.triggerdefinition.TriggerDefinition
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Action defined by the plan
 *
 * An action or group of actions to be taken as part of the plan. For example, in clinical care, an
 * action would be to prescribe a particular indicated medication, or perform a particular test as
 * appropriate. In pharmaceutical quality, an action would be the test that needs to be performed on a
 * drug product as defined in the quality specification.
 *
 * @param id Unique id for inter-element referencing
 * @param prefix User-visible prefix for the action (e.g. 1. or A.)
 * @param title User-visible title
 * @param description Brief description of the action
 * @param textEquivalent Static text equivalent of the action, used if the dynamic aspects cannot be
 * interpreted by the receiving system
 * @param priority routine | urgent | asap | stat
 * @param subjectCodeableConcept Type of individual the action is focused on
 * @param subjectReference Type of individual the action is focused on
 * @param subjectCanonical Type of individual the action is focused on
 * @param timingDateTime When the action should take place
 * @param timingAge When the action should take place
 * @param timingPeriod When the action should take place
 * @param timingDuration When the action should take place
 * @param timingRange When the action should take place
 * @param timingTiming When the action should take place
 * @param type create | update | remove | fire-event
 * @param groupingBehavior visual-group | logical-group | sentence-group
 * @param selectionBehavior any | all | all-or-none | exactly-one | at-most-one | one-or-more
 * @param requiredBehavior must | could | must-unless-documented
 * @param precheckBehavior yes | no
 * @param cardinalityBehavior single | multiple
 * @param definitionCanonical Description of the activity to be performed
 * @param definitionUri Description of the activity to be performed
 * @param transform Transform to apply the template
 */
@SerialName("PlanDefinitionAction")
@Serializable
public data class PlanDefinitionAction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * User-visible prefix for the action (e.g. 1. or A.)
   */
  public val prefix: String? = null,
  /**
   * User-visible title
   */
  public val title: String? = null,
  /**
   * Brief description of the action
   */
  public val description: String? = null,
  /**
   * Static text equivalent of the action, used if the dynamic aspects cannot be interpreted by the
   * receiving system
   */
  public val textEquivalent: String? = null,
  /**
   * routine | urgent | asap | stat
   */
  public val priority: String? = null,
  public val code: List<CodeableConcept> = emptyList(),
  public val reason: List<CodeableConcept> = emptyList(),
  public val documentation: List<RelatedArtifact> = emptyList(),
  public val goalId: List<String> = emptyList(),
  /**
   * Type of individual the action is focused on
   */
  public val subjectCodeableConcept: CodeableConcept? = null,
  /**
   * Type of individual the action is focused on
   */
  public val subjectReference: Reference? = null,
  /**
   * Type of individual the action is focused on
   */
  public val subjectCanonical: String? = null,
  public val trigger: List<TriggerDefinition> = emptyList(),
  public val condition: List<PlanDefinitionActionCondition> = emptyList(),
  public val input: List<DataRequirement> = emptyList(),
  public val output: List<DataRequirement> = emptyList(),
  public val relatedAction: List<PlanDefinitionActionRelatedAction> = emptyList(),
  /**
   * When the action should take place
   */
  public val timingDateTime: String? = null,
  /**
   * When the action should take place
   */
  public val timingAge: Age? = null,
  /**
   * When the action should take place
   */
  public val timingPeriod: Period? = null,
  /**
   * When the action should take place
   */
  public val timingDuration: Duration? = null,
  /**
   * When the action should take place
   */
  public val timingRange: Range? = null,
  /**
   * When the action should take place
   */
  public val timingTiming: Timing? = null,
  public val participant: List<PlanDefinitionActionParticipant> = emptyList(),
  /**
   * create | update | remove | fire-event
   */
  public val type: CodeableConcept? = null,
  /**
   * visual-group | logical-group | sentence-group
   */
  public val groupingBehavior: String? = null,
  /**
   * any | all | all-or-none | exactly-one | at-most-one | one-or-more
   */
  public val selectionBehavior: String? = null,
  /**
   * must | could | must-unless-documented
   */
  public val requiredBehavior: String? = null,
  /**
   * yes | no
   */
  public val precheckBehavior: String? = null,
  /**
   * single | multiple
   */
  public val cardinalityBehavior: String? = null,
  /**
   * Description of the activity to be performed
   */
  public val definitionCanonical: String? = null,
  /**
   * Description of the activity to be performed
   */
  public val definitionUri: String? = null,
  /**
   * Transform to apply the template
   */
  public val transform: String? = null,
  public val dynamicValue: List<PlanDefinitionActionDynamicValue> = emptyList(),
  public val action: List<PlanDefinitionAction> = emptyList(),
) : BackboneElement
