//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.contract

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Circumstance of the asset
 *
 * Circumstance of the asset.
 *
 * @param id Unique id for inter-element referencing
 * @param reference Creator,custodian or owner
 * @param text Context description
 */
@SerialName("ContractTermAssetContext")
@Serializable
public data class ContractTermAssetContext(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Creator,custodian or owner
   */
  public val reference: Reference? = null,
  public val code: List<CodeableConcept> = emptyList(),
  /**
   * Context description
   */
  public val text: String? = null,
) : BackboneElement
