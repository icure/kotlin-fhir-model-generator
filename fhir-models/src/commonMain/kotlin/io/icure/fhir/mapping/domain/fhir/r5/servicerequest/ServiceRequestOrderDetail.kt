//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.servicerequest

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additional order information
 *
 * Additional details and instructions about the how the services are to be delivered.   For
 * example, and order for a urinary catheter may have an order detail for an external or indwelling
 * catheter, or an order for a bandage may require additional instructions specifying how the bandage
 * should be applied.
 *
 * @param id Unique id for inter-element referencing
 * @param parameterFocus The context of the order details by reference
 */
@SerialName("ServiceRequestOrderDetail")
@Serializable
public data class ServiceRequestOrderDetail(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The context of the order details by reference
   */
  public val parameterFocus: CodeableReference? = null,
  public val parameter: List<ServiceRequestOrderDetailParameter> = emptyList(),
) : BackboneElement
