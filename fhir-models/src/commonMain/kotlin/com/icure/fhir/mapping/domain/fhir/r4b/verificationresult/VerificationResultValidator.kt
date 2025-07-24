//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.verificationresult

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4b.signature.Signature
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
 * @param attestationSignature Validator signature
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
   * Validator signature
   */
  public val attestationSignature: Signature? = null,
) : BackboneElement
