//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.chargeitem

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who performed charged service
 *
 * Indicates who or what performed or participated in the charged service.
 *
 * @param id Unique id for inter-element referencing
 * @param function What type of performance was done
 * @param actor Individual who was performing
 */
@SerialName("ChargeItemPerformer")
@Serializable
public data class ChargeItemPerformer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * What type of performance was done
   */
  public val function: CodeableConcept? = null,
  /**
   * Individual who was performing
   */
  public val actor: Reference,
) : BackboneElement
