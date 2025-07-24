//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.practitioner

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Qualifications, certifications, accreditations, licenses, training, etc. pertaining to the
 * provision of care
 *
 * The official qualifications, certifications, accreditations, training, licenses (and other types
 * of educations/skills/capabilities) that authorize or otherwise pertain to the provision of care by
 * the practitioner.For example, a medical license issued by a medical board of licensure authorizing
 * the practitioner to practice medicine within a certain locality.
 *
 * @param id Unique id for inter-element referencing
 * @param code Coded representation of the qualification
 * @param status Status/progress  of the qualification
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
   * Status/progress  of the qualification
   */
  public val status: CodeableConcept? = null,
  /**
   * Period during which the qualification is valid
   */
  public val period: Period? = null,
  /**
   * Organization that regulates and issues the qualification
   */
  public val issuer: Reference? = null,
) : BackboneElement
