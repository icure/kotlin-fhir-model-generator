//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.substancespecification

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the official nature of this name
 *
 * Details of the official nature of this name.
 *
 * @param id Unique id for inter-element referencing
 * @param authority Which authority uses this official name
 * @param status The status of the official name
 * @param date Date of official name change
 */
@SerialName("SubstanceSpecificationNameOfficial")
@Serializable
public data class SubstanceSpecificationNameOfficial(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Which authority uses this official name
   */
  public val authority: CodeableConcept? = null,
  /**
   * The status of the official name
   */
  public val status: CodeableConcept? = null,
  /**
   * Date of official name change
   */
  public val date: String? = null,
) : BackboneElement
