//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.practitioner

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Certification, licenses, or training pertaining to the provision of care
 *
 * The official certifications, training, and licenses that authorize or otherwise pertain to the
 * provision of care by the practitioner.  For example, a medical license issued by a medical board
 * authorizing the practitioner to practice medicine within a certian locality.
 *
 * @param id Unique id for inter-element referencing
 * @param code Coded representation of the qualification
 * @param period Period during which the qualification is valid
 * @param issuer Organization that regulates and issues the qualification
 */
@SerialName("PractitionerQualification")
@Serializable
public data class PractitionerQualification(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Coded representation of the qualification
   */
  public val code: CodeableConcept,
  /**
   * Period during which the qualification is valid
   */
  public val period: Period? = null,
  /**
   * Organization that regulates and issues the qualification
   */
  public val issuer: Reference? = null,
) : BackboneElement
