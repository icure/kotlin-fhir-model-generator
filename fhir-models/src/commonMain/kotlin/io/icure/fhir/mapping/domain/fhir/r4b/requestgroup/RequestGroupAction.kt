//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.requestgroup

import io.icure.fhir.mapping.domain.fhir.r4b.age.Age
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.range.Range
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r4b.relatedartifact.RelatedArtifact
import io.icure.fhir.mapping.domain.fhir.r4b.timing.Timing
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
 * @param type create | update | remove | fire-event
 * @param groupingBehavior visual-group | logical-group | sentence-group
 * @param selectionBehavior any | all | all-or-none | exactly-one | at-most-one | one-or-more
 * @param requiredBehavior must | could | must-unless-documented
 * @param precheckBehavior yes | no
 * @param cardinalityBehavior single | multiple
 * @param resource The target of the action
 */
@SerialName("RequestGroupAction")
@Serializable
public data class RequestGroupAction(
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
  public val condition: List<RequestGroupActionCondition> = emptyList(),
  public val relatedAction: List<RequestGroupActionRelatedAction> = emptyList(),
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
  public val participant: List<Reference> = emptyList(),
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
  public val action: List<RequestGroupAction> = emptyList(),
) : BackboneElement
