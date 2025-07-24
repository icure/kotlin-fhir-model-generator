//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.specimendefinition

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.range.Range
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
