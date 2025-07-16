//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.verificationresult

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about the primary source(s) involved in validation
 *
 * Information about the primary source(s) involved in validation.
 *
 * @param id Unique id for inter-element referencing
 * @param who Reference to the primary source
 * @param validationStatus successful | failed | unknown
 * @param validationDate When the target was validated against the primary source
 * @param canPushUpdates yes | no | undetermined
 */
@SerialName("VerificationResultPrimarySource")
@Serializable
public data class VerificationResultPrimarySource(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Reference to the primary source
   */
  public val who: Reference? = null,
  public val type: List<CodeableConcept> = emptyList(),
  public val communicationMethod: List<CodeableConcept> = emptyList(),
  /**
   * successful | failed | unknown
   */
  public val validationStatus: CodeableConcept? = null,
  /**
   * When the target was validated against the primary source
   */
  public val validationDate: String? = null,
  /**
   * yes | no | undetermined
   */
  public val canPushUpdates: CodeableConcept? = null,
  public val pushTypeAvailable: List<CodeableConcept> = emptyList(),
) : BackboneElement
