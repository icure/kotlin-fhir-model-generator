//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.capabilitystatement

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about security of implementation
 *
 * Information about security implementation from an interface perspective - what a client needs to
 * know.
 *
 * @param id Unique id for inter-element referencing
 * @param cors Adds CORS Headers (http://enable-cors.org/)
 * @param description General description of how security works
 */
@SerialName("CapabilityStatementRestSecurity")
@Serializable
public data class CapabilityStatementRestSecurity(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Adds CORS Headers (http://enable-cors.org/)
   */
  public val cors: Boolean? = null,
  public val service: List<CodeableConcept> = emptyList(),
  /**
   * General description of how security works
   */
  public val description: String? = null,
) : BackboneElement
