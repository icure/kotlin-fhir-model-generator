//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.capabilitystatement

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Document definition
 *
 * A document definition.
 *
 * @param id Unique id for inter-element referencing
 * @param mode producer | consumer
 * @param documentation Description of document support
 * @param profile Constraint on the resources used in the document
 */
@SerialName("CapabilityStatementDocument")
@Serializable
public data class CapabilityStatementDocument(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * producer | consumer
   */
  public val mode: String? = null,
  /**
   * Description of document support
   */
  public val documentation: String? = null,
  /**
   * Constraint on the resources used in the document
   */
  public val profile: String? = null,
) : BackboneElement
