//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.capabilitystatement

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * If this describes a specific instance
 *
 * Identifies a specific implementation instance that is described by the capability statement -
 * i.e. a particular installation, rather than the capabilities of a software program.
 *
 * @param id Unique id for inter-element referencing
 * @param description Describes this specific instance
 * @param url Base URL for the installation
 * @param custodian Organization that manages the data
 */
@SerialName("CapabilityStatementImplementation")
@Serializable
public data class CapabilityStatementImplementation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Describes this specific instance
   */
  public val description: String? = null,
  /**
   * Base URL for the installation
   */
  public val url: String? = null,
  /**
   * Organization that manages the data
   */
  public val custodian: Reference? = null,
) : BackboneElement
