//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.coverage

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additional coverage classifications
 *
 * A suite of underwriter specific classifiers.
 *
 * @param id Unique id for inter-element referencing
 * @param type Type of class such as 'group' or 'plan'
 * @param value Value associated with the type
 * @param name Human readable description of the type and value
 */
@SerialName("CoverageClass")
@Serializable
public data class CoverageClass(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of class such as 'group' or 'plan'
   */
  public val type: CodeableConcept,
  /**
   * Value associated with the type
   */
  public val `value`: Identifier,
  /**
   * Human readable description of the type and value
   */
  public val name: String? = null,
) : BackboneElement
