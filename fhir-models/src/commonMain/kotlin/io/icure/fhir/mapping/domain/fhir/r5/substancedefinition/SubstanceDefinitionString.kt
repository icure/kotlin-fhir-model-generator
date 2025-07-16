//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.substancedefinition

import io.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Codes associated with the substance
 *
 * Codes associated with the substance.
 *
 * @param id Unique id for inter-element referencing
 * @param code The specific code
 * @param status Status of the code assignment, for example 'provisional', 'approved'
 * @param statusDate The date at which the code status was changed
 */
@SerialName("SubstanceDefinitionString")
@Serializable
public data class SubstanceDefinitionString(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The specific code
   */
  public val code: CodeableConcept? = null,
  /**
   * Status of the code assignment, for example 'provisional', 'approved'
   */
  public val status: CodeableConcept? = null,
  /**
   * The date at which the code status was changed
   */
  public val statusDate: String? = null,
  public val note: List<Annotation> = emptyList(),
  public val source: List<Reference> = emptyList(),
) : BackboneElement
