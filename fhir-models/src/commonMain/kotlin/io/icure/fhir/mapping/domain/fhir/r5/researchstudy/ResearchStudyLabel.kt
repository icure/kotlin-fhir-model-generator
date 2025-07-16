//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.researchstudy

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
