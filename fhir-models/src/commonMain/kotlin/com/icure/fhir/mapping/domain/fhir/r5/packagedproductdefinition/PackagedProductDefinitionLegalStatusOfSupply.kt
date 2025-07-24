//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.packagedproductdefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The legal status of supply of the packaged item as classified by the regulator
 *
 * The legal status of supply of the packaged item as classified by the regulator.
 *
 * @param id Unique id for inter-element referencing
 * @param code The actual status of supply. In what situation this package type may be supplied for
 * use
 * @param jurisdiction The place where the legal status of supply applies
 */
@SerialName("PackagedProductDefinitionLegalStatusOfSupply")
@Serializable
public data class PackagedProductDefinitionLegalStatusOfSupply(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The actual status of supply. In what situation this package type may be supplied for use
   */
  public val code: CodeableConcept? = null,
  /**
   * The place where the legal status of supply applies
   */
  public val jurisdiction: CodeableConcept? = null,
) : BackboneElement
