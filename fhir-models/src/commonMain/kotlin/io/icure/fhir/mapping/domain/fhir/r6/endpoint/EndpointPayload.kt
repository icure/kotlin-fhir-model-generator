//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.endpoint

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Set of payloads that are provided by this endpoint
 *
 * The set of payloads that are provided/available at this endpoint.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("EndpointPayload")
@Serializable
public data class EndpointPayload(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val type: List<CodeableConcept> = emptyList(),
  public val mimeType: List<String> = emptyList(),
  public val profileCanonical: List<String> = emptyList(),
  public val profileUri: List<String> = emptyList(),
) : BackboneElement
