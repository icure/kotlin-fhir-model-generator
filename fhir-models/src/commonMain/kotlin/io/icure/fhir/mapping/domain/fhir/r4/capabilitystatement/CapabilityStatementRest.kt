//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.capabilitystatement

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * If the endpoint is a RESTful one
 *
 * A definition of the restful capabilities of the solution, if any.
 *
 * @param id Unique id for inter-element referencing
 * @param mode client | server
 * @param documentation General description of implementation
 * @param security Information about security of implementation
 */
@SerialName("CapabilityStatementRest")
@Serializable
public data class CapabilityStatementRest(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * client | server
   */
  public val mode: String? = null,
  /**
   * General description of implementation
   */
  public val documentation: String? = null,
  /**
   * Information about security of implementation
   */
  public val security: CapabilityStatementRestSecurity? = null,
  public val resource: List<CapabilityStatementRestResource> = emptyList(),
  public val interaction: List<CapabilityStatementRestInteraction> = emptyList(),
  public val searchParam: List<CapabilityStatementRestResourceSearchParam> = emptyList(),
  public val operation: List<CapabilityStatementRestResourceOperation> = emptyList(),
  public val compartment: List<String> = emptyList(),
) : BackboneElement
