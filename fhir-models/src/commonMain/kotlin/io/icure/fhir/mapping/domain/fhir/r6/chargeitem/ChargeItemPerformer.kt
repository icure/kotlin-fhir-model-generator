//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.chargeitem

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
