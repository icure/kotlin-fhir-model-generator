//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.claimresponse

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Note concerning adjudication
 *
 * A note that describes or explains adjudication results in a human readable form.
 *
 * @param id Unique id for inter-element referencing
 * @param number Note instance identifier
 * @param type Note purpose
 * @param text Note explanatory text
 * @param language Language of the text
 */
@SerialName("ClaimResponseProcessNote")
@Serializable
public data class ClaimResponseProcessNote(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Note instance identifier
   */
  public val number: Int? = null,
  /**
   * Note purpose
   */
  public val type: CodeableConcept? = null,
  /**
   * Note explanatory text
   */
  public val text: String? = null,
  /**
   * Language of the text
   */
  public val language: CodeableConcept? = null,
) : BackboneElement
