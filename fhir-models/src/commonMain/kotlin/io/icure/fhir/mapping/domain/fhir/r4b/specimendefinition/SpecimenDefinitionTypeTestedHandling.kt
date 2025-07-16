//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.specimendefinition

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.range.Range
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
 * @param temperatureQualifier Temperature qualifier
 * @param temperatureRange Temperature range
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
   * Temperature qualifier
   */
  public val temperatureQualifier: CodeableConcept? = null,
  /**
   * Temperature range
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
