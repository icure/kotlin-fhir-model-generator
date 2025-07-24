//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.consent

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Consent Verified by patient or family
 *
 * Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the
 * patient, his/her family or another authorized person.
 *
 * @param id Unique id for inter-element referencing
 * @param verified Has been verified
 * @param verifiedWith Person who verified
 * @param verificationDate When consent verified
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
   * Person who verified
   */
  public val verifiedWith: Reference? = null,
  /**
   * When consent verified
   */
  public val verificationDate: String? = null,
) : BackboneElement
