//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.substancespecification

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
 * @param status Status of the code assignment
 * @param statusDate The date at which the code status is changed as part of the terminology
 * maintenance
 * @param comment Any comment can be provided in this field, if necessary
 */
@SerialName("SubstanceSpecificationString")
@Serializable
public data class SubstanceSpecificationString(
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
   * Status of the code assignment
   */
  public val status: CodeableConcept? = null,
  /**
   * The date at which the code status is changed as part of the terminology maintenance
   */
  public val statusDate: String? = null,
  /**
   * Any comment can be provided in this field, if necessary
   */
  public val comment: String? = null,
  public val source: List<Reference> = emptyList(),
) : BackboneElement
