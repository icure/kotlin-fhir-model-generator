//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.familymemberhistory

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.age.Age
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.range.Range
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about patient's relatives, relevant for patient
 *
 * Significant health conditions for a person related to the patient relevant in the context of care
 * for the patient.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status partial | completed | entered-in-error | health-unknown
 * @param dataAbsentReason subject-unknown | withheld | unable-to-obtain | deferred
 * @param patient Patient history is about
 * @param date When history was recorded or last updated
 * @param name The family member described
 * @param relationship Relationship to the subject
 * @param sex male | female | other | unknown
 * @param bornPeriod (approximate) date of birth
 * @param bornDate (approximate) date of birth
 * @param bornString (approximate) date of birth
 * @param ageAge (approximate) age
 * @param ageRange (approximate) age
 * @param ageString (approximate) age
 * @param estimatedAge Age is estimated?
 * @param deceasedBoolean Dead? How old/when?
 * @param deceasedAge Dead? How old/when?
 * @param deceasedRange Dead? How old/when?
 * @param deceasedDate Dead? How old/when?
 * @param deceasedString Dead? How old/when?
 */
@SerialName("FamilyMemberHistory")
@Serializable
public data class FamilyMemberHistory(
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
  public val instantiatesCanonical: List<String> = emptyList(),
  public val instantiatesUri: List<String> = emptyList(),
  /**
   * partial | completed | entered-in-error | health-unknown
   */
  public val status: String? = null,
  /**
   * subject-unknown | withheld | unable-to-obtain | deferred
   */
  public val dataAbsentReason: CodeableConcept? = null,
  /**
   * Patient history is about
   */
  public val patient: Reference,
  /**
   * When history was recorded or last updated
   */
  public val date: String? = null,
  /**
   * The family member described
   */
  public val name: String? = null,
  /**
   * Relationship to the subject
   */
  public val relationship: CodeableConcept,
  /**
   * male | female | other | unknown
   */
  public val sex: CodeableConcept? = null,
  /**
   * (approximate) date of birth
   */
  public val bornPeriod: Period? = null,
  /**
   * (approximate) date of birth
   */
  public val bornDate: String? = null,
  /**
   * (approximate) date of birth
   */
  public val bornString: String? = null,
  /**
   * (approximate) age
   */
  public val ageAge: Age? = null,
  /**
   * (approximate) age
   */
  public val ageRange: Range? = null,
  /**
   * (approximate) age
   */
  public val ageString: String? = null,
  /**
   * Age is estimated?
   */
  public val estimatedAge: Boolean? = null,
  /**
   * Dead? How old/when?
   */
  public val deceasedBoolean: Boolean? = null,
  /**
   * Dead? How old/when?
   */
  public val deceasedAge: Age? = null,
  /**
   * Dead? How old/when?
   */
  public val deceasedRange: Range? = null,
  /**
   * Dead? How old/when?
   */
  public val deceasedDate: String? = null,
  /**
   * Dead? How old/when?
   */
  public val deceasedString: String? = null,
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val condition: List<FamilyMemberHistoryCondition> = emptyList(),
) : DomainResource
