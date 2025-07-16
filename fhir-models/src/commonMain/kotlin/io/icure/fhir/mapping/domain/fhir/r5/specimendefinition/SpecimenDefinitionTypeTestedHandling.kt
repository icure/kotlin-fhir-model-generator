//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.specimendefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.range.Range
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specimen handling before testing
 *
 * Set of instructions for preservation/transport of the specimen at a defined temperature interval,
 * prior the testing process.
 *
 * @param id Unique id for inter-element referencing
 * @param temperatureQualifier Qualifies the interval of temperature
 * @param temperatureRange Temperature range for these handling instructions
 * @param maxDuration Maximum preservation time
 * @param instruction Preservation instruction
 */
@SerialName("SpecimenDefinitionTypeTestedHandling")
@Serializable
public data class SpecimenDefinitionTypeTestedHandling(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Qualifies the interval of temperature
   */
  public val temperatureQualifier: CodeableConcept? = null,
  /**
   * Temperature range for these handling instructions
   */
  public val temperatureRange: Range? = null,
  /**
   * Maximum preservation time
   */
  public val maxDuration: Duration? = null,
  /**
   * Preservation instruction
   */
  public val instruction: String? = null,
) : BackboneElement
