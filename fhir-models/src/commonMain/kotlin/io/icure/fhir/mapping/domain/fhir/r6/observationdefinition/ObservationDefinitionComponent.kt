//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.observationdefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
