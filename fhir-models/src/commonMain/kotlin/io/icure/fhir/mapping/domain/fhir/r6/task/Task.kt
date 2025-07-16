//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.task

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

/**
 * A task to be performed
 *
 * A task to be performed.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param instantiatesCanonical Formal definition of task
 * @param instantiatesUri Formal definition of task
 * @param groupIdentifier Requisition or grouper id
 * @param status draft | requested | received | accepted | +
 * @param statusReason Reason for current status
 * @param businessStatus E.g. "Specimen collected", "IV prepped"
 * @param intent unknown | proposal | plan | order | original-order | reflex-order | filler-order |
 * instance-order | option
 * @param priority routine | urgent | asap | stat
 * @param doNotPerform True if Task is prohibiting action
 * @param code Task Type
 * @param description Human-readable explanation of task
 * @param focus What task is acting on
 * @param for_fhir Beneficiary of the Task
 * @param encounter Healthcare event during which this task originated
 * @param requestedPeriod When the task should be performed
 * @param executionPeriod Start and end time of execution
 * @param authoredOn Task Creation Date
 * @param lastModified Task Last Modified Date
 * @param requester Who is asking for task to be done
 * @param owner Responsible individual
 * @param location Where task occurs
 * @param restriction Constraints on fulfillment tasks
 */
@SerialName("Task")
@Serializable
public data class Task(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Formal definition of task
   */
  public val instantiatesCanonical: String? = null,
  /**
   * Formal definition of task
   */
  public val instantiatesUri: String? = null,
  public val basedOn: List<Reference> = emptyList(),
  /**
   * Requisition or grouper id
   */
  public val groupIdentifier: Identifier? = null,
  public val partOf: List<Reference> = emptyList(),
  /**
   * draft | requested | received | accepted | +
   */
  public val status: String? = null,
  /**
   * Reason for current status
   */
  public val statusReason: CodeableReference? = null,
  /**
   * E.g. "Specimen collected", "IV prepped"
   */
  public val businessStatus: CodeableConcept? = null,
  /**
   * unknown | proposal | plan | order | original-order | reflex-order | filler-order |
   * instance-order | option
   */
  public val intent: String? = null,
  /**
   * routine | urgent | asap | stat
   */
  public val priority: String? = null,
  /**
   * True if Task is prohibiting action
   */
  public val doNotPerform: Boolean? = null,
  /**
   * Task Type
   */
  public val code: CodeableConcept? = null,
  /**
   * Human-readable explanation of task
   */
  public val description: String? = null,
  /**
   * What task is acting on
   */
  public val focus: Reference? = null,
  /**
   * Beneficiary of the Task
   */
  @JsonNames("for")
  public val for_fhir: Reference? = null,
  /**
   * Healthcare event during which this task originated
   */
  public val encounter: Reference? = null,
  /**
   * When the task should be performed
   */
  public val requestedPeriod: Period? = null,
  /**
   * Start and end time of execution
   */
  public val executionPeriod: Period? = null,
  /**
   * Task Creation Date
   */
  public val authoredOn: String? = null,
  /**
   * Task Last Modified Date
   */
  public val lastModified: String? = null,
  /**
   * Who is asking for task to be done
   */
  public val requester: Reference? = null,
  public val requestedPerformer: List<CodeableReference> = emptyList(),
  /**
   * Responsible individual
   */
  public val owner: Reference? = null,
  public val performer: List<TaskPerformer> = emptyList(),
  /**
   * Where task occurs
   */
  public val location: Reference? = null,
  public val reason: List<CodeableReference> = emptyList(),
  public val insurance: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val relevantHistory: List<Reference> = emptyList(),
  /**
   * Constraints on fulfillment tasks
   */
  public val restriction: TaskRestriction? = null,
  public val input: List<TaskInput> = emptyList(),
  public val output: List<TaskOutput> = emptyList(),
) : DomainResource
