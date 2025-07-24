//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.terminologycapabilities

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about the [ValueSet/$validate-code](valueset-operation-validate-code.html) operation
 *
 * Information about the [ValueSet/$validate-code](valueset-operation-validate-code.html) operation.
 *
 * @param id Unique id for inter-element referencing
 * @param translations Whether translations are validated
 */
@SerialName("TerminologyCapabilitiesValidateCode")
@Serializable
public data class TerminologyCapabilitiesValidateCode(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Whether translations are validated
   */
  public val translations: Boolean? = null,
) : BackboneElement
