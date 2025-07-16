//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.terminologycapabilities

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
