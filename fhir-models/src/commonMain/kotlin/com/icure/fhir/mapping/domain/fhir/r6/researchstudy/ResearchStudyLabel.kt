//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.researchstudy

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additional names for the study
 *
 * Additional names for the study.
 *
 * @param id Unique id for inter-element referencing
 * @param type primary | official | scientific | plain-language | subtitle | short-title | acronym |
 * earlier-title | language | auto-translated | human-use | machine-use | duplicate-uid
 * @param value The name
 */
@SerialName("ResearchStudyLabel")
@Serializable
public data class ResearchStudyLabel(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * primary | official | scientific | plain-language | subtitle | short-title | acronym |
   * earlier-title | language | auto-translated | human-use | machine-use | duplicate-uid
   */
  public val type: CodeableConcept? = null,
  /**
   * The name
   */
  public val `value`: String? = null,
) : BackboneElement
