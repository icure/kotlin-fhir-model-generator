//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.consent

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Consent Verified by patient or family
 *
 * Whether a treatment instruction (e.g. artificial respiration: yes or no) was verified with the
 * patient, his/her family or another authorized person.
 *
 * @param id Unique id for inter-element referencing
 * @param verified Has been verified
 * @param verificationType Business case of verification
 * @param verifiedBy Person conducting verification
 * @param verifiedWith Person who verified
 */
@SerialName("ConsentVerification")
@Serializable
public data class ConsentVerification(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Has been verified
   */
  public val verified: Boolean? = null,
  /**
   * Business case of verification
   */
  public val verificationType: CodeableConcept? = null,
  /**
   * Person conducting verification
   */
  public val verifiedBy: Reference? = null,
  /**
   * Person who verified
   */
  public val verifiedWith: Reference? = null,
  public val verificationDate: List<String> = emptyList(),
) : BackboneElement
