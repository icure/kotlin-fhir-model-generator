//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.packagedproductdefinition

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Shelf Life and storage information
 *
 * Shelf Life and storage information.
 *
 * @param id Unique id for inter-element referencing
 * @param type This describes the shelf life, taking into account various scenarios such as shelf
 * life of the packaged Medicinal Product itself, shelf life after transformation where necessary and
 * shelf life after the first opening of a bottle, etc. The shelf life type shall be specified using an
 * appropriate controlled vocabulary The controlled term and the controlled term identifier shall be
 * specified
 * @param periodDuration The shelf life time period can be specified using a numerical value for the
 * period of time and its unit of time measurement The unit of measurement shall be specified in
 * accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall
 * be used
 * @param periodString The shelf life time period can be specified using a numerical value for the
 * period of time and its unit of time measurement The unit of measurement shall be specified in
 * accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall
 * be used
 */
@SerialName("PackagedProductDefinitionPackageShelfLifeStorage")
@Serializable
public data class PackagedProductDefinitionPackageShelfLifeStorage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * This describes the shelf life, taking into account various scenarios such as shelf life of the
   * packaged Medicinal Product itself, shelf life after transformation where necessary and shelf life
   * after the first opening of a bottle, etc. The shelf life type shall be specified using an
   * appropriate controlled vocabulary The controlled term and the controlled term identifier shall be
   * specified
   */
  public val type: CodeableConcept? = null,
  /**
   * The shelf life time period can be specified using a numerical value for the period of time and
   * its unit of time measurement The unit of measurement shall be specified in accordance with ISO
   * 11240 and the resulting terminology The symbol and the symbol identifier shall be used
   */
  public val periodDuration: Duration? = null,
  /**
   * The shelf life time period can be specified using a numerical value for the period of time and
   * its unit of time measurement The unit of measurement shall be specified in accordance with ISO
   * 11240 and the resulting terminology The symbol and the symbol identifier shall be used
   */
  public val periodString: String? = null,
  public val specialPrecautionsForStorage: List<CodeableConcept> = emptyList(),
) : BackboneElement
