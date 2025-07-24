//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.requestorchestration

import com.icure.fhir.mapping.domain.fhir.r6.age.Age
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.range.Range
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r6.relatedartifact.RelatedArtifact
import com.icure.fhir.mapping.domain.fhir.r6.timing.Timing
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Proposed actions, if any
 *
 * The actions, if any, produced by the evaluation of the artifact.
 *
 * @param id Unique id for inter-element referencing
 * @param linkId Pointer to specific item from the PlanDefinition
 * @param prefix User-visible prefix for the action (e.g. 1. or A.)
 * @param title User-visible title
 * @param description Short description of the action
 * @param textEquivalent Static text equivalent of the action, used if the dynamic aspects cannot be
 * interpreted by the receiving system
 * @param priority routine | urgent | asap | stat
 * @param timingDateTime When the action should take place
 * @param timingAge When the action should take place
 * @param timingPeriod When the action should take place
 * @param timingDuration When the action should take place
 * @param timingRange When the action should take place
 * @param timingTiming When the action should take place
 * @param location Where it should happen
 * @param type create | update | remove | fire-event
 * @param groupingBehavior visual-group | logical-group | sentence-group
 * @param selectionBehavior any | all | all-or-none | exactly-one | at-most-one | one-or-more
 * @param requiredBehavior must | could | must-unless-documented
 * @param precheckBehavior yes | no
 * @param cardinalityBehavior single | multiple
 * @param resource The target of the action
 * @param definitionCanonical Description of the activity to be performed
 * @param definitionUri Description of the activity to be performed
 * @param transform Transform to apply the template
 */
@SerialName("RequestOrchestrationAction")
@Serializable
public data class RequestOrchestrationAction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Pointer to specific item from the PlanDefinition
   */
  public val linkId: String? = null,
  /**
   * User-visible prefix for the action (e.g. 1. or A.)
   */
  public val prefix: String? = null,
  /**
   * User-visible title
   */
  public val title: String? = null,
  /**
   * Short description of the action
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
  public val documentation: List<RelatedArtifact> = emptyList(),
  public val goal: List<Reference> = emptyList(),
  public val condition: List<RequestOrchestrationActionCondition> = emptyList(),
  public val input: List<RequestOrchestrationActionInput> = emptyList(),
  public val output: List<RequestOrchestrationActionOutput> = emptyList(),
  public val relatedAction: List<RequestOrchestrationActionRelatedAction> = emptyList(),
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
  /**
   * Where it should happen
   */
  public val location: CodeableReference? = null,
  public val participant: List<RequestOrchestrationActionParticipant> = emptyList(),
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
   * The target of the action
   */
  public val resource: Reference? = null,
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
  public val dynamicValue: List<RequestOrchestrationActionDynamicValue> = emptyList(),
  public val action: List<RequestOrchestrationAction> = emptyList(),
) : BackboneElement
