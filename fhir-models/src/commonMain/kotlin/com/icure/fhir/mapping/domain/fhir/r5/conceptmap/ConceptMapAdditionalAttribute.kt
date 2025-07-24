//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.conceptmap

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Definition of an additional attribute to act as a data source or target
 *
 * An additionalAttribute defines an additional data element found in the source or target data
 * model where the data will come from or be mapped to. Some mappings are based on data in addition to
 * the source data element, where codes in multiple fields are combined to a single field (or vice
 * versa).
 *
 * @param id Unique id for inter-element referencing
 * @param code Identifies this additional attribute through this resource
 * @param uri Formal identifier for the data element referred to in this attribte
 * @param description Why the additional attribute is defined, and/or what the data element it
 * refers to is
 * @param type code | Coding | string | boolean | Quantity
 */
@SerialName("ConceptMapAdditionalAttribute")
@Serializable
public data class ConceptMapAdditionalAttribute(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Identifies this additional attribute through this resource
   */
  public val code: String? = null,
  /**
   * Formal identifier for the data element referred to in this attribte
   */
  public val uri: String? = null,
  /**
   * Why the additional attribute is defined, and/or what the data element it refers to is
   */
  public val description: String? = null,
  /**
   * code | Coding | string | boolean | Quantity
   */
  public val type: String? = null,
) : BackboneElement
