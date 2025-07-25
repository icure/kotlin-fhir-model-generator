//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.substancesourcematerial

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 4.9.13.7.1 Kingdom (Conditional)
 *
 * 4.9.13.7.1 Kingdom (Conditional).
 *
 * @param id Unique id for inter-element referencing
 * @param kingdom The kingdom of an organism shall be specified
 * @param phylum The phylum of an organism shall be specified
 * @param class_fhir The class of an organism shall be specified
 * @param order The order of an organism shall be specified,
 */
@SerialName("SubstanceSourceMaterialOrganismOrganismGeneral")
@Serializable
public data class SubstanceSourceMaterialOrganismOrganismGeneral(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The kingdom of an organism shall be specified
   */
  public val kingdom: CodeableConcept? = null,
  /**
   * The phylum of an organism shall be specified
   */
  public val phylum: CodeableConcept? = null,
  /**
   * The class of an organism shall be specified
   */
  @SerialName("class")
  public val class_fhir: CodeableConcept? = null,
  /**
   * The order of an organism shall be specified,
   */
  public val order: CodeableConcept? = null,
) : BackboneElement
