//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.observationdefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Component results
 *
 * Some observations have multiple component observations, expressed as separate code value pairs.
 *
 * @param id Unique id for inter-element referencing
 * @param code Type of observation
 */
@SerialName("ObservationDefinitionComponent")
@Serializable
public data class ObservationDefinitionComponent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of observation
   */
  public val code: CodeableConcept,
  public val permittedDataType: List<String> = emptyList(),
  public val permittedUnit: List<Coding> = emptyList(),
  public val qualifiedValue: List<ObservationDefinitionQualifiedValue> = emptyList(),
) : BackboneElement
