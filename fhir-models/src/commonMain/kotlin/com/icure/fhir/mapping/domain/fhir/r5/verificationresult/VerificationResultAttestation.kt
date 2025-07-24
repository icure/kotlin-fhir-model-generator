//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.verificationresult

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r5.signature.Signature
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about the entity attesting to information
 *
 * Information about the entity attesting to information.
 *
 * @param id Unique id for inter-element referencing
 * @param who The individual or organization attesting to information
 * @param onBehalfOf When the who is asserting on behalf of another (organization or individual)
 * @param communicationMethod The method by which attested information was submitted/retrieved
 * @param date The date the information was attested to
 * @param sourceIdentityCertificate A digital identity certificate associated with the attestation
 * source
 * @param proxyIdentityCertificate A digital identity certificate associated with the proxy entity
 * submitting attested information on behalf of the attestation source
 * @param proxySignature Proxy signature (digital or image)
 * @param sourceSignature Attester signature (digital or image)
 */
@SerialName("VerificationResultAttestation")
@Serializable
public data class VerificationResultAttestation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The individual or organization attesting to information
   */
  public val who: Reference? = null,
  /**
   * When the who is asserting on behalf of another (organization or individual)
   */
  public val onBehalfOf: Reference? = null,
  /**
   * The method by which attested information was submitted/retrieved
   */
  public val communicationMethod: CodeableConcept? = null,
  /**
   * The date the information was attested to
   */
  public val date: String? = null,
  /**
   * A digital identity certificate associated with the attestation source
   */
  public val sourceIdentityCertificate: String? = null,
  /**
   * A digital identity certificate associated with the proxy entity submitting attested information
   * on behalf of the attestation source
   */
  public val proxyIdentityCertificate: String? = null,
  /**
   * Proxy signature (digital or image)
   */
  public val proxySignature: Signature? = null,
  /**
   * Attester signature (digital or image)
   */
  public val sourceSignature: Signature? = null,
) : BackboneElement
