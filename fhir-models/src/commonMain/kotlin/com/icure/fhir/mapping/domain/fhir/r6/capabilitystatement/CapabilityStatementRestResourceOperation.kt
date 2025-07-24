//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.capabilitystatement

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Definition of a resource operation
 *
 * Definition of an operation or a named query together with its parameters and their meaning and
 * type. Consult the definition of the operation for details about how to invoke the operation, and the
 * parameters.
 *
 * @param id Unique id for inter-element referencing
 * @param name Name by which the operation/query is invoked
 * @param definition The defined operation/query
 * @param documentation Specific details about operation behavior
 */
@SerialName("CapabilityStatementRestResourceOperation")
@Serializable
public data class CapabilityStatementRestResourceOperation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name by which the operation/query is invoked
   */
  public val name: String? = null,
  /**
   * The defined operation/query
   */
  public val definition: String? = null,
  /**
   * Specific details about operation behavior
   */
  public val documentation: String? = null,
) : BackboneElement
