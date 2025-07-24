//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.claimresponse

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
 * @param type display | print | printoper
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
   * display | print | printoper
   */
  public val type: String? = null,
  /**
   * Note explanatory text
   */
  public val text: String? = null,
  /**
   * Language of the text
   */
  public val language: CodeableConcept? = null,
) : BackboneElement
