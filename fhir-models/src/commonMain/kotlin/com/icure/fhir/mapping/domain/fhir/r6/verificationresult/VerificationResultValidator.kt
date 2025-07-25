//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.verificationresult

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r6.signature.Signature
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about the entity validating information
 *
 * Information about the entity validating information.
 *
 * @param id Unique id for inter-element referencing
 * @param organization Reference to the organization validating information
 * @param identityCertificate A digital identity certificate associated with the validator
 * @param attestationSignature Validator signature (digital or image)
 */
@SerialName("VerificationResultValidator")
@Serializable
public data class VerificationResultValidator(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Reference to the organization validating information
   */
  public val organization: Reference,
  /**
   * A digital identity certificate associated with the validator
   */
  public val identityCertificate: String? = null,
  /**
   * Validator signature (digital or image)
   */
  public val attestationSignature: Signature? = null,
) : BackboneElement
